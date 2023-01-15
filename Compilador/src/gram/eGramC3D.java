// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
import compilador.Instruction.OP;
import compilador.Symbol.Types;
import compilador.Symbol.DataTypes;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class eGramC3D extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, VARIABLE=3, CONSTANT=4, FUNCTION=5, RETURN=6, INTEGER=7, 
		BOOLEAN=8, STRING=9, WHILE=10, DO=11, IF=12, ELSE=13, SWITCH=14, CASE=15, 
		DEFAULT=16, BREAK=17, LiteralInteger=18, LiteralBoolean=19, LiteralString=20, 
		LPAREN=21, RPAREN=22, LBRACK=23, RBRACK=24, BEGIN=25, END=26, COMMA=27, 
		SEMI=28, COLON=29, OPREL=30, ASSIGN=31, EQUAL=32, NOTEQUAL=33, GT=34, 
		LT=35, GE=36, LE=37, ADD=38, SUB=39, MULT=40, DIV=41, MOD=42, AND=43, 
		OR=44, NOT=45, ID=46, WS=47, BLOCK_COMMENT=48, LINE_COMMENT=49;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_decl = 2, RULE_declArray = 3, RULE_declArray_ = 4, 
		RULE_numero = 5, RULE_encabezado = 6, RULE_parametros = 7, RULE_parametro = 8, 
		RULE_sents = 9, RULE_sents_ = 10, RULE_sent = 11, RULE_contcase = 12, 
		RULE_contcase_ = 13, RULE_caso = 14, RULE_endcase = 15, RULE_referencia = 16, 
		RULE_idx = 17, RULE_idx_ = 18, RULE_contIdx = 19, RULE_contIdx_ = 20, 
		RULE_expr = 21, RULE_exprOr = 22, RULE_exprOr_ = 23, RULE_exprAnd = 24, 
		RULE_exprAnd_ = 25, RULE_exprNot = 26, RULE_exprComp = 27, RULE_exprComp_ = 28, 
		RULE_exprAdit = 29, RULE_exprAdit_ = 30, RULE_exprMult = 31, RULE_exprMult_ = 32, 
		RULE_exprNeg = 33, RULE_primario = 34, RULE_tipo = 35, RULE_literal = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decl", "declArray", "declArray_", "numero", "encabezado", 
			"parametros", "parametro", "sents", "sents_", "sent", "contcase", "contcase_", 
			"caso", "endcase", "referencia", "idx", "idx_", "contIdx", "contIdx_", 
			"expr", "exprOr", "exprOr_", "exprAnd", "exprAnd_", "exprNot", "exprComp", 
			"exprComp_", "exprAdit", "exprAdit_", "exprMult", "exprMult_", "exprNeg", 
			"primario", "tipo", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'..'", "'indice'", "'var'", "'const'", "'funcion'", "'devolver'", 
			"'ent'", "'logico'", "'palabra'", "'mientras'", "'hacer'", "'si'", "'sino'", 
			"'switch'", "'case'", "'default'", "'break'", null, null, null, "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "';'", "':'", null, "'='", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAIN", "VARIABLE", "CONSTANT", "FUNCTION", "RETURN", "INTEGER", 
			"BOOLEAN", "STRING", "WHILE", "DO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"BREAK", "LiteralInteger", "LiteralBoolean", "LiteralString", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "BEGIN", "END", "COMMA", "SEMI", "COLON", 
			"OPREL", "ASSIGN", "EQUAL", "NOTEQUAL", "GT", "LT", "GE", "LE", "ADD", 
			"SUB", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "ID", "WS", "BLOCK_COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public eGramC3D(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SentsContext sents;
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(eGramC3D.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
				
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(75);
				main();
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(78);
				decl();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			((ProgramContext)_localctx).sents = sents();
			setState(85);
			match(EOF);

				Tag e=te.get(te.newTag(false));
				generate(OP.skip, null, null, e.toString());
				backpatch(((ProgramContext)_localctx).sents.sents_seg,e);
				tv.calcDespOcupVL(tp);
				printC3D();

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public Token MAIN;
		public TerminalNode MAIN() { return getToken(eGramC3D.MAIN, 0); }
		public TerminalNode BEGIN() { return getToken(eGramC3D.BEGIN, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode END() { return getToken(eGramC3D.END, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((MainContext)_localctx).MAIN = match(MAIN);
			setState(89);
			match(BEGIN);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(90);
				decl();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			sents();
			setState(97);
			match(END);

			        Symbol s=new Symbol();
			        int nv=0;
			        try {
			            s=ts.get(((MainContext)_localctx).MAIN.getText());
			            nv=tv.newVar(false,pproc.peek(),Types.VAR, s.dataType());
			            tv.get(nv).setId(s.getId());
			            s.setVariableNumber(nv);
			        } catch(SymbolTable.SymbolTableException e) {
			            System.out.println("Error con la tabla de símbolos: "+e.getMessage());
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public EncabezadoContext encabezado;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode SEMI() { return getToken(eGramC3D.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(eGramC3D.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(eGramC3D.CONSTANT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DeclArrayContext declArray() {
			return getRuleContext(DeclArrayContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(eGramC3D.RBRACK, 0); }
		public TerminalNode FUNCTION() { return getToken(eGramC3D.FUNCTION, 0); }
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(eGramC3D.BEGIN, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				tipo();
				setState(101);
				((DeclContext)_localctx).ID = match(ID);

						Symbol s=new Symbol();
						int nv=0;
						try {
							s=ts.get(((DeclContext)_localctx).ID.getText());
							nv=tv.newVar(false,pproc.peek(),Types.VAR, s.dataType());
							tv.get(nv).setId(s.getId());
							s.setVariableNumber(nv);
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(103);
					match(ASSIGN);
					setState(104);
					((DeclContext)_localctx).expr = expr();

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
									backpatch(((DeclContext)_localctx).expr.cierto,ec);
									backpatch(((DeclContext)_localctx).expr.falso,ef);
								} else {
									generate(OP.copy, ((DeclContext)_localctx).expr.r.toString(), null, tv.get(nv).toString());
								}
						
					}
				}

				setState(109);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(CONSTANT);
				setState(112);
				tipo();
				setState(113);
				((DeclContext)_localctx).ID = match(ID);
				setState(114);
				match(ASSIGN);
				setState(115);
				literal();
				setState(116);
				match(SEMI);

						Symbol s;
						try {
							s = ts.get(((DeclContext)_localctx).ID.getText());
							int nv=tv.newVar(false,pproc.peek(),Symbol.Types.CONST, s.dataType());
							tv.get(nv).setId(s.getId());
							tv.get(nv).setValue(s.getValue());
							s.setVariableNumber(nv);
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				declArray();
				setState(120);
				match(RBRACK);
				setState(121);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(FUNCTION);
				setState(124);
				tipo();
				setState(125);
				((DeclContext)_localctx).encabezado = encabezado();
				setState(126);
				match(BEGIN);

						depth++;
						try{
							ts=ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						pproc.push(((DeclContext)_localctx).encabezado.met.getNp());
						// Crear variables para los parámetros
						Symbol aux=((DeclContext)_localctx).encabezado.s.getNext();
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
						((DeclContext)_localctx).encabezado.met.setStartTag(e.getNe());
						((DeclContext)_localctx).encabezado.met.setNumParams(nparam-1);
						generate(OP.skip, null, null, e.toString());
						generate(OP.pmb, null, null, ((DeclContext)_localctx).encabezado.met.toString());
					
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(128);
					decl();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				sents();

						C3D.get(pc-1).setInstFinal(true);
						pproc.pop();
						depth--;
						ts=ts.blockGoesUp();
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclArrayContext extends ParserRuleContext {
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode LBRACK() { return getToken(eGramC3D.LBRACK, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public DeclArray_Context declArray_() {
			return getRuleContext(DeclArray_Context.class,0);
		}
		public DeclArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterDeclArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitDeclArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclArrayContext declArray() throws RecognitionException {
		DeclArrayContext _localctx = new DeclArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			tipo();
			setState(140);
			((DeclArrayContext)_localctx).ID = match(ID);
			setState(141);
			match(LBRACK);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(142);
				numero();
				setState(143);
				match(T__0);
				}
				break;
			}
			setState(147);
			numero();
			setState(148);
			declArray_();

				Symbol s=null;
				int nv=0;
				try {
					s=ts.get(((DeclArrayContext)_localctx).ID.getText());
					Table dt = s.getTable();
					nv=tv.newVar(false,pproc.peek(),Types.VAR, dt.dataType());
					tv.get(nv).setId(s.getId());
					s.setVariableNumber(nv);
					tv.get(nv).setElements(dt.entradas());
				} catch(SymbolTable.SymbolTableException e) {
					System.out.println("Error con la tabla de símbolos: "+e.getMessage());
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclArray_Context extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(eGramC3D.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(eGramC3D.LBRACK, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public DeclArray_Context declArray_() {
			return getRuleContext(DeclArray_Context.class,0);
		}
		public DeclArray_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declArray_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterDeclArray_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitDeclArray_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitDeclArray_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclArray_Context declArray_() throws RecognitionException {
		DeclArray_Context _localctx = new DeclArray_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_declArray_);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(RBRACK);
				setState(152);
				match(LBRACK);
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(153);
					numero();
					setState(154);
					match(T__0);
					}
					break;
				}
				setState(158);
				numero();
				setState(159);
				declArray_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public int value;
		public boolean constante;
		public TerminalNode LiteralInteger() { return getToken(eGramC3D.LiteralInteger, 0); }
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==LiteralInteger || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EncabezadoContext extends ParserRuleContext {
		public Procedure met;
		public Symbol s;
		public Token ID;
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode LPAREN() { return getToken(eGramC3D.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(eGramC3D.RPAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterEncabezado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitEncabezado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitEncabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_encabezado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((EncabezadoContext)_localctx).ID = match(ID);
			setState(167);
			match(LPAREN);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				setState(168);
				parametros();
				}
			}

			setState(171);
			match(RPAREN);

					Symbol s=new Symbol();
					Procedure met;
					try {
						s=ts.get(((EncabezadoContext)_localctx).ID.getText());
						met=tp.newProc(depth,s.getType(),((EncabezadoContext)_localctx).ID.getText());
						s.setProcedure(met);
						((EncabezadoContext)_localctx).met =  met;
						((EncabezadoContext)_localctx).s = s;
					} catch(SymbolTable.SymbolTableException e) {
						System.out.println("Error con la tabla de símbolos: "+e.getMessage());
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(eGramC3D.COMMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				parametro();
				setState(175);
				match(COMMA);
				setState(176);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				parametro();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			tipo();
			setState(182);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentsContext extends ParserRuleContext {
		public Deque<Integer> sents_seg;
		public SentContext sent;
		public Sents_Context sents_;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sents_Context sents_() {
			return getRuleContext(Sents_Context.class,0);
		}
		public SentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterSents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitSents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitSents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentsContext sents() throws RecognitionException {
		SentsContext _localctx = new SentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((SentsContext)_localctx).sent = sent(_localctx.sents_seg);

					Tag ec = te.get(te.newTag(false));
					generate(OP.skip, null, null, ec.toString());
				
			setState(186);
			((SentsContext)_localctx).sents_ = sents_(_localctx.sents_seg);

					backpatch(((SentsContext)_localctx).sent.sent_seg, ec);
					if(((SentsContext)_localctx).sents_.sents_seg_!=null) {
						((SentsContext)_localctx).sents_seg =  ((SentsContext)_localctx).sents_.sents_seg_;
					} else{
						((SentsContext)_localctx).sents_seg =  ((SentsContext)_localctx).sent.sent_seg;
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sents_Context extends ParserRuleContext {
		public Deque<Integer> sents_seg;
		public Deque<Integer> sents_seg_;
		public SentContext sent;
		public Sents_Context sents_;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sents_Context sents_() {
			return getRuleContext(Sents_Context.class,0);
		}
		public Sents_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sents_Context(ParserRuleContext parent, int invokingState, Deque<Integer> sents_seg) {
			super(parent, invokingState);
			this.sents_seg = sents_seg;
		}
		@Override public int getRuleIndex() { return RULE_sents_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterSents_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitSents_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitSents_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sents_Context sents_(Deque<Integer> sents_seg) throws RecognitionException {
		Sents_Context _localctx = new Sents_Context(_ctx, getState(), sents_seg);
		enterRule(_localctx, 20, RULE_sents_);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((Sents_Context)_localctx).sent = sent(_localctx.sents_seg);

						Tag ec = te.get(te.newTag(false));
						generate(OP.skip, null, null, ec.toString());
					
				setState(191);
				((Sents_Context)_localctx).sents_ = sents_(_localctx.sents_seg);

						backpatch(((Sents_Context)_localctx).sent.sent_seg, ec);
						if(((Sents_Context)_localctx).sents_.sents_seg_!=null) {
							((Sents_Context)_localctx).sents_seg_ =  ((Sents_Context)_localctx).sents_.sents_seg_;
						} else{
							((Sents_Context)_localctx).sents_seg_ =  ((Sents_Context)_localctx).sent.sent_seg;
						}
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public Deque<Integer> sents_seg;
		public Deque<Integer> sent_seg;
		public ExprContext expr;
		public SentsContext sents;
		public ContcaseContext contcase;
		public EndcaseContext endcase;
		public ReferenciaContext referencia;
		public TerminalNode IF() { return getToken(eGramC3D.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> BEGIN() { return getTokens(eGramC3D.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(eGramC3D.BEGIN, i);
		}
		public List<SentsContext> sents() {
			return getRuleContexts(SentsContext.class);
		}
		public SentsContext sents(int i) {
			return getRuleContext(SentsContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(eGramC3D.END); }
		public TerminalNode END(int i) {
			return getToken(eGramC3D.END, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(eGramC3D.ELSE, 0); }
		public ContcaseContext contcase() {
			return getRuleContext(ContcaseContext.class,0);
		}
		public EndcaseContext endcase() {
			return getRuleContext(EndcaseContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(eGramC3D.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(eGramC3D.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(eGramC3D.SEMI, 0); }
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(eGramC3D.ASSIGN, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, Deque<Integer> sents_seg) {
			super(parent, invokingState);
			this.sents_seg = sents_seg;
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent(Deque<Integer> sents_seg) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), sents_seg);
		enterRule(_localctx, 22, RULE_sent);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(IF);
				setState(198);
				((SentContext)_localctx).expr = expr();
				setState(199);
				match(BEGIN);

						try{
							ts=ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						Tag ec = te.get(te.newTag(false));
						generate(OP.skip, null, null, ec.toString());
					
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(201);
					decl();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				((SentContext)_localctx).sents = sents();

						ts=ts.blockGoesUp();
						backpatch(((SentContext)_localctx).expr.cierto, ec);
						((SentContext)_localctx).sent_seg =  concat(((SentContext)_localctx).expr.falso, ((SentContext)_localctx).sents.sents_seg);
					
				setState(209);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(IF);
				setState(212);
				((SentContext)_localctx).expr = expr();
				setState(213);
				match(BEGIN);

						try{
							ts=ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						Tag ec = te.get(te.newTag(false));
						generate(OP.skip, null, null, ec.toString());
					
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(215);
					decl();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				((SentContext)_localctx).sents = sents();

					
				setState(223);
				match(END);

						Deque<Integer> sents_seg1 = new ArrayDeque<Integer>();
						generate(OP.jump, null, null, null);
						sents_seg1.add(pc);
						Tag ef = te.get(te.newTag(false));
						generate(OP.skip, null, null, ef.toString());
					
				setState(225);
				match(ELSE);
				setState(226);
				match(BEGIN);

					
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(228);
					decl();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				((SentContext)_localctx).sents = sents();
				setState(235);
				match(END);

						ts=ts.blockGoesUp();
						backpatch(((SentContext)_localctx).expr.cierto, ec);
						backpatch(((SentContext)_localctx).expr.falso, ef);
						((SentContext)_localctx).sent_seg =  concat(sents_seg1, ((SentContext)_localctx).sents.sents_seg);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				((SentContext)_localctx).contcase = contcase();
				setState(239);
				((SentContext)_localctx).endcase = endcase();
				setState(240);
				match(END);

						generate(OP.skip, null, null, ((SentContext)_localctx).contcase.etest.toString());
						while(((SentContext)_localctx).contcase.pilacond.size()!=0) {
							Tag econd = ((SentContext)_localctx).contcase.pilacond.remove();
							Tag etest = ((SentContext)_localctx).contcase.pilatest.remove();
							Variable v = tv.get(((SentContext)_localctx).contcase.pilavar.remove());
							Tag esent = ((SentContext)_localctx).contcase.pilasent.remove();
							generate(OP.jump, null, null, econd.toString());
							generate(OP.skip, null, null, etest.toString());
							generate(OP.ifEQ, ((SentContext)_localctx).contcase.r.toString(), v.toString(), esent.toString());
						}
						if(((SentContext)_localctx).endcase.e!=null) {
							if(!((SentContext)_localctx).contcase.acababreak && ((SentContext)_localctx).contcase.pilaefi.size()>0) {
								int seg = ((SentContext)_localctx).contcase.pilaefi.removeLast();
								backpatch(seg, ((SentContext)_localctx).endcase.e);
							}
							generate(OP.jump, null, null, ((SentContext)_localctx).endcase.e.toString());
							generate(OP.skip, null, null, ((SentContext)_localctx).endcase.efi.toString());
						}
						Tag efi = te.get(te.newTag(false));
						backpatch(((SentContext)_localctx).contcase.pilaefi, efi);
						generate(OP.skip, null, null, efi.toString());
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(WHILE);

						try{
							ts=ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						Tag ei = te.get(te.newTag(false));
						generate(OP.skip, null, null, ei.toString());
					
				setState(245);
				((SentContext)_localctx).expr = expr();
				setState(246);
				match(BEGIN);

						Tag ec = te.get(te.newTag(false));
						generate(OP.skip, null, null, ec.toString());
					
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(248);
					decl();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				sents();

						ts=ts.blockGoesUp();
						backpatch(((SentContext)_localctx).expr.cierto,ec);
						backpatch(_localctx.sent_seg,ei);
						((SentContext)_localctx).sent_seg = ((SentContext)_localctx).expr.falso;
						generate(OP.jump, null, null, ei.toString());
					
				setState(256);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(RETURN);
				setState(259);
				((SentContext)_localctx).expr = expr();
				setState(260);
				match(SEMI);

						if(((SentContext)_localctx).expr.cierto!=null || ((SentContext)_localctx).expr.falso!=null) {//cambiar
							Tag ec=te.get(te.newTag(false));
							Tag ef=te.get(te.newTag(false));
							Tag efin=te.get(te.newTag(false));
							generate(OP.skip, null, null, ec.toString());
							generate(OP.copy, "-1", null, ((SentContext)_localctx).expr.r.toString());
							((SentContext)_localctx).expr.r.setValue("-1");
							generate(OP.jump, null, null, efin.toString());
							generate(OP.skip, null, null, ef.toString());
							generate(OP.copy, "0", null, ((SentContext)_localctx).expr.r.toString());
							((SentContext)_localctx).expr.r.setValue("0");
							generate(OP.skip, null, null, efin.toString());
							backpatch(((SentContext)_localctx).expr.cierto,ec);
							backpatch(((SentContext)_localctx).expr.falso,ef);
						}
						generate(OP.ret, ((SentContext)_localctx).expr.r.toString(), null, pproc.peek().toString());
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(RETURN);
				setState(264);
				match(SEMI);

						generate(OP.ret, null, null, pproc.peek().toString());
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				((SentContext)_localctx).referencia = referencia();
				setState(267);
				match(ASSIGN);
				setState(268);
				((SentContext)_localctx).expr = expr();
				setState(269);
				match(SEMI);

						if(((SentContext)_localctx).referencia.d!=null) {
							if(((SentContext)_localctx).referencia.datatypes==DataTypes.BOOLEAN) {
								Tag ec=te.get(te.newTag(false));
								Tag ef=te.get(te.newTag(false));
								Tag efin=te.get(te.newTag(false));
								generate(OP.skip, null, null, ec.toString());
								generate(OP.ind_ass, ((SentContext)_localctx).referencia.d.toString(),"-1", ((SentContext)_localctx).referencia.r.toString());
								generate(OP.jump, null, null, efin.toString());
								generate(OP.skip, null, null, ef.toString());
								generate(OP.ind_ass, ((SentContext)_localctx).referencia.d.toString(), "0", ((SentContext)_localctx).referencia.r.toString());
								generate(OP.skip, null, null, efin.toString());
								backpatch(((SentContext)_localctx).expr.cierto,ec);
								backpatch(((SentContext)_localctx).expr.falso,ef);
							} else {
								generate(OP.ind_ass, ((SentContext)_localctx).referencia.d.toString(), ((SentContext)_localctx).expr.r.toString(), ((SentContext)_localctx).referencia.r.toString());
							}
						} else {
							if(((SentContext)_localctx).referencia.datatypes==DataTypes.BOOLEAN) {
								Tag ec=te.get(te.newTag(false));
								Tag ef=te.get(te.newTag(false));
								Tag efin=te.get(te.newTag(false));
								generate(OP.skip, null, null, ec.toString());
								generate(OP.copy, "-1", null, ((SentContext)_localctx).referencia.r.toString());
								generate(OP.jump, null, null, efin.toString());
								generate(OP.skip, null, null, ef.toString());
								generate(OP.copy, "0", null, ((SentContext)_localctx).referencia.r.toString());
								generate(OP.skip, null, null, efin.toString());
								backpatch(((SentContext)_localctx).expr.cierto,ec);
								backpatch(((SentContext)_localctx).expr.falso,ef);
							} else {
								generate(OP.copy, ((SentContext)_localctx).expr.r.toString(), null, ((SentContext)_localctx).referencia.r.toString());
							}
						}
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(272);
				referencia();
				setState(273);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContcaseContext extends ParserRuleContext {
		public Variable r;
		public boolean acababreak;
		public Tag etest;
		public Deque<Integer> pilaefi;
		public Deque<Tag> pilasent;
		public Deque<Integer> pilavar;
		public Deque<Tag> pilacond;
		public Deque<Tag> pilatest;
		public ExprContext expr;
		public Contcase_Context contcase_;
		public TerminalNode SWITCH() { return getToken(eGramC3D.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(eGramC3D.BEGIN, 0); }
		public Contcase_Context contcase_() {
			return getRuleContext(Contcase_Context.class,0);
		}
		public ContcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterContcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitContcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitContcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContcaseContext contcase() throws RecognitionException {
		ContcaseContext _localctx = new ContcaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SWITCH);
			setState(278);
			((ContcaseContext)_localctx).expr = expr();
			setState(279);
			match(BEGIN);

					((ContcaseContext)_localctx).etest =  te.get(te.newTag(false));
					generate(OP.jump, null, null, _localctx.etest.toString());
					((ContcaseContext)_localctx).r =  ((ContcaseContext)_localctx).expr.r;
					((ContcaseContext)_localctx).pilaefi =  new ArrayDeque<>();
					((ContcaseContext)_localctx).pilasent =  new ArrayDeque<Tag>();
					((ContcaseContext)_localctx).pilavar =  new ArrayDeque<Integer>();
					((ContcaseContext)_localctx).pilacond =  new ArrayDeque<Tag>();
					((ContcaseContext)_localctx).pilatest =  new ArrayDeque<Tag>();
				
			setState(281);
			((ContcaseContext)_localctx).contcase_ = contcase_(_localctx.r, true, _localctx.etest, _localctx.pilaefi, _localctx.pilasent, _localctx.pilavar, _localctx.pilacond, _localctx.pilatest);

					((ContcaseContext)_localctx).acababreak =  ((ContcaseContext)_localctx).contcase_.acababreak;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Contcase_Context extends ParserRuleContext {
		public Variable r;
		public boolean acababreak1;
		public Tag etest;
		public Deque<Integer> pilaefi;
		public Deque<Tag> pilasent;
		public Deque<Integer> pilavar;
		public Deque<Tag> pilacond;
		public Deque<Tag> pilatest;
		public boolean acababreak;
		public CasoContext caso;
		public Contcase_Context contcase_;
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public Contcase_Context contcase_() {
			return getRuleContext(Contcase_Context.class,0);
		}
		public Contcase_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Contcase_Context(ParserRuleContext parent, int invokingState, Variable r, boolean acababreak1, Tag etest, Deque<Integer> pilaefi, Deque<Tag> pilasent, Deque<Integer> pilavar, Deque<Tag> pilacond, Deque<Tag> pilatest) {
			super(parent, invokingState);
			this.r = r;
			this.acababreak1 = acababreak1;
			this.etest = etest;
			this.pilaefi = pilaefi;
			this.pilasent = pilasent;
			this.pilavar = pilavar;
			this.pilacond = pilacond;
			this.pilatest = pilatest;
		}
		@Override public int getRuleIndex() { return RULE_contcase_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterContcase_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitContcase_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitContcase_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contcase_Context contcase_(Variable r,boolean acababreak1,Tag etest,Deque<Integer> pilaefi,Deque<Tag> pilasent,Deque<Integer> pilavar,Deque<Tag> pilacond,Deque<Tag> pilatest) throws RecognitionException {
		Contcase_Context _localctx = new Contcase_Context(_ctx, getState(), r, acababreak1, etest, pilaefi, pilasent, pilavar, pilacond, pilatest);
		enterRule(_localctx, 26, RULE_contcase_);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((Contcase_Context)_localctx).caso = caso();

						if(!_localctx.acababreak1 && _localctx.pilaefi.size()>0) {
							int seg = _localctx.pilaefi.removeLast();
							backpatch(seg, ((Contcase_Context)_localctx).caso.esent);
						}
						_localctx.pilaefi.add(((Contcase_Context)_localctx).caso.seg);
						_localctx.pilacond.add(((Contcase_Context)_localctx).caso.econd);
						_localctx.pilavar.add(((Contcase_Context)_localctx).caso.r.nv());
						_localctx.pilatest.add(((Contcase_Context)_localctx).caso.etest);
						_localctx.pilasent.add(((Contcase_Context)_localctx).caso.esent);
					
				setState(286);
				((Contcase_Context)_localctx).contcase_ = contcase_(_localctx.r, ((Contcase_Context)_localctx).caso.acababreak, _localctx.etest, _localctx.pilaefi, _localctx.pilasent, _localctx.pilavar, _localctx.pilacond, _localctx.pilatest);

						((Contcase_Context)_localctx).acababreak = ((Contcase_Context)_localctx).contcase_.acababreak;
					
				}
				break;
			case DEFAULT:
			case END:
				enterOuterAlt(_localctx, 2);
				{

						((Contcase_Context)_localctx).acababreak = _localctx.acababreak1;
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoContext extends ParserRuleContext {
		public Variable r;
		public Tag econd;
		public Tag etest;
		public Tag esent;
		public int seg;
		public boolean acababreak;
		public ExprContext expr;
		public TerminalNode CASE() { return getToken(eGramC3D.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(eGramC3D.COLON, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(eGramC3D.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(eGramC3D.SEMI, 0); }
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CASE);

					((CasoContext)_localctx).econd =  te.get(te.newTag(false));
					generate(OP.skip, null, null, _localctx.econd.toString());
				
			setState(294);
			((CasoContext)_localctx).expr = expr();
			setState(295);
			match(COLON);

					((CasoContext)_localctx).etest =  te.get(te.newTag(false));
					generate(OP.jump, null, null, _localctx.etest.toString());
					((CasoContext)_localctx).esent =  te.get(te.newTag(false));
					generate(OP.skip, null, null, _localctx.esent.toString());
				
			setState(297);
			sents();

					((CasoContext)_localctx).acababreak = false;
				
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(299);
				match(BREAK);
				setState(300);
				match(SEMI);

						((CasoContext)_localctx).acababreak = true;
					
				}
			}


					((CasoContext)_localctx).r =  ((CasoContext)_localctx).expr.r;
					generate(OP.jump, null, null, null);
					((CasoContext)_localctx).seg =  pc;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndcaseContext extends ParserRuleContext {
		public Tag e;
		public Tag efi;
		public TerminalNode DEFAULT() { return getToken(eGramC3D.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(eGramC3D.COLON, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public EndcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterEndcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitEndcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitEndcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndcaseContext endcase() throws RecognitionException {
		EndcaseContext _localctx = new EndcaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endcase);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(DEFAULT);
				setState(307);
				match(COLON);

						((EndcaseContext)_localctx).e =  te.get(te.newTag(false));
						generate(OP.skip, null, null, _localctx.e.toString());
					
				setState(309);
				sents();

						((EndcaseContext)_localctx).efi =  te.get(te.newTag(false));
						generate(OP.jump, null, null, _localctx.efi.toString());
					
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenciaContext extends ParserRuleContext {
		public Variable r;
		public Variable d;
		public DataTypes datatypes;
		public Token ID;
		public IdxContext idx;
		public ContIdxContext contIdx;
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(eGramC3D.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(eGramC3D.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(eGramC3D.RPAREN, 0); }
		public ContIdxContext contIdx() {
			return getRuleContext(ContIdxContext.class,0);
		}
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitReferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitReferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_referencia);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((ReferenciaContext)_localctx).ID = match(ID);

						Symbol s;
						int t;
						try {
							s = ts.get(((ReferenciaContext)_localctx).ID.getText());
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
								((ReferenciaContext)_localctx).r =  tv.get(t);
							} else {
								((ReferenciaContext)_localctx).r =  tv.get(s.getVariableNumber());
							}
							((ReferenciaContext)_localctx).datatypes = s.dataType();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				((ReferenciaContext)_localctx).idx = idx();
				setState(318);
				match(RBRACK);

						Variable t2;
						String nbytes = String.valueOf(((ReferenciaContext)_localctx).idx.dt.ocupacion());
						if(((ReferenciaContext)_localctx).idx.dt.b()==0) {
							t2 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
							generate(OP.mult, ((ReferenciaContext)_localctx).idx.d.toString(), nbytes, t2.toString());
						} else {
							String b = String.valueOf(((ReferenciaContext)_localctx).idx.dt.b());
							Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
							generate(OP.sub, ((ReferenciaContext)_localctx).idx.d.toString(), b, t1.toString());
							t2 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
							generate(OP.mult, t1.toString(), nbytes, t2.toString());
						}
						((ReferenciaContext)_localctx).r =  ((ReferenciaContext)_localctx).idx.r;
						((ReferenciaContext)_localctx).d =  t2;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				((ReferenciaContext)_localctx).ID = match(ID);
				setState(322);
				match(LPAREN);
				setState(323);
				match(RPAREN);

						Symbol s;
						int t;
						try {
							s = ts.get(((ReferenciaContext)_localctx).ID.getText());
							generate(OP.call, null, null, s.getProcedure().toString());
							if(s.getType()==Types.FUNC) {
								t = tv.newVar(true, pproc.peek(),Types.VAR,s.dataType());
								((ReferenciaContext)_localctx).r =  tv.get(t);
								((ReferenciaContext)_localctx).datatypes = s.dataType();
								generate(OP.st, null, null, tv.get(t).toString());
							}
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				((ReferenciaContext)_localctx).contIdx = contIdx();
				setState(326);
				match(RPAREN);

						int t;
						while(((ReferenciaContext)_localctx).contIdx.pparams.size()>0)
						generate(OP.params, null, null, ((ReferenciaContext)_localctx).contIdx.pparams.pop().toString());
						generate(OP.call, null, null, ((ReferenciaContext)_localctx).contIdx.met.toString());
						if(((ReferenciaContext)_localctx).contIdx.s.getType()==Types.FUNC) {
							t = tv.newVar(true, pproc.peek(),Types.VAR,((ReferenciaContext)_localctx).contIdx.s.dataType());
							((ReferenciaContext)_localctx).r =  tv.get(t);
							((ReferenciaContext)_localctx).datatypes =  ((ReferenciaContext)_localctx).contIdx.s.dataType();
							generate(OP.st, null, null, tv.get(t).toString());
						}
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdxContext extends ParserRuleContext {
		public Table dt;
		public Variable r;
		public Variable d;
		public Token ID;
		public ExprContext expr;
		public Idx_Context idx_;
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode LBRACK() { return getToken(eGramC3D.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Idx_Context idx_() {
			return getRuleContext(Idx_Context.class,0);
		}
		public IdxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdxContext idx() throws RecognitionException {
		IdxContext _localctx = new IdxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((IdxContext)_localctx).ID = match(ID);
			setState(332);
			match(LBRACK);
			setState(333);
			((IdxContext)_localctx).expr = expr();

					Symbol dv = null;
					try {
						dv = ts.get(((IdxContext)_localctx).ID.getText());
					} catch(SymbolTable.SymbolTableException e) {
						System.out.println("Error con la tabla de símbolos: "+e.getMessage());
					}
					((IdxContext)_localctx).dt =  dv.getTable();
					Index idx = _localctx.dt.primerIndice();
					((IdxContext)_localctx).r =  tv.get(dv.getVariableNumber());
					Variable d = ((IdxContext)_localctx).expr.r;
				
			setState(335);
			((IdxContext)_localctx).idx_ = idx_(idx, d);

					((IdxContext)_localctx).d =  ((IdxContext)_localctx).idx_.d;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Idx_Context extends ParserRuleContext {
		public Index idx1;
		public Variable d1;
		public Variable d;
		public ExprContext expr;
		public Idx_Context idx_;
		public TerminalNode RBRACK() { return getToken(eGramC3D.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(eGramC3D.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Idx_Context idx_() {
			return getRuleContext(Idx_Context.class,0);
		}
		public Idx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Idx_Context(ParserRuleContext parent, int invokingState, Index idx1, Variable d1) {
			super(parent, invokingState);
			this.idx1 = idx1;
			this.d1 = d1;
		}
		@Override public int getRuleIndex() { return RULE_idx_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterIdx_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitIdx_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitIdx_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idx_Context idx_(Index idx1,Variable d1) throws RecognitionException {
		Idx_Context _localctx = new Idx_Context(_ctx, getState(), idx1, d1);
		enterRule(_localctx, 36, RULE_idx_);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(RBRACK);
				setState(339);
				match(LBRACK);
				setState(340);
				((Idx_Context)_localctx).expr = expr();

						Index idx = idx1.getNextIndex();
						Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
						generate(OP.mult, _localctx.d1.toString(), String.valueOf(idx.d()), t1.toString());
						Variable t2 = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
						generate(OP.add, t1.toString(), ((Idx_Context)_localctx).expr.r.toString(), t2.toString());
					
				setState(342);
				((Idx_Context)_localctx).idx_ = idx_(idx, t2);

						((Idx_Context)_localctx).d = ((Idx_Context)_localctx).idx_.d;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

						((Idx_Context)_localctx).d = _localctx.d1; // Devuelve la misma variable que recibe
					
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContIdxContext extends ParserRuleContext {
		public Deque<Variable> pparams;
		public Procedure met;
		public Symbol s;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode LPAREN() { return getToken(eGramC3D.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContIdx_Context contIdx_() {
			return getRuleContext(ContIdx_Context.class,0);
		}
		public ContIdxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contIdx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterContIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitContIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitContIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContIdxContext contIdx() throws RecognitionException {
		ContIdxContext _localctx = new ContIdxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_contIdx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((ContIdxContext)_localctx).ID = match(ID);
			setState(349);
			match(LPAREN);
			setState(350);
			((ContIdxContext)_localctx).expr = expr();

					Symbol s=new Symbol();
					((ContIdxContext)_localctx).pparams =  new ArrayDeque<Variable>();
					try {
						s = ts.get(((ContIdxContext)_localctx).ID.getText());
						((ContIdxContext)_localctx).s =  s;
						((ContIdxContext)_localctx).met =  s.getProcedure();
						_localctx.pparams.push(((ContIdxContext)_localctx).expr.r);
						// Boolean parámetro
						if(((ContIdxContext)_localctx).expr.cierto!=null || ((ContIdxContext)_localctx).expr.falso!=null) {
							Tag ec=te.get(te.newTag(false));
							Tag ef=te.get(te.newTag(false));
							Tag efin=te.get(te.newTag(false));
							generate(OP.skip, null, null, ec.toString());
							generate(OP.copy, "-1", null, ((ContIdxContext)_localctx).expr.r.toString());
							generate(OP.jump, null, null, efin.toString());
							generate(OP.skip, null, null, ef.toString());
							generate(OP.copy, "0", null, ((ContIdxContext)_localctx).expr.r.toString());
							generate(OP.skip, null, null, efin.toString());
							backpatch(((ContIdxContext)_localctx).expr.cierto,ec);
							backpatch(((ContIdxContext)_localctx).expr.falso,ef);
						}
					} catch(SymbolTable.SymbolTableException e) {
						System.out.println("Error con la tabla de símbolos: "+e.getMessage());
					}
				
			setState(352);
			contIdx_(_localctx.pparams);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContIdx_Context extends ParserRuleContext {
		public Deque<Variable> pparams;
		public ExprContext expr;
		public TerminalNode COMMA() { return getToken(eGramC3D.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContIdx_Context contIdx_() {
			return getRuleContext(ContIdx_Context.class,0);
		}
		public ContIdx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ContIdx_Context(ParserRuleContext parent, int invokingState, Deque<Variable> pparams) {
			super(parent, invokingState);
			this.pparams = pparams;
		}
		@Override public int getRuleIndex() { return RULE_contIdx_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterContIdx_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitContIdx_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitContIdx_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContIdx_Context contIdx_(Deque<Variable> pparams) throws RecognitionException {
		ContIdx_Context _localctx = new ContIdx_Context(_ctx, getState(), pparams);
		enterRule(_localctx, 40, RULE_contIdx_);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(COMMA);
				setState(355);
				((ContIdx_Context)_localctx).expr = expr();

						_localctx.pparams.push(((ContIdx_Context)_localctx).expr.r);
						// Boolean parámetro
						if(((ContIdx_Context)_localctx).expr.cierto!=null || ((ContIdx_Context)_localctx).expr.falso!=null) {
							Tag ec=te.get(te.newTag(false));
							Tag ef=te.get(te.newTag(false));
							Tag efin=te.get(te.newTag(false));
							generate(OP.skip, null, null, ec.toString());
							generate(OP.copy, "-1", null, ((ContIdx_Context)_localctx).expr.r.toString());
							generate(OP.jump, null, null, efin.toString());
							generate(OP.skip, null, null, ef.toString());
							generate(OP.copy, "0", null, ((ContIdx_Context)_localctx).expr.r.toString());
							generate(OP.skip, null, null, efin.toString());
							backpatch(((ContIdx_Context)_localctx).expr.cierto,ec);
							backpatch(((ContIdx_Context)_localctx).expr.falso,ef);
						}
					
				setState(357);
				contIdx_(_localctx.pparams);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprOrContext exprOr;
		public ExprOrContext exprOr() {
			return getRuleContext(ExprOrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((ExprContext)_localctx).exprOr = exprOr();

					((ExprContext)_localctx).r = ((ExprContext)_localctx).exprOr.r;
					((ExprContext)_localctx).cierto = ((ExprContext)_localctx).exprOr.cierto;
					((ExprContext)_localctx).falso = ((ExprContext)_localctx).exprOr.falso;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprAndContext exprAnd;
		public ExprOr_Context exprOr_;
		public ExprAndContext exprAnd() {
			return getRuleContext(ExprAndContext.class,0);
		}
		public ExprOr_Context exprOr_() {
			return getRuleContext(ExprOr_Context.class,0);
		}
		public ExprOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOrContext exprOr() throws RecognitionException {
		ExprOrContext _localctx = new ExprOrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((ExprOrContext)_localctx).exprAnd = exprAnd();

					((ExprOrContext)_localctx).r = ((ExprOrContext)_localctx).exprAnd.r;
					((ExprOrContext)_localctx).cierto = ((ExprOrContext)_localctx).exprAnd.cierto;
					((ExprOrContext)_localctx).falso = ((ExprOrContext)_localctx).exprAnd.falso;
				
			setState(367);
			((ExprOrContext)_localctx).exprOr_ = exprOr_(_localctx.r,_localctx.cierto,_localctx.falso);

					if(((ExprOrContext)_localctx).exprOr_.cierto!=null || ((ExprOrContext)_localctx).exprOr_.falso!=null) {
						((ExprOrContext)_localctx).r =  ((ExprOrContext)_localctx).exprOr_.r;
						((ExprOrContext)_localctx).cierto = ((ExprOrContext)_localctx).exprOr_.cierto;
						((ExprOrContext)_localctx).falso = ((ExprOrContext)_localctx).exprOr_.falso;
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOr_Context extends ParserRuleContext {
		public Variable t1;
		public Deque<Integer> cierto1;
		public Deque<Integer> falso1;
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprAndContext exprAnd;
		public ExprOr_Context exprOr_;
		public TerminalNode OR() { return getToken(eGramC3D.OR, 0); }
		public ExprAndContext exprAnd() {
			return getRuleContext(ExprAndContext.class,0);
		}
		public ExprOr_Context exprOr_() {
			return getRuleContext(ExprOr_Context.class,0);
		}
		public ExprOr_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprOr_Context(ParserRuleContext parent, int invokingState, Variable t1, Deque<Integer> cierto1, Deque<Integer> falso1) {
			super(parent, invokingState);
			this.t1 = t1;
			this.cierto1 = cierto1;
			this.falso1 = falso1;
		}
		@Override public int getRuleIndex() { return RULE_exprOr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprOr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprOr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprOr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOr_Context exprOr_(Variable t1,Deque<Integer> cierto1,Deque<Integer> falso1) throws RecognitionException {
		ExprOr_Context _localctx = new ExprOr_Context(_ctx, getState(), t1, cierto1, falso1);
		enterRule(_localctx, 46, RULE_exprOr_);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(OR);

						Tag e = te.get(te.newTag(false));
						generate(OP.skip, null, null, e.toString());
					
				setState(372);
				((ExprOr_Context)_localctx).exprAnd = exprAnd();

						backpatch(_localctx.falso1, e);
						((ExprOr_Context)_localctx).cierto =  concat(_localctx.cierto1, ((ExprOr_Context)_localctx).exprAnd.cierto);
						((ExprOr_Context)_localctx).falso =  ((ExprOr_Context)_localctx).exprAnd.falso;
					
				setState(374);
				((ExprOr_Context)_localctx).exprOr_ = exprOr_(_localctx.r,_localctx.cierto,_localctx.falso);

						if(((ExprOr_Context)_localctx).exprOr_.cierto!=null || ((ExprOr_Context)_localctx).exprOr_.falso!=null) {
							((ExprOr_Context)_localctx).r =  ((ExprOr_Context)_localctx).exprOr_.r;
							((ExprOr_Context)_localctx).cierto = ((ExprOr_Context)_localctx).exprOr_.cierto;
							((ExprOr_Context)_localctx).falso = ((ExprOr_Context)_localctx).exprOr_.falso;
						}
					
				}
				break;
			case RPAREN:
			case RBRACK:
			case BEGIN:
			case COMMA:
			case SEMI:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprNotContext exprNot;
		public ExprAnd_Context exprAnd_;
		public ExprNotContext exprNot() {
			return getRuleContext(ExprNotContext.class,0);
		}
		public ExprAnd_Context exprAnd_() {
			return getRuleContext(ExprAnd_Context.class,0);
		}
		public ExprAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAndContext exprAnd() throws RecognitionException {
		ExprAndContext _localctx = new ExprAndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((ExprAndContext)_localctx).exprNot = exprNot();

					((ExprAndContext)_localctx).r = ((ExprAndContext)_localctx).exprNot.r;
					((ExprAndContext)_localctx).cierto = ((ExprAndContext)_localctx).exprNot.cierto;
					((ExprAndContext)_localctx).falso = ((ExprAndContext)_localctx).exprNot.falso;
				
			setState(382);
			((ExprAndContext)_localctx).exprAnd_ = exprAnd_(_localctx.r,_localctx.cierto,_localctx.falso);

					if(((ExprAndContext)_localctx).exprAnd_.cierto!=null || ((ExprAndContext)_localctx).exprAnd_.falso!=null) {
						((ExprAndContext)_localctx).r =  ((ExprAndContext)_localctx).exprAnd_.r;
						((ExprAndContext)_localctx).cierto = ((ExprAndContext)_localctx).exprAnd_.cierto;
						((ExprAndContext)_localctx).falso = ((ExprAndContext)_localctx).exprAnd_.falso;
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAnd_Context extends ParserRuleContext {
		public Variable t1;
		public Deque<Integer> cierto1;
		public Deque<Integer> falso1;
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprNotContext exprNot;
		public ExprAnd_Context exprAnd_;
		public TerminalNode AND() { return getToken(eGramC3D.AND, 0); }
		public ExprNotContext exprNot() {
			return getRuleContext(ExprNotContext.class,0);
		}
		public ExprAnd_Context exprAnd_() {
			return getRuleContext(ExprAnd_Context.class,0);
		}
		public ExprAnd_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprAnd_Context(ParserRuleContext parent, int invokingState, Variable t1, Deque<Integer> cierto1, Deque<Integer> falso1) {
			super(parent, invokingState);
			this.t1 = t1;
			this.cierto1 = cierto1;
			this.falso1 = falso1;
		}
		@Override public int getRuleIndex() { return RULE_exprAnd_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprAnd_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprAnd_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprAnd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAnd_Context exprAnd_(Variable t1,Deque<Integer> cierto1,Deque<Integer> falso1) throws RecognitionException {
		ExprAnd_Context _localctx = new ExprAnd_Context(_ctx, getState(), t1, cierto1, falso1);
		enterRule(_localctx, 50, RULE_exprAnd_);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(AND);

						Tag e = te.get(te.newTag(false));
						generate(OP.skip, null, null, e.toString());
					
				setState(387);
				((ExprAnd_Context)_localctx).exprNot = exprNot();

						backpatch(_localctx.cierto1, e);
						((ExprAnd_Context)_localctx).falso =  concat(_localctx.falso1, ((ExprAnd_Context)_localctx).exprNot.falso);
						((ExprAnd_Context)_localctx).cierto =  ((ExprAnd_Context)_localctx).exprNot.cierto;
					
				setState(389);
				((ExprAnd_Context)_localctx).exprAnd_ = exprAnd_(_localctx.r, _localctx.cierto, _localctx.falso);

						if(((ExprAnd_Context)_localctx).exprAnd_.cierto!=null || ((ExprAnd_Context)_localctx).exprAnd_.falso!=null) {
							((ExprAnd_Context)_localctx).r =  ((ExprAnd_Context)_localctx).exprAnd_.r;
							((ExprAnd_Context)_localctx).cierto = ((ExprAnd_Context)_localctx).exprAnd_.cierto;
							((ExprAnd_Context)_localctx).falso = ((ExprAnd_Context)_localctx).exprAnd_.falso;
						}
					
				}
				break;
			case RPAREN:
			case RBRACK:
			case BEGIN:
			case COMMA:
			case SEMI:
			case COLON:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprCompContext exprComp;
		public TerminalNode NOT() { return getToken(eGramC3D.NOT, 0); }
		public ExprCompContext exprComp() {
			return getRuleContext(ExprCompContext.class,0);
		}
		public ExprNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNotContext exprNot() throws RecognitionException {
		ExprNotContext _localctx = new ExprNotContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprNot);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(NOT);
				setState(396);
				((ExprNotContext)_localctx).exprComp = exprComp();

						((ExprNotContext)_localctx).cierto = ((ExprNotContext)_localctx).exprComp.falso;
						((ExprNotContext)_localctx).falso = ((ExprNotContext)_localctx).exprComp.cierto;
						((ExprNotContext)_localctx).r = ((ExprNotContext)_localctx).exprComp.r;
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case SUB:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				((ExprNotContext)_localctx).exprComp = exprComp();

						((ExprNotContext)_localctx).cierto = ((ExprNotContext)_localctx).exprComp.cierto;
						((ExprNotContext)_localctx).falso = ((ExprNotContext)_localctx).exprComp.falso;
						((ExprNotContext)_localctx).r = ((ExprNotContext)_localctx).exprComp.r;
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprAditContext exprAdit;
		public ExprComp_Context exprComp_;
		public ExprAditContext exprAdit() {
			return getRuleContext(ExprAditContext.class,0);
		}
		public ExprComp_Context exprComp_() {
			return getRuleContext(ExprComp_Context.class,0);
		}
		public ExprCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCompContext exprComp() throws RecognitionException {
		ExprCompContext _localctx = new ExprCompContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((ExprCompContext)_localctx).exprAdit = exprAdit();

					((ExprCompContext)_localctx).r = ((ExprCompContext)_localctx).exprAdit.r;
					((ExprCompContext)_localctx).cierto = ((ExprCompContext)_localctx).exprAdit.cierto;
					((ExprCompContext)_localctx).falso = ((ExprCompContext)_localctx).exprAdit.falso;
				
			setState(406);
			((ExprCompContext)_localctx).exprComp_ = exprComp_(_localctx.r);

					if(((ExprCompContext)_localctx).exprComp_.cierto!=null || ((ExprCompContext)_localctx).exprComp_.falso!=null) {
						((ExprCompContext)_localctx).cierto = ((ExprCompContext)_localctx).exprComp_.cierto;
						((ExprCompContext)_localctx).falso = ((ExprCompContext)_localctx).exprComp_.falso;
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprComp_Context extends ParserRuleContext {
		public Variable t1;
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public Token OPREL;
		public ExprAditContext exprAdit;
		public TerminalNode OPREL() { return getToken(eGramC3D.OPREL, 0); }
		public ExprAditContext exprAdit() {
			return getRuleContext(ExprAditContext.class,0);
		}
		public ExprComp_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprComp_Context(ParserRuleContext parent, int invokingState, Variable t1) {
			super(parent, invokingState);
			this.t1 = t1;
		}
		@Override public int getRuleIndex() { return RULE_exprComp_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprComp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprComp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprComp_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprComp_Context exprComp_(Variable t1) throws RecognitionException {
		ExprComp_Context _localctx = new ExprComp_Context(_ctx, getState(), t1);
		enterRule(_localctx, 56, RULE_exprComp_);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				((ExprComp_Context)_localctx).OPREL = match(OPREL);
				setState(410);
				((ExprComp_Context)_localctx).exprAdit = exprAdit();

						generate(condJumpValue(((ExprComp_Context)_localctx).OPREL.getText()), _localctx.t1.toString(), ((ExprComp_Context)_localctx).exprAdit.r.toString(), null);
						((ExprComp_Context)_localctx).cierto = new ArrayDeque<Integer>();
				 		_localctx.cierto.add(pc);
						generate(OP.jump, null, null, null);
						((ExprComp_Context)_localctx).falso = new ArrayDeque<Integer>();
				 		_localctx.falso.add(pc);
						((ExprComp_Context)_localctx).r =  ((ExprComp_Context)_localctx).exprAdit.r;
				    
				}
				break;
			case RPAREN:
			case RBRACK:
			case BEGIN:
			case COMMA:
			case SEMI:
			case COLON:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAditContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprMultContext exprMult;
		public ExprAdit_Context exprAdit_;
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdit_Context exprAdit_() {
			return getRuleContext(ExprAdit_Context.class,0);
		}
		public ExprAditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAdit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprAdit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprAdit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprAdit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAditContext exprAdit() throws RecognitionException {
		ExprAditContext _localctx = new ExprAditContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprAdit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			((ExprAditContext)_localctx).exprMult = exprMult();

					((ExprAditContext)_localctx).r =  ((ExprAditContext)_localctx).exprMult.r;
					((ExprAditContext)_localctx).cierto = ((ExprAditContext)_localctx).exprMult.cierto;
					((ExprAditContext)_localctx).falso = ((ExprAditContext)_localctx).exprMult.falso;
				
			setState(418);
			((ExprAditContext)_localctx).exprAdit_ = exprAdit_(_localctx.r);

					if(((ExprAditContext)_localctx).exprAdit_.cierto!=null || ((ExprAditContext)_localctx).exprAdit_.falso!=null || ((ExprAditContext)_localctx).exprAdit_.r!=null) {
						((ExprAditContext)_localctx).r = ((ExprAditContext)_localctx).exprAdit_.r;
						((ExprAditContext)_localctx).cierto = ((ExprAditContext)_localctx).exprAdit_.cierto;
						((ExprAditContext)_localctx).falso = ((ExprAditContext)_localctx).exprAdit_.falso;
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAdit_Context extends ParserRuleContext {
		public Variable t1;
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer > falso;
		public ExprMultContext exprMult;
		public ExprAdit_Context exprAdit_;
		public TerminalNode ADD() { return getToken(eGramC3D.ADD, 0); }
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdit_Context exprAdit_() {
			return getRuleContext(ExprAdit_Context.class,0);
		}
		public TerminalNode SUB() { return getToken(eGramC3D.SUB, 0); }
		public ExprAdit_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprAdit_Context(ParserRuleContext parent, int invokingState, Variable t1) {
			super(parent, invokingState);
			this.t1 = t1;
		}
		@Override public int getRuleIndex() { return RULE_exprAdit_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprAdit_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprAdit_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprAdit_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAdit_Context exprAdit_(Variable t1) throws RecognitionException {
		ExprAdit_Context _localctx = new ExprAdit_Context(_ctx, getState(), t1);
		enterRule(_localctx, 60, RULE_exprAdit_);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(ADD);
				setState(422);
				((ExprAdit_Context)_localctx).exprMult = exprMult();

						int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
						generate(OP.add, _localctx.t1.toString(), ((ExprAdit_Context)_localctx).exprMult.r.toString(), tv.get(t).toString());
						((ExprAdit_Context)_localctx).r = tv.get(t);
						((ExprAdit_Context)_localctx).cierto = ((ExprAdit_Context)_localctx).exprMult.cierto;
						((ExprAdit_Context)_localctx).falso = ((ExprAdit_Context)_localctx).exprMult.falso;
					
				setState(424);
				((ExprAdit_Context)_localctx).exprAdit_ = exprAdit_(_localctx.r);

						if(((ExprAdit_Context)_localctx).exprAdit_.r!=null || ((ExprAdit_Context)_localctx).exprAdit_.cierto!=null || ((ExprAdit_Context)_localctx).exprAdit_.falso!=null) {
							((ExprAdit_Context)_localctx).r = ((ExprAdit_Context)_localctx).exprAdit_.r;
							((ExprAdit_Context)_localctx).cierto = ((ExprAdit_Context)_localctx).exprAdit_.cierto;
							((ExprAdit_Context)_localctx).falso = ((ExprAdit_Context)_localctx).exprAdit_.falso;
						}
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(SUB);
				setState(428);
				((ExprAdit_Context)_localctx).exprMult = exprMult();

						int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
						generate(OP.sub, _localctx.t1.toString(), ((ExprAdit_Context)_localctx).exprMult.r.toString(), tv.get(t).toString());
						((ExprAdit_Context)_localctx).r = tv.get(t);
						((ExprAdit_Context)_localctx).cierto = ((ExprAdit_Context)_localctx).exprMult.cierto;
						((ExprAdit_Context)_localctx).falso = ((ExprAdit_Context)_localctx).exprMult.falso;
					
				setState(430);
				((ExprAdit_Context)_localctx).exprAdit_ = exprAdit_(_localctx.r);

						if(((ExprAdit_Context)_localctx).exprAdit_.r!=null || ((ExprAdit_Context)_localctx).exprAdit_.cierto!=null || ((ExprAdit_Context)_localctx).exprAdit_.falso!=null) {
							((ExprAdit_Context)_localctx).r = ((ExprAdit_Context)_localctx).exprAdit_.r;
							((ExprAdit_Context)_localctx).cierto = ((ExprAdit_Context)_localctx).exprAdit_.cierto;
							((ExprAdit_Context)_localctx).falso = ((ExprAdit_Context)_localctx).exprAdit_.falso;
						}
					
				}
				break;
			case RPAREN:
			case RBRACK:
			case BEGIN:
			case COMMA:
			case SEMI:
			case COLON:
			case OPREL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprNegContext exprNeg;
		public ExprMult_Context exprMult_;
		public ExprNegContext exprNeg() {
			return getRuleContext(ExprNegContext.class,0);
		}
		public ExprMult_Context exprMult_() {
			return getRuleContext(ExprMult_Context.class,0);
		}
		public ExprMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultContext exprMult() throws RecognitionException {
		ExprMultContext _localctx = new ExprMultContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			((ExprMultContext)_localctx).exprNeg = exprNeg();

					((ExprMultContext)_localctx).r =  ((ExprMultContext)_localctx).exprNeg.r;
					((ExprMultContext)_localctx).cierto = ((ExprMultContext)_localctx).exprNeg.cierto;
					((ExprMultContext)_localctx).falso = ((ExprMultContext)_localctx).exprNeg.falso;
				
			setState(438);
			((ExprMultContext)_localctx).exprMult_ = exprMult_(_localctx.r);

					if(((ExprMultContext)_localctx).exprMult_.r!=null || ((ExprMultContext)_localctx).exprMult_.cierto!=null || ((ExprMultContext)_localctx).exprMult_.falso!=null) {
						((ExprMultContext)_localctx).r = ((ExprMultContext)_localctx).exprMult_.r;
						((ExprMultContext)_localctx).cierto = ((ExprMultContext)_localctx).exprMult_.cierto;
						((ExprMultContext)_localctx).falso = ((ExprMultContext)_localctx).exprMult_.falso;
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMult_Context extends ParserRuleContext {
		public Variable t1;
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprNegContext exprNeg;
		public ExprMult_Context exprMult_;
		public TerminalNode MULT() { return getToken(eGramC3D.MULT, 0); }
		public ExprNegContext exprNeg() {
			return getRuleContext(ExprNegContext.class,0);
		}
		public ExprMult_Context exprMult_() {
			return getRuleContext(ExprMult_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(eGramC3D.DIV, 0); }
		public TerminalNode MOD() { return getToken(eGramC3D.MOD, 0); }
		public ExprMult_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprMult_Context(ParserRuleContext parent, int invokingState, Variable t1) {
			super(parent, invokingState);
			this.t1 = t1;
		}
		@Override public int getRuleIndex() { return RULE_exprMult_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprMult_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprMult_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprMult_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMult_Context exprMult_(Variable t1) throws RecognitionException {
		ExprMult_Context _localctx = new ExprMult_Context(_ctx, getState(), t1);
		enterRule(_localctx, 64, RULE_exprMult_);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(MULT);
				setState(442);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

						int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
						generate(OP.mult, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.r.toString(), tv.get(t).toString());
						((ExprMult_Context)_localctx).r = tv.get(t);
						((ExprMult_Context)_localctx).cierto = ((ExprMult_Context)_localctx).exprNeg.cierto;
						((ExprMult_Context)_localctx).falso = ((ExprMult_Context)_localctx).exprNeg.falso;
					
				setState(444);
				((ExprMult_Context)_localctx).exprMult_ = exprMult_(_localctx.r);

						if(((ExprMult_Context)_localctx).exprMult_.r!=null || ((ExprMult_Context)_localctx).exprMult_.cierto!=null || ((ExprMult_Context)_localctx).exprMult_.falso!=null) {
							((ExprMult_Context)_localctx).r = ((ExprMult_Context)_localctx).exprMult_.r;
							((ExprMult_Context)_localctx).cierto = ((ExprMult_Context)_localctx).exprMult_.cierto;
							((ExprMult_Context)_localctx).falso = ((ExprMult_Context)_localctx).exprMult_.falso;
						}
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(DIV);
				setState(448);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

						int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
						generate(OP.div, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.r.toString(), tv.get(t).toString());
						((ExprMult_Context)_localctx).r = tv.get(t);
						((ExprMult_Context)_localctx).cierto = ((ExprMult_Context)_localctx).exprNeg.cierto;
						((ExprMult_Context)_localctx).falso = ((ExprMult_Context)_localctx).exprNeg.falso;
					
				setState(450);
				((ExprMult_Context)_localctx).exprMult_ = exprMult_(_localctx.r);

						if(((ExprMult_Context)_localctx).exprMult_.r!=null || ((ExprMult_Context)_localctx).exprMult_.cierto!=null || ((ExprMult_Context)_localctx).exprMult_.falso!=null) {
							((ExprMult_Context)_localctx).r = ((ExprMult_Context)_localctx).exprMult_.r;
							((ExprMult_Context)_localctx).cierto = ((ExprMult_Context)_localctx).exprMult_.cierto;
							((ExprMult_Context)_localctx).falso = ((ExprMult_Context)_localctx).exprMult_.falso;
						}
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(MOD);
				setState(454);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

						int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
						generate(OP.mod, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.r.toString(), tv.get(t).toString());
						((ExprMult_Context)_localctx).r = tv.get(t);
						((ExprMult_Context)_localctx).cierto = ((ExprMult_Context)_localctx).exprNeg.cierto;
						((ExprMult_Context)_localctx).falso = ((ExprMult_Context)_localctx).exprNeg.falso;
					
				setState(456);
				((ExprMult_Context)_localctx).exprMult_ = exprMult_(_localctx.r);

						if(((ExprMult_Context)_localctx).exprMult_.r!=null || ((ExprMult_Context)_localctx).exprMult_.cierto!=null || ((ExprMult_Context)_localctx).exprMult_.falso!=null) {
							((ExprMult_Context)_localctx).r = ((ExprMult_Context)_localctx).exprMult_.r;
							((ExprMult_Context)_localctx).cierto = ((ExprMult_Context)_localctx).exprMult_.cierto;
							((ExprMult_Context)_localctx).falso = ((ExprMult_Context)_localctx).exprMult_.falso;
						}
					
				}
				break;
			case RPAREN:
			case RBRACK:
			case BEGIN:
			case COMMA:
			case SEMI:
			case COLON:
			case OPREL:
			case ADD:
			case SUB:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public PrimarioContext primario;
		public TerminalNode SUB() { return getToken(eGramC3D.SUB, 0); }
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public ExprNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNegContext exprNeg() throws RecognitionException {
		ExprNegContext _localctx = new ExprNegContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprNeg);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(SUB);
				setState(463);
				((ExprNegContext)_localctx).primario = primario();

						int t = tv.newVar(true,pproc.peek(),Types.VAR,DataTypes.INT);
						generate(OP.neg, ((ExprNegContext)_localctx).primario.r.toString(), null, tv.get(t).toString());
						((ExprNegContext)_localctx).r =  tv.get(t);
						((ExprNegContext)_localctx).cierto =  ((ExprNegContext)_localctx).primario.cierto;
						((ExprNegContext)_localctx).falso =  ((ExprNegContext)_localctx).primario.falso;
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				((ExprNegContext)_localctx).primario = primario();

						((ExprNegContext)_localctx).r =  ((ExprNegContext)_localctx).primario.r;
						((ExprNegContext)_localctx).cierto =  ((ExprNegContext)_localctx).primario.cierto;
						((ExprNegContext)_localctx).falso =  ((ExprNegContext)_localctx).primario.falso;
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends ParserRuleContext {
		public Variable r;
		public Deque<Integer> cierto;
		public Deque<Integer> falso;
		public ExprContext expr;
		public ReferenciaContext referencia;
		public LiteralContext literal;
		public TerminalNode LPAREN() { return getToken(eGramC3D.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(eGramC3D.RPAREN, 0); }
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primario);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(LPAREN);
				setState(472);
				((PrimarioContext)_localctx).expr = expr();
				setState(473);
				match(RPAREN);

						((PrimarioContext)_localctx).r =  ((PrimarioContext)_localctx).expr.r;
						((PrimarioContext)_localctx).cierto =  ((PrimarioContext)_localctx).expr.cierto;
						((PrimarioContext)_localctx).falso =  ((PrimarioContext)_localctx).expr.falso;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				((PrimarioContext)_localctx).referencia = referencia();

						if(((PrimarioContext)_localctx).referencia.d!=null) {
							// Caso para cuando hay desplazamiento
							Variable t = tv.get(tv.newVar(true, pproc.peek(), Types.VAR, DataTypes.INT));
							generate(OP.ind_val, ((PrimarioContext)_localctx).referencia.r.toString(), ((PrimarioContext)_localctx).referencia.d.toString(), t.toString());
							((PrimarioContext)_localctx).r =  t;
						} else {
							((PrimarioContext)_localctx).r =  ((PrimarioContext)_localctx).referencia.r;
						}
						if(((PrimarioContext)_localctx).referencia.datatypes==DataTypes.BOOLEAN) {
							generate(OP.ifEQ, _localctx.r.toString(), "-1", null);
							((PrimarioContext)_localctx).cierto = new ArrayDeque<Integer>();
							_localctx.cierto.add(pc);
							generate(OP.jump, null, null, null);
							((PrimarioContext)_localctx).falso = new ArrayDeque<Integer>();
							_localctx.falso.add(pc);
						}
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				((PrimarioContext)_localctx).literal = literal();

						int t=0;
						switch(((PrimarioContext)_localctx).literal.datatypes) {
							case BOOLEAN:
								t = tv.newVar(true,pproc.peek(), Types.VAR,DataTypes.BOOLEAN);
								if((((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null).equals("true")) {
									generate(OP.copy, "-1", null, tv.get(t).toString());
									tv.get(t).setValue("-1");
									generate(OP.jump, null, null, null);
									((PrimarioContext)_localctx).cierto = new ArrayDeque<Integer>();
									_localctx.cierto.add(pc);
									((PrimarioContext)_localctx).falso =  null;
								} else {
									generate(OP.copy, "0", null, tv.get(t).toString());
									tv.get(t).setValue("0");
									generate(OP.jump, null, null, null);
									((PrimarioContext)_localctx).falso = new ArrayDeque<Integer>();
									_localctx.falso.add(pc);
									((PrimarioContext)_localctx).cierto =  null;
								}
								break;
							case STRING:
								t = tv.newVar(true,pproc.peek(), Types.CONST,DataTypes.STRING);
								tv.get(t).setValue((((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null));
								break;
							case INT:
								t = tv.newVar(true,pproc.peek(), Types.VAR,DataTypes.INT);
								generate(OP.copy, (((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null), null, tv.get(t).toString());
								tv.get(t).setValue((((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null));
								break;
							default:
								break;
						}
						((PrimarioContext)_localctx).r =  tv.get(t);
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public DataTypes datatypes;
		public TerminalNode INTEGER() { return getToken(eGramC3D.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(eGramC3D.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(eGramC3D.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tipo);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(INTEGER);

						((TipoContext)_localctx).datatypes = DataTypes.INT;
					
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(BOOLEAN);

						((TipoContext)_localctx).datatypes = DataTypes.BOOLEAN;
					
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(STRING);

						((TipoContext)_localctx).datatypes = DataTypes.STRING;
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public DataTypes datatypes;
		public TerminalNode LiteralInteger() { return getToken(eGramC3D.LiteralInteger, 0); }
		public TerminalNode LiteralBoolean() { return getToken(eGramC3D.LiteralBoolean, 0); }
		public TerminalNode LiteralString() { return getToken(eGramC3D.LiteralString, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(LiteralInteger);

						((LiteralContext)_localctx).datatypes = DataTypes.INT;
					
				}
				break;
			case LiteralBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(LiteralBoolean);

						((LiteralContext)_localctx).datatypes = DataTypes.BOOLEAN;
					
				}
				break;
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(LiteralString);

						((LiteralContext)_localctx).datatypes = DataTypes.STRING;
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u01f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0003\u0000M\b\u0000\u0001"+
		"\u0000\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\\\b\u0001\n\u0001\f\u0001_\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0082\b\u0002\n\u0002\f\u0002\u0085\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u008a\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0092\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009d\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a3\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00aa\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00b4\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00c4\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00cb\b\u000b\n\u000b\f\u000b\u00ce"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d9\b\u000b\n"+
		"\u000b\f\u000b\u00dc\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e6"+
		"\b\u000b\n\u000b\f\u000b\u00e9\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00fa\b\u000b\n\u000b\f\u000b\u00fd\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0114\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0123\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u012f\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013a"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014a\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u015b\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0169\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u017b\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u018a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0193\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u019f\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01b3\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u01cd\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01d6\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01e3\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u01eb\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01f3\b$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"H\u0000\u0001\u0002\u0000\u0012\u0012..\u0200\u0000J\u0001\u0000\u0000"+
		"\u0000\u0002X\u0001\u0000\u0000\u0000\u0004\u0089\u0001\u0000\u0000\u0000"+
		"\u0006\u008b\u0001\u0000\u0000\u0000\b\u00a2\u0001\u0000\u0000\u0000\n"+
		"\u00a4\u0001\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e\u00b3"+
		"\u0001\u0000\u0000\u0000\u0010\u00b5\u0001\u0000\u0000\u0000\u0012\u00b8"+
		"\u0001\u0000\u0000\u0000\u0014\u00c3\u0001\u0000\u0000\u0000\u0016\u0113"+
		"\u0001\u0000\u0000\u0000\u0018\u0115\u0001\u0000\u0000\u0000\u001a\u0122"+
		"\u0001\u0000\u0000\u0000\u001c\u0124\u0001\u0000\u0000\u0000\u001e\u0139"+
		"\u0001\u0000\u0000\u0000 \u0149\u0001\u0000\u0000\u0000\"\u014b\u0001"+
		"\u0000\u0000\u0000$\u015a\u0001\u0000\u0000\u0000&\u015c\u0001\u0000\u0000"+
		"\u0000(\u0168\u0001\u0000\u0000\u0000*\u016a\u0001\u0000\u0000\u0000,"+
		"\u016d\u0001\u0000\u0000\u0000.\u017a\u0001\u0000\u0000\u00000\u017c\u0001"+
		"\u0000\u0000\u00002\u0189\u0001\u0000\u0000\u00004\u0192\u0001\u0000\u0000"+
		"\u00006\u0194\u0001\u0000\u0000\u00008\u019e\u0001\u0000\u0000\u0000:"+
		"\u01a0\u0001\u0000\u0000\u0000<\u01b2\u0001\u0000\u0000\u0000>\u01b4\u0001"+
		"\u0000\u0000\u0000@\u01cc\u0001\u0000\u0000\u0000B\u01d5\u0001\u0000\u0000"+
		"\u0000D\u01e2\u0001\u0000\u0000\u0000F\u01ea\u0001\u0000\u0000\u0000H"+
		"\u01f2\u0001\u0000\u0000\u0000JL\u0006\u0000\uffff\uffff\u0000KM\u0003"+
		"\u0002\u0001\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MQ\u0001\u0000\u0000\u0000NP\u0003\u0004\u0002\u0000ON\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0012\t\u0000UV\u0005\u0000\u0000\u0001VW\u0006\u0000\uffff\uffff\u0000"+
		"W\u0001\u0001\u0000\u0000\u0000XY\u0005\u0002\u0000\u0000Y]\u0005\u0019"+
		"\u0000\u0000Z\\\u0003\u0004\u0002\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0003\u0012\t\u0000"+
		"ab\u0005\u001a\u0000\u0000bc\u0006\u0001\uffff\uffff\u0000c\u0003\u0001"+
		"\u0000\u0000\u0000de\u0003F#\u0000ef\u0005.\u0000\u0000fk\u0006\u0002"+
		"\uffff\uffff\u0000gh\u0005\u001f\u0000\u0000hi\u0003*\u0015\u0000ij\u0006"+
		"\u0002\uffff\uffff\u0000jl\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u001c"+
		"\u0000\u0000n\u008a\u0001\u0000\u0000\u0000op\u0005\u0004\u0000\u0000"+
		"pq\u0003F#\u0000qr\u0005.\u0000\u0000rs\u0005\u001f\u0000\u0000st\u0003"+
		"H$\u0000tu\u0005\u001c\u0000\u0000uv\u0006\u0002\uffff\uffff\u0000v\u008a"+
		"\u0001\u0000\u0000\u0000wx\u0003\u0006\u0003\u0000xy\u0005\u0018\u0000"+
		"\u0000yz\u0005\u001c\u0000\u0000z\u008a\u0001\u0000\u0000\u0000{|\u0005"+
		"\u0005\u0000\u0000|}\u0003F#\u0000}~\u0003\f\u0006\u0000~\u007f\u0005"+
		"\u0019\u0000\u0000\u007f\u0083\u0006\u0002\uffff\uffff\u0000\u0080\u0082"+
		"\u0003\u0004\u0002\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0012\t\u0000\u0087\u0088\u0006"+
		"\u0002\uffff\uffff\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089d\u0001"+
		"\u0000\u0000\u0000\u0089o\u0001\u0000\u0000\u0000\u0089w\u0001\u0000\u0000"+
		"\u0000\u0089{\u0001\u0000\u0000\u0000\u008a\u0005\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0003F#\u0000\u008c\u008d\u0005.\u0000\u0000\u008d\u0091"+
		"\u0005\u0017\u0000\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090\u0005"+
		"\u0001\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0003\n\u0005\u0000\u0094\u0095\u0003\b"+
		"\u0004\u0000\u0095\u0096\u0006\u0003\uffff\uffff\u0000\u0096\u0007\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0018\u0000\u0000\u0098\u009c\u0005"+
		"\u0017\u0000\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0005\u0001"+
		"\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0003\n\u0005\u0000\u009f\u00a0\u0003\b\u0004"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\t\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0000\u0000\u0000"+
		"\u00a5\u000b\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005.\u0000\u0000\u00a7"+
		"\u00a9\u0005\u0015\u0000\u0000\u00a8\u00aa\u0003\u000e\u0007\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0016\u0000\u0000\u00ac"+
		"\u00ad\u0006\u0006\uffff\uffff\u0000\u00ad\r\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0003\u0010\b\u0000\u00af\u00b0\u0005\u001b\u0000\u0000\u00b0\u00b1"+
		"\u0003\u000e\u0007\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0003\u0010\b\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u000f\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003"+
		"F#\u0000\u00b6\u00b7\u0005.\u0000\u0000\u00b7\u0011\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9\u00ba\u0006\t\uffff\uffff"+
		"\u0000\u00ba\u00bb\u0003\u0014\n\u0000\u00bb\u00bc\u0006\t\uffff\uffff"+
		"\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0016\u000b"+
		"\u0000\u00be\u00bf\u0006\n\uffff\uffff\u0000\u00bf\u00c0\u0003\u0014\n"+
		"\u0000\u00c0\u00c1\u0006\n\uffff\uffff\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u0015\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00c7\u0003*\u0015\u0000"+
		"\u00c7\u00c8\u0005\u0019\u0000\u0000\u00c8\u00cc\u0006\u000b\uffff\uffff"+
		"\u0000\u00c9\u00cb\u0003\u0004\u0002\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u0012\t\u0000"+
		"\u00d0\u00d1\u0006\u000b\uffff\uffff\u0000\u00d1\u00d2\u0005\u001a\u0000"+
		"\u0000\u00d2\u0114\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\f\u0000\u0000"+
		"\u00d4\u00d5\u0003*\u0015\u0000\u00d5\u00d6\u0005\u0019\u0000\u0000\u00d6"+
		"\u00da\u0006\u000b\uffff\uffff\u0000\u00d7\u00d9\u0003\u0004\u0002\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0003\u0012\t\u0000\u00de\u00df\u0006\u000b\uffff\uffff\u0000"+
		"\u00df\u00e0\u0005\u001a\u0000\u0000\u00e0\u00e1\u0006\u000b\uffff\uffff"+
		"\u0000\u00e1\u00e2\u0005\r\u0000\u0000\u00e2\u00e3\u0005\u0019\u0000\u0000"+
		"\u00e3\u00e7\u0006\u000b\uffff\uffff\u0000\u00e4\u00e6\u0003\u0004\u0002"+
		"\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0003\u0012\t\u0000\u00eb\u00ec\u0005\u001a\u0000\u0000"+
		"\u00ec\u00ed\u0006\u000b\uffff\uffff\u0000\u00ed\u0114\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0003\u0018\f\u0000\u00ef\u00f0\u0003\u001e\u000f\u0000"+
		"\u00f0\u00f1\u0005\u001a\u0000\u0000\u00f1\u00f2\u0006\u000b\uffff\uffff"+
		"\u0000\u00f2\u0114\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000"+
		"\u00f4\u00f5\u0006\u000b\uffff\uffff\u0000\u00f5\u00f6\u0003*\u0015\u0000"+
		"\u00f6\u00f7\u0005\u0019\u0000\u0000\u00f7\u00fb\u0006\u000b\uffff\uffff"+
		"\u0000\u00f8\u00fa\u0003\u0004\u0002\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\u0012\t\u0000"+
		"\u00ff\u0100\u0006\u000b\uffff\uffff\u0000\u0100\u0101\u0005\u001a\u0000"+
		"\u0000\u0101\u0114\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0006\u0000"+
		"\u0000\u0103\u0104\u0003*\u0015\u0000\u0104\u0105\u0005\u001c\u0000\u0000"+
		"\u0105\u0106\u0006\u000b\uffff\uffff\u0000\u0106\u0114\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0005\u0006\u0000\u0000\u0108\u0109\u0005\u001c\u0000"+
		"\u0000\u0109\u0114\u0006\u000b\uffff\uffff\u0000\u010a\u010b\u0003 \u0010"+
		"\u0000\u010b\u010c\u0005\u001f\u0000\u0000\u010c\u010d\u0003*\u0015\u0000"+
		"\u010d\u010e\u0005\u001c\u0000\u0000\u010e\u010f\u0006\u000b\uffff\uffff"+
		"\u0000\u010f\u0114\u0001\u0000\u0000\u0000\u0110\u0111\u0003 \u0010\u0000"+
		"\u0111\u0112\u0005\u001c\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u00c5\u0001\u0000\u0000\u0000\u0113\u00d3\u0001\u0000\u0000\u0000"+
		"\u0113\u00ee\u0001\u0000\u0000\u0000\u0113\u00f3\u0001\u0000\u0000\u0000"+
		"\u0113\u0102\u0001\u0000\u0000\u0000\u0113\u0107\u0001\u0000\u0000\u0000"+
		"\u0113\u010a\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000"+
		"\u0114\u0017\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u000e\u0000\u0000"+
		"\u0116\u0117\u0003*\u0015\u0000\u0117\u0118\u0005\u0019\u0000\u0000\u0118"+
		"\u0119\u0006\f\uffff\uffff\u0000\u0119\u011a\u0003\u001a\r\u0000\u011a"+
		"\u011b\u0006\f\uffff\uffff\u0000\u011b\u0019\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0003\u001c\u000e\u0000\u011d\u011e\u0006\r\uffff\uffff\u0000\u011e"+
		"\u011f\u0003\u001a\r\u0000\u011f\u0120\u0006\r\uffff\uffff\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u0123\u0006\r\uffff\uffff\u0000\u0122"+
		"\u011c\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u001b\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u000f\u0000\u0000\u0125"+
		"\u0126\u0006\u000e\uffff\uffff\u0000\u0126\u0127\u0003*\u0015\u0000\u0127"+
		"\u0128\u0005\u001d\u0000\u0000\u0128\u0129\u0006\u000e\uffff\uffff\u0000"+
		"\u0129\u012a\u0003\u0012\t\u0000\u012a\u012e\u0006\u000e\uffff\uffff\u0000"+
		"\u012b\u012c\u0005\u0011\u0000\u0000\u012c\u012d\u0005\u001c\u0000\u0000"+
		"\u012d\u012f\u0006\u000e\uffff\uffff\u0000\u012e\u012b\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0006\u000e\uffff\uffff\u0000\u0131\u001d\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0005\u0010\u0000\u0000\u0133\u0134\u0005\u001d"+
		"\u0000\u0000\u0134\u0135\u0006\u000f\uffff\uffff\u0000\u0135\u0136\u0003"+
		"\u0012\t\u0000\u0136\u0137\u0006\u000f\uffff\uffff\u0000\u0137\u013a\u0001"+
		"\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0132\u0001"+
		"\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u001f\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005.\u0000\u0000\u013c\u014a\u0006\u0010"+
		"\uffff\uffff\u0000\u013d\u013e\u0003\"\u0011\u0000\u013e\u013f\u0005\u0018"+
		"\u0000\u0000\u013f\u0140\u0006\u0010\uffff\uffff\u0000\u0140\u014a\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005.\u0000\u0000\u0142\u0143\u0005\u0015"+
		"\u0000\u0000\u0143\u0144\u0005\u0016\u0000\u0000\u0144\u014a\u0006\u0010"+
		"\uffff\uffff\u0000\u0145\u0146\u0003&\u0013\u0000\u0146\u0147\u0005\u0016"+
		"\u0000\u0000\u0147\u0148\u0006\u0010\uffff\uffff\u0000\u0148\u014a\u0001"+
		"\u0000\u0000\u0000\u0149\u013b\u0001\u0000\u0000\u0000\u0149\u013d\u0001"+
		"\u0000\u0000\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u0149\u0145\u0001"+
		"\u0000\u0000\u0000\u014a!\u0001\u0000\u0000\u0000\u014b\u014c\u0005.\u0000"+
		"\u0000\u014c\u014d\u0005\u0017\u0000\u0000\u014d\u014e\u0003*\u0015\u0000"+
		"\u014e\u014f\u0006\u0011\uffff\uffff\u0000\u014f\u0150\u0003$\u0012\u0000"+
		"\u0150\u0151\u0006\u0011\uffff\uffff\u0000\u0151#\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0005\u0018\u0000\u0000\u0153\u0154\u0005\u0017\u0000\u0000"+
		"\u0154\u0155\u0003*\u0015\u0000\u0155\u0156\u0006\u0012\uffff\uffff\u0000"+
		"\u0156\u0157\u0003$\u0012\u0000\u0157\u0158\u0006\u0012\uffff\uffff\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u015b\u0006\u0012\uffff\uffff"+
		"\u0000\u015a\u0152\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000"+
		"\u0000\u015b%\u0001\u0000\u0000\u0000\u015c\u015d\u0005.\u0000\u0000\u015d"+
		"\u015e\u0005\u0015\u0000\u0000\u015e\u015f\u0003*\u0015\u0000\u015f\u0160"+
		"\u0006\u0013\uffff\uffff\u0000\u0160\u0161\u0003(\u0014\u0000\u0161\'"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u001b\u0000\u0000\u0163\u0164"+
		"\u0003*\u0015\u0000\u0164\u0165\u0006\u0014\uffff\uffff\u0000\u0165\u0166"+
		"\u0003(\u0014\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0169\u0001"+
		"\u0000\u0000\u0000\u0168\u0162\u0001\u0000\u0000\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0169)\u0001\u0000\u0000\u0000\u016a\u016b\u0003,\u0016"+
		"\u0000\u016b\u016c\u0006\u0015\uffff\uffff\u0000\u016c+\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u00030\u0018\u0000\u016e\u016f\u0006\u0016\uffff\uffff"+
		"\u0000\u016f\u0170\u0003.\u0017\u0000\u0170\u0171\u0006\u0016\uffff\uffff"+
		"\u0000\u0171-\u0001\u0000\u0000\u0000\u0172\u0173\u0005,\u0000\u0000\u0173"+
		"\u0174\u0006\u0017\uffff\uffff\u0000\u0174\u0175\u00030\u0018\u0000\u0175"+
		"\u0176\u0006\u0017\uffff\uffff\u0000\u0176\u0177\u0003.\u0017\u0000\u0177"+
		"\u0178\u0006\u0017\uffff\uffff\u0000\u0178\u017b\u0001\u0000\u0000\u0000"+
		"\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0172\u0001\u0000\u0000\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017b/\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u00034\u001a\u0000\u017d\u017e\u0006\u0018\uffff\uffff\u0000\u017e"+
		"\u017f\u00032\u0019\u0000\u017f\u0180\u0006\u0018\uffff\uffff\u0000\u0180"+
		"1\u0001\u0000\u0000\u0000\u0181\u0182\u0005+\u0000\u0000\u0182\u0183\u0006"+
		"\u0019\uffff\uffff\u0000\u0183\u0184\u00034\u001a\u0000\u0184\u0185\u0006"+
		"\u0019\uffff\uffff\u0000\u0185\u0186\u00032\u0019\u0000\u0186\u0187\u0006"+
		"\u0019\uffff\uffff\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u018a"+
		"\u0001\u0000\u0000\u0000\u0189\u0181\u0001\u0000\u0000\u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u018a3\u0001\u0000\u0000\u0000\u018b\u018c\u0005"+
		"-\u0000\u0000\u018c\u018d\u00036\u001b\u0000\u018d\u018e\u0006\u001a\uffff"+
		"\uffff\u0000\u018e\u0193\u0001\u0000\u0000\u0000\u018f\u0190\u00036\u001b"+
		"\u0000\u0190\u0191\u0006\u001a\uffff\uffff\u0000\u0191\u0193\u0001\u0000"+
		"\u0000\u0000\u0192\u018b\u0001\u0000\u0000\u0000\u0192\u018f\u0001\u0000"+
		"\u0000\u0000\u01935\u0001\u0000\u0000\u0000\u0194\u0195\u0003:\u001d\u0000"+
		"\u0195\u0196\u0006\u001b\uffff\uffff\u0000\u0196\u0197\u00038\u001c\u0000"+
		"\u0197\u0198\u0006\u001b\uffff\uffff\u0000\u01987\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0005\u001e\u0000\u0000\u019a\u019b\u0003:\u001d\u0000\u019b"+
		"\u019c\u0006\u001c\uffff\uffff\u0000\u019c\u019f\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000"+
		"\u019e\u019d\u0001\u0000\u0000\u0000\u019f9\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0003>\u001f\u0000\u01a1\u01a2\u0006\u001d\uffff\uffff\u0000\u01a2"+
		"\u01a3\u0003<\u001e\u0000\u01a3\u01a4\u0006\u001d\uffff\uffff\u0000\u01a4"+
		";\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005&\u0000\u0000\u01a6\u01a7\u0003"+
		">\u001f\u0000\u01a7\u01a8\u0006\u001e\uffff\uffff\u0000\u01a8\u01a9\u0003"+
		"<\u001e\u0000\u01a9\u01aa\u0006\u001e\uffff\uffff\u0000\u01aa\u01b3\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005\'\u0000\u0000\u01ac\u01ad\u0003>"+
		"\u001f\u0000\u01ad\u01ae\u0006\u001e\uffff\uffff\u0000\u01ae\u01af\u0003"+
		"<\u001e\u0000\u01af\u01b0\u0006\u001e\uffff\uffff\u0000\u01b0\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01b2\u01ab\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3=\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003B!"+
		"\u0000\u01b5\u01b6\u0006\u001f\uffff\uffff\u0000\u01b6\u01b7\u0003@ \u0000"+
		"\u01b7\u01b8\u0006\u001f\uffff\uffff\u0000\u01b8?\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0005(\u0000\u0000\u01ba\u01bb\u0003B!\u0000\u01bb\u01bc"+
		"\u0006 \uffff\uffff\u0000\u01bc\u01bd\u0003@ \u0000\u01bd\u01be\u0006"+
		" \uffff\uffff\u0000\u01be\u01cd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		")\u0000\u0000\u01c0\u01c1\u0003B!\u0000\u01c1\u01c2\u0006 \uffff\uffff"+
		"\u0000\u01c2\u01c3\u0003@ \u0000\u01c3\u01c4\u0006 \uffff\uffff\u0000"+
		"\u01c4\u01cd\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005*\u0000\u0000\u01c6"+
		"\u01c7\u0003B!\u0000\u01c7\u01c8\u0006 \uffff\uffff\u0000\u01c8\u01c9"+
		"\u0003@ \u0000\u01c9\u01ca\u0006 \uffff\uffff\u0000\u01ca\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01b9\u0001"+
		"\u0000\u0000\u0000\u01cc\u01bf\u0001\u0000\u0000\u0000\u01cc\u01c5\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cdA\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0005\'\u0000\u0000\u01cf\u01d0\u0003D\"\u0000"+
		"\u01d0\u01d1\u0006!\uffff\uffff\u0000\u01d1\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0003D\"\u0000\u01d3\u01d4\u0006!\uffff\uffff\u0000\u01d4"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d5\u01ce\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d6C\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005\u0015\u0000\u0000\u01d8\u01d9\u0003*\u0015\u0000\u01d9\u01da\u0005"+
		"\u0016\u0000\u0000\u01da\u01db\u0006\"\uffff\uffff\u0000\u01db\u01e3\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0003 \u0010\u0000\u01dd\u01de\u0006\""+
		"\uffff\uffff\u0000\u01de\u01e3\u0001\u0000\u0000\u0000\u01df\u01e0\u0003"+
		"H$\u0000\u01e0\u01e1\u0006\"\uffff\uffff\u0000\u01e1\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e2\u01d7\u0001\u0000\u0000\u0000\u01e2\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e3E\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005\u0007\u0000\u0000\u01e5\u01eb\u0006#\uffff\uffff"+
		"\u0000\u01e6\u01e7\u0005\b\u0000\u0000\u01e7\u01eb\u0006#\uffff\uffff"+
		"\u0000\u01e8\u01e9\u0005\t\u0000\u0000\u01e9\u01eb\u0006#\uffff\uffff"+
		"\u0000\u01ea\u01e4\u0001\u0000\u0000\u0000\u01ea\u01e6\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ebG\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0005\u0012\u0000\u0000\u01ed\u01f3\u0006$\uffff\uffff\u0000"+
		"\u01ee\u01ef\u0005\u0013\u0000\u0000\u01ef\u01f3\u0006$\uffff\uffff\u0000"+
		"\u01f0\u01f1\u0005\u0014\u0000\u0000\u01f1\u01f3\u0006$\uffff\uffff\u0000"+
		"\u01f2\u01ec\u0001\u0000\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3I\u0001\u0000\u0000\u0000!L"+
		"Q]k\u0083\u0089\u0091\u009c\u00a2\u00a9\u00b3\u00c3\u00cc\u00da\u00e7"+
		"\u00fb\u0113\u0122\u012e\u0139\u0149\u015a\u0168\u017a\u0189\u0192\u019e"+
		"\u01b2\u01cc\u01d5\u01e2\u01ea\u01f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}