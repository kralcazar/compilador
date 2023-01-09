// Generated from java-escape by ANTLR 4.11.1
package gramatica;

package gram;
import Main.*;
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
		RULE_sents = 9, RULE_sents_ = 10, RULE_sent = 11, RULE_casei = 12, RULE_endcase = 13, 
		RULE_reference = 14, RULE_idx = 15, RULE_idx_ = 16, RULE_contIdx = 17, 
		RULE_contIdx_ = 18, RULE_expr = 19, RULE_exprOr = 20, RULE_exprOr_ = 21, 
		RULE_exprAnd = 22, RULE_exprAnd_ = 23, RULE_exprNot = 24, RULE_exprComp = 25, 
		RULE_exprComp_ = 26, RULE_exprAdit = 27, RULE_exprAdit_ = 28, RULE_exprMult = 29, 
		RULE_exprMult_ = 30, RULE_exprNeg = 31, RULE_primary = 32, RULE_type = 33, 
		RULE_literal = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decl", "arrayDecl", "number", "header", "params", 
			"param", "sentsVoid", "sents", "sents_", "sent", "casei", "endcase", 
			"reference", "idx", "idx_", "contIdx", "contIdx_", "expr", "exprOr", 
			"exprOr_", "exprAnd", "exprAnd_", "exprNot", "exprComp", "exprComp_", 
			"exprAdit", "exprAdit_", "exprMult", "exprMult_", "exprNeg", "primary", 
			"type", "literal"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(70);
				main();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(73);
				decl();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			sentsVoid();
			setState(80);
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
			setState(82);
			match(MAIN);
			setState(83);
			match(BEGIN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(84);
				decl();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			sents();
			setState(91);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				type();
				setState(94);
				match(ID);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(95);
					match(ASSIGN);
					setState(96);
					expr();
					}
				}

				setState(99);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(CONSTANT);
				setState(102);
				type();
				setState(103);
				match(ID);
				setState(104);
				match(ASSIGN);
				setState(105);
				literal();
				setState(106);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				arrayDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(FUNCTION);
				setState(110);
				((DeclContext)_localctx).type = type();
				setState(111);
				header(((DeclContext)_localctx).type.dataType);
				setState(112);
				match(BEGIN);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(113);
					decl();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				sents();
				setState(120);
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
			setState(124);
			type();
			setState(125);
			match(ID);
			setState(126);
			match(LBRACK);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(127);
				number();
				setState(128);
				match(T__0);
				}
				break;
			}
			setState(132);
			number();
			setState(133);
			match(RBRACK);
			setState(134);
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
			setState(136);
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
			setState(138);
			match(ID);
			setState(139);
			match(LPAREN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				setState(140);
				params(_localctx.s);
				}
			}

			setState(143);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				param();
				setState(146);
				match(COMMA);
				setState(147);
				params(_localctx.prev.getNext());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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
			setState(152);
			type();
			setState(153);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
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
			setState(159);
			sent();
			setState(160);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				sent();
				setState(163);
				sents_();
				}
				break;
			case EOF:
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IF);
				setState(169);
				expr();
				setState(170);
				match(BEGIN);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(171);
					decl();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				sents();
				setState(178);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(IF);
				setState(181);
				expr();
				setState(182);
				match(BEGIN);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(183);
					decl();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				sents();
				setState(190);
				match(END);
				setState(191);
				match(ELSE);
				setState(192);
				match(BEGIN);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(193);
					decl();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				sents();
				setState(200);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(WHILE);
				setState(203);
				expr();
				setState(204);
				match(BEGIN);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
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
				sents();
				setState(212);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(DO);
				setState(215);
				match(BEGIN);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(216);
					decl();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				sents();
				setState(223);
				match(END);
				setState(224);
				match(WHILE);
				setState(225);
				expr();
				setState(226);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(RETURN);
				setState(229);
				expr();
				setState(230);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(RETURN);
				setState(233);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				reference(true);
				setState(235);
				match(ASSIGN);
				setState(236);
				expr();
				setState(237);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				reference(false);
				setState(240);
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
	public static class CaseiContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(eGramParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(eGramParser.COLON, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(eGramParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(eGramParser.SEMI, 0); }
		public CaseiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casei; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterCasei(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitCasei(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitCasei(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseiContext casei() throws RecognitionException {
		CaseiContext _localctx = new CaseiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_casei);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CASE);
			setState(245);
			expr();
			setState(246);
			match(COLON);
			setState(247);
			sents();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(248);
				match(BREAK);
				setState(249);
				match(SEMI);
				}
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
	public static class EndcaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(eGramParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(eGramParser.COLON, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public EndcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterEndcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitEndcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitEndcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndcaseContext endcase() throws RecognitionException {
		EndcaseContext _localctx = new EndcaseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endcase);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(DEFAULT);
				setState(253);
				match(COLON);
				setState(254);
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
	public static class ReferenceContext extends ParserRuleContext {
		public boolean assign;
		public Symbol s;
		public Tuple tuple;
		public boolean dimCheck;
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(eGramParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(eGramParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(eGramParser.RPAREN, 0); }
		public ContIdxContext contIdx() {
			return getRuleContext(ContIdxContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_reference);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				idx();
				setState(260);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(ID);
				setState(263);
				match(LPAREN);
				setState(264);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				contIdx();
				setState(266);
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
		public Tuple tuple;
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
		enterRule(_localctx, 30, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			match(LBRACK);
			setState(272);
			expr();
			setState(273);
			idx_(d);
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
		enterRule(_localctx, 32, RULE_idx_);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(RBRACK);
				setState(276);
				match(LBRACK);
				setState(277);
				expr();
				setState(278);
				idx_(d);
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
	public static class ContIdxContext extends ParserRuleContext {
		public Symbol s;
		public TerminalNode ID() { return getToken(eGramParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(eGramParser.LPAREN, 0); }
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
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterContIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitContIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitContIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContIdxContext contIdx() throws RecognitionException {
		ContIdxContext _localctx = new ContIdxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_contIdx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ID);
			setState(284);
			match(LPAREN);
			setState(285);
			expr();
			setState(286);
			contIdx_(pparams);
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
		enterRule(_localctx, 36, RULE_contIdx_);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(COMMA);
				setState(289);
				expr();
				setState(290);
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
		enterRule(_localctx, 38, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 40, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			exprAnd();
			setState(298);
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
		enterRule(_localctx, 42, RULE_exprOr_);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(OR);
				setState(301);
				exprAnd();
				setState(302);
				exprOr_();
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
		enterRule(_localctx, 44, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			exprNot();
			setState(308);
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
		enterRule(_localctx, 46, RULE_exprAnd_);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(AND);
				setState(311);
				exprNot();
				setState(312);
				exprAnd_();
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
		enterRule(_localctx, 48, RULE_exprNot);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(NOT);
				setState(318);
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
				setState(319);
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
		enterRule(_localctx, 50, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			exprAdit();
			setState(323);
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
		enterRule(_localctx, 52, RULE_exprComp_);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(OPREL);
				setState(326);
				exprAdit();
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
		enterRule(_localctx, 54, RULE_exprAdit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			exprMult();
			setState(331);
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
		enterRule(_localctx, 56, RULE_exprAdit_);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(ADD);
				setState(334);
				exprMult();
				setState(335);
				exprAdit_();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(SUB);
				setState(338);
				exprMult();
				setState(339);
				exprAdit_();
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
		enterRule(_localctx, 58, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			exprNeg();
			setState(345);
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
		enterRule(_localctx, 60, RULE_exprMult_);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(MULT);
				setState(348);
				exprNeg();
				setState(349);
				exprMult_();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(DIV);
				setState(352);
				exprNeg();
				setState(353);
				exprMult_();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(MOD);
				setState(356);
				exprNeg();
				setState(357);
				exprMult_();
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
		enterRule(_localctx, 62, RULE_exprNeg);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(SUB);
				setState(363);
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
				setState(364);
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
		enterRule(_localctx, 64, RULE_primary);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(LPAREN);
				setState(368);
				expr();
				setState(369);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				reference(false);
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
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
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		"\u0004\u00011\u017c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0000\u0003\u0000H\b\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f"+
		"\u0000N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001V\b\u0001\n\u0001\f\u0001Y\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002s\b\u0002\n\u0002\f\u0002v\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002{\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0083\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0097"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u009e"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a7"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ad"+
		"\b\u000b\n\u000b\f\u000b\u00b0\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b9\b\u000b"+
		"\n\u000b\f\u000b\u00bc\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00c3\b\u000b\n\u000b\f\u000b\u00c6\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00da\b\u000b\n\u000b\f\u000b\u00dd\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00f3\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00fb\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0101\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010d\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u011a\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0126\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0132\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u013c\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0141\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0149\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0157\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0169\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u016e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0176"+
		"\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0000\u0000#\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BD\u0000\u0003\u0002\u0000\u0012\u0012..\u0001\u0000\u0007"+
		"\t\u0001\u0000\u0012\u0014\u0184\u0000G\u0001\u0000\u0000\u0000\u0002"+
		"R\u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000\u0000\u0006|\u0001"+
		"\u0000\u0000\u0000\b\u0088\u0001\u0000\u0000\u0000\n\u008a\u0001\u0000"+
		"\u0000\u0000\f\u0096\u0001\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000"+
		"\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000\u0000"+
		"\u0000\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00f2\u0001\u0000\u0000"+
		"\u0000\u0018\u00f4\u0001\u0000\u0000\u0000\u001a\u0100\u0001\u0000\u0000"+
		"\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e\u010e\u0001\u0000\u0000"+
		"\u0000 \u0119\u0001\u0000\u0000\u0000\"\u011b\u0001\u0000\u0000\u0000"+
		"$\u0125\u0001\u0000\u0000\u0000&\u0127\u0001\u0000\u0000\u0000(\u0129"+
		"\u0001\u0000\u0000\u0000*\u0131\u0001\u0000\u0000\u0000,\u0133\u0001\u0000"+
		"\u0000\u0000.\u013b\u0001\u0000\u0000\u00000\u0140\u0001\u0000\u0000\u0000"+
		"2\u0142\u0001\u0000\u0000\u00004\u0148\u0001\u0000\u0000\u00006\u014a"+
		"\u0001\u0000\u0000\u00008\u0156\u0001\u0000\u0000\u0000:\u0158\u0001\u0000"+
		"\u0000\u0000<\u0168\u0001\u0000\u0000\u0000>\u016d\u0001\u0000\u0000\u0000"+
		"@\u0175\u0001\u0000\u0000\u0000B\u0177\u0001\u0000\u0000\u0000D\u0179"+
		"\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HL\u0001\u0000\u0000\u0000IK\u0003\u0004"+
		"\u0002\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0000\u0000\u0001"+
		"Q\u0001\u0001\u0000\u0000\u0000RS\u0005\u0002\u0000\u0000SW\u0005\u0019"+
		"\u0000\u0000TV\u0003\u0004\u0002\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0003\u0012\t\u0000"+
		"[\\\u0005\u001a\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000]^\u0003B!"+
		"\u0000^a\u0005.\u0000\u0000_`\u0005\u001f\u0000\u0000`b\u0003&\u0013\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0005\u001c\u0000\u0000d{\u0001\u0000\u0000\u0000ef\u0005\u0004"+
		"\u0000\u0000fg\u0003B!\u0000gh\u0005.\u0000\u0000hi\u0005\u001f\u0000"+
		"\u0000ij\u0003D\"\u0000jk\u0005\u001c\u0000\u0000k{\u0001\u0000\u0000"+
		"\u0000l{\u0003\u0006\u0003\u0000mn\u0005\u0005\u0000\u0000no\u0003B!\u0000"+
		"op\u0003\n\u0005\u0000pt\u0005\u0019\u0000\u0000qs\u0003\u0004\u0002\u0000"+
		"rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wx\u0003\u0012\t\u0000xy\u0005\u001a\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000z]\u0001\u0000\u0000\u0000ze\u0001\u0000\u0000\u0000zl\u0001"+
		"\u0000\u0000\u0000zm\u0001\u0000\u0000\u0000{\u0005\u0001\u0000\u0000"+
		"\u0000|}\u0003B!\u0000}~\u0005.\u0000\u0000~\u0082\u0005\u0017\u0000\u0000"+
		"\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005\u0001\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0003\b\u0004\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086\u0087"+
		"\u0005\u001c\u0000\u0000\u0087\u0007\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0007\u0000\u0000\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		".\u0000\u0000\u008b\u008d\u0005\u0015\u0000\u0000\u008c\u008e\u0003\f"+
		"\u0006\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0016"+
		"\u0000\u0000\u0090\u000b\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u000e"+
		"\u0007\u0000\u0092\u0093\u0005\u001b\u0000\u0000\u0093\u0094\u0003\f\u0006"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u000e\u0007"+
		"\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\r\u0001\u0000\u0000\u0000\u0098\u0099\u0003B!\u0000\u0099"+
		"\u009a\u0005.\u0000\u0000\u009a\u000f\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0003\u0012\t\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u0011\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a1\u0003"+
		"\u0014\n\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0016"+
		"\u000b\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u0015\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\f\u0000\u0000\u00a9\u00aa\u0003&\u0013\u0000"+
		"\u00aa\u00ae\u0005\u0019\u0000\u0000\u00ab\u00ad\u0003\u0004\u0002\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0003\u0012\t\u0000\u00b2\u00b3\u0005\u001a\u0000\u0000\u00b3"+
		"\u00f3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\f\u0000\u0000\u00b5\u00b6"+
		"\u0003&\u0013\u0000\u00b6\u00ba\u0005\u0019\u0000\u0000\u00b7\u00b9\u0003"+
		"\u0004\u0002\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0003\u0012\t\u0000\u00be\u00bf\u0005\u001a"+
		"\u0000\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c4\u0005\u0019\u0000"+
		"\u0000\u00c1\u00c3\u0003\u0004\u0002\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u0012\t\u0000"+
		"\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9\u00f3\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\n\u0000\u0000\u00cb\u00cc\u0003&\u0013\u0000\u00cc"+
		"\u00d0\u0005\u0019\u0000\u0000\u00cd\u00cf\u0003\u0004\u0002\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0003\u0012\t\u0000\u00d4\u00d5\u0005\u001a\u0000\u0000\u00d5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u000b\u0000\u0000\u00d7\u00db"+
		"\u0005\u0019\u0000\u0000\u00d8\u00da\u0003\u0004\u0002\u0000\u00d9\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0003\u0012\t\u0000\u00df\u00e0\u0005\u001a\u0000\u0000\u00e0\u00e1\u0005"+
		"\n\u0000\u0000\u00e1\u00e2\u0003&\u0013\u0000\u00e2\u00e3\u0005\u001c"+
		"\u0000\u0000\u00e3\u00f3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0006"+
		"\u0000\u0000\u00e5\u00e6\u0003&\u0013\u0000\u00e6\u00e7\u0005\u001c\u0000"+
		"\u0000\u00e7\u00f3\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0006\u0000"+
		"\u0000\u00e9\u00f3\u0005\u001c\u0000\u0000\u00ea\u00eb\u0003\u001c\u000e"+
		"\u0000\u00eb\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed\u0003&\u0013\u0000"+
		"\u00ed\u00ee\u0005\u001c\u0000\u0000\u00ee\u00f3\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0003\u001c\u000e\u0000\u00f0\u00f1\u0005\u001c\u0000\u0000"+
		"\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00a8\u0001\u0000\u0000\u0000"+
		"\u00f2\u00b4\u0001\u0000\u0000\u0000\u00f2\u00ca\u0001\u0000\u0000\u0000"+
		"\u00f2\u00d6\u0001\u0000\u0000\u0000\u00f2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00e8\u0001\u0000\u0000\u0000\u00f2\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f3\u0017\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u000f\u0000\u0000\u00f5\u00f6\u0003&\u0013\u0000\u00f6"+
		"\u00f7\u0005\u001d\u0000\u0000\u00f7\u00fa\u0003\u0012\t\u0000\u00f8\u00f9"+
		"\u0005\u0011\u0000\u0000\u00f9\u00fb\u0005\u001c\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0019"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0010\u0000\u0000\u00fd\u00fe"+
		"\u0005\u001d\u0000\u0000\u00fe\u0101\u0003\u0012\t\u0000\u00ff\u0101\u0001"+
		"\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u001b\u0001\u0000\u0000\u0000\u0102\u010d\u0005"+
		".\u0000\u0000\u0103\u0104\u0003\u001e\u000f\u0000\u0104\u0105\u0005\u0018"+
		"\u0000\u0000\u0105\u010d\u0001\u0000\u0000\u0000\u0106\u0107\u0005.\u0000"+
		"\u0000\u0107\u0108\u0005\u0015\u0000\u0000\u0108\u010d\u0005\u0016\u0000"+
		"\u0000\u0109\u010a\u0003\"\u0011\u0000\u010a\u010b\u0005\u0016\u0000\u0000"+
		"\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0102\u0001\u0000\u0000\u0000"+
		"\u010c\u0103\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000"+
		"\u010c\u0109\u0001\u0000\u0000\u0000\u010d\u001d\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005.\u0000\u0000\u010f\u0110\u0005\u0017\u0000\u0000\u0110"+
		"\u0111\u0003&\u0013\u0000\u0111\u0112\u0003 \u0010\u0000\u0112\u001f\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\u0018\u0000\u0000\u0114\u0115\u0005"+
		"\u0017\u0000\u0000\u0115\u0116\u0003&\u0013\u0000\u0116\u0117\u0003 \u0010"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000"+
		"\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a!\u0001\u0000\u0000\u0000\u011b\u011c\u0005.\u0000\u0000\u011c"+
		"\u011d\u0005\u0015\u0000\u0000\u011d\u011e\u0003&\u0013\u0000\u011e\u011f"+
		"\u0003$\u0012\u0000\u011f#\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u001b"+
		"\u0000\u0000\u0121\u0122\u0003&\u0013\u0000\u0122\u0123\u0003$\u0012\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000"+
		"\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126%\u0001\u0000\u0000\u0000\u0127\u0128\u0003(\u0014\u0000\u0128\'"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0003,\u0016\u0000\u012a\u012b\u0003"+
		"*\u0015\u0000\u012b)\u0001\u0000\u0000\u0000\u012c\u012d\u0005,\u0000"+
		"\u0000\u012d\u012e\u0003,\u0016\u0000\u012e\u012f\u0003*\u0015\u0000\u012f"+
		"\u0132\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131"+
		"\u012c\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132"+
		"+\u0001\u0000\u0000\u0000\u0133\u0134\u00030\u0018\u0000\u0134\u0135\u0003"+
		".\u0017\u0000\u0135-\u0001\u0000\u0000\u0000\u0136\u0137\u0005+\u0000"+
		"\u0000\u0137\u0138\u00030\u0018\u0000\u0138\u0139\u0003.\u0017\u0000\u0139"+
		"\u013c\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b"+
		"\u0136\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c"+
		"/\u0001\u0000\u0000\u0000\u013d\u013e\u0005-\u0000\u0000\u013e\u0141\u0003"+
		"2\u0019\u0000\u013f\u0141\u00032\u0019\u0000\u0140\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u01411\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u00036\u001b\u0000\u0143\u0144\u00034\u001a\u0000\u01443"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u001e\u0000\u0000\u0146\u0149"+
		"\u00036\u001b\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u01495\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0003:\u001d\u0000\u014b\u014c\u00038\u001c\u0000"+
		"\u014c7\u0001\u0000\u0000\u0000\u014d\u014e\u0005&\u0000\u0000\u014e\u014f"+
		"\u0003:\u001d\u0000\u014f\u0150\u00038\u001c\u0000\u0150\u0157\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005\'\u0000\u0000\u0152\u0153\u0003:\u001d"+
		"\u0000\u0153\u0154\u00038\u001c\u0000\u0154\u0157\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u014d\u0001\u0000\u0000\u0000"+
		"\u0156\u0151\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u01579\u0001\u0000\u0000\u0000\u0158\u0159\u0003>\u001f\u0000\u0159\u015a"+
		"\u0003<\u001e\u0000\u015a;\u0001\u0000\u0000\u0000\u015b\u015c\u0005("+
		"\u0000\u0000\u015c\u015d\u0003>\u001f\u0000\u015d\u015e\u0003<\u001e\u0000"+
		"\u015e\u0169\u0001\u0000\u0000\u0000\u015f\u0160\u0005)\u0000\u0000\u0160"+
		"\u0161\u0003>\u001f\u0000\u0161\u0162\u0003<\u001e\u0000\u0162\u0169\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005*\u0000\u0000\u0164\u0165\u0003>\u001f"+
		"\u0000\u0165\u0166\u0003<\u001e\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u015b\u0001\u0000\u0000\u0000"+
		"\u0168\u015f\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000"+
		"\u0168\u0167\u0001\u0000\u0000\u0000\u0169=\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\'\u0000\u0000\u016b\u016e\u0003@ \u0000\u016c\u016e\u0003"+
		"@ \u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000"+
		"\u0000\u016e?\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0015\u0000\u0000"+
		"\u0170\u0171\u0003&\u0013\u0000\u0171\u0172\u0005\u0016\u0000\u0000\u0172"+
		"\u0176\u0001\u0000\u0000\u0000\u0173\u0176\u0003\u001c\u000e\u0000\u0174"+
		"\u0176\u0003D\"\u0000\u0175\u016f\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176A\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0007\u0001\u0000\u0000\u0178C\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0007\u0002\u0000\u0000\u017aE\u0001\u0000\u0000"+
		"\u0000\u001eGLWatz\u0082\u008d\u0096\u009d\u00a6\u00ae\u00ba\u00c4\u00d0"+
		"\u00db\u00f2\u00fa\u0100\u010c\u0119\u0125\u0131\u013b\u0140\u0148\u0156"+
		"\u0168\u016d\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}