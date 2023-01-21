// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
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
		MAIN=1, VARIABLE=2, CONSTANT=3, FUNCTION=4, RETURN=5, INTEGER=6, BOOLEAN=7, 
		STRING=8, WHILE=9, DO=10, IF=11, ELSE=12, SWITCH=13, CASE=14, DEFAULT=15, 
		BREAK=16, LiteralInteger=17, LiteralBoolean=18, LiteralString=19, LPAREN=20, 
		RPAREN=21, LBRACK=22, RBRACK=23, BEGIN=24, END=25, COMMA=26, SEMI=27, 
		COLON=28, DOUBLEDOT=29, OPREL=30, ASSIGN=31, EQUAL=32, GT=33, LT=34, ADD=35, 
		SUB=36, MULT=37, DIV=38, MOD=39, AND=40, OR=41, NOT=42, ID=43, WS=44, 
		BLOCK_COMMENT=45, LINE_COMMENT=46;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_decl = 2, RULE_declArray = 3, RULE_declArray_ = 4, 
		RULE_numero = 5, RULE_encabezado = 6, RULE_parametros = 7, RULE_parametro = 8, 
		RULE_sents = 9, RULE_sents_ = 10, RULE_sent = 11, RULE_contcase = 12, 
		RULE_contcase_ = 13, RULE_caso = 14, RULE_endcase = 15, RULE_referencia = 16, 
		RULE_idx = 17, RULE_idx_ = 18, RULE_contIdx = 19, RULE_contIdx_ = 20, 
		RULE_expr = 21, RULE_exprOr = 22, RULE_exprOr_ = 23, RULE_exprAnd = 24, 
		RULE_exprAnd_ = 25, RULE_exprNot = 26, RULE_exprComp = 27, RULE_exprComp_ = 28, 
		RULE_exprAdd = 29, RULE_exprAdd_ = 30, RULE_exprMult = 31, RULE_exprMult_ = 32, 
		RULE_exprNeg = 33, RULE_primario = 34, RULE_tipo = 35, RULE_literal = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decl", "declArray", "declArray_", "numero", "encabezado", 
			"parametros", "parametro", "sents", "sents_", "sent", "contcase", "contcase_", 
			"caso", "endcase", "referencia", "idx", "idx_", "contIdx", "contIdx_", 
			"expr", "exprOr", "exprOr_", "exprAnd", "exprAnd_", "exprNot", "exprComp", 
			"exprComp_", "exprAdd", "exprAdd_", "exprMult", "exprMult_", "exprNeg", 
			"primario", "tipo", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'indice'", "'var'", "'const'", "'funcion'", "'devolver'", "'ent'", 
			"'logico'", "'palabra'", "'mientras'", "'hacer'", "'si'", "'sino'", "'switch'", 
			"'case'", "'default'", "'break'", null, null, null, "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "','", "';'", "':'", "'..'", null, "'='", "'=='", 
			"'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "VARIABLE", "CONSTANT", "FUNCTION", "RETURN", "INTEGER", 
			"BOOLEAN", "STRING", "WHILE", "DO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"BREAK", "LiteralInteger", "LiteralBoolean", "LiteralString", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "BEGIN", "END", "COMMA", "SEMI", "COLON", 
			"DOUBLEDOT", "OPREL", "ASSIGN", "EQUAL", "GT", "LT", "ADD", "SUB", "MULT", 
			"DIV", "MOD", "AND", "OR", "NOT", "ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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


	public eGramC3D(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(eGramC3D.EOF, 0); }
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
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
			        System.out.println("Error con la tabla de símbolos: "+e.getMessage());
			      }
			    
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSTANT:
				case FUNCTION:
				case INTEGER:
				case BOOLEAN:
				case STRING:
					{
					setState(76); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(75);
							decl();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(78); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case MAIN:
					{
					setState(80);
					main();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 474L) != 0 );


				    //Llamar al main despues de leerlo todo
			      try {
			        symbol = ts.get("indice");//TODO: intentar llamada directa a la palabra
			        generate(Instruction.OP.call, null, null, symbol.getProcedure().toString());
			      } catch(SymbolTable.SymbolTableException e) {
			        System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			      }

				  
			setState(86);
			match(EOF);

			      Tag e = te.get(te.newTag(false));
			      generate(Instruction.OP.skip, null, null, e.toString());
			      tv.calcDespOcupVL(tp);
			    
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
		public Procedure procedure;
		public Symbol symbol;
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
			setState(89);
			((MainContext)_localctx).MAIN = match(MAIN);

			      Symbol symbol = new Symbol();
			      Procedure procedure;
			      try {
			        symbol = ts.get(((MainContext)_localctx).MAIN.getText());
			        procedure = tp.newProc(depth, symbol.getType(), ((MainContext)_localctx).MAIN.getText());
			        symbol.setProcedure(procedure);
			        ((MainContext)_localctx).procedure =  procedure;
			      } catch(SymbolTable.SymbolTableException e) {
			        System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			      }
			    
			setState(91);
			match(BEGIN);

			      pproc.push(_localctx.procedure.getNp());
			      depth ++;
			      /*try{
			        ts = ts.blockGoesDown();
			      } catch(SymbolTable.SymbolTableException e) {
			        System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			      }*/

			      Tag e = te.get(te.newTag(true));
					  _localctx.procedure.setStartTag(e.getNe());
			      generate(Instruction.OP.skip, null, null, e.toString());//TODO: averiguar como saltar a esta etiqueta desde program
					  generate(Instruction.OP.pmb, null, null, _localctx.procedure.toString());
			    
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
				{
				{
				setState(93);
				decl();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			sents();
			setState(100);
			match(END);

					  C3D.get(pc-1).setInstFinal(true);
			      pproc.pop();
			      depth --;
			      //ts = ts.blockGoesUp();
			    
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
		public TerminalNode END() { return getToken(eGramC3D.END, 0); }
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				tipo();
				setState(104);
				((DeclContext)_localctx).ID = match(ID);

						Symbol symbol = new Symbol();
						int nv = 0;
						try {
							symbol = ts.get(((DeclContext)_localctx).ID.getText());
							nv = tv.newVar(false, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
							tv.get(nv).setId(symbol.getId());
							symbol.setVariableNumber(nv);
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(106);
					match(ASSIGN);
					setState(107);
					((DeclContext)_localctx).expr = expr();

								if(symbol.dataType() == Symbol.DataTypes.BOOLEAN) {
									Tag ec = te.get(te.newTag(false));
									Tag ef = te.get(te.newTag(false));
									Tag efin = te.get(te.newTag(false));
									generate(Instruction.OP.skip, null, null, ec.toString());
									generate(Instruction.OP.copy, "-1", null, tv.get(nv).toString());
									generate(Instruction.OP.jump, null, null, efin.toString());
									generate(Instruction.OP.skip, null, null, ef.toString());
									generate(Instruction.OP.copy, "0", null, tv.get(nv).toString());
									generate(Instruction.OP.skip, null, null, efin.toString());
									backpatch(((DeclContext)_localctx).expr.true_, ec);
									backpatch(((DeclContext)_localctx).expr.false_, ef);
								} else {
									generate(Instruction.OP.copy, ((DeclContext)_localctx).expr.variable.toString(), null, tv.get(nv).toString());
								}
						
					}
				}

				setState(112);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(CONSTANT);
				setState(115);
				tipo();
				setState(116);
				((DeclContext)_localctx).ID = match(ID);
				setState(117);
				match(ASSIGN);
				setState(118);
				literal();
				setState(119);
				match(SEMI);

						Symbol symbol;
						try {
							symbol = ts.get(((DeclContext)_localctx).ID.getText());
							int nv = tv.newVar(false, pproc.peek(), Symbol.Types.CONST, symbol.dataType());
							tv.get(nv).setId(symbol.getId());
							tv.get(nv).setValue(symbol.getValue());
							symbol.setVariableNumber(nv);
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				declArray();
				setState(123);
				match(RBRACK);
				setState(124);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(FUNCTION);
				setState(127);
				tipo();
				setState(128);
				((DeclContext)_localctx).encabezado = encabezado();
				setState(129);
				match(BEGIN);

						depth++;
						try{
							ts = ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						pproc.push(((DeclContext)_localctx).encabezado.procedure.getNp());
						// Crear variables para los parámetros
						Symbol aux = ((DeclContext)_localctx).encabezado.symbol.getNext();
						int nparam = 1;
						while(aux!= null) {
							try {
								int nv = tv.newVar(false, pproc.peek(), Symbol.Types.VAR, aux.dataType());
								tv.get(nv).setNparam(nparam);
								tv.get(nv).setId(aux.getId());
								ts.get(aux.getId()).setVariableNumber(nv);
							} catch(SymbolTable.SymbolTableException e) {
								System.out.println("Error con la tabla de símbolos: "+e.getMessage());
							}
							aux = aux.getNext();
							nparam++;
						}
						Tag e = te.get(te.newTag(true));
						((DeclContext)_localctx).encabezado.procedure.setStartTag(e.getNe());
						((DeclContext)_localctx).encabezado.procedure.setNumParams(nparam-1);
						generate(Instruction.OP.skip, null, null, e.toString());
						generate(Instruction.OP.pmb, null, null, ((DeclContext)_localctx).encabezado.procedure.toString());
					
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
					{
					{
					setState(131);
					decl();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				sents();
				setState(138);
				match(END);

						C3D.get(pc-1).setInstFinal(true);
						pproc.pop();
						depth--;
						ts = ts.blockGoesUp();
					
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
		public TerminalNode DOUBLEDOT() { return getToken(eGramC3D.DOUBLEDOT, 0); }
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
			setState(143);
			tipo();
			setState(144);
			((DeclArrayContext)_localctx).ID = match(ID);
			setState(145);
			match(LBRACK);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(146);
				numero();
				setState(147);
				match(DOUBLEDOT);
				}
				break;
			}
			setState(151);
			numero();
			setState(152);
			declArray_();

				Symbol symbol = null;
				int nv = 0;
				try {
					symbol = ts.get(((DeclArrayContext)_localctx).ID.getText());
					Table dt = symbol.getTable();
					nv = tv.newVar(false, pproc.peek(), Symbol.Types.VAR, dt.dataType());
					tv.get(nv).setId(symbol.getId());
					symbol.setVariableNumber(nv);
					tv.get(nv).setElements(dt.getEntries());
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
		public TerminalNode DOUBLEDOT() { return getToken(eGramC3D.DOUBLEDOT, 0); }
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(RBRACK);
				setState(156);
				match(LBRACK);
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(157);
					numero();
					setState(158);
					match(DOUBLEDOT);
					}
					break;
				}
				setState(162);
				numero();
				setState(163);
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
			setState(168);
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
		public Procedure procedure;
		public Symbol symbol;
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
			setState(170);
			((EncabezadoContext)_localctx).ID = match(ID);
			setState(171);
			match(LPAREN);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0) {
				{
				setState(172);
				parametros();
				}
			}

			setState(175);
			match(RPAREN);

					Symbol symbol = new Symbol();
					Procedure procedure;
					try {
						symbol = ts.get(((EncabezadoContext)_localctx).ID.getText());
						procedure = tp.newProc(depth, symbol.getType(), ((EncabezadoContext)_localctx).ID.getText());
						symbol.setProcedure(procedure);
						((EncabezadoContext)_localctx).procedure =  procedure;
						((EncabezadoContext)_localctx).symbol =  symbol;
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				parametro();
				setState(179);
				match(COMMA);
				setState(180);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
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
			setState(185);
			tipo();
			setState(186);
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
			setState(188);
			((SentsContext)_localctx).sent = sent(_localctx.sents_seg);

					Tag ec = te.get(te.newTag(false));
					generate(Instruction.OP.skip, null, null, ec.toString());
				
			setState(190);
			((SentsContext)_localctx).sents_ = sents_(_localctx.sents_seg);

					backpatch(((SentsContext)_localctx).sent.sent_seg, ec);
					if(((SentsContext)_localctx).sents_.sents_seg_!= null) {
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case SWITCH:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((Sents_Context)_localctx).sent = sent(_localctx.sents_seg);

						Tag ec = te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, ec.toString());
					
				setState(195);
				((Sents_Context)_localctx).sents_ = sents_(_localctx.sents_seg);

						backpatch(((Sents_Context)_localctx).sent.sent_seg, ec);
						if(((Sents_Context)_localctx).sents_.sents_seg_!= null) {
							((Sents_Context)_localctx).sents_seg_ =  ((Sents_Context)_localctx).sents_.sents_seg_;
						} else{
							((Sents_Context)_localctx).sents_seg_ =  ((Sents_Context)_localctx).sent.sent_seg;
						}
					
				}
				break;
			case CASE:
			case DEFAULT:
			case BREAK:
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
		public TerminalNode DO() { return getToken(eGramC3D.DO, 0); }
		public TerminalNode SEMI() { return getToken(eGramC3D.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(eGramC3D.RETURN, 0); }
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(IF);
				setState(202);
				((SentContext)_localctx).expr = expr();
				setState(203);
				match(BEGIN);

						try{
							ts = ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						Tag ec = te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, ec.toString());
					
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
					{
					{
					setState(205);
					decl();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				((SentContext)_localctx).sents = sents();

						ts = ts.blockGoesUp();
						backpatch(((SentContext)_localctx).expr.true_, ec);
						((SentContext)_localctx).sent_seg =  concat(((SentContext)_localctx).expr.false_, ((SentContext)_localctx).sents.sents_seg);
					
				setState(213);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(IF);
				setState(216);
				((SentContext)_localctx).expr = expr();
				setState(217);
				match(BEGIN);

						try{
							ts = ts.blockGoesDown();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
						Tag ec = te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, ec.toString());
					
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
					{
					{
					setState(219);
					decl();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				((SentContext)_localctx).sents = sents();

					
				setState(227);
				match(END);

						Deque<Integer> sents_seg1 = new ArrayDeque<Integer>();
						generate(Instruction.OP.jump, null, null, null);
						sents_seg1.add(pc);
						Tag ef = te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, ef.toString());
					
				setState(229);
				match(ELSE);
				setState(230);
				match(BEGIN);

					
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
					{
					{
					setState(232);
					decl();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				((SentContext)_localctx).sents = sents();
				setState(239);
				match(END);

						ts = ts.blockGoesUp();
						backpatch(((SentContext)_localctx).expr.true_, ec);
						backpatch(((SentContext)_localctx).expr.false_, ef);
						((SentContext)_localctx).sent_seg =  concat(sents_seg1, ((SentContext)_localctx).sents.sents_seg);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((SentContext)_localctx).contcase = contcase();
				setState(243);
				((SentContext)_localctx).endcase = endcase();
				setState(244);
				match(END);

						generate(Instruction.OP.skip, null, null, ((SentContext)_localctx).contcase.etest.toString());
						while(((SentContext)_localctx).contcase.pilacond.size()!= 0) {
							Tag econd = ((SentContext)_localctx).contcase.pilacond.remove();
							Tag etest = ((SentContext)_localctx).contcase.pilatest.remove();
							Variable v = tv.get(((SentContext)_localctx).contcase.pilavar.remove());
							Tag esent = ((SentContext)_localctx).contcase.pilasent.remove();
							generate(Instruction.OP.jump, null, null, econd.toString());
							generate(Instruction.OP.skip, null, null, etest.toString());
							generate(Instruction.OP.ifEQ, ((SentContext)_localctx).contcase.variable.toString(), v.toString(), esent.toString());
						}
						if(((SentContext)_localctx).endcase.e!= null) {
							if(!((SentContext)_localctx).contcase.acababreak && ((SentContext)_localctx).contcase.pilaefi.size()>0) {
								int seg = ((SentContext)_localctx).contcase.pilaefi.removeLast();
								backpatch(seg, ((SentContext)_localctx).endcase.e);
							}
							generate(Instruction.OP.jump, null, null, ((SentContext)_localctx).endcase.e.toString());
							generate(Instruction.OP.skip, null, null, ((SentContext)_localctx).endcase.efi.toString());
						}
						Tag efi = te.get(te.newTag(false));
						backpatch(((SentContext)_localctx).contcase.pilaefi, efi);
						generate(Instruction.OP.skip, null, null, efi.toString());
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(WHILE);

				      try{
				        ts = ts.blockGoesDown();
				      } catch(SymbolTable.SymbolTableException e) {
				        System.out.println("Error con la tabla de símbolos: "+e.getMessage());
				      }
				      Tag ei = te.get(te.newTag(false));
				      generate(Instruction.OP.skip, null, null, ei.toString());
				    
				setState(249);
				((SentContext)_localctx).expr = expr();
				setState(250);
				match(BEGIN);

				      Tag eis = te.get(te.newTag(false));
				      generate(Instruction.OP.skip, null, null, eis.toString());
				    
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
					{
					{
					setState(252);
					decl();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				sents();

				      ts = ts.blockGoesUp();
				      backpatch(((SentContext)_localctx).expr.true_, eis);
				      backpatch(_localctx.sent_seg, ei);
				      ((SentContext)_localctx).sent_seg =  ((SentContext)_localctx).expr.false_;
				      generate(Instruction.OP.jump, null, null, ei.toString());
				    
				setState(260);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(DO);

				      try{
				        ts = ts.blockGoesDown();
				      } catch(SymbolTable.SymbolTableException e) {
				        System.out.println("Error con la tabla de símbolos: "+e.getMessage());
				      }
					  
				setState(264);
				match(BEGIN);

				      Tag eis = te.get(te.newTag(false));
				      generate(Instruction.OP.skip, null, null, eis.toString());
				    
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
					{
					{
					setState(266);
					decl();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				sents();

				      ts = ts.blockGoesUp();
				    
				setState(274);
				match(END);
				setState(275);
				match(WHILE);

				      Tag ei = te.get(te.newTag(false));
				      generate(Instruction.OP.skip, null, null, ei.toString());
					  
				setState(277);
				((SentContext)_localctx).expr = expr();
				setState(278);
				match(SEMI);

				      backpatch(((SentContext)_localctx).expr.true_, eis);
				      backpatch(_localctx.sent_seg, ei);
				      ((SentContext)_localctx).sent_seg =  ((SentContext)_localctx).expr.false_;
				      generate(Instruction.OP.jump, null, null, eis.toString());
					  
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(RETURN);
				setState(282);
				((SentContext)_localctx).expr = expr();
				setState(283);
				match(SEMI);

						if(((SentContext)_localctx).expr.true_!= null || ((SentContext)_localctx).expr.false_!= null) {//cambiar
							Tag ec = te.get(te.newTag(false));
							Tag ef = te.get(te.newTag(false));
							Tag efin = te.get(te.newTag(false));
							generate(Instruction.OP.skip, null, null, ec.toString());
							generate(Instruction.OP.copy, "-1", null, ((SentContext)_localctx).expr.variable.toString());
							((SentContext)_localctx).expr.variable.setValue("-1");
							generate(Instruction.OP.jump, null, null, efin.toString());
							generate(Instruction.OP.skip, null, null, ef.toString());
							generate(Instruction.OP.copy, "0", null, ((SentContext)_localctx).expr.variable.toString());
							((SentContext)_localctx).expr.variable.setValue("0");
							generate(Instruction.OP.skip, null, null, efin.toString());
							backpatch(((SentContext)_localctx).expr.true_, ec);
							backpatch(((SentContext)_localctx).expr.false_, ef);
						}
						generate(Instruction.OP.ret, ((SentContext)_localctx).expr.variable.toString(), null, pproc.peek().toString());
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(RETURN);
				setState(287);
				match(SEMI);

						generate(Instruction.OP.ret, null, null, pproc.peek().toString());
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				((SentContext)_localctx).referencia = referencia();
				setState(290);
				match(ASSIGN);
				setState(291);
				((SentContext)_localctx).expr = expr();
				setState(292);
				match(SEMI);

						if(((SentContext)_localctx).referencia.offset!= null) {
							if(((SentContext)_localctx).referencia.dataType == Symbol.DataTypes.BOOLEAN) {
								Tag ec = te.get(te.newTag(false));
								Tag ef = te.get(te.newTag(false));
								Tag efin = te.get(te.newTag(false));
								generate(Instruction.OP.skip, null, null, ec.toString());
								generate(Instruction.OP.ind_ass, ((SentContext)_localctx).referencia.offset.toString(), "-1", ((SentContext)_localctx).referencia.variable.toString());
								generate(Instruction.OP.jump, null, null, efin.toString());
								generate(Instruction.OP.skip, null, null, ef.toString());
								generate(Instruction.OP.ind_ass, ((SentContext)_localctx).referencia.offset.toString(), "0", ((SentContext)_localctx).referencia.variable.toString());
								generate(Instruction.OP.skip, null, null, efin.toString());
								backpatch(((SentContext)_localctx).expr.true_, ec);
								backpatch(((SentContext)_localctx).expr.false_, ef);
							} else {
								generate(Instruction.OP.ind_ass, ((SentContext)_localctx).referencia.offset.toString(), ((SentContext)_localctx).expr.variable.toString(), ((SentContext)_localctx).referencia.variable.toString());
							}
						} else {
							if(((SentContext)_localctx).referencia.dataType == Symbol.DataTypes.BOOLEAN) {
								Tag ec = te.get(te.newTag(false));
								Tag ef = te.get(te.newTag(false));
								Tag efin = te.get(te.newTag(false));
								generate(Instruction.OP.skip, null, null, ec.toString());
								generate(Instruction.OP.copy, "-1", null, ((SentContext)_localctx).referencia.variable.toString());
								generate(Instruction.OP.jump, null, null, efin.toString());
								generate(Instruction.OP.skip, null, null, ef.toString());
								generate(Instruction.OP.copy, "0", null, ((SentContext)_localctx).referencia.variable.toString());
								generate(Instruction.OP.skip, null, null, efin.toString());
								backpatch(((SentContext)_localctx).expr.true_, ec);
								backpatch(((SentContext)_localctx).expr.false_, ef);
							} else {
								generate(Instruction.OP.copy, ((SentContext)_localctx).expr.variable.toString(), null, ((SentContext)_localctx).referencia.variable.toString());
							}
						}
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				referencia();
				setState(296);
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
		public Variable variable;
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
			setState(300);
			match(SWITCH);
			setState(301);
			((ContcaseContext)_localctx).expr = expr();
			setState(302);
			match(BEGIN);

					((ContcaseContext)_localctx).etest =  te.get(te.newTag(false));
					generate(Instruction.OP.jump, null, null, _localctx.etest.toString());
					((ContcaseContext)_localctx).variable =  ((ContcaseContext)_localctx).expr.variable;
					((ContcaseContext)_localctx).pilaefi =  new ArrayDeque<>();
					((ContcaseContext)_localctx).pilasent =  new ArrayDeque<Tag>();
					((ContcaseContext)_localctx).pilavar =  new ArrayDeque<Integer>();
					((ContcaseContext)_localctx).pilacond =  new ArrayDeque<Tag>();
					((ContcaseContext)_localctx).pilatest =  new ArrayDeque<Tag>();
				
			setState(304);
			((ContcaseContext)_localctx).contcase_ = contcase_(_localctx.variable, true, _localctx.etest, _localctx.pilaefi, _localctx.pilasent, _localctx.pilavar, _localctx.pilacond, _localctx.pilatest);

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
		public Variable variable;
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
		public Contcase_Context(ParserRuleContext parent, int invokingState, Variable variable, boolean acababreak1, Tag etest, Deque<Integer> pilaefi, Deque<Tag> pilasent, Deque<Integer> pilavar, Deque<Tag> pilacond, Deque<Tag> pilatest) {
			super(parent, invokingState);
			this.variable = variable;
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

	public final Contcase_Context contcase_(Variable variable,boolean acababreak1,Tag etest,Deque<Integer> pilaefi,Deque<Tag> pilasent,Deque<Integer> pilavar,Deque<Tag> pilacond,Deque<Tag> pilatest) throws RecognitionException {
		Contcase_Context _localctx = new Contcase_Context(_ctx, getState(), variable, acababreak1, etest, pilaefi, pilasent, pilavar, pilacond, pilatest);
		enterRule(_localctx, 26, RULE_contcase_);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((Contcase_Context)_localctx).caso = caso();

						if(!_localctx.acababreak1 && _localctx.pilaefi.size()>0) {
							int seg = _localctx.pilaefi.removeLast();
							backpatch(seg, ((Contcase_Context)_localctx).caso.esent);
						}
						_localctx.pilaefi.add(((Contcase_Context)_localctx).caso.seg);
						_localctx.pilacond.add(((Contcase_Context)_localctx).caso.econd);
						_localctx.pilavar.add(((Contcase_Context)_localctx).caso.variable.nv());
						_localctx.pilatest.add(((Contcase_Context)_localctx).caso.etest);
						_localctx.pilasent.add(((Contcase_Context)_localctx).caso.esent);
					
				setState(309);
				((Contcase_Context)_localctx).contcase_ = contcase_(_localctx.variable, ((Contcase_Context)_localctx).caso.acababreak, _localctx.etest, _localctx.pilaefi, _localctx.pilasent, _localctx.pilavar, _localctx.pilacond, _localctx.pilatest);

						((Contcase_Context)_localctx).acababreak =  ((Contcase_Context)_localctx).contcase_.acababreak;
					
				}
				break;
			case DEFAULT:
			case END:
				enterOuterAlt(_localctx, 2);
				{

						((Contcase_Context)_localctx).acababreak =  _localctx.acababreak1;
					
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
		public Variable variable;
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
			setState(315);
			match(CASE);

					((CasoContext)_localctx).econd =  te.get(te.newTag(false));
					generate(Instruction.OP.skip, null, null, _localctx.econd.toString());
				
			setState(317);
			((CasoContext)_localctx).expr = expr();
			setState(318);
			match(COLON);

					((CasoContext)_localctx).etest =  te.get(te.newTag(false));
					generate(Instruction.OP.jump, null, null, _localctx.etest.toString());
					((CasoContext)_localctx).esent =  te.get(te.newTag(false));
					generate(Instruction.OP.skip, null, null, _localctx.esent.toString());
				
			setState(320);
			sents();

					((CasoContext)_localctx).acababreak =  false;
				
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(322);
				match(BREAK);
				setState(323);
				match(SEMI);

						((CasoContext)_localctx).acababreak =  true;
					
				}
			}


					((CasoContext)_localctx).variable =  ((CasoContext)_localctx).expr.variable;
					generate(Instruction.OP.jump, null, null, null);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(DEFAULT);
				setState(330);
				match(COLON);

						((EndcaseContext)_localctx).e =  te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, _localctx.e.toString());
					
				setState(332);
				sents();

						((EndcaseContext)_localctx).efi =  te.get(te.newTag(false));
						generate(Instruction.OP.jump, null, null, _localctx.efi.toString());
					
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
		public Variable variable;
		public Variable offset;
		public Symbol.DataTypes dataType;
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
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				((ReferenciaContext)_localctx).ID = match(ID);

						Symbol symbol;
						int vn;
						try {
							symbol = ts.get(((ReferenciaContext)_localctx).ID.getText());
							if (symbol.getType()  ==  Symbol.Types.CONST){
								vn = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
								switch(symbol.dataType()) {
									case BOOLEAN:
										generate(Instruction.OP.copy, symbol.getValue(), null, tv.get(vn).toString());
										if(symbol.getValue().equals("true")){
											tv.get(vn).setValue("-1");
										} else {
											tv.get(vn).setValue("0");
										}
										break;
									case INT:
										generate(Instruction.OP.copy, symbol.getValue(), null, tv.get(vn).toString());
										tv.get(vn).setValue(symbol.getValue());
										break;
									case STRING:
										generate(Instruction.OP.copy, tv.get(symbol.getVariableNumber()).toString(), null, tv.get(vn).toString());
										tv.get(vn).setValue(symbol.getValue());
										break;
								}
								((ReferenciaContext)_localctx).variable =  tv.get(vn);
							} else {
								((ReferenciaContext)_localctx).variable =  tv.get(symbol.getVariableNumber());
							}
							((ReferenciaContext)_localctx).dataType =  symbol.dataType();
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				((ReferenciaContext)_localctx).idx = idx();
				setState(341);
				match(RBRACK);

						Variable t2;
						String nbytes = String.valueOf(((ReferenciaContext)_localctx).idx.table.getItemSize());
						if(((ReferenciaContext)_localctx).idx.table.getOffset() == 0) {
							t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
							generate(Instruction.OP.mult, ((ReferenciaContext)_localctx).idx.offset.toString(), nbytes, t2.toString());
						} else {
							String tableOffsetComp = String.valueOf(((ReferenciaContext)_localctx).idx.table.getOffset());
							Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
							generate(Instruction.OP.sub, ((ReferenciaContext)_localctx).idx.offset.toString(), tableOffsetComp, t1.toString());
							t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
							generate(Instruction.OP.mult, t1.toString(), nbytes, t2.toString());
						}
						((ReferenciaContext)_localctx).variable =  ((ReferenciaContext)_localctx).idx.variable;
						((ReferenciaContext)_localctx).offset =  t2;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				((ReferenciaContext)_localctx).ID = match(ID);
				setState(345);
				match(LPAREN);
				setState(346);
				match(RPAREN);

						Symbol symbol;
						int t;
						try {
							symbol = ts.get(((ReferenciaContext)_localctx).ID.getText());
							generate(Instruction.OP.call, null, null, symbol.getProcedure().toString());
							if(symbol.getType()  ==  Symbol.Types.FUNC) {
								t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
								((ReferenciaContext)_localctx).variable =  tv.get(t);
								((ReferenciaContext)_localctx).dataType =  symbol.dataType();
								generate(Instruction.OP.st, null, null, tv.get(t).toString());
							}
						} catch(SymbolTable.SymbolTableException e) {
							System.out.println("Error con la tabla de símbolos: "+e.getMessage());
						}
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				((ReferenciaContext)_localctx).contIdx = contIdx();
				setState(349);
				match(RPAREN);

						int t;
						while(((ReferenciaContext)_localctx).contIdx.pparams.size() > 0)
						{
						  Variable parameter = ((ReferenciaContext)_localctx).contIdx.pparams.pop();
						  generate(Instruction.OP.params, null, null, parameter.toString());
				    }
						generate(Instruction.OP.call, null, null, ((ReferenciaContext)_localctx).contIdx.procedure.toString());
						if(((ReferenciaContext)_localctx).contIdx.symbol.getType()  ==  Symbol.Types.FUNC) {
							t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, ((ReferenciaContext)_localctx).contIdx.symbol.dataType());
							((ReferenciaContext)_localctx).variable =  tv.get(t);
							((ReferenciaContext)_localctx).dataType =  ((ReferenciaContext)_localctx).contIdx.symbol.dataType();
							generate(Instruction.OP.st, null, null, tv.get(t).toString());
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
		public Table table;
		public Variable variable;
		public Variable offset;
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
			setState(354);
			((IdxContext)_localctx).ID = match(ID);
			setState(355);
			match(LBRACK);
			setState(356);
			((IdxContext)_localctx).expr = expr();

					Symbol symbol = null;
					try {
						symbol = ts.get(((IdxContext)_localctx).ID.getText());
					} catch(SymbolTable.SymbolTableException e) {
						System.out.println("Error con la tabla de símbolos: "+e.getMessage());
					}
					((IdxContext)_localctx).table =  symbol.getTable();
					Index idx = _localctx.table.getFirst();
					((IdxContext)_localctx).variable =  tv.get(symbol.getVariableNumber());
					Variable offset = ((IdxContext)_localctx).expr.variable;
				
			setState(358);
			((IdxContext)_localctx).idx_ = idx_(idx, offset);

					((IdxContext)_localctx).offset =  ((IdxContext)_localctx).idx_.offset;
				
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
		public Variable offset1;
		public Variable offset;
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
		public Idx_Context(ParserRuleContext parent, int invokingState, Index idx1, Variable offset1) {
			super(parent, invokingState);
			this.idx1 = idx1;
			this.offset1 = offset1;
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

	public final Idx_Context idx_(Index idx1,Variable offset1) throws RecognitionException {
		Idx_Context _localctx = new Idx_Context(_ctx, getState(), idx1, offset1);
		enterRule(_localctx, 36, RULE_idx_);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(RBRACK);
				setState(362);
				match(LBRACK);
				setState(363);
				((Idx_Context)_localctx).expr = expr();

						Index idx = idx1.getNextIndex();
						Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
						generate(Instruction.OP.mult, _localctx.offset1.toString(), String.valueOf(idx.getDimension()), t1.toString());
						Variable t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
						generate(Instruction.OP.add, t1.toString(), ((Idx_Context)_localctx).expr.variable.toString(), t2.toString());
					
				setState(365);
				((Idx_Context)_localctx).idx_ = idx_(idx, t2);

						((Idx_Context)_localctx).offset =  ((Idx_Context)_localctx).idx_.offset;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

						((Idx_Context)_localctx).offset =  _localctx.offset1; // Devuelve la misma variable que recibe
					
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
		public Procedure procedure;
		public Symbol symbol;
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
			setState(371);
			((ContIdxContext)_localctx).ID = match(ID);
			setState(372);
			match(LPAREN);
			setState(373);
			((ContIdxContext)_localctx).expr = expr();

					Symbol symbol = new Symbol();
					((ContIdxContext)_localctx).pparams =  new ArrayDeque<Variable>();
					try {
						symbol = ts.get(((ContIdxContext)_localctx).ID.getText());
						((ContIdxContext)_localctx).symbol =  symbol;
						((ContIdxContext)_localctx).procedure =  symbol.getProcedure();
						_localctx.pparams.push(((ContIdxContext)_localctx).expr.variable);
						if(((ContIdxContext)_localctx).expr.true_ != null || ((ContIdxContext)_localctx).expr.false_ != null) { // Booleano
							Tag ec = te.get(te.newTag(false));
							Tag ef = te.get(te.newTag(false));
							Tag efin = te.get(te.newTag(false));
							generate(Instruction.OP.skip, null, null, ec.toString());
							generate(Instruction.OP.copy, "-1", null, ((ContIdxContext)_localctx).expr.variable.toString());
							generate(Instruction.OP.jump, null, null, efin.toString());
							generate(Instruction.OP.skip, null, null, ef.toString());
							generate(Instruction.OP.copy, "0", null, ((ContIdxContext)_localctx).expr.variable.toString());
							generate(Instruction.OP.skip, null, null, efin.toString());
							backpatch(((ContIdxContext)_localctx).expr.true_, ec);
							backpatch(((ContIdxContext)_localctx).expr.false_, ef);
						}
					} catch(SymbolTable.SymbolTableException e) {
						System.out.println("Error con la tabla de símbolos: "+e.getMessage());
					}
				
			setState(375);
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
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(COMMA);
				setState(378);
				((ContIdx_Context)_localctx).expr = expr();

						_localctx.pparams.push(((ContIdx_Context)_localctx).expr.variable);
						if(((ContIdx_Context)_localctx).expr.true_ != null || ((ContIdx_Context)_localctx).expr.false_ != null) { // Boolean
							Tag ec = te.get(te.newTag(false));
							Tag ef = te.get(te.newTag(false));
							Tag efin = te.get(te.newTag(false));
							generate(Instruction.OP.skip, null, null, ec.toString());
							generate(Instruction.OP.copy, "-1", null, ((ContIdx_Context)_localctx).expr.variable.toString());
							generate(Instruction.OP.jump, null, null, efin.toString());
							generate(Instruction.OP.skip, null, null, ef.toString());
							generate(Instruction.OP.copy, "0", null, ((ContIdx_Context)_localctx).expr.variable.toString());
							generate(Instruction.OP.skip, null, null, efin.toString());
				      backpatch(((ContIdx_Context)_localctx).expr.true_, ec);
				      backpatch(((ContIdx_Context)_localctx).expr.false_, ef);
						}
					
				setState(380);
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(385);
			((ExprContext)_localctx).exprOr = exprOr();

					((ExprContext)_localctx).variable =  ((ExprContext)_localctx).exprOr.variable;
					((ExprContext)_localctx).true_ =  ((ExprContext)_localctx).exprOr.true_;
					((ExprContext)_localctx).false_ =  ((ExprContext)_localctx).exprOr.false_;
				
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(388);
			((ExprOrContext)_localctx).exprAnd = exprAnd();

					((ExprOrContext)_localctx).variable =  ((ExprOrContext)_localctx).exprAnd.variable;
					((ExprOrContext)_localctx).true_ =  ((ExprOrContext)_localctx).exprAnd.true_;
					((ExprOrContext)_localctx).false_ =  ((ExprOrContext)_localctx).exprAnd.false_;
				
			setState(390);
			((ExprOrContext)_localctx).exprOr_ = exprOr_(_localctx.variable, _localctx.true_, _localctx.false_);

					if(((ExprOrContext)_localctx).exprOr_.true_ != null || ((ExprOrContext)_localctx).exprOr_.false_ != null) {
						((ExprOrContext)_localctx).variable =  ((ExprOrContext)_localctx).exprOr_.variable;
						((ExprOrContext)_localctx).true_ =  ((ExprOrContext)_localctx).exprOr_.true_;
						((ExprOrContext)_localctx).false_ =  ((ExprOrContext)_localctx).exprOr_.false_;
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
		public Variable variable1;
		public Deque<Integer> true_1;
		public Deque<Integer> false_1;
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
		public ExprOr_Context(ParserRuleContext parent, int invokingState, Variable variable1, Deque<Integer> true_1, Deque<Integer> false_1) {
			super(parent, invokingState);
			this.variable1 = variable1;
			this.true_1 = true_1;
			this.false_1 = false_1;
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

	public final ExprOr_Context exprOr_(Variable variable1,Deque<Integer> true_1,Deque<Integer> false_1) throws RecognitionException {
		ExprOr_Context _localctx = new ExprOr_Context(_ctx, getState(), variable1, true_1, false_1);
		enterRule(_localctx, 46, RULE_exprOr_);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(OR);

						Tag e = te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, e.toString());
					
				setState(395);
				((ExprOr_Context)_localctx).exprAnd = exprAnd();

						backpatch(_localctx.false_1, e);
						((ExprOr_Context)_localctx).true_ =  concat(_localctx.true_1, ((ExprOr_Context)_localctx).exprAnd.true_);
						((ExprOr_Context)_localctx).false_ =  ((ExprOr_Context)_localctx).exprAnd.false_;
					
				setState(397);
				((ExprOr_Context)_localctx).exprOr_ = exprOr_(_localctx.variable, _localctx.true_, _localctx.false_);

						if(((ExprOr_Context)_localctx).exprOr_.true_!= null || ((ExprOr_Context)_localctx).exprOr_.false_!= null) {
							((ExprOr_Context)_localctx).variable =  ((ExprOr_Context)_localctx).exprOr_.variable;
							((ExprOr_Context)_localctx).true_ =  ((ExprOr_Context)_localctx).exprOr_.true_;
							((ExprOr_Context)_localctx).false_ =  ((ExprOr_Context)_localctx).exprOr_.false_;
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(403);
			((ExprAndContext)_localctx).exprNot = exprNot();

					((ExprAndContext)_localctx).variable =  ((ExprAndContext)_localctx).exprNot.variable;
					((ExprAndContext)_localctx).true_ =  ((ExprAndContext)_localctx).exprNot.true_;
					((ExprAndContext)_localctx).false_ =  ((ExprAndContext)_localctx).exprNot.false_;
				
			setState(405);
			((ExprAndContext)_localctx).exprAnd_ = exprAnd_(_localctx.variable, _localctx.true_, _localctx.false_);

					if(((ExprAndContext)_localctx).exprAnd_.true_!= null || ((ExprAndContext)_localctx).exprAnd_.false_!= null) {
						((ExprAndContext)_localctx).variable =  ((ExprAndContext)_localctx).exprAnd_.variable;
						((ExprAndContext)_localctx).true_ =  ((ExprAndContext)_localctx).exprAnd_.true_;
						((ExprAndContext)_localctx).false_ =  ((ExprAndContext)_localctx).exprAnd_.false_;
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
		public Variable variable1;
		public Deque<Integer> true_1;
		public Deque<Integer> false_1;
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
		public ExprAnd_Context(ParserRuleContext parent, int invokingState, Variable variable1, Deque<Integer> true_1, Deque<Integer> false_1) {
			super(parent, invokingState);
			this.variable1 = variable1;
			this.true_1 = true_1;
			this.false_1 = false_1;
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

	public final ExprAnd_Context exprAnd_(Variable variable1,Deque<Integer> true_1,Deque<Integer> false_1) throws RecognitionException {
		ExprAnd_Context _localctx = new ExprAnd_Context(_ctx, getState(), variable1, true_1, false_1);
		enterRule(_localctx, 50, RULE_exprAnd_);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(AND);

						Tag e = te.get(te.newTag(false));
						generate(Instruction.OP.skip, null, null, e.toString());
					
				setState(410);
				((ExprAnd_Context)_localctx).exprNot = exprNot();

						backpatch(_localctx.true_1, e);
						((ExprAnd_Context)_localctx).false_ =  concat(_localctx.false_1, ((ExprAnd_Context)_localctx).exprNot.false_);
						((ExprAnd_Context)_localctx).true_ =  ((ExprAnd_Context)_localctx).exprNot.true_;
					
				setState(412);
				((ExprAnd_Context)_localctx).exprAnd_ = exprAnd_(_localctx.variable, _localctx.true_, _localctx.false_);

						if(((ExprAnd_Context)_localctx).exprAnd_.true_ != null || ((ExprAnd_Context)_localctx).exprAnd_.false_ != null) {
							((ExprAnd_Context)_localctx).variable =  ((ExprAnd_Context)_localctx).exprAnd_.variable;
							((ExprAnd_Context)_localctx).true_ =  ((ExprAnd_Context)_localctx).exprAnd_.true_;
							((ExprAnd_Context)_localctx).false_ =  ((ExprAnd_Context)_localctx).exprAnd_.false_;
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(NOT);
				setState(419);
				((ExprNotContext)_localctx).exprComp = exprComp();

						((ExprNotContext)_localctx).true_ =  ((ExprNotContext)_localctx).exprComp.false_;
						((ExprNotContext)_localctx).false_ =  ((ExprNotContext)_localctx).exprComp.true_;
						((ExprNotContext)_localctx).variable =  ((ExprNotContext)_localctx).exprComp.variable;
					
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
				setState(422);
				((ExprNotContext)_localctx).exprComp = exprComp();

						((ExprNotContext)_localctx).true_ =  ((ExprNotContext)_localctx).exprComp.true_;
						((ExprNotContext)_localctx).false_ =  ((ExprNotContext)_localctx).exprComp.false_;
						((ExprNotContext)_localctx).variable =  ((ExprNotContext)_localctx).exprComp.variable;
					
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
		public ExprAddContext exprAdd;
		public ExprComp_Context exprComp_;
		public ExprAddContext exprAdd() {
			return getRuleContext(ExprAddContext.class,0);
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
			setState(427);
			((ExprCompContext)_localctx).exprAdd = exprAdd();

					((ExprCompContext)_localctx).variable =  ((ExprCompContext)_localctx).exprAdd.variable;
					((ExprCompContext)_localctx).true_ =  ((ExprCompContext)_localctx).exprAdd.true_;
					((ExprCompContext)_localctx).false_ =  ((ExprCompContext)_localctx).exprAdd.false_;
				
			setState(429);
			((ExprCompContext)_localctx).exprComp_ = exprComp_(_localctx.variable);

					if(((ExprCompContext)_localctx).exprComp_.true_!= null || ((ExprCompContext)_localctx).exprComp_.false_!= null) {
						((ExprCompContext)_localctx).true_ =  ((ExprCompContext)_localctx).exprComp_.true_;
						((ExprCompContext)_localctx).false_ =  ((ExprCompContext)_localctx).exprComp_.false_;
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
		public Variable e1;
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
		public Token OPREL;
		public ExprAddContext exprAdd;
		public TerminalNode OPREL() { return getToken(eGramC3D.OPREL, 0); }
		public ExprAddContext exprAdd() {
			return getRuleContext(ExprAddContext.class,0);
		}
		public ExprComp_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprComp_Context(ParserRuleContext parent, int invokingState, Variable e1) {
			super(parent, invokingState);
			this.e1 = e1;
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

	public final ExprComp_Context exprComp_(Variable e1) throws RecognitionException {
		ExprComp_Context _localctx = new ExprComp_Context(_ctx, getState(), e1);
		enterRule(_localctx, 56, RULE_exprComp_);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				((ExprComp_Context)_localctx).OPREL = match(OPREL);
				setState(433);
				((ExprComp_Context)_localctx).exprAdd = exprAdd();

						generate(condJumpValue(((ExprComp_Context)_localctx).OPREL.getText()), _localctx.e1.toString(), ((ExprComp_Context)_localctx).exprAdd.variable.toString(), null);
						((ExprComp_Context)_localctx).true_ =  new ArrayDeque<Integer>();
				 		_localctx.true_.add(pc);
						generate(Instruction.OP.jump, null, null, null);
						((ExprComp_Context)_localctx).false_ =  new ArrayDeque<Integer>();
				 		_localctx.false_.add(pc);
						((ExprComp_Context)_localctx).variable =  ((ExprComp_Context)_localctx).exprAdd.variable;
				  
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
	public static class ExprAddContext extends ParserRuleContext {
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
		public ExprMultContext exprMult;
		public ExprAdd_Context exprAdd_;
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdd_Context exprAdd_() {
			return getRuleContext(ExprAdd_Context.class,0);
		}
		public ExprAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAddContext exprAdd() throws RecognitionException {
		ExprAddContext _localctx = new ExprAddContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			((ExprAddContext)_localctx).exprMult = exprMult();

					((ExprAddContext)_localctx).variable =  ((ExprAddContext)_localctx).exprMult.variable;
					((ExprAddContext)_localctx).true_ =  ((ExprAddContext)_localctx).exprMult.true_;
					((ExprAddContext)_localctx).false_ =  ((ExprAddContext)_localctx).exprMult.false_;
				
			setState(441);
			((ExprAddContext)_localctx).exprAdd_ = exprAdd_(_localctx.variable);

					if(((ExprAddContext)_localctx).exprAdd_.true_!= null || ((ExprAddContext)_localctx).exprAdd_.false_!= null || ((ExprAddContext)_localctx).exprAdd_.variable!= null) {
						((ExprAddContext)_localctx).variable =  ((ExprAddContext)_localctx).exprAdd_.variable;
						((ExprAddContext)_localctx).true_ =  ((ExprAddContext)_localctx).exprAdd_.true_;
						((ExprAddContext)_localctx).false_ =  ((ExprAddContext)_localctx).exprAdd_.false_;
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
	public static class ExprAdd_Context extends ParserRuleContext {
		public Variable t1;
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
		public ExprMultContext exprMult;
		public ExprAdd_Context exprAdd_;
		public TerminalNode ADD() { return getToken(eGramC3D.ADD, 0); }
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdd_Context exprAdd_() {
			return getRuleContext(ExprAdd_Context.class,0);
		}
		public TerminalNode SUB() { return getToken(eGramC3D.SUB, 0); }
		public ExprAdd_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprAdd_Context(ParserRuleContext parent, int invokingState, Variable t1) {
			super(parent, invokingState);
			this.t1 = t1;
		}
		@Override public int getRuleIndex() { return RULE_exprAdd_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterExprAdd_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitExprAdd_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitExprAdd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAdd_Context exprAdd_(Variable t1) throws RecognitionException {
		ExprAdd_Context _localctx = new ExprAdd_Context(_ctx, getState(), t1);
		enterRule(_localctx, 60, RULE_exprAdd_);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(ADD);
				setState(445);
				((ExprAdd_Context)_localctx).exprMult = exprMult();

						int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
						generate(Instruction.OP.add, _localctx.t1.toString(), ((ExprAdd_Context)_localctx).exprMult.variable.toString(), tv.get(t).toString());
						((ExprAdd_Context)_localctx).variable =  tv.get(t);
						((ExprAdd_Context)_localctx).true_ =  ((ExprAdd_Context)_localctx).exprMult.true_;
						((ExprAdd_Context)_localctx).false_ =  ((ExprAdd_Context)_localctx).exprMult.false_;
					
				setState(447);
				((ExprAdd_Context)_localctx).exprAdd_ = exprAdd_(_localctx.variable);

						if(((ExprAdd_Context)_localctx).exprAdd_.variable!= null || ((ExprAdd_Context)_localctx).exprAdd_.true_!= null || ((ExprAdd_Context)_localctx).exprAdd_.false_!= null) {
							((ExprAdd_Context)_localctx).variable =  ((ExprAdd_Context)_localctx).exprAdd_.variable;
							((ExprAdd_Context)_localctx).true_ =  ((ExprAdd_Context)_localctx).exprAdd_.true_;
							((ExprAdd_Context)_localctx).false_ =  ((ExprAdd_Context)_localctx).exprAdd_.false_;
						}
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(SUB);
				setState(451);
				((ExprAdd_Context)_localctx).exprMult = exprMult();

						int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
						generate(Instruction.OP.sub, _localctx.t1.toString(), ((ExprAdd_Context)_localctx).exprMult.variable.toString(), tv.get(t).toString());
						((ExprAdd_Context)_localctx).variable =  tv.get(t);
						((ExprAdd_Context)_localctx).true_ =  ((ExprAdd_Context)_localctx).exprMult.true_;
						((ExprAdd_Context)_localctx).false_ =  ((ExprAdd_Context)_localctx).exprMult.false_;
					
				setState(453);
				((ExprAdd_Context)_localctx).exprAdd_ = exprAdd_(_localctx.variable);

						if(((ExprAdd_Context)_localctx).exprAdd_.variable!= null || ((ExprAdd_Context)_localctx).exprAdd_.true_!= null || ((ExprAdd_Context)_localctx).exprAdd_.false_!= null) {
							((ExprAdd_Context)_localctx).variable =  ((ExprAdd_Context)_localctx).exprAdd_.variable;
							((ExprAdd_Context)_localctx).true_ =  ((ExprAdd_Context)_localctx).exprAdd_.true_;
							((ExprAdd_Context)_localctx).false_ =  ((ExprAdd_Context)_localctx).exprAdd_.false_;
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(459);
			((ExprMultContext)_localctx).exprNeg = exprNeg();

					((ExprMultContext)_localctx).variable =  ((ExprMultContext)_localctx).exprNeg.variable;
					((ExprMultContext)_localctx).true_ =  ((ExprMultContext)_localctx).exprNeg.true_;
					((ExprMultContext)_localctx).false_ =  ((ExprMultContext)_localctx).exprNeg.false_;
				
			setState(461);
			((ExprMultContext)_localctx).exprMult_ = exprMult_(_localctx.variable);

					if(((ExprMultContext)_localctx).exprMult_.variable!= null || ((ExprMultContext)_localctx).exprMult_.true_!= null || ((ExprMultContext)_localctx).exprMult_.false_!= null) {
						((ExprMultContext)_localctx).variable =  ((ExprMultContext)_localctx).exprMult_.variable;
						((ExprMultContext)_localctx).true_ =  ((ExprMultContext)_localctx).exprMult_.true_;
						((ExprMultContext)_localctx).false_ =  ((ExprMultContext)_localctx).exprMult_.false_;
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(MULT);
				setState(465);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

						int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
						generate(Instruction.OP.mult, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.variable.toString(), tv.get(t).toString());
						((ExprMult_Context)_localctx).variable =  tv.get(t);
						((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprNeg.true_;
						((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprNeg.false_;
					
				setState(467);
				((ExprMult_Context)_localctx).exprMult_ = exprMult_(_localctx.variable);

						if(((ExprMult_Context)_localctx).exprMult_.variable!= null || ((ExprMult_Context)_localctx).exprMult_.true_!= null || ((ExprMult_Context)_localctx).exprMult_.false_!= null) {
							((ExprMult_Context)_localctx).variable =  ((ExprMult_Context)_localctx).exprMult_.variable;
							((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprMult_.true_;
							((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprMult_.false_;
						}
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(DIV);
				setState(471);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

						int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
						generate(Instruction.OP.div, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.variable.toString(), tv.get(t).toString());
						((ExprMult_Context)_localctx).variable =  tv.get(t);
						((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprNeg.true_;
						((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprNeg.false_;
					
				setState(473);
				((ExprMult_Context)_localctx).exprMult_ = exprMult_(_localctx.variable);

						if(((ExprMult_Context)_localctx).exprMult_.variable!= null || ((ExprMult_Context)_localctx).exprMult_.true_!= null || ((ExprMult_Context)_localctx).exprMult_.false_!= null) {
							((ExprMult_Context)_localctx).variable =  ((ExprMult_Context)_localctx).exprMult_.variable;
							((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprMult_.true_;
							((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprMult_.false_;
						}
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(MOD);
				setState(477);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

						int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
						generate(Instruction.OP.mod, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.variable.toString(), tv.get(t).toString());
						((ExprMult_Context)_localctx).variable =  tv.get(t);
						((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprNeg.true_;
						((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprNeg.false_;
					
				setState(479);
				((ExprMult_Context)_localctx).exprMult_ = exprMult_(_localctx.variable);

						if(((ExprMult_Context)_localctx).exprMult_.variable!= null || ((ExprMult_Context)_localctx).exprMult_.true_!= null || ((ExprMult_Context)_localctx).exprMult_.false_!= null) {
							((ExprMult_Context)_localctx).variable =  ((ExprMult_Context)_localctx).exprMult_.variable;
							((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprMult_.true_;
							((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprMult_.false_;
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(SUB);
				setState(486);
				((ExprNegContext)_localctx).primario = primario();

						int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
						generate(Instruction.OP.neg, ((ExprNegContext)_localctx).primario.variable.toString(), null, tv.get(t).toString());
						((ExprNegContext)_localctx).variable =  tv.get(t);
						((ExprNegContext)_localctx).true_ =  ((ExprNegContext)_localctx).primario.true_;
						((ExprNegContext)_localctx).false_ =  ((ExprNegContext)_localctx).primario.false_;
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				((ExprNegContext)_localctx).primario = primario();

						((ExprNegContext)_localctx).variable =  ((ExprNegContext)_localctx).primario.variable;
						((ExprNegContext)_localctx).true_ =  ((ExprNegContext)_localctx).primario.true_;
						((ExprNegContext)_localctx).false_ =  ((ExprNegContext)_localctx).primario.false_;
					
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
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
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
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(LPAREN);
				setState(495);
				((PrimarioContext)_localctx).expr = expr();
				setState(496);
				match(RPAREN);

						((PrimarioContext)_localctx).variable =  ((PrimarioContext)_localctx).expr.variable;
						((PrimarioContext)_localctx).true_ =  ((PrimarioContext)_localctx).expr.true_;
						((PrimarioContext)_localctx).false_ =  ((PrimarioContext)_localctx).expr.false_;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				((PrimarioContext)_localctx).referencia = referencia();

						if(((PrimarioContext)_localctx).referencia.offset!= null) {
							// Caso para cuando hay desplazamiento
							Variable t = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
							generate(Instruction.OP.ind_val, ((PrimarioContext)_localctx).referencia.variable.toString(), ((PrimarioContext)_localctx).referencia.offset.toString(), t.toString());
							((PrimarioContext)_localctx).variable =  t;
						} else {
							((PrimarioContext)_localctx).variable =  ((PrimarioContext)_localctx).referencia.variable;
						}
						if(((PrimarioContext)_localctx).referencia.dataType == Symbol.DataTypes.BOOLEAN) {
							generate(Instruction.OP.ifEQ, _localctx.variable.toString(), "-1", null);
							((PrimarioContext)_localctx).true_ =  new ArrayDeque<Integer>();
							_localctx.true_.add(pc);
							generate(Instruction.OP.jump, null, null, null);
							((PrimarioContext)_localctx).false_ =  new ArrayDeque<Integer>();
							_localctx.false_.add(pc);
						}
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				((PrimarioContext)_localctx).literal = literal();

						int t = 0;
						switch(((PrimarioContext)_localctx).literal.datatypes) {
							case BOOLEAN:
								t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.BOOLEAN);
								if((((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null).equals("true")) {
									generate(Instruction.OP.copy, "-1", null, tv.get(t).toString());
									tv.get(t).setValue("-1");
									generate(Instruction.OP.jump, null, null, null);
									((PrimarioContext)_localctx).true_ =  new ArrayDeque<Integer>();
									_localctx.true_.add(pc);
									((PrimarioContext)_localctx).false_ =  null;
								} else {
									generate(Instruction.OP.copy, "0", null, tv.get(t).toString());
									tv.get(t).setValue("0");
									generate(Instruction.OP.jump, null, null, null);
									((PrimarioContext)_localctx).false_ =  new ArrayDeque<Integer>();
									_localctx.false_.add(pc);
									((PrimarioContext)_localctx).true_ =  null;
								}
								break;
							case STRING:
								t = tv.newVar(true, pproc.peek(), Symbol.Types.CONST, Symbol.DataTypes.STRING);
								tv.get(t).setValue((((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null));
								break;
							case INT:
								t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
								generate(Instruction.OP.copy, (((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null), null, tv.get(t).toString());
								tv.get(t).setValue((((PrimarioContext)_localctx).literal!=null?_input.getText(((PrimarioContext)_localctx).literal.start,((PrimarioContext)_localctx).literal.stop):null));
								break;
							default:
								break;
						}
						((PrimarioContext)_localctx).variable =  tv.get(t);
					
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
		public Symbol.DataTypes datatypes;
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
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(INTEGER);

						((TipoContext)_localctx).datatypes =  Symbol.DataTypes.INT;
					
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(BOOLEAN);

						((TipoContext)_localctx).datatypes =  Symbol.DataTypes.BOOLEAN;
					
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(STRING);

						((TipoContext)_localctx).datatypes =  Symbol.DataTypes.STRING;
					
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
		public Symbol.DataTypes datatypes;
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
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(LiteralInteger);

						((LiteralContext)_localctx).datatypes =  Symbol.DataTypes.INT;
					
				}
				break;
			case LiteralBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(LiteralBoolean);

						((LiteralContext)_localctx).datatypes =  Symbol.DataTypes.BOOLEAN;
					
				}
				break;
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(LiteralString);

						((LiteralContext)_localctx).datatypes =  Symbol.DataTypes.STRING;
					
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
		"\u0004\u0001.\u020c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0004\u0000M\b\u0000\u000b"+
		"\u0000\f\u0000N\u0001\u0000\u0004\u0000R\b\u0000\u000b\u0000\f\u0000S"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001_\b\u0001\n\u0001\f\u0001"+
		"b\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002o\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0085\b\u0002"+
		"\n\u0002\f\u0002\u0088\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u008e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0096\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00a7\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ae\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00b8\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c8\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00dd\b\u000b\n\u000b\f\u000b\u00e0"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ea\b\u000b\n\u000b\f\u000b"+
		"\u00ed\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00fe\b\u000b"+
		"\n\u000b\f\u000b\u0101\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u010c\b\u000b\n\u000b\f\u000b\u010f\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u012b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u013a"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0146"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0151\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0161\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0172\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0180\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0192\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01a1\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01aa\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01b6\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01ca"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01e4"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01ed\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01fa\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u0202\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u020a"+
		"\b$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0001"+
		"\u0002\u0000\u0011\u0011++\u021a\u0000J\u0001\u0000\u0000\u0000\u0002"+
		"Y\u0001\u0000\u0000\u0000\u0004\u008d\u0001\u0000\u0000\u0000\u0006\u008f"+
		"\u0001\u0000\u0000\u0000\b\u00a6\u0001\u0000\u0000\u0000\n\u00a8\u0001"+
		"\u0000\u0000\u0000\f\u00aa\u0001\u0000\u0000\u0000\u000e\u00b7\u0001\u0000"+
		"\u0000\u0000\u0010\u00b9\u0001\u0000\u0000\u0000\u0012\u00bc\u0001\u0000"+
		"\u0000\u0000\u0014\u00c7\u0001\u0000\u0000\u0000\u0016\u012a\u0001\u0000"+
		"\u0000\u0000\u0018\u012c\u0001\u0000\u0000\u0000\u001a\u0139\u0001\u0000"+
		"\u0000\u0000\u001c\u013b\u0001\u0000\u0000\u0000\u001e\u0150\u0001\u0000"+
		"\u0000\u0000 \u0160\u0001\u0000\u0000\u0000\"\u0162\u0001\u0000\u0000"+
		"\u0000$\u0171\u0001\u0000\u0000\u0000&\u0173\u0001\u0000\u0000\u0000("+
		"\u017f\u0001\u0000\u0000\u0000*\u0181\u0001\u0000\u0000\u0000,\u0184\u0001"+
		"\u0000\u0000\u0000.\u0191\u0001\u0000\u0000\u00000\u0193\u0001\u0000\u0000"+
		"\u00002\u01a0\u0001\u0000\u0000\u00004\u01a9\u0001\u0000\u0000\u00006"+
		"\u01ab\u0001\u0000\u0000\u00008\u01b5\u0001\u0000\u0000\u0000:\u01b7\u0001"+
		"\u0000\u0000\u0000<\u01c9\u0001\u0000\u0000\u0000>\u01cb\u0001\u0000\u0000"+
		"\u0000@\u01e3\u0001\u0000\u0000\u0000B\u01ec\u0001\u0000\u0000\u0000D"+
		"\u01f9\u0001\u0000\u0000\u0000F\u0201\u0001\u0000\u0000\u0000H\u0209\u0001"+
		"\u0000\u0000\u0000JQ\u0006\u0000\uffff\uffff\u0000KM\u0003\u0004\u0002"+
		"\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PR\u0003"+
		"\u0002\u0001\u0000QL\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0006\u0000\uffff\uffff\u0000VW\u0005"+
		"\u0000\u0000\u0001WX\u0006\u0000\uffff\uffff\u0000X\u0001\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0001\u0000\u0000Z[\u0006\u0001\uffff\uffff\u0000"+
		"[\\\u0005\u0018\u0000\u0000\\`\u0006\u0001\uffff\uffff\u0000]_\u0003\u0004"+
		"\u0002\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0003\u0012\t\u0000de\u0005\u0019\u0000\u0000"+
		"ef\u0006\u0001\uffff\uffff\u0000f\u0003\u0001\u0000\u0000\u0000gh\u0003"+
		"F#\u0000hi\u0005+\u0000\u0000in\u0006\u0002\uffff\uffff\u0000jk\u0005"+
		"\u001f\u0000\u0000kl\u0003*\u0015\u0000lm\u0006\u0002\uffff\uffff\u0000"+
		"mo\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0005\u001b\u0000\u0000q\u008e\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0003\u0000\u0000st\u0003F#\u0000tu\u0005+"+
		"\u0000\u0000uv\u0005\u001f\u0000\u0000vw\u0003H$\u0000wx\u0005\u001b\u0000"+
		"\u0000xy\u0006\u0002\uffff\uffff\u0000y\u008e\u0001\u0000\u0000\u0000"+
		"z{\u0003\u0006\u0003\u0000{|\u0005\u0017\u0000\u0000|}\u0005\u001b\u0000"+
		"\u0000}\u008e\u0001\u0000\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f"+
		"\u0080\u0003F#\u0000\u0080\u0081\u0003\f\u0006\u0000\u0081\u0082\u0005"+
		"\u0018\u0000\u0000\u0082\u0086\u0006\u0002\uffff\uffff\u0000\u0083\u0085"+
		"\u0003\u0004\u0002\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u0012\t\u0000\u008a\u008b\u0005"+
		"\u0019\u0000\u0000\u008b\u008c\u0006\u0002\uffff\uffff\u0000\u008c\u008e"+
		"\u0001\u0000\u0000\u0000\u008dg\u0001\u0000\u0000\u0000\u008dr\u0001\u0000"+
		"\u0000\u0000\u008dz\u0001\u0000\u0000\u0000\u008d~\u0001\u0000\u0000\u0000"+
		"\u008e\u0005\u0001\u0000\u0000\u0000\u008f\u0090\u0003F#\u0000\u0090\u0091"+
		"\u0005+\u0000\u0000\u0091\u0095\u0005\u0016\u0000\u0000\u0092\u0093\u0003"+
		"\n\u0005\u0000\u0093\u0094\u0005\u001d\u0000\u0000\u0094\u0096\u0001\u0000"+
		"\u0000\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0003\n\u0005"+
		"\u0000\u0098\u0099\u0003\b\u0004\u0000\u0099\u009a\u0006\u0003\uffff\uffff"+
		"\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0017\u0000"+
		"\u0000\u009c\u00a0\u0005\u0016\u0000\u0000\u009d\u009e\u0003\n\u0005\u0000"+
		"\u009e\u009f\u0005\u001d\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\n\u0005\u0000\u00a3"+
		"\u00a4\u0003\b\u0004\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u009b\u0001\u0000\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\t\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007"+
		"\u0000\u0000\u0000\u00a9\u000b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"+\u0000\u0000\u00ab\u00ad\u0005\u0014\u0000\u0000\u00ac\u00ae\u0003\u000e"+
		"\u0007\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0015"+
		"\u0000\u0000\u00b0\u00b1\u0006\u0006\uffff\uffff\u0000\u00b1\r\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0010\b\u0000\u00b3\u00b4\u0005\u001a\u0000"+
		"\u0000\u00b4\u00b5\u0003\u000e\u0007\u0000\u00b5\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0003\u0010\b\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u000f\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0003F#\u0000\u00ba\u00bb\u0005+\u0000\u0000\u00bb\u0011"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b\u0000\u00bd\u00be"+
		"\u0006\t\uffff\uffff\u0000\u00be\u00bf\u0003\u0014\n\u0000\u00bf\u00c0"+
		"\u0006\t\uffff\uffff\u0000\u00c0\u0013\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0003\u0016\u000b\u0000\u00c2\u00c3\u0006\n\uffff\uffff\u0000\u00c3\u00c4"+
		"\u0003\u0014\n\u0000\u00c4\u00c5\u0006\n\uffff\uffff\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u0015"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u000b\u0000\u0000\u00ca\u00cb"+
		"\u0003*\u0015\u0000\u00cb\u00cc\u0005\u0018\u0000\u0000\u00cc\u00d0\u0006"+
		"\u000b\uffff\uffff\u0000\u00cd\u00cf\u0003\u0004\u0002\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0003\u0012\t\u0000\u00d4\u00d5\u0006\u000b\uffff\uffff\u0000\u00d5\u00d6"+
		"\u0005\u0019\u0000\u0000\u00d6\u012b\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\u000b\u0000\u0000\u00d8\u00d9\u0003*\u0015\u0000\u00d9\u00da\u0005"+
		"\u0018\u0000\u0000\u00da\u00de\u0006\u000b\uffff\uffff\u0000\u00db\u00dd"+
		"\u0003\u0004\u0002\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u0012\t\u0000\u00e2\u00e3\u0006"+
		"\u000b\uffff\uffff\u0000\u00e3\u00e4\u0005\u0019\u0000\u0000\u00e4\u00e5"+
		"\u0006\u000b\uffff\uffff\u0000\u00e5\u00e6\u0005\f\u0000\u0000\u00e6\u00e7"+
		"\u0005\u0018\u0000\u0000\u00e7\u00eb\u0006\u000b\uffff\uffff\u0000\u00e8"+
		"\u00ea\u0003\u0004\u0002\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003\u0012\t\u0000\u00ef\u00f0"+
		"\u0005\u0019\u0000\u0000\u00f0\u00f1\u0006\u000b\uffff\uffff\u0000\u00f1"+
		"\u012b\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\u0018\f\u0000\u00f3\u00f4"+
		"\u0003\u001e\u000f\u0000\u00f4\u00f5\u0005\u0019\u0000\u0000\u00f5\u00f6"+
		"\u0006\u000b\uffff\uffff\u0000\u00f6\u012b\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\t\u0000\u0000\u00f8\u00f9\u0006\u000b\uffff\uffff\u0000\u00f9"+
		"\u00fa\u0003*\u0015\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000\u00fb\u00ff"+
		"\u0006\u000b\uffff\uffff\u0000\u00fc\u00fe\u0003\u0004\u0002\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003\u0012\t\u0000\u0103\u0104\u0006\u000b\uffff\uffff\u0000\u0104"+
		"\u0105\u0005\u0019\u0000\u0000\u0105\u012b\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\n\u0000\u0000\u0107\u0108\u0006\u000b\uffff\uffff\u0000\u0108"+
		"\u0109\u0005\u0018\u0000\u0000\u0109\u010d\u0006\u000b\uffff\uffff\u0000"+
		"\u010a\u010c\u0003\u0004\u0002\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0003\u0012\t\u0000\u0111"+
		"\u0112\u0006\u000b\uffff\uffff\u0000\u0112\u0113\u0005\u0019\u0000\u0000"+
		"\u0113\u0114\u0005\t\u0000\u0000\u0114\u0115\u0006\u000b\uffff\uffff\u0000"+
		"\u0115\u0116\u0003*\u0015\u0000\u0116\u0117\u0005\u001b\u0000\u0000\u0117"+
		"\u0118\u0006\u000b\uffff\uffff\u0000\u0118\u012b\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\u0005\u0000\u0000\u011a\u011b\u0003*\u0015\u0000\u011b"+
		"\u011c\u0005\u001b\u0000\u0000\u011c\u011d\u0006\u000b\uffff\uffff\u0000"+
		"\u011d\u012b\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0005\u0000\u0000"+
		"\u011f\u0120\u0005\u001b\u0000\u0000\u0120\u012b\u0006\u000b\uffff\uffff"+
		"\u0000\u0121\u0122\u0003 \u0010\u0000\u0122\u0123\u0005\u001f\u0000\u0000"+
		"\u0123\u0124\u0003*\u0015\u0000\u0124\u0125\u0005\u001b\u0000\u0000\u0125"+
		"\u0126\u0006\u000b\uffff\uffff\u0000\u0126\u012b\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0003 \u0010\u0000\u0128\u0129\u0005\u001b\u0000\u0000\u0129"+
		"\u012b\u0001\u0000\u0000\u0000\u012a\u00c9\u0001\u0000\u0000\u0000\u012a"+
		"\u00d7\u0001\u0000\u0000\u0000\u012a\u00f2\u0001\u0000\u0000\u0000\u012a"+
		"\u00f7\u0001\u0000\u0000\u0000\u012a\u0106\u0001\u0000\u0000\u0000\u012a"+
		"\u0119\u0001\u0000\u0000\u0000\u012a\u011e\u0001\u0000\u0000\u0000\u012a"+
		"\u0121\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012b"+
		"\u0017\u0001\u0000\u0000\u0000\u012c\u012d\u0005\r\u0000\u0000\u012d\u012e"+
		"\u0003*\u0015\u0000\u012e\u012f\u0005\u0018\u0000\u0000\u012f\u0130\u0006"+
		"\f\uffff\uffff\u0000\u0130\u0131\u0003\u001a\r\u0000\u0131\u0132\u0006"+
		"\f\uffff\uffff\u0000\u0132\u0019\u0001\u0000\u0000\u0000\u0133\u0134\u0003"+
		"\u001c\u000e\u0000\u0134\u0135\u0006\r\uffff\uffff\u0000\u0135\u0136\u0003"+
		"\u001a\r\u0000\u0136\u0137\u0006\r\uffff\uffff\u0000\u0137\u013a\u0001"+
		"\u0000\u0000\u0000\u0138\u013a\u0006\r\uffff\uffff\u0000\u0139\u0133\u0001"+
		"\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u001b\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u000e\u0000\u0000\u013c\u013d\u0006"+
		"\u000e\uffff\uffff\u0000\u013d\u013e\u0003*\u0015\u0000\u013e\u013f\u0005"+
		"\u001c\u0000\u0000\u013f\u0140\u0006\u000e\uffff\uffff\u0000\u0140\u0141"+
		"\u0003\u0012\t\u0000\u0141\u0145\u0006\u000e\uffff\uffff\u0000\u0142\u0143"+
		"\u0005\u0010\u0000\u0000\u0143\u0144\u0005\u001b\u0000\u0000\u0144\u0146"+
		"\u0006\u000e\uffff\uffff\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0006\u000e\uffff\uffff\u0000\u0148\u001d\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005\u000f\u0000\u0000\u014a\u014b\u0005\u001c\u0000\u0000"+
		"\u014b\u014c\u0006\u000f\uffff\uffff\u0000\u014c\u014d\u0003\u0012\t\u0000"+
		"\u014d\u014e\u0006\u000f\uffff\uffff\u0000\u014e\u0151\u0001\u0000\u0000"+
		"\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0149\u0001\u0000\u0000"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u001f\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005+\u0000\u0000\u0153\u0161\u0006\u0010\uffff\uffff"+
		"\u0000\u0154\u0155\u0003\"\u0011\u0000\u0155\u0156\u0005\u0017\u0000\u0000"+
		"\u0156\u0157\u0006\u0010\uffff\uffff\u0000\u0157\u0161\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005+\u0000\u0000\u0159\u015a\u0005\u0014\u0000\u0000"+
		"\u015a\u015b\u0005\u0015\u0000\u0000\u015b\u0161\u0006\u0010\uffff\uffff"+
		"\u0000\u015c\u015d\u0003&\u0013\u0000\u015d\u015e\u0005\u0015\u0000\u0000"+
		"\u015e\u015f\u0006\u0010\uffff\uffff\u0000\u015f\u0161\u0001\u0000\u0000"+
		"\u0000\u0160\u0152\u0001\u0000\u0000\u0000\u0160\u0154\u0001\u0000\u0000"+
		"\u0000\u0160\u0158\u0001\u0000\u0000\u0000\u0160\u015c\u0001\u0000\u0000"+
		"\u0000\u0161!\u0001\u0000\u0000\u0000\u0162\u0163\u0005+\u0000\u0000\u0163"+
		"\u0164\u0005\u0016\u0000\u0000\u0164\u0165\u0003*\u0015\u0000\u0165\u0166"+
		"\u0006\u0011\uffff\uffff\u0000\u0166\u0167\u0003$\u0012\u0000\u0167\u0168"+
		"\u0006\u0011\uffff\uffff\u0000\u0168#\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0005\u0017\u0000\u0000\u016a\u016b\u0005\u0016\u0000\u0000\u016b\u016c"+
		"\u0003*\u0015\u0000\u016c\u016d\u0006\u0012\uffff\uffff\u0000\u016d\u016e"+
		"\u0003$\u0012\u0000\u016e\u016f\u0006\u0012\uffff\uffff\u0000\u016f\u0172"+
		"\u0001\u0000\u0000\u0000\u0170\u0172\u0006\u0012\uffff\uffff\u0000\u0171"+
		"\u0169\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172"+
		"%\u0001\u0000\u0000\u0000\u0173\u0174\u0005+\u0000\u0000\u0174\u0175\u0005"+
		"\u0014\u0000\u0000\u0175\u0176\u0003*\u0015\u0000\u0176\u0177\u0006\u0013"+
		"\uffff\uffff\u0000\u0177\u0178\u0003(\u0014\u0000\u0178\'\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0005\u001a\u0000\u0000\u017a\u017b\u0003*\u0015"+
		"\u0000\u017b\u017c\u0006\u0014\uffff\uffff\u0000\u017c\u017d\u0003(\u0014"+
		"\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000"+
		"\u0000\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u0180)\u0001\u0000\u0000\u0000\u0181\u0182\u0003,\u0016\u0000\u0182"+
		"\u0183\u0006\u0015\uffff\uffff\u0000\u0183+\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u00030\u0018\u0000\u0185\u0186\u0006\u0016\uffff\uffff\u0000\u0186"+
		"\u0187\u0003.\u0017\u0000\u0187\u0188\u0006\u0016\uffff\uffff\u0000\u0188"+
		"-\u0001\u0000\u0000\u0000\u0189\u018a\u0005)\u0000\u0000\u018a\u018b\u0006"+
		"\u0017\uffff\uffff\u0000\u018b\u018c\u00030\u0018\u0000\u018c\u018d\u0006"+
		"\u0017\uffff\uffff\u0000\u018d\u018e\u0003.\u0017\u0000\u018e\u018f\u0006"+
		"\u0017\uffff\uffff\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u0192"+
		"\u0001\u0000\u0000\u0000\u0191\u0189\u0001\u0000\u0000\u0000\u0191\u0190"+
		"\u0001\u0000\u0000\u0000\u0192/\u0001\u0000\u0000\u0000\u0193\u0194\u0003"+
		"4\u001a\u0000\u0194\u0195\u0006\u0018\uffff\uffff\u0000\u0195\u0196\u0003"+
		"2\u0019\u0000\u0196\u0197\u0006\u0018\uffff\uffff\u0000\u01971\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0005(\u0000\u0000\u0199\u019a\u0006\u0019\uffff"+
		"\uffff\u0000\u019a\u019b\u00034\u001a\u0000\u019b\u019c\u0006\u0019\uffff"+
		"\uffff\u0000\u019c\u019d\u00032\u0019\u0000\u019d\u019e\u0006\u0019\uffff"+
		"\uffff\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a0\u0198\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000"+
		"\u0000\u0000\u01a13\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005*\u0000\u0000"+
		"\u01a3\u01a4\u00036\u001b\u0000\u01a4\u01a5\u0006\u001a\uffff\uffff\u0000"+
		"\u01a5\u01aa\u0001\u0000\u0000\u0000\u01a6\u01a7\u00036\u001b\u0000\u01a7"+
		"\u01a8\u0006\u001a\uffff\uffff\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a2\u0001\u0000\u0000\u0000\u01a9\u01a6\u0001\u0000\u0000\u0000"+
		"\u01aa5\u0001\u0000\u0000\u0000\u01ab\u01ac\u0003:\u001d\u0000\u01ac\u01ad"+
		"\u0006\u001b\uffff\uffff\u0000\u01ad\u01ae\u00038\u001c\u0000\u01ae\u01af"+
		"\u0006\u001b\uffff\uffff\u0000\u01af7\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005\u001e\u0000\u0000\u01b1\u01b2\u0003:\u001d\u0000\u01b2\u01b3\u0006"+
		"\u001c\uffff\uffff\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b69\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003"+
		">\u001f\u0000\u01b8\u01b9\u0006\u001d\uffff\uffff\u0000\u01b9\u01ba\u0003"+
		"<\u001e\u0000\u01ba\u01bb\u0006\u001d\uffff\uffff\u0000\u01bb;\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0005#\u0000\u0000\u01bd\u01be\u0003>\u001f\u0000"+
		"\u01be\u01bf\u0006\u001e\uffff\uffff\u0000\u01bf\u01c0\u0003<\u001e\u0000"+
		"\u01c0\u01c1\u0006\u001e\uffff\uffff\u0000\u01c1\u01ca\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005$\u0000\u0000\u01c3\u01c4\u0003>\u001f\u0000\u01c4"+
		"\u01c5\u0006\u001e\uffff\uffff\u0000\u01c5\u01c6\u0003<\u001e\u0000\u01c6"+
		"\u01c7\u0006\u001e\uffff\uffff\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000"+
		"\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01bc\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01ca=\u0001\u0000\u0000\u0000\u01cb\u01cc\u0003B!\u0000\u01cc\u01cd"+
		"\u0006\u001f\uffff\uffff\u0000\u01cd\u01ce\u0003@ \u0000\u01ce\u01cf\u0006"+
		"\u001f\uffff\uffff\u0000\u01cf?\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		"%\u0000\u0000\u01d1\u01d2\u0003B!\u0000\u01d2\u01d3\u0006 \uffff\uffff"+
		"\u0000\u01d3\u01d4\u0003@ \u0000\u01d4\u01d5\u0006 \uffff\uffff\u0000"+
		"\u01d5\u01e4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005&\u0000\u0000\u01d7"+
		"\u01d8\u0003B!\u0000\u01d8\u01d9\u0006 \uffff\uffff\u0000\u01d9\u01da"+
		"\u0003@ \u0000\u01da\u01db\u0006 \uffff\uffff\u0000\u01db\u01e4\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0005\'\u0000\u0000\u01dd\u01de\u0003B"+
		"!\u0000\u01de\u01df\u0006 \uffff\uffff\u0000\u01df\u01e0\u0003@ \u0000"+
		"\u01e0\u01e1\u0006 \uffff\uffff\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01d0\u0001\u0000\u0000\u0000"+
		"\u01e3\u01d6\u0001\u0000\u0000\u0000\u01e3\u01dc\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4A\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0005$\u0000\u0000\u01e6\u01e7\u0003D\"\u0000\u01e7\u01e8\u0006"+
		"!\uffff\uffff\u0000\u01e8\u01ed\u0001\u0000\u0000\u0000\u01e9\u01ea\u0003"+
		"D\"\u0000\u01ea\u01eb\u0006!\uffff\uffff\u0000\u01eb\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ec\u01e5\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000"+
		"\u0000\u0000\u01edC\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\u0014\u0000"+
		"\u0000\u01ef\u01f0\u0003*\u0015\u0000\u01f0\u01f1\u0005\u0015\u0000\u0000"+
		"\u01f1\u01f2\u0006\"\uffff\uffff\u0000\u01f2\u01fa\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0003 \u0010\u0000\u01f4\u01f5\u0006\"\uffff\uffff\u0000"+
		"\u01f5\u01fa\u0001\u0000\u0000\u0000\u01f6\u01f7\u0003H$\u0000\u01f7\u01f8"+
		"\u0006\"\uffff\uffff\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f3\u0001\u0000\u0000\u0000\u01f9\u01f6"+
		"\u0001\u0000\u0000\u0000\u01faE\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005"+
		"\u0006\u0000\u0000\u01fc\u0202\u0006#\uffff\uffff\u0000\u01fd\u01fe\u0005"+
		"\u0007\u0000\u0000\u01fe\u0202\u0006#\uffff\uffff\u0000\u01ff\u0200\u0005"+
		"\b\u0000\u0000\u0200\u0202\u0006#\uffff\uffff\u0000\u0201\u01fb\u0001"+
		"\u0000\u0000\u0000\u0201\u01fd\u0001\u0000\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0202G\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u0011"+
		"\u0000\u0000\u0204\u020a\u0006$\uffff\uffff\u0000\u0205\u0206\u0005\u0012"+
		"\u0000\u0000\u0206\u020a\u0006$\uffff\uffff\u0000\u0207\u0208\u0005\u0013"+
		"\u0000\u0000\u0208\u020a\u0006$\uffff\uffff\u0000\u0209\u0203\u0001\u0000"+
		"\u0000\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u020aI\u0001\u0000\u0000\u0000#NQS`n\u0086\u008d\u0095\u00a0"+
		"\u00a6\u00ad\u00b7\u00c7\u00d0\u00de\u00eb\u00ff\u010d\u012a\u0139\u0145"+
		"\u0150\u0160\u0171\u017f\u0191\u01a0\u01a9\u01b5\u01c9\u01e3\u01ec\u01f9"+
		"\u0201\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}