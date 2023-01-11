// Generated from java-escape by ANTLR 4.11.1

package gram;
import compilador.*;
import java.io.*;
import java.sql.SQLOutput;
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
public class eGramParser extends Parser {
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
		RULE_program = 0, RULE_main = 1, RULE_decl = 2, RULE_arrayDecl = 3, RULE_number = 4, 
		RULE_header = 5, RULE_params = 6, RULE_param = 7, RULE_sentsVoid = 8, 
		RULE_sents = 9, RULE_sents_ = 10, RULE_sent = 11, RULE_reference = 12, 
		RULE_idx = 13, RULE_idx_ = 14, RULE_contIdx_ = 15, RULE_expr = 16, RULE_exprOr = 17, 
		RULE_exprOr_ = 18, RULE_exprAnd = 19, RULE_exprAnd_ = 20, RULE_exprNot = 21, 
		RULE_exprComp = 22, RULE_exprComp_ = 23, RULE_exprAdit = 24, RULE_exprAdit_ = 25, 
		RULE_exprMult = 26, RULE_exprMult_ = 27, RULE_exprNeg = 28, RULE_primary = 29, 
		RULE_type = 30, RULE_literal = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decl", "arrayDecl", "number", "header", "params", 
			"param", "sentsVoid", "sents", "sents_", "sent", "reference", "idx", 
			"idx_", "contIdx_", "expr", "exprOr", "exprOr_", "exprAnd", "exprAnd_", 
			"exprNot", "exprComp", "exprComp_", "exprAdit", "exprAdit_", "exprMult", 
			"exprMult_", "exprNeg", "primary", "type", "literal"
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


	public SymbolTable ts;
	int depthCondition;
	String errors="";
	String folder;
	Deque<Symbol> proceduresStack = new ArrayDeque<Symbol>();
	//El constructor aquí no hace nada (de momento)
	public eGramParser(TokenStream input,String folder){
		this(input);
		this.folder=folder;
	}


	@Override
	public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException ex)
	{
		String notificacion = "Error sintáctico en la línea " + offendingToken.getLine()
		+ ", columna " + offendingToken.getCharPositionInLine() + ": \n\t ";
		System.out.println(offendingToken);
		String expected = msg;
		if(expected.contains("expecting")){
			expected = expected.substring(expected.indexOf("expecting") + 10);
			notificacion += "encontrado: '" + offendingToken.getText() + "' esperado: "+ expected;
		}else if(expected.contains("missing")){
			expected = expected.substring(expected.indexOf("missing") + 8);
			expected = expected.substring(0, expected.indexOf("at") - 1);
			notificacion += "encontrado: '" + offendingToken.getText() + "', falta "+ expected;
		}else if(expected.contains("alternative")){
			expected = expected.substring(expected.indexOf("input") + 6).replace("'","");
			notificacion += "Se ha detectado un error antes de la entrada '" + offendingToken.getText()+"'.";
			//Eliminar el siguiente token encontrado tras analizar el token que genera error
			//TODO: La siguiente instrucción solo quita el offendingToken que se encuentra despues del error, no los de antes. caso que funciona: int i = 6; caso que no funciona: ent i 6;
			expected = expected.substring(0, expected.length()-offendingToken.getText().length());
			String[] lines = offendingToken.getInputStream().toString().split(System.getProperty("line.separator"));
			if(expected.length()==0){ //Es posible que sea porque falta cerrar la sentencia con punto y coma
				notificacion += " Se esperaba otra instrucción, quizás te has saltado un ';'.";
			}else{
				notificacion += " No se reconoce '" + expected +"'";
			}
		}
		notificacion = notificacion.replaceAll("Comparador","==, !=, <, >, <=, >=");
		notificacion = notificacion.replaceAll("OpBinSum","+, -");
		throw new RuntimeException(notificacion);
	}

	public eGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SentsVoidContext sentsVoid() {
			return getRuleContext(SentsVoidContext.class,0);
		}
		public TerminalNode EOF() { return getToken(eGramParser.EOF, 0); }
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(64);
				main();
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(67);
				decl();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			sentsVoid();
			setState(74);
			match(EOF);
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
		public TerminalNode MAIN() { return getToken(eGramParser.MAIN, 0); }
		public TerminalNode BEGIN() { return getToken(eGramParser.BEGIN, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode END() { return getToken(eGramParser.END, 0); }
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitMain(this);
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
			setState(76);
			match(MAIN);
			setState(77);
			match(BEGIN);
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
			sents();
			setState(85);
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
	public static class DeclContext extends ParserRuleContext {
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(eGramParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(eGramParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(eGramParser.CONSTANT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(eGramParser.FUNCTION, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(eGramParser.BEGIN, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode END() { return getToken(eGramParser.END, 0); }
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				type();
				setState(88);
				match(ID);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(89);
					match(ASSIGN);
					setState(90);
					expr();
					}
				}

				setState(93);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(CONSTANT);
				setState(96);
				type();
				setState(97);
				match(ID);
				setState(98);
				match(ASSIGN);
				setState(99);
				literal();
				setState(100);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				arrayDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(FUNCTION);
				setState(104);
				((DeclContext)_localctx).type = type();
				setState(105);
				header(((DeclContext)_localctx).type.dataType);
				setState(106);
				match(BEGIN);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(107);
					decl();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				sents();
				setState(114);
				match(END);
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
	public static class ArrayDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(eGramParser.LBRACK, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(eGramParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(eGramParser.SEMI, 0); }
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type();
			setState(119);
			match(ID);
			setState(120);
			match(LBRACK);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(121);
				number();
				setState(122);
				match(T__0);
				}
				break;
			}
			setState(126);
			number();
			setState(127);
			match(RBRACK);
			setState(128);
			match(SEMI);
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
		public boolean constant;
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public TerminalNode LiteralInteger() { return getToken(eGramParser.LiteralInteger, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
	public static class HeaderContext extends ParserRuleContext {
		public Symbol.DataTypes dataType;
		public Symbol s;
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(eGramParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(eGramParser.RPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeaderContext(ParserRuleContext parent, int invokingState, Symbol.DataTypes dataType) {
			super(parent, invokingState);
			this.dataType = dataType;
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header(Symbol.DataTypes dataType) throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState(), dataType);
		enterRule(_localctx, 10, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(LPAREN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				setState(134);
				params(_localctx.s);
				}
			}

			setState(137);
			match(RPAREN);
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
	public static class ParamsContext extends ParserRuleContext {
		public Symbol prev;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(eGramParser.COMMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsContext(ParserRuleContext parent, int invokingState, Symbol prev) {
			super(parent, invokingState);
			this.prev = prev;
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params(Symbol prev) throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState(), prev);
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				param();
				setState(140);
				match(COMMA);
				setState(141);
				params(_localctx.prev.getNext());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				param();
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
	public static class ParamContext extends ParserRuleContext {
		public Symbol s;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			type();
			setState(147);
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
	public static class SentsVoidContext extends ParserRuleContext {
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public SentsVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentsVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterSentsVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitSentsVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitSentsVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentsVoidContext sentsVoid() throws RecognitionException {
		SentsVoidContext _localctx = new SentsVoidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentsVoid);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				sents();
				}
				break;
			case EOF:
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
	public static class SentsContext extends ParserRuleContext {
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterSents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitSents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitSents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentsContext sents() throws RecognitionException {
		SentsContext _localctx = new SentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			sent();
			setState(154);
			sents_();
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sents_Context sents_() {
			return getRuleContext(Sents_Context.class,0);
		}
		public Sents_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sents_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterSents_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitSents_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitSents_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sents_Context sents_() throws RecognitionException {
		Sents_Context _localctx = new Sents_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_sents_);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				sent();
				setState(157);
				sents_();
				}
				break;
			case EOF:
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
		public TerminalNode IF() { return getToken(eGramParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> BEGIN() { return getTokens(eGramParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(eGramParser.BEGIN, i);
		}
		public List<SentsContext> sents() {
			return getRuleContexts(SentsContext.class);
		}
		public SentsContext sents(int i) {
			return getRuleContext(SentsContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(eGramParser.END); }
		public TerminalNode END(int i) {
			return getToken(eGramParser.END, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(eGramParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(eGramParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(eGramParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(eGramParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(eGramParser.RETURN, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(eGramParser.ASSIGN, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sent);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(IF);
				setState(163);
				expr();
				setState(164);
				match(BEGIN);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(165);
					decl();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				sents();
				setState(172);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(IF);
				setState(175);
				expr();
				setState(176);
				match(BEGIN);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(177);
					decl();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				sents();
				setState(184);
				match(END);
				setState(185);
				match(ELSE);
				setState(186);
				match(BEGIN);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(187);
					decl();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				sents();
				setState(194);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(WHILE);
				setState(197);
				expr();
				setState(198);
				match(BEGIN);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(199);
					decl();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				sents();
				setState(206);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(DO);
				setState(209);
				match(BEGIN);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(210);
					decl();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				sents();
				setState(217);
				match(END);
				setState(218);
				match(WHILE);
				setState(219);
				expr();
				setState(220);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(RETURN);
				setState(223);
				expr();
				setState(224);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(RETURN);
				setState(227);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				reference(true);
				setState(229);
				match(ASSIGN);
				setState(230);
				expr();
				setState(231);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				reference(false);
				setState(234);
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
	public static class ReferenceContext extends ParserRuleContext {
		public boolean assign;
		public Symbol s;
		public boolean dimCheck;
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(eGramParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(eGramParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(eGramParser.RPAREN, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReferenceContext(ParserRuleContext parent, int invokingState, boolean assign) {
			super(parent, invokingState);
			this.assign = assign;
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference(boolean assign) throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState(), assign);
		enterRule(_localctx, 24, RULE_reference);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				idx();
				setState(240);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(ID);
				setState(243);
				match(LPAREN);
				setState(244);
				match(RPAREN);
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
		public Symbol s;
		public int dim;
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(eGramParser.LBRACK, 0); }
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdxContext idx() throws RecognitionException {
		IdxContext _localctx = new IdxContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(LBRACK);
			setState(249);
			expr();
			setState(250);
			idx_(_localctx.dim);
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
		public int dim1;
		public int dim;
		public TerminalNode RBRACK() { return getToken(eGramParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(eGramParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Idx_Context idx_() {
			return getRuleContext(Idx_Context.class,0);
		}
		public Idx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Idx_Context(ParserRuleContext parent, int invokingState, int dim1) {
			super(parent, invokingState);
			this.dim1 = dim1;
		}
		@Override public int getRuleIndex() { return RULE_idx_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterIdx_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitIdx_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitIdx_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idx_Context idx_(int dim1) throws RecognitionException {
		Idx_Context _localctx = new Idx_Context(_ctx, getState(), dim1);
		enterRule(_localctx, 28, RULE_idx_);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(RBRACK);
				setState(253);
				match(LBRACK);
				setState(254);
				expr();
				setState(255);
				idx_(_localctx.dim);
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
	public static class ContIdx_Context extends ParserRuleContext {
		public Deque<Symbol.DataTypes> pparams;
		public TerminalNode COMMA() { return getToken(eGramParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContIdx_Context contIdx_() {
			return getRuleContext(ContIdx_Context.class,0);
		}
		public ContIdx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ContIdx_Context(ParserRuleContext parent, int invokingState, Deque<Symbol.DataTypes> pparams) {
			super(parent, invokingState);
			this.pparams = pparams;
		}
		@Override public int getRuleIndex() { return RULE_contIdx_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterContIdx_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitContIdx_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitContIdx_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContIdx_Context contIdx_(Deque<Symbol.DataTypes> pparams) throws RecognitionException {
		ContIdx_Context _localctx = new ContIdx_Context(_ctx, getState(), pparams);
		enterRule(_localctx, 30, RULE_contIdx_);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(COMMA);
				setState(261);
				expr();
				setState(262);
				contIdx_(_localctx.pparams);
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
	public static class ExprContext extends ParserRuleContext {
		public Symbol.DataTypes dataType;
		public ExprOrContext exprOr() {
			return getRuleContext(ExprOrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			exprOr();
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
		public Symbol.DataTypes dataType;
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOrContext exprOr() throws RecognitionException {
		ExprOrContext _localctx = new ExprOrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			exprAnd();
			setState(270);
			exprOr_();
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
		public Symbol.DataTypes dataType;
		public TerminalNode OR() { return getToken(eGramParser.OR, 0); }
		public ExprAndContext exprAnd() {
			return getRuleContext(ExprAndContext.class,0);
		}
		public ExprOr_Context exprOr_() {
			return getRuleContext(ExprOr_Context.class,0);
		}
		public ExprOr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprOr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprOr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprOr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOr_Context exprOr_() throws RecognitionException {
		ExprOr_Context _localctx = new ExprOr_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprOr_);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(OR);
				setState(273);
				exprAnd();
				setState(274);
				exprOr_();
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
		public Symbol.DataTypes dataType;
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAndContext exprAnd() throws RecognitionException {
		ExprAndContext _localctx = new ExprAndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			exprNot();
			setState(280);
			exprAnd_();
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
		public Symbol.DataTypes dataType;
		public TerminalNode AND() { return getToken(eGramParser.AND, 0); }
		public ExprNotContext exprNot() {
			return getRuleContext(ExprNotContext.class,0);
		}
		public ExprAnd_Context exprAnd_() {
			return getRuleContext(ExprAnd_Context.class,0);
		}
		public ExprAnd_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAnd_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprAnd_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprAnd_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprAnd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAnd_Context exprAnd_() throws RecognitionException {
		ExprAnd_Context _localctx = new ExprAnd_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprAnd_);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(AND);
				setState(283);
				exprNot();
				setState(284);
				exprAnd_();
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
		public Symbol.DataTypes dataType;
		public TerminalNode NOT() { return getToken(eGramParser.NOT, 0); }
		public ExprCompContext exprComp() {
			return getRuleContext(ExprCompContext.class,0);
		}
		public ExprNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNotContext exprNot() throws RecognitionException {
		ExprNotContext _localctx = new ExprNotContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprNot);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(NOT);
				setState(290);
				exprComp();
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
				setState(291);
				exprComp();
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
		public Symbol.DataTypes dataType;
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCompContext exprComp() throws RecognitionException {
		ExprCompContext _localctx = new ExprCompContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			exprAdit();
			setState(295);
			exprComp_();
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
		public Symbol.DataTypes dataType;
		public TerminalNode OPREL() { return getToken(eGramParser.OPREL, 0); }
		public ExprAditContext exprAdit() {
			return getRuleContext(ExprAditContext.class,0);
		}
		public ExprComp_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComp_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprComp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprComp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprComp_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprComp_Context exprComp_() throws RecognitionException {
		ExprComp_Context _localctx = new ExprComp_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprComp_);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(OPREL);
				setState(298);
				exprAdit();
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
	public static class ExprAditContext extends ParserRuleContext {
		public Symbol.DataTypes dataType;
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprAdit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprAdit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprAdit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAditContext exprAdit() throws RecognitionException {
		ExprAditContext _localctx = new ExprAditContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprAdit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			exprMult();
			setState(303);
			exprAdit_();
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
		public Symbol.DataTypes dataType;
		public TerminalNode ADD() { return getToken(eGramParser.ADD, 0); }
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdit_Context exprAdit_() {
			return getRuleContext(ExprAdit_Context.class,0);
		}
		public TerminalNode SUB() { return getToken(eGramParser.SUB, 0); }
		public ExprAdit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAdit_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprAdit_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprAdit_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprAdit_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAdit_Context exprAdit_() throws RecognitionException {
		ExprAdit_Context _localctx = new ExprAdit_Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprAdit_);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(ADD);
				setState(306);
				exprMult();
				setState(307);
				exprAdit_();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(SUB);
				setState(310);
				exprMult();
				setState(311);
				exprAdit_();
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
		public Symbol.DataTypes dataType;
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultContext exprMult() throws RecognitionException {
		ExprMultContext _localctx = new ExprMultContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			exprNeg();
			setState(317);
			exprMult_();
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
		public Symbol.DataTypes dataType;
		public TerminalNode MULT() { return getToken(eGramParser.MULT, 0); }
		public ExprNegContext exprNeg() {
			return getRuleContext(ExprNegContext.class,0);
		}
		public ExprMult_Context exprMult_() {
			return getRuleContext(ExprMult_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(eGramParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(eGramParser.MOD, 0); }
		public ExprMult_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMult_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprMult_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprMult_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprMult_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMult_Context exprMult_() throws RecognitionException {
		ExprMult_Context _localctx = new ExprMult_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprMult_);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(MULT);
				setState(320);
				exprNeg();
				setState(321);
				exprMult_();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(DIV);
				setState(324);
				exprNeg();
				setState(325);
				exprMult_();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(MOD);
				setState(328);
				exprNeg();
				setState(329);
				exprMult_();
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
		public Symbol.DataTypes dataType;
		public boolean zero;
		public TerminalNode SUB() { return getToken(eGramParser.SUB, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExprNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNegContext exprNeg() throws RecognitionException {
		ExprNegContext _localctx = new ExprNegContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exprNeg);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(SUB);
				setState(335);
				primary();
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				primary();
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
		public Symbol.DataTypes dataType;
		public boolean zero;
		public TerminalNode LPAREN() { return getToken(eGramParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(eGramParser.RPAREN, 0); }
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primary);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(LPAREN);
				setState(340);
				expr();
				setState(341);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				reference(false);
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				literal();
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
		public Symbol.DataTypes dataType;
		public TerminalNode INTEGER() { return getToken(eGramParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(eGramParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(eGramParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public Symbol.DataTypes dataType;
		public boolean zero;
		public TerminalNode LiteralInteger() { return getToken(eGramParser.LiteralInteger, 0); }
		public TerminalNode LiteralBoolean() { return getToken(eGramParser.LiteralBoolean, 0); }
		public TerminalNode LiteralString() { return getToken(eGramParser.LiteralString, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0) ) {
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

	public static final String _serializedATN =
		"\u0004\u00011\u0160\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0003\u0000B\b\u0000\u0001\u0000"+
		"\u0005\u0000E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001P\b\u0001"+
		"\n\u0001\f\u0001S\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002m\b\u0002\n\u0002\f\u0002p\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002u\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"}\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0088\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0091\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00a1\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00a7\b\u000b\n\u000b\f\u000b\u00aa\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00b3\b\u000b\n\u000b\f\u000b\u00b6\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00bd\b\u000b"+
		"\n\u000b\f\u000b\u00c0\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c9\b\u000b\n"+
		"\u000b\f\u000b\u00cc\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d4\b\u000b\n\u000b\f\u000b"+
		"\u00d7\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ed\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f6\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0103\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010a\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0116\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0120\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0125\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012d\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u013b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u014d\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0152\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u015a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0003"+
		"\u0002\u0000\u0012\u0012..\u0001\u0000\u0007\t\u0001\u0000\u0012\u0014"+
		"\u0168\u0000A\u0001\u0000\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004"+
		"t\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\b\u0082\u0001"+
		"\u0000\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000"+
		"\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000"+
		"\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000"+
		"\u0000\u0000\u0016\u00ec\u0001\u0000\u0000\u0000\u0018\u00f5\u0001\u0000"+
		"\u0000\u0000\u001a\u00f7\u0001\u0000\u0000\u0000\u001c\u0102\u0001\u0000"+
		"\u0000\u0000\u001e\u0109\u0001\u0000\u0000\u0000 \u010b\u0001\u0000\u0000"+
		"\u0000\"\u010d\u0001\u0000\u0000\u0000$\u0115\u0001\u0000\u0000\u0000"+
		"&\u0117\u0001\u0000\u0000\u0000(\u011f\u0001\u0000\u0000\u0000*\u0124"+
		"\u0001\u0000\u0000\u0000,\u0126\u0001\u0000\u0000\u0000.\u012c\u0001\u0000"+
		"\u0000\u00000\u012e\u0001\u0000\u0000\u00002\u013a\u0001\u0000\u0000\u0000"+
		"4\u013c\u0001\u0000\u0000\u00006\u014c\u0001\u0000\u0000\u00008\u0151"+
		"\u0001\u0000\u0000\u0000:\u0159\u0001\u0000\u0000\u0000<\u015b\u0001\u0000"+
		"\u0000\u0000>\u015d\u0001\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BF\u0001\u0000\u0000"+
		"\u0000CE\u0003\u0004\u0002\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0003\u0010\b\u0000JK\u0005"+
		"\u0000\u0000\u0001K\u0001\u0001\u0000\u0000\u0000LM\u0005\u0002\u0000"+
		"\u0000MQ\u0005\u0019\u0000\u0000NP\u0003\u0004\u0002\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0003\u0012\t\u0000UV\u0005\u001a\u0000\u0000V\u0003\u0001\u0000\u0000"+
		"\u0000WX\u0003<\u001e\u0000X[\u0005.\u0000\u0000YZ\u0005\u001f\u0000\u0000"+
		"Z\\\u0003 \u0010\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u001c\u0000\u0000^u\u0001\u0000"+
		"\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0003<\u001e\u0000ab\u0005.\u0000"+
		"\u0000bc\u0005\u001f\u0000\u0000cd\u0003>\u001f\u0000de\u0005\u001c\u0000"+
		"\u0000eu\u0001\u0000\u0000\u0000fu\u0003\u0006\u0003\u0000gh\u0005\u0005"+
		"\u0000\u0000hi\u0003<\u001e\u0000ij\u0003\n\u0005\u0000jn\u0005\u0019"+
		"\u0000\u0000km\u0003\u0004\u0002\u0000lk\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0003\u0012\t\u0000"+
		"rs\u0005\u001a\u0000\u0000su\u0001\u0000\u0000\u0000tW\u0001\u0000\u0000"+
		"\u0000t_\u0001\u0000\u0000\u0000tf\u0001\u0000\u0000\u0000tg\u0001\u0000"+
		"\u0000\u0000u\u0005\u0001\u0000\u0000\u0000vw\u0003<\u001e\u0000wx\u0005"+
		".\u0000\u0000x|\u0005\u0017\u0000\u0000yz\u0003\b\u0004\u0000z{\u0005"+
		"\u0001\u0000\u0000{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0003\b\u0004"+
		"\u0000\u007f\u0080\u0005\u0018\u0000\u0000\u0080\u0081\u0005\u001c\u0000"+
		"\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0000\u0000"+
		"\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084\u0085\u0005.\u0000\u0000"+
		"\u0085\u0087\u0005\u0015\u0000\u0000\u0086\u0088\u0003\f\u0006\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0016\u0000\u0000\u008a"+
		"\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u000e\u0007\u0000\u008c"+
		"\u008d\u0005\u001b\u0000\u0000\u008d\u008e\u0003\f\u0006\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008b"+
		"\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\r\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0003<\u001e\u0000\u0093\u0094\u0005.\u0000"+
		"\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u0098\u0003\u0012\t\u0000"+
		"\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0011\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0003\u0016\u000b\u0000\u009a\u009b\u0003\u0014\n\u0000\u009b"+
		"\u0013\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0016\u000b\u0000\u009d"+
		"\u009e\u0003\u0014\n\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\f\u0000\u0000\u00a3\u00a4\u0003 \u0010\u0000\u00a4\u00a8\u0005"+
		"\u0019\u0000\u0000\u00a5\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003"+
		"\u0012\t\u0000\u00ac\u00ad\u0005\u001a\u0000\u0000\u00ad\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\f\u0000\u0000\u00af\u00b0\u0003 \u0010"+
		"\u0000\u00b0\u00b4\u0005\u0019\u0000\u0000\u00b1\u00b3\u0003\u0004\u0002"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0003\u0012\t\u0000\u00b8\u00b9\u0005\u001a\u0000\u0000"+
		"\u00b9\u00ba\u0005\r\u0000\u0000\u00ba\u00be\u0005\u0019\u0000\u0000\u00bb"+
		"\u00bd\u0003\u0004\u0002\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0012\t\u0000\u00c2\u00c3"+
		"\u0005\u001a\u0000\u0000\u00c3\u00ed\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\n\u0000\u0000\u00c5\u00c6\u0003 \u0010\u0000\u00c6\u00ca\u0005"+
		"\u0019\u0000\u0000\u00c7\u00c9\u0003\u0004\u0002\u0000\u00c8\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		"\u0012\t\u0000\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf\u00ed\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\u000b\u0000\u0000\u00d1\u00d5\u0005\u0019"+
		"\u0000\u0000\u00d2\u00d4\u0003\u0004\u0002\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u0012"+
		"\t\u0000\u00d9\u00da\u0005\u001a\u0000\u0000\u00da\u00db\u0005\n\u0000"+
		"\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0005\u001c\u0000\u0000"+
		"\u00dd\u00ed\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0006\u0000\u0000"+
		"\u00df\u00e0\u0003 \u0010\u0000\u00e0\u00e1\u0005\u001c\u0000\u0000\u00e1"+
		"\u00ed\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0006\u0000\u0000\u00e3"+
		"\u00ed\u0005\u001c\u0000\u0000\u00e4\u00e5\u0003\u0018\f\u0000\u00e5\u00e6"+
		"\u0005\u001f\u0000\u0000\u00e6\u00e7\u0003 \u0010\u0000\u00e7\u00e8\u0005"+
		"\u001c\u0000\u0000\u00e8\u00ed\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003"+
		"\u0018\f\u0000\u00ea\u00eb\u0005\u001c\u0000\u0000\u00eb\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ec\u00a2\u0001\u0000\u0000\u0000\u00ec\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ec\u00c4\u0001\u0000\u0000\u0000\u00ec\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ec\u00de\u0001\u0000\u0000\u0000\u00ec\u00e2\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ed\u0017\u0001\u0000\u0000\u0000\u00ee\u00f6\u0005.\u0000"+
		"\u0000\u00ef\u00f0\u0003\u001a\r\u0000\u00f0\u00f1\u0005\u0018\u0000\u0000"+
		"\u00f1\u00f6\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005.\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f6\u0005\u0016\u0000\u0000\u00f5"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f6\u0019\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005.\u0000\u0000\u00f8\u00f9\u0005\u0017\u0000\u0000\u00f9\u00fa"+
		"\u0003 \u0010\u0000\u00fa\u00fb\u0003\u001c\u000e\u0000\u00fb\u001b\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\u0018\u0000\u0000\u00fd\u00fe\u0005"+
		"\u0017\u0000\u0000\u00fe\u00ff\u0003 \u0010\u0000\u00ff\u0100\u0003\u001c"+
		"\u000e\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000"+
		"\u0000\u0000\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u001d\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u001b"+
		"\u0000\u0000\u0105\u0106\u0003 \u0010\u0000\u0106\u0107\u0003\u001e\u000f"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000"+
		"\u0000\u0109\u0104\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u001f\u0001\u0000\u0000\u0000\u010b\u010c\u0003\"\u0011\u0000"+
		"\u010c!\u0001\u0000\u0000\u0000\u010d\u010e\u0003&\u0013\u0000\u010e\u010f"+
		"\u0003$\u0012\u0000\u010f#\u0001\u0000\u0000\u0000\u0110\u0111\u0005,"+
		"\u0000\u0000\u0111\u0112\u0003&\u0013\u0000\u0112\u0113\u0003$\u0012\u0000"+
		"\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000"+
		"\u0115\u0110\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0116%\u0001\u0000\u0000\u0000\u0117\u0118\u0003*\u0015\u0000\u0118\u0119"+
		"\u0003(\u0014\u0000\u0119\'\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"+\u0000\u0000\u011b\u011c\u0003*\u0015\u0000\u011c\u011d\u0003(\u0014"+
		"\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000"+
		"\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u0120)\u0001\u0000\u0000\u0000\u0121\u0122\u0005-\u0000\u0000\u0122"+
		"\u0125\u0003,\u0016\u0000\u0123\u0125\u0003,\u0016\u0000\u0124\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125+\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u00030\u0018\u0000\u0127\u0128\u0003.\u0017\u0000"+
		"\u0128-\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001e\u0000\u0000\u012a"+
		"\u012d\u00030\u0018\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d/\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u00034\u001a\u0000\u012f\u0130\u00032\u0019"+
		"\u0000\u01301\u0001\u0000\u0000\u0000\u0131\u0132\u0005&\u0000\u0000\u0132"+
		"\u0133\u00034\u001a\u0000\u0133\u0134\u00032\u0019\u0000\u0134\u013b\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005\'\u0000\u0000\u0136\u0137\u00034"+
		"\u001a\u0000\u0137\u0138\u00032\u0019\u0000\u0138\u013b\u0001\u0000\u0000"+
		"\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0131\u0001\u0000\u0000"+
		"\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000"+
		"\u0000\u013b3\u0001\u0000\u0000\u0000\u013c\u013d\u00038\u001c\u0000\u013d"+
		"\u013e\u00036\u001b\u0000\u013e5\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"(\u0000\u0000\u0140\u0141\u00038\u001c\u0000\u0141\u0142\u00036\u001b"+
		"\u0000\u0142\u014d\u0001\u0000\u0000\u0000\u0143\u0144\u0005)\u0000\u0000"+
		"\u0144\u0145\u00038\u001c\u0000\u0145\u0146\u00036\u001b\u0000\u0146\u014d"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0005*\u0000\u0000\u0148\u0149\u0003"+
		"8\u001c\u0000\u0149\u014a\u00036\u001b\u0000\u014a\u014d\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u013f\u0001\u0000\u0000"+
		"\u0000\u014c\u0143\u0001\u0000\u0000\u0000\u014c\u0147\u0001\u0000\u0000"+
		"\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d7\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\'\u0000\u0000\u014f\u0152\u0003:\u001d\u0000\u0150"+
		"\u0152\u0003:\u001d\u0000\u0151\u014e\u0001\u0000\u0000\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u01529\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"\u0015\u0000\u0000\u0154\u0155\u0003 \u0010\u0000\u0155\u0156\u0005\u0016"+
		"\u0000\u0000\u0156\u015a\u0001\u0000\u0000\u0000\u0157\u015a\u0003\u0018"+
		"\f\u0000\u0158\u015a\u0003>\u001f\u0000\u0159\u0153\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u015a;\u0001\u0000\u0000\u0000\u015b\u015c\u0007\u0001\u0000\u0000"+
		"\u015c=\u0001\u0000\u0000\u0000\u015d\u015e\u0007\u0002\u0000\u0000\u015e"+
		"?\u0001\u0000\u0000\u0000\u001cAFQ[nt|\u0087\u0090\u0097\u00a0\u00a8\u00b4"+
		"\u00be\u00ca\u00d5\u00ec\u00f5\u0102\u0109\u0115\u011f\u0124\u012c\u013a"+
		"\u014c\u0151\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}