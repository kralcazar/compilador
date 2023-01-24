parser grammar eGramC3D;
options
{
	tokenVocab = eGramLexer;
}

@parser::header {
package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
}

@parser::members {
private Deque<Integer> pproc = new ArrayDeque<Integer>(); // Pila de procedimientos
private SymbolTable ts;
private VariablesTable tv;
private ProceduresTable tp;
private TagsTable te;
private String directory;
private ArrayList<Instruction> C3D;
private int pc = 0; // program counter
private int depth = 0;

public eGramC3D(TokenStream input, String directory, SymbolTable ts){
	this(input);
	this.directory = directory;
	this.ts = ts;
	this.C3D = new ArrayList<Instruction>();
	this.tv = new VariablesTable(directory);
	this.tp = new ProceduresTable();
	this.te = new TagsTable();
}

public void generate(Instruction.OP code, String op1, String op2, String destination){
	pc++;
	if(code == Instruction.OP.skip) {
		te.get(destination).setLine(pc);
	}
	C3D.add(new Instruction(code, op1, op2, destination));
}

public void backpatch(Deque<Integer> list, Tag e){
	if(list!= null) {
		while(list.size()>0) {
			int instruction = list.remove()-1;
			C3D.get(instruction).setTag(e.toString());
		}
	}
}

public void backpatch(int line, Tag e){
	C3D.get(line-1).setTag(e.toString());
}

public Deque<Integer> concat(Deque<Integer> dq1, Deque<Integer> dq2){
	if(dq1 == null) {
		return dq2;
	} else if(dq2!= null) {
		while(dq2.size()>0) {
			dq1.add(dq2.removeFirst());
		}
	}
	return dq1;
}

public Instruction.OP condJumpValue(String s){
	Instruction.OP op = null;
	switch(s){
		case "==":
			op = Instruction.OP.ifEQ;
			break;
		case "<":
			op = Instruction.OP.ifLT;
			break;
		case ">":
			op = Instruction.OP.ifGT;
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
            Symbol symbol;
            try{
                // Operación de entrada
                symbol = ts.get("read");
                symbol.setProcedure(tp.newProc(depth, symbol.getType(), "read"));
                // Operaciones de salida
                symbol = ts.get("printb");
                symbol.setProcedure(tp.newProc(depth, symbol.getType(), "printb"));
                symbol = ts.get("printi");
                symbol.setProcedure(tp.newProc(depth, symbol.getType(), "printi"));
                symbol = ts.get("prints");
                symbol.setProcedure(tp.newProc(depth, symbol.getType(), "prints"));
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
    (decl+ | main)+
        {
            //Llamar al main despues de leerlo todo
            try {
                symbol = ts.get("indice");//TODO: intentar llamada directa a la palabra
                generate(Instruction.OP.call, null, null, symbol.getProcedure().toString());
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
        EOF
        {
            Tag e=te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, e.toString());
            backpatch($main.sents_seg,e);
            tv.calcDespOcupVL(tp);
        }
    ;


/*******************************************************************************************/
/*                                      MAIN                                               */
/*******************************************************************************************/
main
    returns[Procedure procedure, Symbol symbol, Deque<Integer> sents_seg]:
    MAIN
        {
            Symbol symbol = new Symbol();
            Procedure procedure;
            try {
                symbol = ts.get($MAIN.getText());
                procedure = tp.newProc(depth, symbol.getType(), $MAIN.getText());
                symbol.setProcedure(procedure);
                $procedure = procedure;
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
        BEGIN
        {
            //pproc.push($procedure.getNp());
            //depth ++;
            /*
            try{
                ts = ts.blockGoesDown();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
            **/

            Tag e = te.get(te.newTag(true));
            $procedure.setStartTag(e.getNe());
            generate(Instruction.OP.skip, null, null, e.toString());//TODO: averiguar como saltar a esta etiqueta desde program
            generate(Instruction.OP.pmb, null, null, $procedure.toString());
        }
        decl* sents END
        {
            $sents_seg = $sents.sents_seg;
            C3D.get(pc-1).setInstFinal(true);
            //pproc.pop();
            //depth --;
            //ts = ts.blockGoesUp();
        }
    ;

/*******************************************************************************************/
/*                                     DECLARACIONES                                       */
/*******************************************************************************************/
decl:
	tipo ID
        {
            Symbol symbol = new Symbol();
            int nv = 1;
            try {
                symbol = ts.get($ID.getText());
                nv = tv.newVar(false, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
                tv.get(nv).setId(symbol.getId());
                symbol.setVariableNumber(nv);
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
        ( ASSIGN expr
        {
            if(symbol.dataType() == Symbol.DataTypes.BOOLEAN) {
                Tag ec = te.get(te.newTag(false));
                Tag ef = te.get(te.newTag(false));
                Tag efn = te.get(te.newTag(false));
                generate(Instruction.OP.skip, null, null, ec.toString());
                generate(Instruction.OP.copy, "-1", null, tv.get(nv).toString());
                generate(Instruction.OP.jump, null, null, efn.toString());
                generate(Instruction.OP.skip, null, null, ef.toString());
                generate(Instruction.OP.copy, "0", null, tv.get(nv).toString());
                generate(Instruction.OP.skip, null, null, efn.toString());
                backpatch($expr.true_, ec);
                backpatch($expr.false_, ef);
            } else {
                generate(Instruction.OP.copy, $expr.variable.toString(), null, tv.get(nv).toString());
            }
        }
        )? SEMI
	| CONSTANT tipo ID ASSIGN literal SEMI
	    {
            Symbol symbol;
            try {
                symbol = ts.get($ID.getText());
                int nv = tv.newVar(false, pproc.peek(), Symbol.Types.CONST, symbol.dataType());
                tv.get(nv).setId(symbol.getId());
                tv.get(nv).setValue(symbol.getValue());
                symbol.setVariableNumber(nv);
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
	| declArray RBRACK SEMI
	| FUNCTION tipo encabezado BEGIN
	    {
            depth++;
            try{
                ts = ts.blockGoesDown();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
            pproc.push($encabezado.procedure.getNp());
            // Crear variables para los parámetros
            Symbol aux = $encabezado.symbol.getNext();
            int nparam = 1;
            while(aux!= null) {
                try {
                    int nv = tv.newVar(false, pproc.peek(), Symbol.Types.VAR, aux.dataType());
                    tv.get(nv).setNparam(nparam);
                    tv.get(nv).setId(aux.getId());
                    ts.get(aux.getId()).setVariableNumber(nv);
                } catch(SymbolTable.SymbolTableException e) {
                    System.out.println("Error en la tabla de símbolos: "+e.getMessage());
                }
                aux = aux.getNext();
                nparam++;
            }
            Tag e = te.get(te.newTag(true));
            $encabezado.procedure.setStartTag(e.getNe());
            $encabezado.procedure.setNumParams(nparam-1);
            generate(Instruction.OP.skip, null, null, e.toString());
            generate(Instruction.OP.pmb, null, null, $encabezado.procedure.toString());
        }
	    decl* sents END
        {
            C3D.get(pc-1).setInstFinal(true);
            pproc.pop();
            depth--;
            ts = ts.blockGoesUp();
        }
	;

declArray:
	tipo ID LBRACK (numero DOUBLEDOT)? numero declArray_
        {
            Symbol symbol = null;
            int nv = 0;
            try {
                symbol = ts.get($ID.getText());
                Table dt = symbol.getTable();
                nv = tv.newVar(false, pproc.peek(), Symbol.Types.VAR, dt.dataType());
                tv.get(nv).setId(symbol.getId());
                symbol.setVariableNumber(nv);
                tv.get(nv).setElements(dt.getEntries());
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
;

declArray_:
	RBRACK LBRACK (numero DOUBLEDOT)? numero declArray_
	|; // lambda

numero
	returns[int value, boolean constante]:
	LiteralInteger
	| ID;

encabezado
	returns[Procedure procedure, Symbol symbol]:
	ID LPAREN parametros? RPAREN
        {
            Symbol symbol = new Symbol();
            Procedure procedure;
            try {
                symbol = ts.get($ID.getText());
                procedure = tp.newProc(depth, symbol.getType(), $ID.getText());
                symbol.setProcedure(procedure);
                $procedure = procedure;
                $symbol = symbol;
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
	;

parametros: parametro COMMA parametros | parametro;

parametro: tipo ID;

sents
	returns[Deque<Integer> sents_seg]:
	sent[$sents_seg]
        {
            Tag ec = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ec.toString());
        }
        sents_[$sents_seg]
        {
            backpatch($sent.sent_seg, ec);
            if($sents_.sents_seg_!= null) {
                $sents_seg = $sents_.sents_seg_;
            } else{
                $sents_seg = $sent.sent_seg;
            }
	    } |
	;

sents_[Deque<Integer> sents_seg]
	returns[Deque<Integer> sents_seg_]:
	sent[$sents_seg]
        {
            Tag ec = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ec.toString());
        }
        sents_[$sents_seg]
        {
            backpatch($sent.sent_seg, ec);
            if($sents_.sents_seg_!= null) {
                $sents_seg_ = $sents_.sents_seg_;
            } else{
                $sents_seg_ = $sent.sent_seg;
            }
        }
	|
	;

sent[Deque<Integer> sents_seg]
	returns[Deque<Integer> sent_seg]:
	IF expr BEGIN
	    {
            try{
                ts = ts.blockGoesDown();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
            Tag ec = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ec.toString());
        }
        decl* sents
        {
            ts = ts.blockGoesUp();
            backpatch($expr.true_, ec);
            $sent_seg = concat($expr.false_, $sents.sents_seg);
        }
        END
	| IF expr BEGIN
	    {
            try{
                ts = ts.blockGoesDown();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
            Tag ec = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ec.toString());
        }
        decl* sents END
        {
            Deque<Integer> sents_seg1 = new ArrayDeque<Integer>();
            generate(Instruction.OP.jump, null, null, null);
            sents_seg1.add(pc);
            Tag ef = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ef.toString());
        }
        ELSE BEGIN decl* sents END
        {
            ts = ts.blockGoesUp();
            backpatch($expr.true_, ec);
            backpatch($expr.false_, ef);
            $sent_seg = concat(sents_seg1, $sents.sents_seg);
        }
	| WHILE
        {
            try{
                 ts = ts.blockGoesDown();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
            Tag ei = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ei.toString());
        }
        expr BEGIN
        {
            Tag eis = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, eis.toString());
        }
        decl* sents
        {
            ts = ts.blockGoesUp();
            backpatch($expr.true_, eis);
            backpatch($sent_seg, ei);
            $sent_seg = $expr.false_;
            generate(Instruction.OP.jump, null, null, ei.toString());
        }
        END
    | DO
        {
            try{
                ts = ts.blockGoesDown();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
        BEGIN
        {
            Tag eis = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, eis.toString());
        }
        decl* sents
        {
            ts = ts.blockGoesUp();
        }
        END WHILE
        {
            Tag ei = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, ei.toString());
        }
        expr SEMI
        {
            backpatch($expr.true_, eis);
            backpatch($sent_seg, ei);
            $sent_seg = $expr.false_;
            generate(Instruction.OP.jump, null, null, eis.toString());
        }
	| RETURN expr SEMI
	    {
            if($expr.true_!= null || $expr.false_!= null) {//cambiar
                Tag ec = te.get(te.newTag(false));
                Tag ef = te.get(te.newTag(false));
                Tag efn = te.get(te.newTag(false));
                generate(Instruction.OP.skip, null, null, ec.toString());
                generate(Instruction.OP.copy, "-1", null, $expr.variable.toString());
                $expr.variable.setValue("-1");
                generate(Instruction.OP.jump, null, null, efn.toString());
                generate(Instruction.OP.skip, null, null, ef.toString());
                generate(Instruction.OP.copy, "0", null, $expr.variable.toString());
                $expr.variable.setValue("0");
                generate(Instruction.OP.skip, null, null, efn.toString());
                backpatch($expr.true_, ec);
                backpatch($expr.false_, ef);
            }
            generate(Instruction.OP.ret, $expr.variable.toString(), null, pproc.peek().toString());
        }
	| RETURN SEMI
        {
            generate(Instruction.OP.ret, null, null, pproc.peek().toString());
        }
	| referencia ASSIGN expr SEMI
        {
            if($referencia.offset!= null) {
                if($referencia.dataType == Symbol.DataTypes.BOOLEAN) {
                    Tag ec = te.get(te.newTag(false));
                    Tag ef = te.get(te.newTag(false));
                    Tag efn = te.get(te.newTag(false));
                    generate(Instruction.OP.skip, null, null, ec.toString());
                    generate(Instruction.OP.ind_ass, $referencia.offset.toString(), "-1", $referencia.variable.toString());
                    generate(Instruction.OP.jump, null, null, efn.toString());
                    generate(Instruction.OP.skip, null, null, ef.toString());
                    generate(Instruction.OP.ind_ass, $referencia.offset.toString(), "0", $referencia.variable.toString());
                    generate(Instruction.OP.skip, null, null, efn.toString());
                    backpatch($expr.true_, ec);
                    backpatch($expr.false_, ef);
                } else {
                    generate(Instruction.OP.ind_ass, $referencia.offset.toString(), $expr.variable.toString(), $referencia.variable.toString());
                }
            } else {
                if($referencia.dataType == Symbol.DataTypes.BOOLEAN) {
                    Tag ec = te.get(te.newTag(false));
                    Tag ef = te.get(te.newTag(false));
                    Tag efn = te.get(te.newTag(false));
                    generate(Instruction.OP.skip, null, null, ec.toString());
                    generate(Instruction.OP.copy, "-1", null, $referencia.variable.toString());
                    generate(Instruction.OP.jump, null, null, efn.toString());
                    generate(Instruction.OP.skip, null, null, ef.toString());
                    generate(Instruction.OP.copy, "0", null, $referencia.variable.toString());
                    generate(Instruction.OP.skip, null, null, efn.toString());
                    backpatch($expr.true_, ec);
                    backpatch($expr.false_, ef);
                } else {
                    generate(Instruction.OP.copy, $expr.variable.toString(), null, $referencia.variable.toString());
                }
            }
        }
	| referencia SEMI;

referencia
	returns[Variable variable, Variable offset, Symbol.DataTypes dataType]:
	ID
	    {
            Symbol symbol;
            int vn2;
            try {
                symbol = ts.get($ID.getText());
                if (symbol.getType()  ==  Symbol.Types.CONST){
                    vn2 = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
                    switch(symbol.dataType()) {
                        case BOOLEAN:
                            generate(Instruction.OP.copy, symbol.getValue(), null, tv.get(vn2).toString());
                            if(symbol.getValue().equals("true")){
                                tv.get(vn2).setValue("-1");
                            } else {
                                tv.get(vn2).setValue("0");
                            }
                            break;
                        case INT:
                            generate(Instruction.OP.copy, symbol.getValue(), null, tv.get(vn2).toString());
                            tv.get(vn2).setValue(symbol.getValue());
                            break;
                        case STRING:
                            generate(Instruction.OP.copy, tv.get(symbol.getVariableNumber()).toString(), null, tv.get(vn2).toString());
                            tv.get(vn2).setValue(symbol.getValue());
                            break;
                    }
                    $variable = tv.get(vn2);
                } else {
                    $variable = tv.get(symbol.getVariableNumber());
                }
                $dataType = symbol.dataType();
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
	| idx RBRACK
	    {
            Variable t2;
            String nbytes = String.valueOf($idx.table.getItemSize());
            if($idx.table.getOffset() == 0) {
                t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
                generate(Instruction.OP.mult, $idx.offset.toString(), nbytes, t2.toString());
            } else {
                String tableOffsetComp = String.valueOf($idx.table.getOffset());

                Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
                generate(Instruction.OP.sub, $idx.offset.toString(), tableOffsetComp, t1.toString());

                t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
                generate(Instruction.OP.mult, t1.toString(), nbytes, t2.toString());
            }
            $variable = $idx.variable;
            $offset = t2;
        }
	| ID LPAREN RPAREN
        {
            Symbol symbol;
            int t;
            try {
                symbol = ts.get($ID.getText());
                generate(Instruction.OP.call, null, null, symbol.getProcedure().toString());
                if(symbol.getType()  ==  Symbol.Types.FUNC) {
                    t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
                    $variable = tv.get(t);
                    $dataType = symbol.dataType();
                    generate(Instruction.OP.st, null, null, tv.get(t).toString());
                }
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
	| contIdx RPAREN
	    {
            int t;
            while($contIdx.pparams.size() > 0)
            {
              Variable parameter = $contIdx.pparams.pop();
              generate(Instruction.OP.params, null, null, parameter.toString());
            }
            generate(Instruction.OP.call, null, null, $contIdx.procedure.toString());
            if($contIdx.symbol.getType()  ==  Symbol.Types.FUNC) {
                t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, $contIdx.symbol.dataType());
                $variable = tv.get(t);
                $dataType = $contIdx.symbol.dataType();
                generate(Instruction.OP.st, null, null, tv.get(t).toString());
            }
        }
	;

idx
	returns[Table table, Variable variable, Variable offset]:
	ID LBRACK expr
        {
            Symbol symbol = null;
            try {
                symbol = ts.get($ID.getText());
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
            $table = symbol.getTable();
            Index idx = $table.getFirst();
            $variable = tv.get(symbol.getVariableNumber());
            Variable offset = $expr.variable;
        }
	idx_[idx, offset]
        {
            $offset = $idx_.offset;
        }
	;

idx_[Index idx1, Variable offset1]
	returns[Variable offset]:
	RBRACK LBRACK expr
        {
            Index idx = idx1.getNextIndex();

            Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
            generate(Instruction.OP.mult, $offset1.toString(), String.valueOf(idx.getDimension()), t1.toString());

            Variable t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
            generate(Instruction.OP.add, t1.toString(), $expr.variable.toString(), t2.toString());
        }
        idx_[idx, t2]
        {
            $offset = $idx_.offset;
        }
	| // lambda
	    {
		    $offset = $offset1; // Devuelve la misma variable que recibe
	    }
    ;

contIdx
	returns[Deque<Variable> pparams, Procedure procedure, Symbol symbol]:
	ID LPAREN expr
        {
            Symbol symbol = new Symbol();
            $pparams = new ArrayDeque<Variable>();
            try {
                symbol = ts.get($ID.getText());
                $symbol = symbol;
                $procedure = symbol.getProcedure();
                $pparams.push($expr.variable);
                if($expr.true_ != null || $expr.false_ != null) { // Booleano
                    Tag ec = te.get(te.newTag(false));
                    Tag ef = te.get(te.newTag(false));
                    Tag efn = te.get(te.newTag(false));
                    generate(Instruction.OP.skip, null, null, ec.toString());
                    generate(Instruction.OP.copy, "-1", null, $expr.variable.toString());
                    generate(Instruction.OP.jump, null, null, efn.toString());
                    generate(Instruction.OP.skip, null, null, ef.toString());
                    generate(Instruction.OP.copy, "0", null, $expr.variable.toString());
                    generate(Instruction.OP.skip, null, null, efn.toString());
                    backpatch($expr.true_, ec);
                    backpatch($expr.false_, ef);
                }
            } catch(SymbolTable.SymbolTableException e) {
                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
            }
        }
        contIdx_[$pparams];

contIdx_[Deque<Variable> pparams]:
	COMMA expr
	    {
            $pparams.push($expr.variable);
            if($expr.true_ != null || $expr.false_ != null) { // Boolean
                Tag ec = te.get(te.newTag(false));
                Tag ef = te.get(te.newTag(false));
                Tag efn = te.get(te.newTag(false));
                generate(Instruction.OP.skip, null, null, ec.toString());
                generate(Instruction.OP.copy, "-1", null, $expr.variable.toString());
                generate(Instruction.OP.jump, null, null, efn.toString());
                generate(Instruction.OP.skip, null, null, ef.toString());
                generate(Instruction.OP.copy, "0", null, $expr.variable.toString());
                generate(Instruction.OP.skip, null, null, efn.toString());
                backpatch($expr.true_, ec);
                backpatch($expr.false_, ef);
            }
	    }
	    contIdx_[$pparams]
	| // lambda
	;

expr returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	exprOr
        {
            $variable = $exprOr.variable;
            $true_ = $exprOr.true_;
            $false_ = $exprOr.false_;
        }
	;

exprOr returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	exprAnd
        {
            $variable = $exprAnd.variable;
            $true_ = $exprAnd.true_;
            $false_ = $exprAnd.false_;
        }
        exprOr_[$variable, $true_, $false_]
        {
            if($exprOr_.true_ != null || $exprOr_.false_ != null) {
                $variable = $exprOr_.variable;
                $true_ = $exprOr_.true_;
                $false_ = $exprOr_.false_;
            }
        }
    ;

exprOr_[Variable variable1, Deque<Integer> true_1, Deque<Integer> false_1]
	returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	OR
        {
            Tag e = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, e.toString());
        }
        exprAnd
        {
            backpatch($false_1, e);
            $true_ = concat($true_1, $exprAnd.true_);
            $false_ = $exprAnd.false_;
        }
        exprOr_[$variable, $true_, $false_]
        {
            if($exprOr_.true_!= null || $exprOr_.false_!= null) {
                $variable = $exprOr_.variable;
                $true_ = $exprOr_.true_;
                $false_ = $exprOr_.false_;
            }
        }
	| //lambda
	;

exprAnd returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	exprNot
	    {
            $variable = $exprNot.variable;
            $true_ = $exprNot.true_;
            $false_ = $exprNot.false_;
        }
        exprAnd_[$variable, $true_, $false_]
        {
            if($exprAnd_.true_!= null || $exprAnd_.false_!= null) {
                $variable = $exprAnd_.variable;
                $true_ = $exprAnd_.true_;
                $false_ = $exprAnd_.false_;
            }
        }
	;

exprAnd_[Variable variable1, Deque<Integer> true_1, Deque<Integer> false_1]
	returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	AND
        {
            Tag e = te.get(te.newTag(false));
            generate(Instruction.OP.skip, null, null, e.toString());
        }
        exprNot
        {
            backpatch($true_1, e);
            $false_ = concat($false_1, $exprNot.false_);
            $true_ = $exprNot.true_;
        }
        exprAnd_[$variable, $true_, $false_]
        {
            if($exprAnd_.true_ != null || $exprAnd_.false_ != null) {
                $variable = $exprAnd_.variable;
                $true_ = $exprAnd_.true_;
                $false_ = $exprAnd_.false_;
            }
        }
	| // lambda
	;

exprNot returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	NOT exprComp
        {
            $true_ = $exprComp.false_;
            $false_ = $exprComp.true_;
            $variable = $exprComp.variable;
        }
	| exprComp
        {
            $true_ = $exprComp.true_;
            $false_ = $exprComp.false_;
            $variable = $exprComp.variable;
        }
	;

exprComp returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	exprAdd
        {
            $variable = $exprAdd.variable;
            $true_ = $exprAdd.true_;
            $false_ = $exprAdd.false_;
        }
        exprComp_[$variable]
        {
            if($exprComp_.true_!= null || $exprComp_.false_!= null) {
                $true_ = $exprComp_.true_;
                $false_ = $exprComp_.false_;
            }
        }
	;

exprComp_[Variable e1] returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	OPREL exprAdd
        {
            generate(condJumpValue($OPREL.getText()), $e1.toString(), $exprAdd.variable.toString(), null);
            $true_ = new ArrayDeque<Integer>();
            $true_.add(pc);
            generate(Instruction.OP.jump, null, null, null);
            $false_ = new ArrayDeque<Integer>();
            $false_.add(pc);
            $variable = $exprAdd.variable;
        }
	|; //lambda

exprAdd returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	exprMult
        {
            $variable = $exprMult.variable;
            $true_ = $exprMult.true_;
            $false_ = $exprMult.false_;
        }
	    exprAdd_[$variable]
        {
            if($exprAdd_.true_!= null || $exprAdd_.false_!= null || $exprAdd_.variable!= null) {
                $variable = $exprAdd_.variable;
                $true_ = $exprAdd_.true_;
                $false_ = $exprAdd_.false_;
            }
        }
	;

exprAdd_[Variable t1] returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	ADD exprMult
        {
            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
            generate(Instruction.OP.add, $t1.toString(), $exprMult.variable.toString(), tv.get(t).toString());
            $variable = tv.get(t);
            $true_ = $exprMult.true_;
            $false_ = $exprMult.false_;
        }
	    exprAdd_[$variable]
        {
            if($exprAdd_.variable!= null || $exprAdd_.true_!= null || $exprAdd_.false_!= null) {
                $variable = $exprAdd_.variable;
                $true_ = $exprAdd_.true_;
                $false_ = $exprAdd_.false_;
            }
        }
	| SUB exprMult
        {
            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
            generate(Instruction.OP.sub, $t1.toString(), $exprMult.variable.toString(), tv.get(t).toString());
            $variable = tv.get(t);
            $true_ = $exprMult.true_;
            $false_ = $exprMult.false_;
        }
	    exprAdd_[$variable]
        {
            if($exprAdd_.variable!= null || $exprAdd_.true_!= null || $exprAdd_.false_!= null) {
                $variable = $exprAdd_.variable;
                $true_ = $exprAdd_.true_;
                $false_ = $exprAdd_.false_;
            }
        }
	|; //lambda

exprMult returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	exprNeg
        {
            $variable = $exprNeg.variable;
            $true_ = $exprNeg.true_;
            $false_ = $exprNeg.false_;
        }
        exprMult_[$variable]
        {
            if($exprMult_.variable!= null || $exprMult_.true_!= null || $exprMult_.false_!= null) {
                $variable = $exprMult_.variable;
                $true_ = $exprMult_.true_;
                $false_ = $exprMult_.false_;
            }
        }
	;

exprMult_[Variable t1] returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	MULT exprNeg
        {
            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
            generate(Instruction.OP.mult, $t1.toString(), $exprNeg.variable.toString(), tv.get(t).toString());
            $variable = tv.get(t);
            $true_ = $exprNeg.true_;
            $false_ = $exprNeg.false_;
        }
        exprMult_[$variable] {
            if($exprMult_.variable!= null || $exprMult_.true_!= null || $exprMult_.false_!= null) {
                $variable = $exprMult_.variable;
                $true_ = $exprMult_.true_;
                $false_ = $exprMult_.false_;
            }
        }
	| DIV exprNeg
        {
            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
            generate(Instruction.OP.div, $t1.toString(), $exprNeg.variable.toString(), tv.get(t).toString());
            $variable = tv.get(t);
            $true_ = $exprNeg.true_;
            $false_ = $exprNeg.false_;
        }
        exprMult_[$variable]
        {
            if($exprMult_.variable!= null || $exprMult_.true_!= null || $exprMult_.false_!= null) {
                $variable = $exprMult_.variable;
                $true_ = $exprMult_.true_;
                $false_ = $exprMult_.false_;
            }
        }
	| MOD exprNeg
        {
            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
            generate(Instruction.OP.mod, $t1.toString(), $exprNeg.variable.toString(), tv.get(t).toString());
            $variable = tv.get(t);
            $true_ = $exprNeg.true_;
            $false_ = $exprNeg.false_;
        }
        exprMult_[$variable]
        {
            if($exprMult_.variable!= null || $exprMult_.true_!= null || $exprMult_.false_!= null) {
                $variable = $exprMult_.variable;
                $true_ = $exprMult_.true_;
                $false_ = $exprMult_.false_;
            }
        }
	|; //lambda

exprNeg returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	SUB primario
        {
            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
            generate(Instruction.OP.neg, $primario.variable.toString(), null, tv.get(t).toString());
            $variable = tv.get(t);
            $true_ = $primario.true_;
            $false_ = $primario.false_;
        }
	| primario
        {
            $variable = $primario.variable;
            $true_ = $primario.true_;
            $false_ = $primario.false_;
        }
	;

primario returns[Variable variable, Deque<Integer> true_, Deque<Integer> false_]:
	LPAREN expr RPAREN
        {
            $variable = $expr.variable;
            $true_ = $expr.true_;
            $false_ = $expr.false_;
        }
	| referencia
        {
            if($referencia.offset!= null) {
                // Caso para cuando hay desplazamiento
                Variable t = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
                generate(Instruction.OP.ind_val, $referencia.variable.toString(), $referencia.offset.toString(), t.toString());
                $variable = t;
            } else {
                $variable = $referencia.variable;
            }
            if($referencia.dataType == Symbol.DataTypes.BOOLEAN) {
                generate(Instruction.OP.ifEQ, $variable.toString(), "-1", null);
                $true_ = new ArrayDeque<Integer>();
                $true_.add(pc);
                generate(Instruction.OP.jump, null, null, null);
                $false_ = new ArrayDeque<Integer>();
                $false_.add(pc);
            }
        }
	| literal
        {
            int t = 0;
            switch($literal.datatypes) {
                case BOOLEAN:
                    t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.BOOLEAN);
                    if($literal.text.equals("true")) {
                        generate(Instruction.OP.copy, "-1", null, tv.get(t).toString());
                        tv.get(t).setValue("-1");
                        generate(Instruction.OP.jump, null, null, null);
                        $true_ = new ArrayDeque<Integer>();
                        $true_.add(pc);
                        $false_ = null;
                    } else {
                        generate(Instruction.OP.copy, "0", null, tv.get(t).toString());
                        tv.get(t).setValue("0");
                        generate(Instruction.OP.jump, null, null, null);
                        $false_ = new ArrayDeque<Integer>();
                        $false_.add(pc);
                        $true_ = null;
                    }
                    break;
                case STRING:
                    t = tv.newVar(true, pproc.peek(), Symbol.Types.CONST, Symbol.DataTypes.STRING);
                    tv.get(t).setValue($literal.text);
                    break;
                case INT:
                    t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
                    generate(Instruction.OP.copy, $literal.text, null, tv.get(t).toString());
                    tv.get(t).setValue($literal.text);
                    break;
                default:
                    break;
            }
            $variable = tv.get(t);
        }
	;

tipo returns[Symbol.DataTypes datatypes]:
	INTEGER
        {
            $datatypes = Symbol.DataTypes.INT;
        }
	| BOOLEAN
        {
            $datatypes = Symbol.DataTypes.BOOLEAN;
        }
	| STRING
        {
            $datatypes = Symbol.DataTypes.STRING;
        }
	;

literal returns[Symbol.DataTypes datatypes]:
	LiteralInteger
        {
            $datatypes = Symbol.DataTypes.INT;
        }
	| LiteralBoolean
        {
            $datatypes = Symbol.DataTypes.BOOLEAN;
        }
	| LiteralString
        {
            $datatypes = Symbol.DataTypes.STRING;
        }
	;

