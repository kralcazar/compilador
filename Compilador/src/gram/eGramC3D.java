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
		RULE_program = 0, RULE_main = 1, RULE_declAndFunc = 2, RULE_decl = 3, 
		RULE_funcs = 4, RULE_sents = 5, RULE_sents_ = 6, RULE_sent = 7, RULE_header = 8, 
		RULE_parameters = 9, RULE_parameter = 10, RULE_declArray = 11, RULE_declArray_ = 12, 
		RULE_number = 13, RULE_reference = 14, RULE_idx = 15, RULE_idx_ = 16, 
		RULE_contIdx = 17, RULE_contIdx_ = 18, RULE_expr = 19, RULE_exprOr = 20, 
		RULE_exprOr_ = 21, RULE_exprAnd = 22, RULE_exprAnd_ = 23, RULE_exprNot = 24, 
		RULE_exprComp = 25, RULE_exprComp_ = 26, RULE_exprAdd = 27, RULE_exprAdd_ = 28, 
		RULE_exprMult = 29, RULE_exprMult_ = 30, RULE_exprNeg = 31, RULE_primary = 32, 
		RULE_type = 33, RULE_literal = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "declAndFunc", "decl", "funcs", "sents", "sents_", 
			"sent", "header", "parameters", "parameter", "declArray", "declArray_", 
			"number", "reference", "idx", "idx_", "contIdx", "contIdx_", "expr", 
			"exprOr", "exprOr_", "exprAnd", "exprAnd_", "exprNot", "exprComp", "exprComp_", 
			"exprAdd", "exprAdd_", "exprMult", "exprMult_", "exprNeg", "primary", 
			"type", "literal"
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
		public List<FuncsContext> funcs() {
			return getRuleContexts(FuncsContext.class);
		}
		public FuncsContext funcs(int i) {
			return getRuleContext(FuncsContext.class,i);
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
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			            }
			        
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(72); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(71);
							funcs();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(74); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case MAIN:
					{
					setState(76);
					main();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAIN || _la==FUNCTION );

			            //Llamar al main despues de leerlo todo
			            try {
			                 symbol = ts.get("indice");
			                 generate(Instruction.OP.call, null, null, symbol.getProcedure().toString());
			            } catch(SymbolTable.SymbolTableException e) {
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			            }
			        
			setState(82);
			match(EOF);

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
		public Deque<Integer> sents_seg;
		public Token MAIN;
		public SentsContext sents;
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
			setState(85);
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
			        
			setState(87);
			match(BEGIN);

			            depth ++;
			            pproc.push(_localctx.procedure.getNp());

			            Tag e = te.get(te.newTag(true));
			            _localctx.procedure.setStartTag(e.getNe());
					    _localctx.procedure.setNumParams(0);
			            generate(Instruction.OP.skip, null, null, e.toString()); //TODO: averiguar como saltar a esta etiqueta desde program
			            generate(Instruction.OP.pmb, null, null, _localctx.procedure.toString());
			        
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) {
				{
				{
				setState(89);
				decl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			((MainContext)_localctx).sents = sents();

			            Tag et=te.get(te.newTag(false));
			            generate(Instruction.OP.skip, null, null, et.toString());
			            backpatch(((MainContext)_localctx).sents.sents_seg,et);
					    generate(Instruction.OP.ret, null, null, String.valueOf(_localctx.procedure.getNp()));
			            C3D.get(pc-1).setInstFinal(true);
			            pproc.pop();
			            depth --;
			        
			setState(97);
			match(END);
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
	public static class DeclAndFuncContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public DeclAndFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAndFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterDeclAndFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitDeclAndFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitDeclAndFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclAndFuncContext declAndFunc() throws RecognitionException {
		DeclAndFuncContext _localctx = new DeclAndFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declAndFunc);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
			case INTEGER:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				decl();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				funcs();
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
	public static class DeclContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 6, RULE_decl);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				type();
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
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
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
					                Tag efn = te.get(te.newTag(false));
					                generate(Instruction.OP.skip, null, null, ec.toString());
					                generate(Instruction.OP.copy, "-1", null, tv.get(nv).toString());
					                generate(Instruction.OP.jump, null, null, efn.toString());
					                generate(Instruction.OP.skip, null, null, ef.toString());
					                generate(Instruction.OP.copy, "0", null, tv.get(nv).toString());
					                generate(Instruction.OP.skip, null, null, efn.toString());
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
				type();
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
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
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
	public static class FuncsContext extends ParserRuleContext {
		public HeaderContext header;
		public TerminalNode FUNCTION() { return getToken(eGramC3D.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(eGramC3D.BEGIN, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode END() { return getToken(eGramC3D.END, 0); }
		public List<DeclAndFuncContext> declAndFunc() {
			return getRuleContexts(DeclAndFuncContext.class);
		}
		public DeclAndFuncContext declAndFunc(int i) {
			return getRuleContext(DeclAndFuncContext.class,i);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitFuncs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitFuncs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FUNCTION);
			setState(129);
			type();
			setState(130);
			((FuncsContext)_localctx).header = header();
			setState(131);
			match(BEGIN);

			            depth++;
			            try{
			                ts = ts.blockGoesDown();
			            } catch(SymbolTable.SymbolTableException e) {
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			            }
			            pproc.push(((FuncsContext)_localctx).header.procedure.getNp());
			            // Crear variables para los parámetros
			            Symbol aux = ((FuncsContext)_localctx).header.symbol.getNext();
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
			            ((FuncsContext)_localctx).header.procedure.setStartTag(e.getNe());
			            ((FuncsContext)_localctx).header.procedure.setNumParams(nparam-1);
			            generate(Instruction.OP.skip, null, null, e.toString());
			            generate(Instruction.OP.pmb, null, null, ((FuncsContext)_localctx).header.procedure.toString());
			        
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 472L) != 0) {
				{
				{
				setState(133);
				declAndFunc();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			sents();
			setState(140);
			match(END);

			            C3D.get(pc-1).setInstFinal(true);
			            pproc.pop();
			            depth--;
			            ts = ts.blockGoesUp();
			        
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
		enterRule(_localctx, 10, RULE_sents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((SentsContext)_localctx).sent = sent(_localctx.sents_seg);

			            Tag ec = te.get(te.newTag(false));
			            generate(Instruction.OP.skip, null, null, ec.toString());
			        
			setState(145);
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
		enterRule(_localctx, 12, RULE_sents_);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((Sents_Context)_localctx).sent = sent(_localctx.sents_seg);

				            Tag ec = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, ec.toString());
				        
				setState(150);
				((Sents_Context)_localctx).sents_ = sents_(_localctx.sents_seg);

				            backpatch(((Sents_Context)_localctx).sent.sent_seg, ec);
				            if(((Sents_Context)_localctx).sents_.sents_seg_!= null) {
				                ((Sents_Context)_localctx).sents_seg_ =  ((Sents_Context)_localctx).sents_.sents_seg_;
				            } else{
				                ((Sents_Context)_localctx).sents_seg_ =  ((Sents_Context)_localctx).sent.sent_seg;
				            }
				        
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
	public static class SentContext extends ParserRuleContext {
		public Deque<Integer> sents_seg;
		public Deque<Integer> sent_seg;
		public ExprContext expr;
		public SentsContext sents;
		public ReferenceContext reference;
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
		public TerminalNode WHILE() { return getToken(eGramC3D.WHILE, 0); }
		public TerminalNode DO() { return getToken(eGramC3D.DO, 0); }
		public TerminalNode SEMI() { return getToken(eGramC3D.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(eGramC3D.RETURN, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
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
		enterRule(_localctx, 14, RULE_sent);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(IF);
				setState(157);
				((SentContext)_localctx).expr = expr();
				setState(158);
				match(BEGIN);

				            try{
				                ts = ts.blockGoesDown();
				            } catch(SymbolTable.SymbolTableException e) {
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
				            }
				            Tag ec = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, ec.toString());
				        
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) {
					{
					{
					setState(160);
					decl();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				((SentContext)_localctx).sents = sents();

				            ts = ts.blockGoesUp();
				            backpatch(((SentContext)_localctx).expr.true_, ec);
				            ((SentContext)_localctx).sent_seg =  concat(((SentContext)_localctx).expr.false_, ((SentContext)_localctx).sents.sents_seg);
				        
				setState(168);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IF);
				setState(171);
				((SentContext)_localctx).expr = expr();
				setState(172);
				match(BEGIN);

				            try{
				                ts = ts.blockGoesDown();
				            } catch(SymbolTable.SymbolTableException e) {
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
				            }
				            Tag ec = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, ec.toString());
				        
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) {
					{
					{
					setState(174);
					decl();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				((SentContext)_localctx).sents = sents();
				setState(181);
				match(END);

				            Deque<Integer> sents_seg1 = new ArrayDeque<Integer>();
				            generate(Instruction.OP.jump, null, null, null);
				            sents_seg1.add(pc);
				            Tag ef = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, ef.toString());
				        
				setState(183);
				match(ELSE);
				setState(184);
				match(BEGIN);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) {
					{
					{
					setState(185);
					decl();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				((SentContext)_localctx).sents = sents();
				setState(192);
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
				setState(195);
				match(WHILE);

				            try{
				                 ts = ts.blockGoesDown();
				            } catch(SymbolTable.SymbolTableException e) {
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
				            }
				            Tag ei = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, ei.toString());
				        
				setState(197);
				((SentContext)_localctx).expr = expr();
				setState(198);
				match(BEGIN);

				            Tag eis = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, eis.toString());
				        
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) {
					{
					{
					setState(200);
					decl();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				sents();

				            ts = ts.blockGoesUp();
				            backpatch(((SentContext)_localctx).expr.true_, eis);
				            backpatch(_localctx.sent_seg, ei);
				            ((SentContext)_localctx).sent_seg =  ((SentContext)_localctx).expr.false_;
				            generate(Instruction.OP.jump, null, null, ei.toString());
				        
				setState(208);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(DO);

				            try{
				                ts = ts.blockGoesDown();
				            } catch(SymbolTable.SymbolTableException e) {
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
				            }
				        
				setState(212);
				match(BEGIN);

				            Tag eis = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, eis.toString());
				        
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) {
					{
					{
					setState(214);
					decl();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				sents();

				            ts = ts.blockGoesUp();
				        
				setState(222);
				match(END);
				setState(223);
				match(WHILE);

				            Tag ei = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, ei.toString());
				        
				setState(225);
				((SentContext)_localctx).expr = expr();
				setState(226);
				match(SEMI);

				            backpatch(((SentContext)_localctx).expr.true_, eis);
				            backpatch(_localctx.sent_seg, ei);
				            ((SentContext)_localctx).sent_seg =  ((SentContext)_localctx).expr.false_;
				            generate(Instruction.OP.jump, null, null, eis.toString());
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(RETURN);
				setState(230);
				((SentContext)_localctx).expr = expr();
				setState(231);
				match(SEMI);

				            if(((SentContext)_localctx).expr.true_!= null || ((SentContext)_localctx).expr.false_!= null) {//cambiar
				                Tag ec = te.get(te.newTag(false));
				                Tag ef = te.get(te.newTag(false));
				                Tag efn = te.get(te.newTag(false));
				                generate(Instruction.OP.skip, null, null, ec.toString());
				                generate(Instruction.OP.copy, "-1", null, ((SentContext)_localctx).expr.variable.toString());
				                ((SentContext)_localctx).expr.variable.setValue("-1");
				                generate(Instruction.OP.jump, null, null, efn.toString());
				                generate(Instruction.OP.skip, null, null, ef.toString());
				                generate(Instruction.OP.copy, "0", null, ((SentContext)_localctx).expr.variable.toString());
				                ((SentContext)_localctx).expr.variable.setValue("0");
				                generate(Instruction.OP.skip, null, null, efn.toString());
				                backpatch(((SentContext)_localctx).expr.true_, ec);
				                backpatch(((SentContext)_localctx).expr.false_, ef);
				            }
				            generate(Instruction.OP.ret, ((SentContext)_localctx).expr.variable.toString(), null, pproc.peek().toString());
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				((SentContext)_localctx).reference = reference();
				setState(235);
				match(ASSIGN);
				setState(236);
				((SentContext)_localctx).expr = expr();
				setState(237);
				match(SEMI);

				            if(((SentContext)_localctx).reference.offset!= null) {
				                if(((SentContext)_localctx).reference.dataType == Symbol.DataTypes.BOOLEAN) {
				                    Tag ec = te.get(te.newTag(false));
				                    Tag ef = te.get(te.newTag(false));
				                    Tag efn = te.get(te.newTag(false));
				                    generate(Instruction.OP.skip, null, null, ec.toString());
				                    generate(Instruction.OP.ind_ass, ((SentContext)_localctx).reference.offset.toString(), "-1", ((SentContext)_localctx).reference.variable.toString());
				                    generate(Instruction.OP.jump, null, null, efn.toString());
				                    generate(Instruction.OP.skip, null, null, ef.toString());
				                    generate(Instruction.OP.ind_ass, ((SentContext)_localctx).reference.offset.toString(), "0", ((SentContext)_localctx).reference.variable.toString());
				                    generate(Instruction.OP.skip, null, null, efn.toString());
				                    backpatch(((SentContext)_localctx).expr.true_, ec);
				                    backpatch(((SentContext)_localctx).expr.false_, ef);
				                } else {
				                    generate(Instruction.OP.ind_ass, ((SentContext)_localctx).reference.offset.toString(), ((SentContext)_localctx).expr.variable.toString(), ((SentContext)_localctx).reference.variable.toString());
				                }
				            } else {
				                if(((SentContext)_localctx).reference.dataType == Symbol.DataTypes.BOOLEAN) {
				                    Tag ec = te.get(te.newTag(false));
				                    Tag ef = te.get(te.newTag(false));
				                    Tag efn = te.get(te.newTag(false));
				                    generate(Instruction.OP.skip, null, null, ec.toString());
				                    generate(Instruction.OP.copy, "-1", null, ((SentContext)_localctx).reference.variable.toString());
				                    generate(Instruction.OP.jump, null, null, efn.toString());
				                    generate(Instruction.OP.skip, null, null, ef.toString());
				                    generate(Instruction.OP.copy, "0", null, ((SentContext)_localctx).reference.variable.toString());
				                    generate(Instruction.OP.skip, null, null, efn.toString());
				                    backpatch(((SentContext)_localctx).expr.true_, ec);
				                    backpatch(((SentContext)_localctx).expr.false_, ef);
				                } else {
				                    generate(Instruction.OP.copy, ((SentContext)_localctx).expr.variable.toString(), null, ((SentContext)_localctx).reference.variable.toString());
				                }
				            }
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				reference();
				setState(241);
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
	public static class HeaderContext extends ParserRuleContext {
		public Procedure procedure;
		public Symbol symbol;
		public Token ID;
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode LPAREN() { return getToken(eGramC3D.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(eGramC3D.RPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((HeaderContext)_localctx).ID = match(ID);
			setState(246);
			match(LPAREN);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0) {
				{
				setState(247);
				parameters();
				}
			}

			setState(250);
			match(RPAREN);

			            Symbol symbol = new Symbol();
			            Procedure procedure;
			            try {
			                symbol = ts.get(((HeaderContext)_localctx).ID.getText());
			                procedure = tp.newProc(depth, symbol.getType(), ((HeaderContext)_localctx).ID.getText());
			                symbol.setProcedure(procedure);
			                ((HeaderContext)_localctx).procedure =  procedure;
			                ((HeaderContext)_localctx).symbol =  symbol;
			            } catch(SymbolTable.SymbolTableException e) {
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
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
	public static class ParametersContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(eGramC3D.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				parameter();
				setState(254);
				match(COMMA);
				setState(255);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				parameter();
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			type();
			setState(261);
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
	public static class DeclArrayContext extends ParserRuleContext {
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public TerminalNode LBRACK() { return getToken(eGramC3D.LBRACK, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 22, RULE_declArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			type();
			setState(264);
			((DeclArrayContext)_localctx).ID = match(ID);
			setState(265);
			match(LBRACK);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(266);
				number();
				setState(267);
				match(DOUBLEDOT);
				}
				break;
			}
			setState(271);
			number();
			setState(272);
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
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 24, RULE_declArray_);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(RBRACK);
				setState(276);
				match(LBRACK);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(277);
					number();
					setState(278);
					match(DOUBLEDOT);
					}
					break;
				}
				setState(282);
				number();
				setState(283);
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
	public static class NumberContext extends ParserRuleContext {
		public int value;
		public boolean constante;
		public TerminalNode LiteralInteger() { return getToken(eGramC3D.LiteralInteger, 0); }
		public TerminalNode ID() { return getToken(eGramC3D.ID, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
	public static class ReferenceContext extends ParserRuleContext {
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
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reference);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((ReferenceContext)_localctx).ID = match(ID);

				            Symbol symbol;
				            int vn2;
				            try {
				                symbol = ts.get(((ReferenceContext)_localctx).ID.getText());
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
				                    ((ReferenceContext)_localctx).variable =  tv.get(vn2);
				                } else {
				                    ((ReferenceContext)_localctx).variable =  tv.get(symbol.getVariableNumber());
				                }
				                ((ReferenceContext)_localctx).dataType =  symbol.dataType();
				            } catch(SymbolTable.SymbolTableException e) {
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((ReferenceContext)_localctx).idx = idx();
				setState(293);
				match(RBRACK);

				            Variable t2;
				            String nbytes = String.valueOf(((ReferenceContext)_localctx).idx.table.getItemSize());
				            if(((ReferenceContext)_localctx).idx.table.getOffset() == 0) {
				                t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
				                generate(Instruction.OP.mult, ((ReferenceContext)_localctx).idx.offset.toString(), nbytes, t2.toString());
				            } else {
				                String tableOffsetComp = String.valueOf(((ReferenceContext)_localctx).idx.table.getOffset());

				                Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
				                generate(Instruction.OP.sub, ((ReferenceContext)_localctx).idx.offset.toString(), tableOffsetComp, t1.toString());

				                t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
				                generate(Instruction.OP.mult, t1.toString(), nbytes, t2.toString());
				            }
				            ((ReferenceContext)_localctx).variable =  ((ReferenceContext)_localctx).idx.variable;
				            ((ReferenceContext)_localctx).offset =  t2;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				((ReferenceContext)_localctx).ID = match(ID);
				setState(297);
				match(LPAREN);
				setState(298);
				match(RPAREN);

				            Symbol symbol;
				            int t;
				            try {
				                symbol = ts.get(((ReferenceContext)_localctx).ID.getText());
				                generate(Instruction.OP.call, null, null, symbol.getProcedure().toString());
				                if(symbol.getType()  ==  Symbol.Types.FUNC) {
				                    t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, symbol.dataType());
				                    ((ReferenceContext)_localctx).variable =  tv.get(t);
				                    ((ReferenceContext)_localctx).dataType =  symbol.dataType();
				                    generate(Instruction.OP.st, null, null, tv.get(t).toString());
				                }
				            } catch(SymbolTable.SymbolTableException e) {
				                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				((ReferenceContext)_localctx).contIdx = contIdx();
				setState(301);
				match(RPAREN);

				            int t;
				            while(((ReferenceContext)_localctx).contIdx.pparams.size() > 0)
				            {
				              Variable parameter = ((ReferenceContext)_localctx).contIdx.pparams.pop();
				              generate(Instruction.OP.params, null, null, parameter.toString());
				            }
				            generate(Instruction.OP.call, null, null, ((ReferenceContext)_localctx).contIdx.procedure.toString());
				            if(((ReferenceContext)_localctx).contIdx.symbol.getType()  ==  Symbol.Types.FUNC) {
				                t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, ((ReferenceContext)_localctx).contIdx.symbol.dataType());
				                ((ReferenceContext)_localctx).variable =  tv.get(t);
				                ((ReferenceContext)_localctx).dataType =  ((ReferenceContext)_localctx).contIdx.symbol.dataType();
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
		enterRule(_localctx, 30, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((IdxContext)_localctx).ID = match(ID);
			setState(307);
			match(LBRACK);
			setState(308);
			((IdxContext)_localctx).expr = expr();

			            Symbol symbol = null;
			            try {
			                symbol = ts.get(((IdxContext)_localctx).ID.getText());
			            } catch(SymbolTable.SymbolTableException e) {
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			            }
			            ((IdxContext)_localctx).table =  symbol.getTable();
			            Index idx = _localctx.table.getFirst();
			            ((IdxContext)_localctx).variable =  tv.get(symbol.getVariableNumber());
			            Variable offset = ((IdxContext)_localctx).expr.variable;
			        
			setState(310);
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
		enterRule(_localctx, 32, RULE_idx_);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(RBRACK);
				setState(314);
				match(LBRACK);
				setState(315);
				((Idx_Context)_localctx).expr = expr();

				            Index idx = idx1.getNextIndex();

				            Variable t1 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
				            generate(Instruction.OP.mult, _localctx.offset1.toString(), String.valueOf(idx.getDimension()), t1.toString());

				            Variable t2 = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
				            generate(Instruction.OP.add, t1.toString(), ((Idx_Context)_localctx).expr.variable.toString(), t2.toString());
				        
				setState(317);
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
		enterRule(_localctx, 34, RULE_contIdx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((ContIdxContext)_localctx).ID = match(ID);
			setState(324);
			match(LPAREN);
			setState(325);
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
			                    Tag efn = te.get(te.newTag(false));
			                    generate(Instruction.OP.skip, null, null, ec.toString());
			                    generate(Instruction.OP.copy, "-1", null, ((ContIdxContext)_localctx).expr.variable.toString());
			                    generate(Instruction.OP.jump, null, null, efn.toString());
			                    generate(Instruction.OP.skip, null, null, ef.toString());
			                    generate(Instruction.OP.copy, "0", null, ((ContIdxContext)_localctx).expr.variable.toString());
			                    generate(Instruction.OP.skip, null, null, efn.toString());
			                    backpatch(((ContIdxContext)_localctx).expr.true_, ec);
			                    backpatch(((ContIdxContext)_localctx).expr.false_, ef);
			                }
			            } catch(SymbolTable.SymbolTableException e) {
			                System.out.println("Error en la tabla de símbolos: "+e.getMessage());
			            }
			        
			setState(327);
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
		enterRule(_localctx, 36, RULE_contIdx_);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(COMMA);
				setState(330);
				((ContIdx_Context)_localctx).expr = expr();

				            _localctx.pparams.push(((ContIdx_Context)_localctx).expr.variable);
				            if(((ContIdx_Context)_localctx).expr.true_ != null || ((ContIdx_Context)_localctx).expr.false_ != null) { // Boolean
				                Tag ec = te.get(te.newTag(false));
				                Tag ef = te.get(te.newTag(false));
				                Tag efn = te.get(te.newTag(false));
				                generate(Instruction.OP.skip, null, null, ec.toString());
				                generate(Instruction.OP.copy, "-1", null, ((ContIdx_Context)_localctx).expr.variable.toString());
				                generate(Instruction.OP.jump, null, null, efn.toString());
				                generate(Instruction.OP.skip, null, null, ef.toString());
				                generate(Instruction.OP.copy, "0", null, ((ContIdx_Context)_localctx).expr.variable.toString());
				                generate(Instruction.OP.skip, null, null, efn.toString());
				                backpatch(((ContIdx_Context)_localctx).expr.true_, ec);
				                backpatch(((ContIdx_Context)_localctx).expr.false_, ef);
				            }
					    
				setState(332);
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
		enterRule(_localctx, 38, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		enterRule(_localctx, 40, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((ExprOrContext)_localctx).exprAnd = exprAnd();

			            ((ExprOrContext)_localctx).variable =  ((ExprOrContext)_localctx).exprAnd.variable;
			            ((ExprOrContext)_localctx).true_ =  ((ExprOrContext)_localctx).exprAnd.true_;
			            ((ExprOrContext)_localctx).false_ =  ((ExprOrContext)_localctx).exprAnd.false_;
			        
			setState(342);
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
		enterRule(_localctx, 42, RULE_exprOr_);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(OR);

				            Tag e = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, e.toString());
				        
				setState(347);
				((ExprOr_Context)_localctx).exprAnd = exprAnd();

				            backpatch(_localctx.false_1, e);
				            ((ExprOr_Context)_localctx).true_ =  concat(_localctx.true_1, ((ExprOr_Context)_localctx).exprAnd.true_);
				            ((ExprOr_Context)_localctx).false_ =  ((ExprOr_Context)_localctx).exprAnd.false_;
				        
				setState(349);
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
		enterRule(_localctx, 44, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((ExprAndContext)_localctx).exprNot = exprNot();

			            ((ExprAndContext)_localctx).variable =  ((ExprAndContext)_localctx).exprNot.variable;
			            ((ExprAndContext)_localctx).true_ =  ((ExprAndContext)_localctx).exprNot.true_;
			            ((ExprAndContext)_localctx).false_ =  ((ExprAndContext)_localctx).exprNot.false_;
			        
			setState(357);
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
		enterRule(_localctx, 46, RULE_exprAnd_);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(AND);

				            Tag e = te.get(te.newTag(false));
				            generate(Instruction.OP.skip, null, null, e.toString());
				        
				setState(362);
				((ExprAnd_Context)_localctx).exprNot = exprNot();

				            backpatch(_localctx.true_1, e);
				            ((ExprAnd_Context)_localctx).false_ =  concat(_localctx.false_1, ((ExprAnd_Context)_localctx).exprNot.false_);
				            ((ExprAnd_Context)_localctx).true_ =  ((ExprAnd_Context)_localctx).exprNot.true_;
				        
				setState(364);
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
		enterRule(_localctx, 48, RULE_exprNot);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(NOT);
				setState(371);
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
				setState(374);
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
		enterRule(_localctx, 50, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((ExprCompContext)_localctx).exprAdd = exprAdd();

			            ((ExprCompContext)_localctx).variable =  ((ExprCompContext)_localctx).exprAdd.variable;

			            ((ExprCompContext)_localctx).true_ =  ((ExprCompContext)_localctx).exprAdd.true_;
			            ((ExprCompContext)_localctx).false_ =  ((ExprCompContext)_localctx).exprAdd.false_;
			        
			setState(381);
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
		enterRule(_localctx, 52, RULE_exprComp_);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				((ExprComp_Context)_localctx).OPREL = match(OPREL);
				setState(385);
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
		enterRule(_localctx, 54, RULE_exprAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((ExprAddContext)_localctx).exprMult = exprMult();

			            ((ExprAddContext)_localctx).variable =  ((ExprAddContext)_localctx).exprMult.variable;


			            ((ExprAddContext)_localctx).true_ =  ((ExprAddContext)_localctx).exprMult.true_;
			            ((ExprAddContext)_localctx).false_ =  ((ExprAddContext)_localctx).exprMult.false_;
			        
			setState(393);
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
		enterRule(_localctx, 56, RULE_exprAdd_);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(ADD);
				setState(397);
				((ExprAdd_Context)_localctx).exprMult = exprMult();

				            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				            generate(Instruction.OP.add, _localctx.t1.toString(), ((ExprAdd_Context)_localctx).exprMult.variable.toString(), tv.get(t).toString());
				            ((ExprAdd_Context)_localctx).variable =  tv.get(t);
				            ((ExprAdd_Context)_localctx).true_ =  ((ExprAdd_Context)_localctx).exprMult.true_;
				            ((ExprAdd_Context)_localctx).false_ =  ((ExprAdd_Context)_localctx).exprMult.false_;
				        
				setState(399);
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
				setState(402);
				match(SUB);
				setState(403);
				((ExprAdd_Context)_localctx).exprMult = exprMult();

				            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				            generate(Instruction.OP.sub, _localctx.t1.toString(), ((ExprAdd_Context)_localctx).exprMult.variable.toString(), tv.get(t).toString());
				            ((ExprAdd_Context)_localctx).variable =  tv.get(t);
				            ((ExprAdd_Context)_localctx).true_ =  ((ExprAdd_Context)_localctx).exprMult.true_;
				            ((ExprAdd_Context)_localctx).false_ =  ((ExprAdd_Context)_localctx).exprMult.false_;
				        
				setState(405);
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
		enterRule(_localctx, 58, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			((ExprMultContext)_localctx).exprNeg = exprNeg();

			            ((ExprMultContext)_localctx).variable =  ((ExprMultContext)_localctx).exprNeg.variable;
			            ((ExprMultContext)_localctx).true_ =  ((ExprMultContext)_localctx).exprNeg.true_;
			            ((ExprMultContext)_localctx).false_ =  ((ExprMultContext)_localctx).exprNeg.false_;
			        
			setState(413);
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
		enterRule(_localctx, 60, RULE_exprMult_);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(MULT);
				setState(417);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

				            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				            generate(Instruction.OP.mult, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.variable.toString(), tv.get(t).toString());
				            ((ExprMult_Context)_localctx).variable =  tv.get(t);
				            ((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprNeg.true_;
				            ((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprNeg.false_;
				        
				setState(419);
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
				setState(422);
				match(DIV);
				setState(423);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

				            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				            generate(Instruction.OP.div, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.variable.toString(), tv.get(t).toString());
				            ((ExprMult_Context)_localctx).variable =  tv.get(t);
				            ((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprNeg.true_;
				            ((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprNeg.false_;
				        
				setState(425);
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
				setState(428);
				match(MOD);
				setState(429);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();

				            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				            generate(Instruction.OP.mod, _localctx.t1.toString(), ((ExprMult_Context)_localctx).exprNeg.variable.toString(), tv.get(t).toString());
				            ((ExprMult_Context)_localctx).variable =  tv.get(t);
				            ((ExprMult_Context)_localctx).true_ =  ((ExprMult_Context)_localctx).exprNeg.true_;
				            ((ExprMult_Context)_localctx).false_ =  ((ExprMult_Context)_localctx).exprNeg.false_;
				        
				setState(431);
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
		public PrimaryContext primary;
		public TerminalNode SUB() { return getToken(eGramC3D.SUB, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		enterRule(_localctx, 62, RULE_exprNeg);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(SUB);
				setState(438);
				((ExprNegContext)_localctx).primary = primary();

				            int t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				            generate(Instruction.OP.neg, ((ExprNegContext)_localctx).primary.variable.toString(), null, tv.get(t).toString());
				            ((ExprNegContext)_localctx).variable =  tv.get(t);
				            ((ExprNegContext)_localctx).true_ =  ((ExprNegContext)_localctx).primary.true_;
				            ((ExprNegContext)_localctx).false_ =  ((ExprNegContext)_localctx).primary.false_;
				        
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((ExprNegContext)_localctx).primary = primary();

				            ((ExprNegContext)_localctx).variable =  ((ExprNegContext)_localctx).primary.variable;
				            ((ExprNegContext)_localctx).true_ =  ((ExprNegContext)_localctx).primary.true_;
				            ((ExprNegContext)_localctx).false_ =  ((ExprNegContext)_localctx).primary.false_;
				        
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
	public static class PrimaryContext extends ParserRuleContext {
		public Variable variable;
		public Deque<Integer> true_;
		public Deque<Integer> false_;
		public ExprContext expr;
		public ReferenceContext reference;
		public LiteralContext literal;
		public TerminalNode LPAREN() { return getToken(eGramC3D.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(eGramC3D.RPAREN, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primary);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(LPAREN);
				setState(447);
				((PrimaryContext)_localctx).expr = expr();
				setState(448);
				match(RPAREN);

				            ((PrimaryContext)_localctx).variable =  ((PrimaryContext)_localctx).expr.variable;
				            ((PrimaryContext)_localctx).true_ =  ((PrimaryContext)_localctx).expr.true_;
				            ((PrimaryContext)_localctx).false_ =  ((PrimaryContext)_localctx).expr.false_;
				        
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				((PrimaryContext)_localctx).reference = reference();

				            if(((PrimaryContext)_localctx).reference.offset!= null) {
				                // Caso para cuando hay desplazamiento
				                Variable t = tv.get(tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT));
				                generate(Instruction.OP.ind_val, ((PrimaryContext)_localctx).reference.variable.toString(), ((PrimaryContext)_localctx).reference.offset.toString(), t.toString());
				                ((PrimaryContext)_localctx).variable =  t;
				            } else {
				                ((PrimaryContext)_localctx).variable =  ((PrimaryContext)_localctx).reference.variable;
				            }
				            if(((PrimaryContext)_localctx).reference.dataType == Symbol.DataTypes.BOOLEAN) {
				                generate(Instruction.OP.ifEQ, _localctx.variable.toString(), "-1", null);
				                ((PrimaryContext)_localctx).true_ =  new ArrayDeque<Integer>();
				                _localctx.true_.add(pc);
				                generate(Instruction.OP.jump, null, null, null);
				                ((PrimaryContext)_localctx).false_ =  new ArrayDeque<Integer>();
				                _localctx.false_.add(pc);
				            }
				        
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				((PrimaryContext)_localctx).literal = literal();

				            int t = 0;

				            switch(((PrimaryContext)_localctx).literal.datatypes) {
				                case BOOLEAN:
				                    t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.BOOLEAN);
				                    if((((PrimaryContext)_localctx).literal!=null?_input.getText(((PrimaryContext)_localctx).literal.start,((PrimaryContext)_localctx).literal.stop):null).equals("true")) {
				                        generate(Instruction.OP.copy, "-1", null, tv.get(t).toString());
				                        tv.get(t).setValue("-1");
				                        generate(Instruction.OP.jump, null, null, null);
				                        ((PrimaryContext)_localctx).true_ =  new ArrayDeque<Integer>();
				                        _localctx.true_.add(pc);
				                        ((PrimaryContext)_localctx).false_ =  null;
				                    } else {
				                        generate(Instruction.OP.copy, "0", null, tv.get(t).toString());
				                        tv.get(t).setValue("0");
				                        generate(Instruction.OP.jump, null, null, null);
				                        ((PrimaryContext)_localctx).false_ =  new ArrayDeque<Integer>();
				                        _localctx.false_.add(pc);
				                        ((PrimaryContext)_localctx).true_ =  null;
				                    }
				                    break;
				                case STRING:
				                    t = tv.newVar(true, pproc.peek(), Symbol.Types.CONST, Symbol.DataTypes.STRING);
				                    tv.get(t).setValue((((PrimaryContext)_localctx).literal!=null?_input.getText(((PrimaryContext)_localctx).literal.start,((PrimaryContext)_localctx).literal.stop):null));
				                    break;
				                case INT:
				                    t = tv.newVar(true, pproc.peek(), Symbol.Types.VAR, Symbol.DataTypes.INT);
				                    generate(Instruction.OP.copy, (((PrimaryContext)_localctx).literal!=null?_input.getText(((PrimaryContext)_localctx).literal.start,((PrimaryContext)_localctx).literal.stop):null), null, tv.get(t).toString());
				                    tv.get(t).setValue((((PrimaryContext)_localctx).literal!=null?_input.getText(((PrimaryContext)_localctx).literal.start,((PrimaryContext)_localctx).literal.stop):null));
				                    break;
				                default:
				                    break;
				            }
				            ((PrimaryContext)_localctx).variable =  tv.get(t);
				        
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
	public static class TypeContext extends ParserRuleContext {
		public Symbol.DataTypes datatypes;
		public TerminalNode INTEGER() { return getToken(eGramC3D.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(eGramC3D.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(eGramC3D.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramC3DListener ) ((eGramC3DListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramC3DVisitor ) return ((eGramC3DVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(INTEGER);

				            ((TypeContext)_localctx).datatypes =  Symbol.DataTypes.INT;
				        
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(BOOLEAN);

				            ((TypeContext)_localctx).datatypes =  Symbol.DataTypes.BOOLEAN;
				        
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(STRING);

				            ((TypeContext)_localctx).datatypes =  Symbol.DataTypes.STRING;
				        
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
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(LiteralInteger);

				            ((LiteralContext)_localctx).datatypes =  Symbol.DataTypes.INT;
				        
				}
				break;
			case LiteralBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(LiteralBoolean);

				            ((LiteralContext)_localctx).datatypes =  Symbol.DataTypes.BOOLEAN;
				        
				}
				break;
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
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
		"\u0004\u0001.\u01dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0004\u0000I\b\u0000\u000b\u0000\f\u0000J\u0001\u0000"+
		"\u0004\u0000N\b\u0000\u000b\u0000\f\u0000O\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001[\b\u0001\n\u0001\f\u0001^\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002f\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u007f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009b\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a2\b\u0007"+
		"\n\u0007\f\u0007\u00a5\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00b0\b\u0007\n\u0007\f\u0007\u00b3\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bb\b\u0007"+
		"\n\u0007\f\u0007\u00be\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00ca\b\u0007\n\u0007\f\u0007\u00cd\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00d8\b\u0007\n\u0007\f\u0007\u00db"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00f4\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00f9\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0103"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u010e\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0119\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011f\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0131\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0142\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0150\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0162\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0171\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u017a\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0186\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u019a\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01b4\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01bd\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01ca\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01d2\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01da\b\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BD\u0000\u0001\u0002\u0000\u0011\u0011++\u01e7\u0000F\u0001\u0000"+
		"\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000"+
		"\u0006~\u0001\u0000\u0000\u0000\b\u0080\u0001\u0000\u0000\u0000\n\u008f"+
		"\u0001\u0000\u0000\u0000\f\u009a\u0001\u0000\u0000\u0000\u000e\u00f3\u0001"+
		"\u0000\u0000\u0000\u0010\u00f5\u0001\u0000\u0000\u0000\u0012\u0102\u0001"+
		"\u0000\u0000\u0000\u0014\u0104\u0001\u0000\u0000\u0000\u0016\u0107\u0001"+
		"\u0000\u0000\u0000\u0018\u011e\u0001\u0000\u0000\u0000\u001a\u0120\u0001"+
		"\u0000\u0000\u0000\u001c\u0130\u0001\u0000\u0000\u0000\u001e\u0132\u0001"+
		"\u0000\u0000\u0000 \u0141\u0001\u0000\u0000\u0000\"\u0143\u0001\u0000"+
		"\u0000\u0000$\u014f\u0001\u0000\u0000\u0000&\u0151\u0001\u0000\u0000\u0000"+
		"(\u0154\u0001\u0000\u0000\u0000*\u0161\u0001\u0000\u0000\u0000,\u0163"+
		"\u0001\u0000\u0000\u0000.\u0170\u0001\u0000\u0000\u00000\u0179\u0001\u0000"+
		"\u0000\u00002\u017b\u0001\u0000\u0000\u00004\u0185\u0001\u0000\u0000\u0000"+
		"6\u0187\u0001\u0000\u0000\u00008\u0199\u0001\u0000\u0000\u0000:\u019b"+
		"\u0001\u0000\u0000\u0000<\u01b3\u0001\u0000\u0000\u0000>\u01bc\u0001\u0000"+
		"\u0000\u0000@\u01c9\u0001\u0000\u0000\u0000B\u01d1\u0001\u0000\u0000\u0000"+
		"D\u01d9\u0001\u0000\u0000\u0000FM\u0006\u0000\uffff\uffff\u0000GI\u0003"+
		"\b\u0004\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LN\u0003\u0002\u0001\u0000MH\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0006\u0000\uffff\uffff\u0000"+
		"RS\u0005\u0000\u0000\u0001ST\u0006\u0000\uffff\uffff\u0000T\u0001\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0006\u0001\uffff\uffff"+
		"\u0000WX\u0005\u0018\u0000\u0000X\\\u0006\u0001\uffff\uffff\u0000Y[\u0003"+
		"\u0006\u0003\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_`\u0003\n\u0005\u0000`a\u0006\u0001"+
		"\uffff\uffff\u0000ab\u0005\u0019\u0000\u0000b\u0003\u0001\u0000\u0000"+
		"\u0000cf\u0003\u0006\u0003\u0000df\u0003\b\u0004\u0000ec\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000f\u0005\u0001\u0000\u0000\u0000gh\u0003"+
		"B!\u0000hi\u0005+\u0000\u0000in\u0006\u0003\uffff\uffff\u0000jk\u0005"+
		"\u001f\u0000\u0000kl\u0003&\u0013\u0000lm\u0006\u0003\uffff\uffff\u0000"+
		"mo\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0005\u001b\u0000\u0000q\u007f\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0003\u0000\u0000st\u0003B!\u0000tu\u0005+"+
		"\u0000\u0000uv\u0005\u001f\u0000\u0000vw\u0003D\"\u0000wx\u0005\u001b"+
		"\u0000\u0000xy\u0006\u0003\uffff\uffff\u0000y\u007f\u0001\u0000\u0000"+
		"\u0000z{\u0003\u0016\u000b\u0000{|\u0005\u0017\u0000\u0000|}\u0005\u001b"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~g\u0001\u0000\u0000\u0000"+
		"~r\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0007\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0003"+
		"B!\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005\u0018\u0000"+
		"\u0000\u0084\u0088\u0006\u0004\uffff\uffff\u0000\u0085\u0087\u0003\u0004"+
		"\u0002\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003\n\u0005\u0000\u008c\u008d\u0005\u0019\u0000"+
		"\u0000\u008d\u008e\u0006\u0004\uffff\uffff\u0000\u008e\t\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091\u0006\u0005\uffff"+
		"\uffff\u0000\u0091\u0092\u0003\f\u0006\u0000\u0092\u0093\u0006\u0005\uffff"+
		"\uffff\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u000e"+
		"\u0007\u0000\u0095\u0096\u0006\u0006\uffff\uffff\u0000\u0096\u0097\u0003"+
		"\f\u0006\u0000\u0097\u0098\u0006\u0006\uffff\uffff\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0094\u0001"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\r\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\u009e\u0003&\u0013"+
		"\u0000\u009e\u009f\u0005\u0018\u0000\u0000\u009f\u00a3\u0006\u0007\uffff"+
		"\uffff\u0000\u00a0\u00a2\u0003\u0006\u0003\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\n\u0005"+
		"\u0000\u00a7\u00a8\u0006\u0007\uffff\uffff\u0000\u00a8\u00a9\u0005\u0019"+
		"\u0000\u0000\u00a9\u00f4\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000b"+
		"\u0000\u0000\u00ab\u00ac\u0003&\u0013\u0000\u00ac\u00ad\u0005\u0018\u0000"+
		"\u0000\u00ad\u00b1\u0006\u0007\uffff\uffff\u0000\u00ae\u00b0\u0003\u0006"+
		"\u0003\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0003\n\u0005\u0000\u00b5\u00b6\u0005\u0019\u0000"+
		"\u0000\u00b6\u00b7\u0006\u0007\uffff\uffff\u0000\u00b7\u00b8\u0005\f\u0000"+
		"\u0000\u00b8\u00bc\u0005\u0018\u0000\u0000\u00b9\u00bb\u0003\u0006\u0003"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0003\n\u0005\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000"+
		"\u00c1\u00c2\u0006\u0007\uffff\uffff\u0000\u00c2\u00f4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c5\u0006\u0007\uffff\uffff"+
		"\u0000\u00c5\u00c6\u0003&\u0013\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000"+
		"\u00c7\u00cb\u0006\u0007\uffff\uffff\u0000\u00c8\u00ca\u0003\u0006\u0003"+
		"\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0003\n\u0005\u0000\u00cf\u00d0\u0006\u0007\uffff\uffff"+
		"\u0000\u00d0\u00d1\u0005\u0019\u0000\u0000\u00d1\u00f4\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d4\u0006\u0007\uffff\uffff"+
		"\u0000\u00d4\u00d5\u0005\u0018\u0000\u0000\u00d5\u00d9\u0006\u0007\uffff"+
		"\uffff\u0000\u00d6\u00d8\u0003\u0006\u0003\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003\n\u0005"+
		"\u0000\u00dd\u00de\u0006\u0007\uffff\uffff\u0000\u00de\u00df\u0005\u0019"+
		"\u0000\u0000\u00df\u00e0\u0005\t\u0000\u0000\u00e0\u00e1\u0006\u0007\uffff"+
		"\uffff\u0000\u00e1\u00e2\u0003&\u0013\u0000\u00e2\u00e3\u0005\u001b\u0000"+
		"\u0000\u00e3\u00e4\u0006\u0007\uffff\uffff\u0000\u00e4\u00f4\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6\u00e7\u0003&\u0013"+
		"\u0000\u00e7\u00e8\u0005\u001b\u0000\u0000\u00e8\u00e9\u0006\u0007\uffff"+
		"\uffff\u0000\u00e9\u00f4\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003\u001c"+
		"\u000e\u0000\u00eb\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed\u0003&\u0013"+
		"\u0000\u00ed\u00ee\u0005\u001b\u0000\u0000\u00ee\u00ef\u0006\u0007\uffff"+
		"\uffff\u0000\u00ef\u00f4\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u001c"+
		"\u000e\u0000\u00f1\u00f2\u0005\u001b\u0000\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u009c\u0001\u0000\u0000\u0000\u00f3\u00aa\u0001\u0000"+
		"\u0000\u0000\u00f3\u00c3\u0001\u0000\u0000\u0000\u00f3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00f3\u00e5\u0001\u0000\u0000\u0000\u00f3\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f4\u000f\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005+\u0000\u0000\u00f6\u00f8\u0005\u0014\u0000"+
		"\u0000\u00f7\u00f9\u0003\u0012\t\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0015\u0000\u0000\u00fb\u00fc\u0006\b\uffff\uffff\u0000"+
		"\u00fc\u0011\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u0014\n\u0000\u00fe"+
		"\u00ff\u0005\u001a\u0000\u0000\u00ff\u0100\u0003\u0012\t\u0000\u0100\u0103"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u0014\n\u0000\u0102\u00fd\u0001"+
		"\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0013\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0003B!\u0000\u0105\u0106\u0005+\u0000"+
		"\u0000\u0106\u0015\u0001\u0000\u0000\u0000\u0107\u0108\u0003B!\u0000\u0108"+
		"\u0109\u0005+\u0000\u0000\u0109\u010d\u0005\u0016\u0000\u0000\u010a\u010b"+
		"\u0003\u001a\r\u0000\u010b\u010c\u0005\u001d\u0000\u0000\u010c\u010e\u0001"+
		"\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0003"+
		"\u001a\r\u0000\u0110\u0111\u0003\u0018\f\u0000\u0111\u0112\u0006\u000b"+
		"\uffff\uffff\u0000\u0112\u0017\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\u0017\u0000\u0000\u0114\u0118\u0005\u0016\u0000\u0000\u0115\u0116\u0003"+
		"\u001a\r\u0000\u0116\u0117\u0005\u001d\u0000\u0000\u0117\u0119\u0001\u0000"+
		"\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u001a"+
		"\r\u0000\u011b\u011c\u0003\u0018\f\u0000\u011c\u011f\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0113\u0001\u0000\u0000"+
		"\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0019\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0007\u0000\u0000\u0000\u0121\u001b\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005+\u0000\u0000\u0123\u0131\u0006\u000e\uffff\uffff"+
		"\u0000\u0124\u0125\u0003\u001e\u000f\u0000\u0125\u0126\u0005\u0017\u0000"+
		"\u0000\u0126\u0127\u0006\u000e\uffff\uffff\u0000\u0127\u0131\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005+\u0000\u0000\u0129\u012a\u0005\u0014\u0000"+
		"\u0000\u012a\u012b\u0005\u0015\u0000\u0000\u012b\u0131\u0006\u000e\uffff"+
		"\uffff\u0000\u012c\u012d\u0003\"\u0011\u0000\u012d\u012e\u0005\u0015\u0000"+
		"\u0000\u012e\u012f\u0006\u000e\uffff\uffff\u0000\u012f\u0131\u0001\u0000"+
		"\u0000\u0000\u0130\u0122\u0001\u0000\u0000\u0000\u0130\u0124\u0001\u0000"+
		"\u0000\u0000\u0130\u0128\u0001\u0000\u0000\u0000\u0130\u012c\u0001\u0000"+
		"\u0000\u0000\u0131\u001d\u0001\u0000\u0000\u0000\u0132\u0133\u0005+\u0000"+
		"\u0000\u0133\u0134\u0005\u0016\u0000\u0000\u0134\u0135\u0003&\u0013\u0000"+
		"\u0135\u0136\u0006\u000f\uffff\uffff\u0000\u0136\u0137\u0003 \u0010\u0000"+
		"\u0137\u0138\u0006\u000f\uffff\uffff\u0000\u0138\u001f\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005\u0017\u0000\u0000\u013a\u013b\u0005\u0016\u0000"+
		"\u0000\u013b\u013c\u0003&\u0013\u0000\u013c\u013d\u0006\u0010\uffff\uffff"+
		"\u0000\u013d\u013e\u0003 \u0010\u0000\u013e\u013f\u0006\u0010\uffff\uffff"+
		"\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u0142\u0006\u0010\uffff"+
		"\uffff\u0000\u0141\u0139\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142!\u0001\u0000\u0000\u0000\u0143\u0144\u0005+\u0000\u0000"+
		"\u0144\u0145\u0005\u0014\u0000\u0000\u0145\u0146\u0003&\u0013\u0000\u0146"+
		"\u0147\u0006\u0011\uffff\uffff\u0000\u0147\u0148\u0003$\u0012\u0000\u0148"+
		"#\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u001a\u0000\u0000\u014a\u014b"+
		"\u0003&\u0013\u0000\u014b\u014c\u0006\u0012\uffff\uffff\u0000\u014c\u014d"+
		"\u0003$\u0012\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u0150\u0001"+
		"\u0000\u0000\u0000\u014f\u0149\u0001\u0000\u0000\u0000\u014f\u014e\u0001"+
		"\u0000\u0000\u0000\u0150%\u0001\u0000\u0000\u0000\u0151\u0152\u0003(\u0014"+
		"\u0000\u0152\u0153\u0006\u0013\uffff\uffff\u0000\u0153\'\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0003,\u0016\u0000\u0155\u0156\u0006\u0014\uffff\uffff"+
		"\u0000\u0156\u0157\u0003*\u0015\u0000\u0157\u0158\u0006\u0014\uffff\uffff"+
		"\u0000\u0158)\u0001\u0000\u0000\u0000\u0159\u015a\u0005)\u0000\u0000\u015a"+
		"\u015b\u0006\u0015\uffff\uffff\u0000\u015b\u015c\u0003,\u0016\u0000\u015c"+
		"\u015d\u0006\u0015\uffff\uffff\u0000\u015d\u015e\u0003*\u0015\u0000\u015e"+
		"\u015f\u0006\u0015\uffff\uffff\u0000\u015f\u0162\u0001\u0000\u0000\u0000"+
		"\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0159\u0001\u0000\u0000\u0000"+
		"\u0161\u0160\u0001\u0000\u0000\u0000\u0162+\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u00030\u0018\u0000\u0164\u0165\u0006\u0016\uffff\uffff\u0000\u0165"+
		"\u0166\u0003.\u0017\u0000\u0166\u0167\u0006\u0016\uffff\uffff\u0000\u0167"+
		"-\u0001\u0000\u0000\u0000\u0168\u0169\u0005(\u0000\u0000\u0169\u016a\u0006"+
		"\u0017\uffff\uffff\u0000\u016a\u016b\u00030\u0018\u0000\u016b\u016c\u0006"+
		"\u0017\uffff\uffff\u0000\u016c\u016d\u0003.\u0017\u0000\u016d\u016e\u0006"+
		"\u0017\uffff\uffff\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u0171"+
		"\u0001\u0000\u0000\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u016f"+
		"\u0001\u0000\u0000\u0000\u0171/\u0001\u0000\u0000\u0000\u0172\u0173\u0005"+
		"*\u0000\u0000\u0173\u0174\u00032\u0019\u0000\u0174\u0175\u0006\u0018\uffff"+
		"\uffff\u0000\u0175\u017a\u0001\u0000\u0000\u0000\u0176\u0177\u00032\u0019"+
		"\u0000\u0177\u0178\u0006\u0018\uffff\uffff\u0000\u0178\u017a\u0001\u0000"+
		"\u0000\u0000\u0179\u0172\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000"+
		"\u0000\u0000\u017a1\u0001\u0000\u0000\u0000\u017b\u017c\u00036\u001b\u0000"+
		"\u017c\u017d\u0006\u0019\uffff\uffff\u0000\u017d\u017e\u00034\u001a\u0000"+
		"\u017e\u017f\u0006\u0019\uffff\uffff\u0000\u017f3\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0005\u001e\u0000\u0000\u0181\u0182\u00036\u001b\u0000\u0182"+
		"\u0183\u0006\u001a\uffff\uffff\u0000\u0183\u0186\u0001\u0000\u0000\u0000"+
		"\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0180\u0001\u0000\u0000\u0000"+
		"\u0185\u0184\u0001\u0000\u0000\u0000\u01865\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0003:\u001d\u0000\u0188\u0189\u0006\u001b\uffff\uffff\u0000\u0189"+
		"\u018a\u00038\u001c\u0000\u018a\u018b\u0006\u001b\uffff\uffff\u0000\u018b"+
		"7\u0001\u0000\u0000\u0000\u018c\u018d\u0005#\u0000\u0000\u018d\u018e\u0003"+
		":\u001d\u0000\u018e\u018f\u0006\u001c\uffff\uffff\u0000\u018f\u0190\u0003"+
		"8\u001c\u0000\u0190\u0191\u0006\u001c\uffff\uffff\u0000\u0191\u019a\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005$\u0000\u0000\u0193\u0194\u0003:\u001d"+
		"\u0000\u0194\u0195\u0006\u001c\uffff\uffff\u0000\u0195\u0196\u00038\u001c"+
		"\u0000\u0196\u0197\u0006\u001c\uffff\uffff\u0000\u0197\u019a\u0001\u0000"+
		"\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u018c\u0001\u0000"+
		"\u0000\u0000\u0199\u0192\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000"+
		"\u0000\u0000\u019a9\u0001\u0000\u0000\u0000\u019b\u019c\u0003>\u001f\u0000"+
		"\u019c\u019d\u0006\u001d\uffff\uffff\u0000\u019d\u019e\u0003<\u001e\u0000"+
		"\u019e\u019f\u0006\u001d\uffff\uffff\u0000\u019f;\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005%\u0000\u0000\u01a1\u01a2\u0003>\u001f\u0000\u01a2\u01a3"+
		"\u0006\u001e\uffff\uffff\u0000\u01a3\u01a4\u0003<\u001e\u0000\u01a4\u01a5"+
		"\u0006\u001e\uffff\uffff\u0000\u01a5\u01b4\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0005&\u0000\u0000\u01a7\u01a8\u0003>\u001f\u0000\u01a8\u01a9\u0006"+
		"\u001e\uffff\uffff\u0000\u01a9\u01aa\u0003<\u001e\u0000\u01aa\u01ab\u0006"+
		"\u001e\uffff\uffff\u0000\u01ab\u01b4\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0005\'\u0000\u0000\u01ad\u01ae\u0003>\u001f\u0000\u01ae\u01af\u0006"+
		"\u001e\uffff\uffff\u0000\u01af\u01b0\u0003<\u001e\u0000\u01b0\u01b1\u0006"+
		"\u001e\uffff\uffff\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b3\u01a0\u0001\u0000\u0000\u0000\u01b3\u01a6"+
		"\u0001\u0000\u0000\u0000\u01b3\u01ac\u0001\u0000\u0000\u0000\u01b3\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4=\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"$\u0000\u0000\u01b6\u01b7\u0003@ \u0000\u01b7\u01b8\u0006\u001f\uffff"+
		"\uffff\u0000\u01b8\u01bd\u0001\u0000\u0000\u0000\u01b9\u01ba\u0003@ \u0000"+
		"\u01ba\u01bb\u0006\u001f\uffff\uffff\u0000\u01bb\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b5\u0001\u0000\u0000\u0000\u01bc\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bd?\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\u0014\u0000\u0000"+
		"\u01bf\u01c0\u0003&\u0013\u0000\u01c0\u01c1\u0005\u0015\u0000\u0000\u01c1"+
		"\u01c2\u0006 \uffff\uffff\u0000\u01c2\u01ca\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0003\u001c\u000e\u0000\u01c4\u01c5\u0006 \uffff\uffff\u0000\u01c5"+
		"\u01ca\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003D\"\u0000\u01c7\u01c8"+
		"\u0006 \uffff\uffff\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01be"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c3\u0001\u0000\u0000\u0000\u01c9\u01c6"+
		"\u0001\u0000\u0000\u0000\u01caA\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0006\u0000\u0000\u01cc\u01d2\u0006!\uffff\uffff\u0000\u01cd\u01ce\u0005"+
		"\u0007\u0000\u0000\u01ce\u01d2\u0006!\uffff\uffff\u0000\u01cf\u01d0\u0005"+
		"\b\u0000\u0000\u01d0\u01d2\u0006!\uffff\uffff\u0000\u01d1\u01cb\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d2C\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005\u0011"+
		"\u0000\u0000\u01d4\u01da\u0006\"\uffff\uffff\u0000\u01d5\u01d6\u0005\u0012"+
		"\u0000\u0000\u01d6\u01da\u0006\"\uffff\uffff\u0000\u01d7\u01d8\u0005\u0013"+
		"\u0000\u0000\u01d8\u01da\u0006\"\uffff\uffff\u0000\u01d9\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01daE\u0001\u0000\u0000\u0000!JMO\\en~\u0088\u009a\u00a3"+
		"\u00b1\u00bc\u00cb\u00d9\u00f3\u00f8\u0102\u010d\u0118\u011e\u0130\u0141"+
		"\u014f\u0161\u0170\u0179\u0185\u0199\u01b3\u01bc\u01c9\u01d1\u01d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}