parser grammar eGramC3D;
options
{
	tokenVocab = eGramLexer;
}

@parser::header {
package gram;
import compilador.*;
import compilador.Instruction.OP;
import compilador.Symbol.Types;
import compilador.Symbol.DataTypes;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
}

@parser::members {
private Deque<Integer> pproc=new ArrayDeque<Integer>(); // Pila de procedimientos
private SymbolTable ts;
private VariablesTable tv;
private ProceduresTable tp;
private TagsTable te;
private String directory;
private ArrayList<Instruction> C3D;
private int pc = 0; // program counter
private int depth=0;

public eGramC3D(TokenStream input, String directory, SymbolTable ts){
	this(input);
	this.directory=directory;
	this.ts=ts;
	this.C3D = new ArrayList<Instruction>();
	this.tv= new VariablesTable(directory);
	this.tp= new ProceduresTable();
	this.te = new TagsTable();
}

public void generate(OP code, String op1, String op2, String destination){
	pc++;
	if(code==OP.skip) {
		te.get(destination).setLine(pc);
	}
	C3D.add(new Instruction(code, op1, op2, destination));
}

public void printC3D(){
	Writer buffer;
	File interFile = new File(directory+"_C3D.txt");
	try {
		buffer = new BufferedWriter(new FileWriter(interFile));
		for(int i=0;i<C3D.size();i++) {
			buffer.write(C3D.get(i).toString() + "\n");
		}
		buffer.close();
	} catch(IOException e) {}
}

public void backpatch(Deque<Integer> list, Tag e){
	if(list!=null) {
		while(list.size()>0) {
			int instruction=list.remove()-1;
			C3D.get(instruction).setTag(e.toString());
		}
	}
}

public void backpatch(int line, Tag e){
	C3D.get(line-1).setTag(e.toString());
}

public Deque<Integer> concat(Deque<Integer> dq1, Deque<Integer> dq2){
	if(dq1==null) {
		return dq2;
	} else if(dq2!=null) {
		while(dq2.size()>0) {
			dq1.add(dq2.removeFirst());
		}
	}
	return dq1;
}

public OP condJumpValue(String s){
	OP op = null;
	switch(s){
		case "==":
			op = OP.ifEQ;
			break;
		case "!=":
			op = OP.ifNE;
			break;
		case "<":
			op = OP.ifLT;
			break;
		case ">":
			op = OP.ifGT;
			break;
		case ">=":
			op = OP.ifGE;
			break;
		case "<=":
			op = OP.ifLE;
			break;
	}
	return op;
}

public ArrayList<Instruction> getC3D() {
	return C3D;
}

public VariablesTable getTv() {
	return tv;
}

public ProceduresTable getTp() {
	return tp;
}

public TagsTable getTe(){
	return te;
 }

}

program:
	{
		// Poner los métodos de IO en la tabla de procedimientos
		Symbol s;
		try{
			// Operación de entrada
			s=ts.get("read");
			s.setProcedure(tp.newProc(depth,s.getType(),"read"));
			// Operaciones de salida
			s=ts.get("printb");
			s.setProcedure(tp.newProc(depth,s.getType(),"printb"));
			s=ts.get("printi");
			s.setProcedure(tp.newProc(depth,s.getType(),"printi"));
			s=ts.get("prints");
			s.setProcedure(tp.newProc(depth,s.getType(),"prints"));
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	} main? decl* sents EOF {
	Tag e=te.get(te.newTag(false));
	generate(OP.skip, null, null, e.toString());
	backpatch($sents.sents_seg,e);
	tv.calcDespOcupVL(tp);
	printC3D();
};

main:
    MAIN BEGIN decl* sents END
    ;

decl:
	tipo ID {
		Symbol s=new Symbol();
		int nv=0;
		try {
			s=ts.get($ID.getText());
			nv=tv.newVar(false,pproc.peek(),Types.VAR, s.dataType());
			tv.get(nv).setId(s.getId());
			s.setVariableNumber(nv);
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	} (
		'=' expr {
			if(s.dataType()==DataTypes.BOOLEAN) {
				Tag ec=te.get(te.newTag(false));
				Tag ef=te.get(te.newTag(false));
				Tag efin=te.get(te.newTag(false));
				generate(OP.skip, null, null, ec.toString());
				generate(OP.copy, "-1", null, tv.get(nv).toString());
				generate(OP.jump, null, null, efin.toString());
				generate(OP.skip, null, null, ef.toString());
				generate(OP.copy, "0", null, tv.get(nv).toString());
				generate(OP.skip, null, null, efin.toString());
				backpatch($expr.cierto,ec);
				backpatch($expr.falso,ef);
			} else {
				generate(OP.copy, $expr.r.toString(), null, tv.get(nv).toString());
			}
	}
	)? ';'
	| CONSTANT tipo ID '=' literal ';' {
		Symbol s;
		try {
			s = ts.get($ID.getText());
			int nv=tv.newVar(false,pproc.peek(),Symbol.Types.CONST, s.dataType());
			tv.get(nv).setId(s.getId());
			tv.get(nv).setValue(s.getValue());
			s.setVariableNumber(nv);
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	}
	| declArray ']' ';'
	| FUNCTION tipo encabezado BEGIN {
		depth++;
		try{
			ts=ts.blockGoesDown();
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
		pproc.push($encabezado.met.getNp());
		// Crear variables para los parámetros
		Symbol aux=$encabezado.s.getNext();
		int nparam=1;
		while(aux!=null) {
			try {
				int nv=tv.newVar(false,pproc.peek(),Types.VAR, aux.dataType());
				tv.get(nv).setNparam(nparam);
				tv.get(nv).setId(aux.getId());
				ts.get(aux.getId()).setVariableNumber(nv);
			} catch(SymbolTable.SymbolTableException e) {
				System.out.println("Error con la tabla de símbolos: "+e.getMessage());
			}
			aux=aux.getNext();
			nparam++;
		}
		Tag e=te.get(te.newTag(true));
		$encabezado.met.setStartTag(e.getNe());
		$encabezado.met.setNumParams(nparam-1);
		generate(OP.skip, null, null, e.toString());
		generate(OP.pmb, null, null, $encabezado.met.toString());
	} decl* sents {
		C3D.get(pc-1).setInstFinal(true);
		pproc.pop();
		depth--;
		ts=ts.blockGoesUp();
	};

declArray:
	tipo ID '[' (numero '..')? numero declArray_ {
	Symbol s=null;
	int nv=0;
	try {
		s=ts.get($ID.getText());
		Table dt = s.getTable();
		nv=tv.newVar(false,pproc.peek(),Types.VAR, dt.dataType());
		tv.get(nv).setId(s.getId());
		s.setVariableNumber(nv);
		tv.get(nv).setElements(dt.entradas());
	} catch(SymbolTable.SymbolTableException e) {
		System.out.println("Error con la tabla de símbolos: "+e.getMessage());
	}
};

declArray_:
	']' '[' (numero '..')? numero declArray_
	|; // lambda

numero
	returns[int value, boolean constante]:
	LiteralInteger
	| ID;

encabezado
	returns[Procedure met, Symbol s]:
	ID '(' parametros? ')' {
		Symbol s=new Symbol();
		Procedure met;
		try {
			s=ts.get($ID.getText());
			met=tp.newProc(depth,s.getType(),$ID.getText());
			s.setProcedure(met);
			$met = met;
			$s=s;
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	};

parametros: parametro ',' parametros | parametro;

parametro: tipo ID;

sents
	returns[Deque<Integer> sents_seg]:
	sent[$sents_seg] {
		Tag ec = te.get(te.newTag(false));
		generate(OP.skip, null, null, ec.toString());
	} sents_[$sents_seg] {
		backpatch($sent.sent_seg, ec);
		if($sents_.sents_seg_!=null) {
			$sents_seg = $sents_.sents_seg_;
		} else{
			$sents_seg= $sent.sent_seg;
		}
	};

sents_[Deque<Integer> sents_seg]
	returns[Deque<Integer> sents_seg_]:
	sent[$sents_seg] {
		Tag ec = te.get(te.newTag(false));
		generate(OP.skip, null, null, ec.toString());
	} sents_[$sents_seg] {
		backpatch($sent.sent_seg, ec);
		if($sents_.sents_seg_!=null) {
			$sents_seg_ = $sents_.sents_seg_;
		} else{
			$sents_seg_= $sent.sent_seg;
		}
	}
	|;

sent[Deque<Integer> sents_seg]
	returns[Deque<Integer> sent_seg]:
	IF expr BEGIN {
		try{
			ts=ts.blockGoesDown();
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
		Tag ec = te.get(te.newTag(false));
		generate(OP.skip, null, null, ec.toString());
	} decl* sents {
		ts=ts.blockGoesUp();
		backpatch($expr.cierto, ec);
		$sent_seg = concat($expr.falso, $sents.sents_seg);
	} END
	| IF expr BEGIN {
		try{
			ts=ts.blockGoesDown();
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
		Tag ec = te.get(te.newTag(false));
		generate(OP.skip, null, null, ec.toString());
	} decl* sents {
	} END {
		Deque<Integer> sents_seg1 = new ArrayDeque<Integer>();
		generate(OP.jump, null, null, null);
		sents_seg1.add(pc);
		Tag ef = te.get(te.newTag(false));
		generate(OP.skip, null, null, ef.toString());
	} ELSE BEGIN {
	} decl* sents END {
		ts=ts.blockGoesUp();
		backpatch($expr.cierto, ec);
		backpatch($expr.falso, ef);
		$sent_seg = concat(sents_seg1, $sents.sents_seg);
	}
	| contcase endcase END {
		generate(OP.skip, null, null, $contcase.etest.toString());
		while($contcase.pilacond.size()!=0) {
			Tag econd = $contcase.pilacond.remove();
			Tag etest = $contcase.pilatest.remove();
			Variable v = tv.get($contcase.pilavar.remove());
			Tag esent = $contcase.pilasent.remove();
			generate(OP.jump, null, null, econd.toString());
			generate(OP.skip, null, null, etest.toString());
			generate(OP.ifEQ, $contcase.r.toString(), v.toString(), esent.toString());
		}
		if($endcase.e!=null) {
			if(!$contcase.acababreak && $contcase.pilaefi.size()>0) {
				int seg = $contcase.pilaefi.removeLast();
				backpatch(seg, $endcase.e);
			}
			generate(OP.jump, null, null, $endcase.e.toString());
			generate(OP.skip, null, null, $endcase.efi.toString());
		}
		Tag efi = te.get(te.newTag(false));
		backpatch($contcase.pilaefi, efi);
		generate(OP.skip, null, null, efi.toString());
	}
	| WHILE {
		try{
			ts=ts.blockGoesDown();
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
		Tag ei = te.get(te.newTag(false));
		generate(OP.skip, null, null, ei.toString());
	} expr BEGIN {
		Tag ec = te.get(te.newTag(false));
		generate(OP.skip, null, null, ec.toString());
	} decl* sents {
		ts=ts.blockGoesUp();
		backpatch($expr.cierto,ec);
		backpatch($sent_seg,ei);
		$sent_seg=$expr.falso;
		generate(OP.jump, null, null, ei.toString());
	} END
	| RETURN expr ';' {
		if($expr.cierto!=null || $expr.falso!=null) {//cambiar
			Tag ec=te.get(te.newTag(false));
			Tag ef=te.get(te.newTag(false));
			Tag efin=te.get(te.newTag(false));
			generate(OP.skip, null, null, ec.toString());
			generate(OP.copy, "-1", null, $expr.r.toString());
			$expr.r.setValue("-1");
			generate(OP.jump, null, null, efin.toString());
			generate(OP.skip, null, null, ef.toString());
			generate(OP.copy, "0", null, $expr.r.toString());
			$expr.r.setValue("0");
			generate(OP.skip, null, null, efin.toString());
			backpatch($expr.cierto,ec);
			backpatch($expr.falso,ef);
		}
		generate(OP.ret, $expr.r.toString(), null, pproc.peek().toString());
	}
	| RETURN ';' {
		generate(OP.ret, null, null, pproc.peek().toString());
	}
	| referencia '=' expr ';' {
		if($referencia.d!=null) {
			if($referencia.datatypes==DataTypes.BOOLEAN) {
				Tag ec=te.get(te.newTag(false));
				Tag ef=te.get(te.newTag(false));
				Tag efin=te.get(te.newTag(false));
				generate(OP.skip, null, null, ec.toString());
				generate(OP.ind_ass, $referencia.d.toString(),"-1", $referencia.r.toString());
				generate(OP.jump, null, null, efin.toString());
				generate(OP.skip, null, null, ef.toString());
				generate(OP.ind_ass, $referencia.d.toString(), "0", $referencia.r.toString());
				generate(OP.skip, null, null, efin.toString());
				backpatch($expr.cierto,ec);
				backpatch($expr.falso,ef);
			} else {
				generate(OP.ind_ass, $referencia.d.toString(), $expr.r.toString(), $referencia.r.toString());
			}
		} else {
			if($referencia.datatypes==DataTypes.BOOLEAN) {
				Tag ec=te.get(te.newTag(false));
				Tag ef=te.get(te.newTag(false));
				Tag efin=te.get(te.newTag(false));
				generate(OP.skip, null, null, ec.toString());
				generate(OP.copy, "-1", null, $referencia.r.toString());
				generate(OP.jump, null, null, efin.toString());
				generate(OP.skip, null, null, ef.toString());
				generate(OP.copy, "0", null, $referencia.r.toString());
				generate(OP.skip, null, null, efin.toString());
				backpatch($expr.cierto,ec);
				backpatch($expr.falso,ef);
			} else {
				generate(OP.copy, $expr.r.toString(), null, $referencia.r.toString());
			}
		}
	}
	| referencia ';';

contcase
	returns[Variable r, boolean acababreak, Tag etest, Deque<Integer> pilaefi, Deque<Tag> pilasent, Deque<Integer> pilavar, Deque<Tag> pilacond, Deque<Tag> pilatest]
		:
	SWITCH expr BEGIN {
		$etest = te.get(te.newTag(false));
		generate(OP.jump, null, null, $etest.toString());
		$r = $expr.r;
		$pilaefi = new ArrayDeque<>();
		$pilasent = new ArrayDeque<Tag>();
		$pilavar = new ArrayDeque<Integer>();
		$pilacond = new ArrayDeque<Tag>();
		$pilatest = new ArrayDeque<Tag>();
	} contcase_[$r, true, $etest, $pilaefi, $pilasent, $pilavar, $pilacond, $pilatest] {
		$acababreak = $contcase_.acababreak;
	};

contcase_[Variable r, boolean acababreak1, Tag etest, Deque<Integer> pilaefi, Deque<Tag> pilasent, Deque<Integer> pilavar, Deque<Tag> pilacond, Deque<Tag> pilatest]
	returns[boolean acababreak]:
	caso {
		if(!$acababreak1 && $pilaefi.size()>0) {
			int seg = $pilaefi.removeLast();
			backpatch(seg, $caso.esent);
		}
		$pilaefi.add($caso.seg);
		$pilacond.add($caso.econd);
		$pilavar.add($caso.r.nv());
		$pilatest.add($caso.etest);
		$pilasent.add($caso.esent);
	} contcase_[$r, $caso.acababreak, $etest, $pilaefi, $pilasent, $pilavar, $pilacond, $pilatest] {
		$acababreak=$contcase_.acababreak;
	}
	| {
		$acababreak=$acababreak1;
	}; // lambda

caso
	returns[Variable r, Tag econd, Tag etest, Tag esent, int seg, boolean acababreak]
		:
	CASE {
		$econd = te.get(te.newTag(false));
		generate(OP.skip, null, null, $econd.toString());
	} expr ':' {
		$etest = te.get(te.newTag(false));
		generate(OP.jump, null, null, $etest.toString());
		$esent = te.get(te.newTag(false));
		generate(OP.skip, null, null, $esent.toString());
	} sents {
		$acababreak=false;
	} (
		BREAK ';' {
		$acababreak=true;
	}
	)? {
		$r = $expr.r;
		generate(OP.jump, null, null, null);
		$seg = pc;
	};

endcase
	returns[Tag e, Tag efi]:
	DEFAULT ':' {
		$e = te.get(te.newTag(false));
		generate(OP.skip, null, null, $e.toString());
	} sents {
		$efi = te.get(te.newTag(false));
		generate(OP.jump, null, null, $efi.toString());
	}
	|; // lambda

referencia
	returns[Variable r, Variable d, DataTypes datatypes]:
	ID {
		Symbol s;
		int t;
		try {
			s = ts.get($ID.getText());
			if (s.getType() == Types.CONST){
				t = tv.newVar(true,pproc.peek(),Types.VAR,s.dataType());
				switch(s.dataType()) {
					case BOOLEAN:
						generate(OP.copy, s.getValue(), null, tv.get(t).toString());
						if(s.getValue().equals("true")){
							tv.get(t).setValue("-1");
						} else {
							tv.get(t).setValue("0");
						}
						break;
					case INT:
						generate(OP.copy, s.getValue(), null, tv.get(t).toString());
						tv.get(t).setValue(s.getValue());
						break;
					case STRING:
						generate(OP.copy, tv.get(s.getVariableNumber()).toString(), null, tv.get(t).toString());
						tv.get(t).setValue(s.getValue());
						break;
				}
				$r = tv.get(t);
			} else {
				$r = tv.get(s.getVariableNumber());
			}
			$datatypes=s.dataType();
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	}
	| idx ']' {
		Variable t2;
		String nbytes = String.valueOf($idx.dt.ocupacion());
		if($idx.dt.b()==0) {
			t2 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
			generate(OP.mult, $idx.d.toString(), nbytes, t2.toString());
		} else {
			String b = String.valueOf($idx.dt.b());
			Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
			generate(OP.sub, $idx.d.toString(), b, t1.toString());
			t2 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
			generate(OP.mult, t1.toString(), nbytes, t2.toString());
		}
		$r = $idx.r;
		$d = t2;
	}
	| ID '(' ')' {
		Symbol s;
		int t;
		try {
			s = ts.get($ID.getText());
			generate(OP.call, null, null, s.getProcedure().toString());
			if(s.getType()==Types.FUNC) {
				t = tv.newVar(true, pproc.peek(),Types.VAR,s.dataType());
				$r = tv.get(t);
				$datatypes=s.dataType();
				generate(OP.st, null, null, tv.get(t).toString());
			}
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	}
	| contIdx ')' {
		int t;
		while($contIdx.pparams.size()>0)
		generate(OP.params, null, null, $contIdx.pparams.pop().toString());
		generate(OP.call, null, null, $contIdx.met.toString());
		if($contIdx.s.getType()==Types.FUNC) {
			t = tv.newVar(true, pproc.peek(),Types.VAR,$contIdx.s.dataType());
			$r = tv.get(t);
			$datatypes = $contIdx.s.dataType();
			generate(OP.st, null, null, tv.get(t).toString());
		}
	};

idx
	returns[Table dt, Variable r, Variable d]:
	ID '[' expr {
		Symbol dv = null;
		try {
			dv = ts.get($ID.getText());
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
		$dt = dv.getTable();
		Index idx = $dt.primerIndice();
		$r = tv.get(dv.getVariableNumber());
		Variable d = $expr.r;
	} idx_[idx, d] {
		$d = $idx_.d;
	};

idx_[Index idx1, Variable d1]
	returns[Variable d]:
	']' '[' expr {
		Index idx = idx1.getNextIndex();
		Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
		generate(OP.mult, $d1.toString(), String.valueOf(idx.d()), t1.toString());
		Variable t2 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
		generate(OP.add, t1.toString(), $expr.r.toString(), t2.toString());
	} idx_[idx, t2] {
		$d=$idx_.d;
	}
	| {
		$d=$d1; // Devuelve la misma variable que recibe
	};

contIdx
	returns[Deque<Variable> pparams, Procedure met, Symbol s]:
	ID '(' expr {
		Symbol s=new Symbol();
		$pparams = new ArrayDeque<Variable>();
		try {
			s = ts.get($ID.getText());
			$s = s;
			$met = s.getProcedure();
			$pparams.push($expr.r);
			// Boolean parámetro
			if($expr.cierto!=null || $expr.falso!=null) {
				Tag ec=te.get(te.newTag(false));
				Tag ef=te.get(te.newTag(false));
				Tag efin=te.get(te.newTag(false));
				generate(OP.skip, null, null, ec.toString());
				generate(OP.copy, "-1", null, $expr.r.toString());
				generate(OP.jump, null, null, efin.toString());
				generate(OP.skip, null, null, ef.toString());
				generate(OP.copy, "0", null, $expr.r.toString());
				generate(OP.skip, null, null, efin.toString());
				backpatch($expr.cierto,ec);
				backpatch($expr.falso,ef);
			}
		} catch(SymbolTable.SymbolTableException e) {
			System.out.println("Error con la tabla de símbolos: "+e.getMessage());
		}
	} contIdx_[$pparams];

contIdx_[Deque<Variable> pparams]:
	',' expr {
		$pparams.push($expr.r);
		// Boolean parámetro
		if($expr.cierto!=null || $expr.falso!=null) {
			Tag ec=te.get(te.newTag(false));
			Tag ef=te.get(te.newTag(false));
			Tag efin=te.get(te.newTag(false));
			generate(OP.skip, null, null, ec.toString());
			generate(OP.copy, "-1", null, $expr.r.toString());
			generate(OP.jump, null, null, efin.toString());
			generate(OP.skip, null, null, ef.toString());
			generate(OP.copy, "0", null, $expr.r.toString());
			generate(OP.skip, null, null, efin.toString());
			backpatch($expr.cierto,ec);
			backpatch($expr.falso,ef);
		}
	} contIdx_[$pparams]
	|; // lambda

expr
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	exprOr {
		$r=$exprOr.r;
		$cierto=$exprOr.cierto;
		$falso=$exprOr.falso;
	};

// Expresión de OR
exprOr
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	exprAnd {
		$r=$exprAnd.r;
		$cierto=$exprAnd.cierto;
		$falso=$exprAnd.falso;
	} exprOr_[$r,$cierto,$falso] {
		if($exprOr_.cierto!=null || $exprOr_.falso!=null) {
			$r = $exprOr_.r;
			$cierto=$exprOr_.cierto;
			$falso=$exprOr_.falso;
		}
	};

exprOr_[Variable t1, Deque<Integer> cierto1, Deque<Integer> falso1]
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	OR {
		Tag e = te.get(te.newTag(false));
		generate(OP.skip, null, null, e.toString());
	} exprAnd {
		backpatch($falso1, e);
		$cierto = concat($cierto1, $exprAnd.cierto);
		$falso = $exprAnd.falso;
	} exprOr_[$r,$cierto,$falso]{
		if($exprOr_.cierto!=null || $exprOr_.falso!=null) {
			$r = $exprOr_.r;
			$cierto=$exprOr_.cierto;
			$falso=$exprOr_.falso;
		}
	}
	|; //lambda

// Expresión de AND
exprAnd
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	exprNot {
		$r=$exprNot.r;
		$cierto=$exprNot.cierto;
		$falso=$exprNot.falso;
	} exprAnd_[$r,$cierto,$falso] {
		if($exprAnd_.cierto!=null || $exprAnd_.falso!=null) {
			$r = $exprAnd_.r;
			$cierto=$exprAnd_.cierto;
			$falso=$exprAnd_.falso;
		}
	};

exprAnd_[Variable t1, Deque<Integer> cierto1, Deque<Integer> falso1]
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	AND {
		Tag e = te.get(te.newTag(false));
		generate(OP.skip, null, null, e.toString());
	} exprNot {
		backpatch($cierto1, e);
		$falso = concat($falso1, $exprNot.falso);
		$cierto = $exprNot.cierto;
	} exprAnd_[$r, $cierto, $falso]{
		if($exprAnd_.cierto!=null || $exprAnd_.falso!=null) {
			$r = $exprAnd_.r;
			$cierto=$exprAnd_.cierto;
			$falso=$exprAnd_.falso;
		}
	}
	|; //lambda

// Expresión de NOT
exprNot
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	NOT exprComp {
		$cierto=$exprComp.falso;
		$falso=$exprComp.cierto;
		$r=$exprComp.r;
	}
	| exprComp {
		$cierto=$exprComp.cierto;
		$falso=$exprComp.falso;
		$r=$exprComp.r;
	};

// Expresión comparativa
exprComp
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	exprAdit {
		$r=$exprAdit.r;
		$cierto=$exprAdit.cierto;
		$falso=$exprAdit.falso;
	} exprComp_[$r]{
		if($exprComp_.cierto!=null || $exprComp_.falso!=null) {
			$cierto=$exprComp_.cierto;
			$falso=$exprComp_.falso;
		}
	};

exprComp_[Variable t1]
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	OPREL exprAdit {
		generate(condJumpValue($OPREL.getText()), $t1.toString(), $exprAdit.r.toString(), null);
		$cierto=new ArrayDeque<Integer>();
 		$cierto.add(pc);
		generate(OP.jump, null, null, null);
		$falso=new ArrayDeque<Integer>();
 		$falso.add(pc);
		$r = $exprAdit.r;
    }
	//exprComp_
	|; //lambda

// Expresión aditiva
exprAdit
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	exprMult {
		$r = $exprMult.r;
		$cierto=$exprMult.cierto;
		$falso=$exprMult.falso;
	} exprAdit_[$r] {
		if($exprAdit_.cierto!=null || $exprAdit_.falso!=null || $exprAdit_.r!=null) {
			$r=$exprAdit_.r;
			$cierto=$exprAdit_.cierto;
			$falso=$exprAdit_.falso;
		}
	};

exprAdit_[Variable t1]
	returns[Variable r, Deque<Integer> cierto, Deque<Integer falso>]:
	ADD exprMult {
		int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
		generate(OP.add, $t1.toString(), $exprMult.r.toString(), tv.get(t).toString());
		$r=tv.get(t);
		$cierto=$exprMult.cierto;
		$falso=$exprMult.falso;
	} exprAdit_[$r] {
		if($exprAdit_.r!=null || $exprAdit_.cierto!=null || $exprAdit_.falso!=null) {
			$r=$exprAdit_.r;
			$cierto=$exprAdit_.cierto;
			$falso=$exprAdit_.falso;
		}
	}
	| SUB exprMult {
		int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
		generate(OP.sub, $t1.toString(), $exprMult.r.toString(), tv.get(t).toString());
		$r=tv.get(t);
		$cierto=$exprMult.cierto;
		$falso=$exprMult.falso;
	} exprAdit_[$r] {
		if($exprAdit_.r!=null || $exprAdit_.cierto!=null || $exprAdit_.falso!=null) {
			$r=$exprAdit_.r;
			$cierto=$exprAdit_.cierto;
			$falso=$exprAdit_.falso;
		}
	}
	|; //lambda

// Expresión multiplicativa
exprMult
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	exprNeg {
		$r = $exprNeg.r;
		$cierto=$exprNeg.cierto;
		$falso=$exprNeg.falso;
	} exprMult_[$r] {
		if($exprMult_.r!=null || $exprMult_.cierto!=null || $exprMult_.falso!=null) {
			$r=$exprMult_.r;
			$cierto=$exprMult_.cierto;
			$falso=$exprMult_.falso;
		}
	};

exprMult_[Variable t1]
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	MULT exprNeg {
		int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
		generate(OP.mult, $t1.toString(), $exprNeg.r.toString(), tv.get(t).toString());
		$r=tv.get(t);
		$cierto=$exprNeg.cierto;
		$falso=$exprNeg.falso;
	} exprMult_[$r] {
		if($exprMult_.r!=null || $exprMult_.cierto!=null || $exprMult_.falso!=null) {
			$r=$exprMult_.r;
			$cierto=$exprMult_.cierto;
			$falso=$exprMult_.falso;
		}
	}
	| DIV exprNeg {
		int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
		generate(OP.div, $t1.toString(), $exprNeg.r.toString(), tv.get(t).toString());
		$r=tv.get(t);
		$cierto=$exprNeg.cierto;
		$falso=$exprNeg.falso;
	} exprMult_[$r] {
		if($exprMult_.r!=null || $exprMult_.cierto!=null || $exprMult_.falso!=null) {
			$r=$exprMult_.r;
			$cierto=$exprMult_.cierto;
			$falso=$exprMult_.falso;
		}
	}
	| MOD exprNeg{
		int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
		generate(OP.mod, $t1.toString(), $exprNeg.r.toString(), tv.get(t).toString());
		$r=tv.get(t);
		$cierto=$exprNeg.cierto;
		$falso=$exprNeg.falso;
	} exprMult_[$r] {
		if($exprMult_.r!=null || $exprMult_.cierto!=null || $exprMult_.falso!=null) {
			$r=$exprMult_.r;
			$cierto=$exprMult_.cierto;
			$falso=$exprMult_.falso;
		}
	}
	|; //lambda

// Expresión de negación
exprNeg
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	SUB primario {
		int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
		generate(OP.neg, $primario.r.toString(), null, tv.get(t).toString());
		$r = tv.get(t);
		$cierto = $primario.cierto;
		$falso = $primario.falso;
	}
	| primario {
		$r = $primario.r;
		$cierto = $primario.cierto;
		$falso = $primario.falso;
	};

primario
	returns[Variable r, Deque<Integer> cierto, Deque<Integer> falso]:
	'(' expr ')' {
		$r = $expr.r;
		$cierto = $expr.cierto;
		$falso = $expr.falso;
	}
	| referencia {
		if($referencia.d!=null) {
			// Caso para cuando hay desplazamiento
			Variable t = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
			generate(OP.ind_val, $referencia.r.toString(), $referencia.d.toString(), t.toString());
			$r = t;
		} else {
			$r = $referencia.r;
		}
		if($referencia.datatypes==DataTypes.BOOLEAN) {
			generate(OP.ifEQ, $r.toString(), "-1", null);
			$cierto=new ArrayDeque<Integer>();
			$cierto.add(pc);
			generate(OP.jump, null, null, null);
			$falso=new ArrayDeque<Integer>();
			$falso.add(pc);
		}
	}
	| literal {
		int t=0;
		switch($literal.datatypes) {
			case BOOLEAN:
				t = tv.newVar(true,pproc.peek(), Types.VAR,DataTypes.BOOLEAN);
				if($literal.text.equals("true")) {
					generate(OP.copy, "-1", null, tv.get(t).toString());
					tv.get(t).setValue("-1");
					generate(OP.jump, null, null, null);
					$cierto=new ArrayDeque<Integer>();
					$cierto.add(pc);
					$falso = null;
				} else {
					generate(OP.copy, "0", null, tv.get(t).toString());
					tv.get(t).setValue("0");
					generate(OP.jump, null, null, null);
					$falso=new ArrayDeque<Integer>();
					$falso.add(pc);
					$cierto = null;
				}
				break;
			case STRING:
				t = tv.newVar(true,pproc.peek(), Types.CONST,DataTypes.STRING);
				tv.get(t).setValue($literal.text);
				break;
			case INT:
				t = tv.newVar(true,pproc.peek(), Types.VAR,DataTypes.INT);
				generate(OP.copy, $literal.text, null, tv.get(t).toString());
				tv.get(t).setValue($literal.text);
				break;
			default:
				break;
		}
		$r = tv.get(t);
	};

tipo
	returns[DataTypes datatypes]:
	INTEGER {
		$datatypes=DataTypes.INT;
	}
	| BOOLEAN {
		$datatypes=DataTypes.BOOLEAN;
	}
	| STRING {
		$datatypes=DataTypes.STRING;
	};

literal
	returns[DataTypes datatypes]:
	LiteralInteger {
		$datatypes=DataTypes.INT;
	}
	| LiteralBoolean {
		$datatypes=DataTypes.BOOLEAN;
	}
	| LiteralString {
		$datatypes=DataTypes.STRING;
	};