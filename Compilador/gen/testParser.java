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
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, VARIABLE=5, CONSTANT=6, FUNCTION=7, PROCEDURE=8, 
		RETURN=9, INTEGER=10, BOOLEAN=11, STRING=12, WHILE=13, IF=14, ELSE=15, 
		SWITCH=16, CASE=17, DEFAULT=18, BREAK=19, LiteralInteger=20, LiteralBoolean=21, 
		LiteralString=22, LPAREN=23, RPAREN=24, BEGIN=25, END=26, COMMA=27, SEMI=28, 
		OPREL=29, ASSIGN=30, EQUAL=31, NOTEQUAL=32, GT=33, LT=34, GE=35, LE=36, 
		ADD=37, SUB=38, MULT=39, DIV=40, MOD=41, AND=42, OR=43, NOT=44, ID=45, 
		WS=46, BLOCK_COMMENT=47, LINE_COMMENT=48;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_declArray = 2, RULE_declArray_ = 3, 
		RULE_numero = 4, RULE_encabezado = 5, RULE_parametros = 6, RULE_parametro = 7, 
		RULE_sents = 8, RULE_sents_ = 9, RULE_sent = 10, RULE_contcase = 11, RULE_contcase_ = 12, 
		RULE_caso = 13, RULE_endcase = 14, RULE_referencia = 15, RULE_idx = 16, 
		RULE_idx_ = 17, RULE_contIdx = 18, RULE_contIdx_ = 19, RULE_expr = 20, 
		RULE_exprOr = 21, RULE_exprOr_ = 22, RULE_exprAnd = 23, RULE_exprAnd_ = 24, 
		RULE_exprNot = 25, RULE_exprComp = 26, RULE_exprComp_ = 27, RULE_exprAdit = 28, 
		RULE_exprAdit_ = 29, RULE_exprMult = 30, RULE_exprMult_ = 31, RULE_exprNeg = 32, 
		RULE_primario = 33, RULE_tipo = 34, RULE_literal = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "declArray", "declArray_", "numero", "encabezado", 
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
			null, "']'", "'['", "'..'", "':'", "'var'", "'const'", "'func'", "'proc'", 
			"'return'", "'int'", "'boolean'", "'string'", "'while'", "'if'", "'else'", 
			"'switch'", "'case'", "'default'", "'break'", null, null, null, "'('", 
			"')'", "'{'", "'}'", "','", "';'", null, "'='", "'=='", "'!='", "'<'", 
			"'>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "VARIABLE", "CONSTANT", "FUNCTION", "PROCEDURE", 
			"RETURN", "INTEGER", "BOOLEAN", "STRING", "WHILE", "IF", "ELSE", "SWITCH", 
			"CASE", "DEFAULT", "BREAK", "LiteralInteger", "LiteralBoolean", "LiteralString", 
			"LPAREN", "RPAREN", "BEGIN", "END", "COMMA", "SEMI", "OPREL", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "GT", "LT", "GE", "LE", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "ID", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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


	public TablaSimbolos ts;
	int profCondRep; // Profundidad dentro de estructura condicional o repetitiva
	String errores="";
	String directorio;
	Deque<Simbolo> pproc=new ArrayDeque<Simbolo>(); // Pila de procedimientos
	public vajaParser(TokenStream input,String directorio){
		this(input);
		this.directorio=directorio;
	}

	@Override
	public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException ex)
	{
		String notificacion = "Error sintáctico - Línea " + offendingToken.getLine()
		+ ", Columna " + offendingToken.getCharPositionInLine() + ": \n\t ";
		String expected = msg;
		if(expected.contains("expecting")){
			expected = expected.substring(expected.indexOf("expecting") + 10);
			notificacion += "encontrado: '" + offendingToken.getText() + "' esperado: "+ expected;
		}else if(expected.contains("missing")){
			expected = expected.substring(expected.indexOf("missing") + 8);
			expected = expected.substring(0, expected.indexOf("at") - 1);
			notificacion += "encontrado: '" + offendingToken.getText() + "', falta "+ expected;
		}else if(expected.contains("alternative")){
			expected = expected.substring(expected.indexOf("input") + 6);
			notificacion += "no se reconoce " + expected;
		}
		notificacion = notificacion.replaceAll("Comparador","==, !=, <, >, <=, >=");
		notificacion = notificacion.replaceAll("OpBinSum","+, -");
		throw new RuntimeException(notificacion);
	}

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

				ts = new TablaSimbolos(directorio);
				// Insertar operaciones de input/output
				try {
					ts.inserta("read",new Simbolo("read",null,Simbolo.Tipo.FUNC,Simbolo.TSub.STRING));
					Simbolo arg = new Simbolo("argBool",null,Simbolo.Tipo.ARG,Simbolo.TSub.BOOLEAN);
					ts.inserta("printb", new Simbolo("printb",arg,Simbolo.Tipo.PROC, Simbolo.TSub.NULL));
					arg = new Simbolo("argInt",null,Simbolo.Tipo.ARG,Simbolo.TSub.INT);
					ts.inserta("printi", new Simbolo("printi",arg,Simbolo.Tipo.PROC, Simbolo.TSub.NULL));
					arg = new Simbolo("argString",null,Simbolo.Tipo.ARG,Simbolo.TSub.STRING);
					ts.inserta("prints", new Simbolo("prints",arg,Simbolo.Tipo.PROC, Simbolo.TSub.NULL));
				} catch (TablaSimbolos.TablaSimbolosException e) {}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
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
			sents();
			setState(80);
			match(EOF);

				ts.saleBloque();
				if(!errores.isEmpty()) {
					throw new RuntimeException(errores);
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
		public TipoContext tipo;
		public Token ID;
		public ExprContext expr;
		public LiteralContext literal;
		public Token FUNCTION;
		public EncabezadoContext encabezado;
		public Token PROCEDURE;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(testParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(testParser.CONSTANT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DeclArrayContext declArray() {
			return getRuleContext(DeclArrayContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(testParser.FUNCTION, 0); }
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(testParser.BEGIN, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode END() { return getToken(testParser.END, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode PROCEDURE() { return getToken(testParser.PROCEDURE, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((DeclContext)_localctx).tipo = tipo();
				setState(84);
				((DeclContext)_localctx).ID = match(ID);

					try{
						ts.inserta(((DeclContext)_localctx).ID.getText(),new Simbolo(((DeclContext)_localctx).ID.getText(),null,Simbolo.Tipo.VAR,((DeclContext)_localctx).tipo.tsub));
					} catch(TablaSimbolos.TablaSimbolosException e) {
						errores+="Error semántico - Línea "+((DeclContext)_localctx).ID.getLine()+": variable '"+((DeclContext)_localctx).ID.getText()+
						"' redeclarada\n";
					}
					
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(86);
					match(ASSIGN);
					setState(87);
					((DeclContext)_localctx).expr = expr();

							try{
								ts.consulta(((DeclContext)_localctx).ID.getText()).setInicializada(true);
							} catch(TablaSimbolos.TablaSimbolosException e) {
								errores+="Error semántico - Línea "+((DeclContext)_localctx).ID.getLine()+": variable '"+((DeclContext)_localctx).ID.getText()+
								"' no existe\n";
							}
							if(((DeclContext)_localctx).expr.tsub!=((DeclContext)_localctx).tipo.tsub) {
								errores+="Error semántico - Línea "+((DeclContext)_localctx).ID.getLine()+": tipos incompatibles (esperado '"+
								((DeclContext)_localctx).tipo.tsub+"', encontrado '"+((DeclContext)_localctx).expr.tsub+"')\n";
							}
							
					}
				}

				setState(92);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(CONSTANT);
				setState(95);
				((DeclContext)_localctx).tipo = tipo();
				setState(96);
				((DeclContext)_localctx).ID = match(ID);

					Simbolo s = null;
					try {
						ts.inserta(((DeclContext)_localctx).ID.getText(),new Simbolo(((DeclContext)_localctx).ID.getText(),null,Simbolo.Tipo.CONST,((DeclContext)_localctx).tipo.tsub));
						s = ts.consulta(((DeclContext)_localctx).ID.getText());
						s.setInicializada(true);
					} catch(TablaSimbolos.TablaSimbolosException e) {
						errores+="Error semántico - Línea "+((DeclContext)_localctx).ID.getLine()+": constante '"+((DeclContext)_localctx).ID.getText()+
						"' redeclarada\n";
					}
					
				setState(98);
				match(ASSIGN);
				setState(99);
				((DeclContext)_localctx).literal = literal();
				setState(100);
				match(SEMI);

						if(((DeclContext)_localctx).literal.tsub!=((DeclContext)_localctx).tipo.tsub) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).ID.getLine()+": tipos incompatibles (esperado '"+
							((DeclContext)_localctx).tipo.tsub+"')\n";
						}
						if(s!=null) {
							switch(((DeclContext)_localctx).literal.tsub) {
								case INT:
									s.setValor((((DeclContext)_localctx).literal!=null?_input.getText(((DeclContext)_localctx).literal.start,((DeclContext)_localctx).literal.stop):null));
									break;
								case BOOLEAN:
									if((((DeclContext)_localctx).literal!=null?_input.getText(((DeclContext)_localctx).literal.start,((DeclContext)_localctx).literal.stop):null).equals("true")) {
										s.setValor("-1");
									} else {
										s.setValor("0");
									}
									break;
								case STRING:
									s.setValor((((DeclContext)_localctx).literal!=null?_input.getText(((DeclContext)_localctx).literal.start,((DeclContext)_localctx).literal.stop):null));
									break;
								default:
									break;
							}
						}
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				declArray();
				setState(104);
				match(T__0);
				setState(105);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				((DeclContext)_localctx).FUNCTION = match(FUNCTION);
				setState(108);
				((DeclContext)_localctx).tipo = tipo();
				setState(109);
				((DeclContext)_localctx).encabezado = encabezado(((DeclContext)_localctx).tipo.tsub);
				setState(110);
				match(BEGIN);

						try {
							ts.inserta(((DeclContext)_localctx).encabezado.met.getId(),((DeclContext)_localctx).encabezado.met);
						} catch(TablaSimbolos.TablaSimbolosException e) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).FUNCTION.getLine()+": "+e.getMessage()+"\n";
						}
						ts=ts.entraBloque();
						pproc.push(((DeclContext)_localctx).encabezado.met);
						Simbolo param=((DeclContext)_localctx).encabezado.met.getNext();
						while(param!=null) {
							Simbolo aux=new Simbolo(param);
							aux.setInicializada(true);
							aux.setNext(null);
							try {
								ts.inserta(aux.getId(),aux);
							} catch(TablaSimbolos.TablaSimbolosException e) {
								errores+="Error semántico - Línea "+((DeclContext)_localctx).FUNCTION.getLine()+": "+e.getMessage()+"\n";
							}
							param=param.getNext();
						}
					
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
					{
					{
					setState(112);
					decl();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				sents();
				setState(119);
				match(END);

						ts=ts.saleBloque();
						pproc.pop();
						if(!((DeclContext)_localctx).encabezado.met.isReturnEncontrado()) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).FUNCTION.getLine()+
							": 'return' no encontrado para la función '"+((DeclContext)_localctx).encabezado.met.getId()+"'\n";
						}
						if(profCondRep!=0) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).FUNCTION.getLine()+
							": no se puede definir una función en una estructura condicional o repetitiva\n";
						}
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				((DeclContext)_localctx).PROCEDURE = match(PROCEDURE);
				setState(123);
				((DeclContext)_localctx).encabezado = encabezado(null);
				setState(124);
				match(BEGIN);

						try {
							ts.inserta(((DeclContext)_localctx).encabezado.met.getId(),((DeclContext)_localctx).encabezado.met);
						} catch(TablaSimbolos.TablaSimbolosException e) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).PROCEDURE.getLine()+": "+e.getMessage()+"\n";
						}
						ts=ts.entraBloque();
						pproc.push(((DeclContext)_localctx).encabezado.met);
						Simbolo param=((DeclContext)_localctx).encabezado.met.getNext();
						while(param!=null) {
							Simbolo aux=new Simbolo(param);
							aux.setInicializada(true);
							aux.setNext(null);
							try {
								ts.inserta(aux.getId(),aux);
							} catch(TablaSimbolos.TablaSimbolosException e) {
								errores+="Error semántico - Línea "+((DeclContext)_localctx).PROCEDURE.getLine()+": "+e.getMessage()+"\n";
							}
							param=param.getNext();
						}
					
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
					{
					{
					setState(126);
					decl();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				sents();
				setState(133);
				match(END);

						ts=ts.saleBloque();
						pproc.pop();
						if(((DeclContext)_localctx).encabezado.met.isReturnEncontrado()) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).PROCEDURE.getLine()+
							": 'return' encontrado para el procedimiento "+((DeclContext)_localctx).encabezado.met.getId()+"\n";
						}
						if(profCondRep!=0) {
							errores+="Error semántico - Línea "+((DeclContext)_localctx).PROCEDURE.getLine()+
							": no se puede definir un procedimiento en una estructura condicional o repetitiva\n";
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
	public static class DeclArrayContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public NumeroContext numero;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclArrayContext declArray() throws RecognitionException {
		DeclArrayContext _localctx = new DeclArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((DeclArrayContext)_localctx).tipo = tipo();
			setState(139);
			((DeclArrayContext)_localctx).ID = match(ID);
			setState(140);
			match(T__1);

					Simbolo s = new Simbolo(((DeclArrayContext)_localctx).ID.getText(),null,Simbolo.Tipo.VAR,Simbolo.TSub.NULL);
					Tabla dt = new Tabla(((DeclArrayContext)_localctx).tipo.tsub);
					s.setDt(dt);
					try{
						ts.inserta(((DeclArrayContext)_localctx).ID.getText(),s);
					} catch(TablaSimbolos.TablaSimbolosException e) {
						errores+="Error semántico - Línea "+((DeclArrayContext)_localctx).ID.getLine()+": variable '"+((DeclArrayContext)_localctx).ID.getText()+
						"' redeclarada\n";
					}
					int li = 0;
					boolean limites=false;
				
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(142);
				((DeclArrayContext)_localctx).numero = numero();
				setState(143);
				match(T__2);

						if(!((DeclArrayContext)_localctx).numero.constante) {
							errores+="Error semántico - Línea "+((DeclArrayContext)_localctx).ID.getLine()+
							": los límites del índice deben ser valores constantes\n";
						}
						li = ((DeclArrayContext)_localctx).numero.valor;
						limites=true;
					
				}
				break;
			}
			setState(148);
			((DeclArrayContext)_localctx).numero = numero();

					if(!((DeclArrayContext)_localctx).numero.constante) {
						errores+="Error semántico - Línea "+((DeclArrayContext)_localctx).ID.getLine()+
						": los límites del índice deben ser valores constantes\n";
					}
					int lf = ((DeclArrayContext)_localctx).numero.valor;
					if(!limites) {
						// Caso en el que se indica el tamaño
						if(lf<1) {
							errores+="Error semántico - Línea "+((DeclArrayContext)_localctx).ID.getLine()+
							": una tabla no puede ser de tamaño 0\n";
						} else {
							lf--; // Si se indica el tamaño, hay que corregir el limite superior
						}
					} else {
						// Caso en el que se indican los limites
						if(li>lf) {
							errores+="Error semántico - Línea "+(((DeclArrayContext)_localctx).numero!=null?(((DeclArrayContext)_localctx).numero.start):null).getLine()+
							": el límite inferior no puede ser mayor al superior\n";
						}
					}
					dt.nuevoIndice(li, lf);
				
			setState(150);
			declArray_(dt);

					dt.calcularDimensiones();
					dt.calcularB();
					dt.calcularEntradas();
				
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
		public Tabla dt;
		public NumeroContext numero;
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public DeclArray_Context declArray_() {
			return getRuleContext(DeclArray_Context.class,0);
		}
		public DeclArray_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclArray_Context(ParserRuleContext parent, int invokingState, Tabla dt) {
			super(parent, invokingState);
			this.dt = dt;
		}
		@Override public int getRuleIndex() { return RULE_declArray_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclArray_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclArray_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclArray_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclArray_Context declArray_(Tabla dt) throws RecognitionException {
		DeclArray_Context _localctx = new DeclArray_Context(_ctx, getState(), dt);
		enterRule(_localctx, 6, RULE_declArray_);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__0);
				setState(154);
				match(T__1);

						int li = 0;
						boolean limites=false;
					
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(156);
					((DeclArray_Context)_localctx).numero = numero();
					setState(157);
					match(T__2);

							if(!((DeclArray_Context)_localctx).numero.constante) {
								errores+="Error semántico - Línea "+(((DeclArray_Context)_localctx).numero!=null?(((DeclArray_Context)_localctx).numero.start):null).getLine()+
								": los límites del índice deben ser valores constantes\n";
							}
							li = ((DeclArray_Context)_localctx).numero.valor;
							limites=true;
						
					}
					break;
				}
				setState(162);
				((DeclArray_Context)_localctx).numero = numero();

						if(!((DeclArray_Context)_localctx).numero.constante) {
							errores+="Error semántico - Línea "+(((DeclArray_Context)_localctx).numero!=null?(((DeclArray_Context)_localctx).numero.start):null).getLine()+
							": los límites del índice deben ser valores constantes\n";
						}
						int lf = ((DeclArray_Context)_localctx).numero.valor;
						if(!limites) {
							// Caso en el que se indica el tamaño
							if(lf<1) {
								errores+="Error semántico - Línea "+(((DeclArray_Context)_localctx).numero!=null?(((DeclArray_Context)_localctx).numero.start):null).getLine()+
								": una tabla no puede ser de tamaño 0\n";
							} else {
								lf--; // Si se indica el tamaño, hay que corregir el limite superior
							}
						} else {
							// Caso en el que se indican los limites
							if(li>lf) {
								errores+="Error semántico - Línea "+(((DeclArray_Context)_localctx).numero!=null?(((DeclArray_Context)_localctx).numero.start):null).getLine()+
								": el límite inferior no puede ser mayor al superior\n";
							}
						}

						_localctx.dt.nuevoIndice(li, lf);
					
				setState(164);
				declArray_(_localctx.dt);
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
		public int valor;
		public boolean constante;
		public Token LiteralInteger;
		public Token ID;
		public TerminalNode LiteralInteger() { return getToken(testParser.LiteralInteger, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numero);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((NumeroContext)_localctx).LiteralInteger = match(LiteralInteger);

						((NumeroContext)_localctx).valor = Integer.parseInt(((NumeroContext)_localctx).LiteralInteger.getText());
						((NumeroContext)_localctx).constante = true;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((NumeroContext)_localctx).ID = match(ID);

						Simbolo s=null;
						try {
							s=ts.consulta(((NumeroContext)_localctx).ID.getText());
						} catch(TablaSimbolos.TablaSimbolosException e) {
							errores+="Error semántico - Línea "+((NumeroContext)_localctx).ID.getLine()+": "+e.getMessage()+"\n";
						}
						if(s!=null && s.getT()==Simbolo.Tipo.CONST) {
							((NumeroContext)_localctx).valor = Integer.parseInt(s.getValor());
							((NumeroContext)_localctx).constante = true;
						} else {
							errores+="Error semántico - Línea "+((NumeroContext)_localctx).ID.getLine()+
							": el limite debe ser un literal o una constante\n";
							((NumeroContext)_localctx).valor = 0;
							((NumeroContext)_localctx).constante = false;
						}

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
	public static class EncabezadoContext extends ParserRuleContext {
		public Simbolo.TSub tsub;
		public Simbolo met;
		public Token ID;
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(testParser.RPAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public EncabezadoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EncabezadoContext(ParserRuleContext parent, int invokingState, Simbolo.TSub tsub) {
			super(parent, invokingState);
			this.tsub = tsub;
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEncabezado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEncabezado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEncabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado(Simbolo.TSub tsub) throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState(), tsub);
		enterRule(_localctx, 10, RULE_encabezado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((EncabezadoContext)_localctx).ID = match(ID);

					if(_localctx.tsub!=null) {
						// Función
						((EncabezadoContext)_localctx).met =  new Simbolo(((EncabezadoContext)_localctx).ID.getText(),null,Simbolo.Tipo.FUNC,_localctx.tsub);
					} else {
						// Procedimiento
						((EncabezadoContext)_localctx).met =  new Simbolo(((EncabezadoContext)_localctx).ID.getText(),null,Simbolo.Tipo.PROC,Simbolo.TSub.NULL);
					}
				
			setState(177);
			match(LPAREN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) {
				{
				setState(178);
				parametros(_localctx.met);
				}
			}

			setState(181);
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
	public static class ParametrosContext extends ParserRuleContext {
		public Simbolo anterior;
		public ParametroContext parametro;
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(testParser.COMMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParametrosContext(ParserRuleContext parent, int invokingState, Simbolo anterior) {
			super(parent, invokingState);
			this.anterior = anterior;
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros(Simbolo anterior) throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState(), anterior);
		enterRule(_localctx, 12, RULE_parametros);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((ParametrosContext)_localctx).parametro = parametro();
				setState(184);
				match(COMMA);

						_localctx.anterior.setNext(((ParametrosContext)_localctx).parametro.s);
					
				setState(186);
				parametros(_localctx.anterior.getNext());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((ParametrosContext)_localctx).parametro = parametro();

						_localctx.anterior.setNext(((ParametrosContext)_localctx).parametro.s);
					
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
		public Simbolo s;
		public TipoContext tipo;
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((ParametroContext)_localctx).tipo = tipo();
			setState(194);
			((ParametroContext)_localctx).ID = match(ID);

				((ParametroContext)_localctx).s =  new Simbolo(((ParametroContext)_localctx).ID.getText(),null,Simbolo.Tipo.ARG,((ParametroContext)_localctx).tipo.tsub);

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
			if ( listener instanceof testListener ) ((testListener)listener).enterSents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentsContext sents() throws RecognitionException {
		SentsContext _localctx = new SentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			sent();
			setState(198);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterSents_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSents_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSents_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sents_Context sents_() throws RecognitionException {
		Sents_Context _localctx = new Sents_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_sents_);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case IF:
			case SWITCH:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				sent();
				setState(201);
				sents_();
				}
				break;
			case EOF:
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
		public Token IF;
		public ExprContext expr;
		public Token WHILE;
		public Token RETURN;
		public ReferenciaContext referencia;
		public Token ASSIGN;
		public Token SEMI;
		public TerminalNode IF() { return getToken(testParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> BEGIN() { return getTokens(testParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(testParser.BEGIN, i);
		}
		public List<SentsContext> sents() {
			return getRuleContexts(SentsContext.class);
		}
		public SentsContext sents(int i) {
			return getRuleContext(SentsContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(testParser.END); }
		public TerminalNode END(int i) {
			return getToken(testParser.END, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(testParser.ELSE, 0); }
		public ContcaseContext contcase() {
			return getRuleContext(ContcaseContext.class,0);
		}
		public EndcaseContext endcase() {
			return getRuleContext(EndcaseContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(testParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(testParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(testParser.SEMI, 0); }
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sent);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((SentContext)_localctx).IF = match(IF);
				setState(207);
				((SentContext)_localctx).expr = expr();

						if(((SentContext)_localctx).expr.tsub!=Simbolo.TSub.BOOLEAN) {
							errores+="Error semántico - Línea "+((SentContext)_localctx).IF.getLine()+
							": tipos incompatibles (esperado 'BOOLEAN', encontrado '"+((SentContext)_localctx).expr.tsub+"')\n";
						}
					
				setState(209);
				match(BEGIN);

						profCondRep++;
						ts=ts.entraBloque();
					
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
					{
					{
					setState(211);
					decl();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				sents();

						profCondRep--;
						ts=ts.saleBloque();
					
				setState(219);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				((SentContext)_localctx).IF = match(IF);
				setState(222);
				((SentContext)_localctx).expr = expr();

						if(((SentContext)_localctx).expr.tsub!=Simbolo.TSub.BOOLEAN) {
							errores+="Error semántico - Línea "+((SentContext)_localctx).IF.getLine()+
							": tipos incompatibles (esperado 'BOOLEAN', encontrado '"+((SentContext)_localctx).expr.tsub+
							"', encontrado '"+((SentContext)_localctx).expr.tsub+"')\n";
						}
					
				setState(224);
				match(BEGIN);

						profCondRep++;
						ts=ts.entraBloque();
					
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
					{
					{
					setState(226);
					decl();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				sents();

						ts=ts.saleBloque();
					
				setState(234);
				match(END);
				setState(235);
				match(ELSE);
				setState(236);
				match(BEGIN);

						ts=ts.entraBloque();
					
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
					{
					{
					setState(238);
					decl();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				sents();

						profCondRep--;
						ts=ts.saleBloque();
					
				setState(246);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				contcase();
				setState(249);
				endcase();

						profCondRep--;
					
				setState(251);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				((SentContext)_localctx).WHILE = match(WHILE);
				setState(254);
				((SentContext)_localctx).expr = expr();

						if(((SentContext)_localctx).expr.tsub!=Simbolo.TSub.BOOLEAN) {
							errores+="Error semántico - Línea "+((SentContext)_localctx).WHILE.getLine()+
							": tipos incompatibles (esperado 'BOOLEAN', encontrado '"+((SentContext)_localctx).expr.tsub+"')\n";
						}
					
				setState(256);
				match(BEGIN);

						profCondRep++;
						ts=ts.entraBloque();
					
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7616L) != 0) {
					{
					{
					setState(258);
					decl();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				sents();

						profCondRep--;
						ts=ts.saleBloque();
					
				setState(266);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				((SentContext)_localctx).RETURN = match(RETURN);
				setState(269);
				((SentContext)_localctx).expr = expr();
				setState(270);
				match(SEMI);

						Simbolo funcion;
						if(pproc.size()==0) {
							// Return fuera de una función
							errores+="Error semántico - Línea "+((SentContext)_localctx).RETURN.getLine()+": return fuera de función\n";
						} else {
							funcion=pproc.peek();
							if (funcion.getT()==Simbolo.Tipo.PROC) {
								// Return no vacío en un procedimiento
								errores+="Error semántico - Línea "+((SentContext)_localctx).RETURN.getLine()+
								": return de expresión en un procedimiento\n";
							} else if(funcion.tsub()!=((SentContext)_localctx).expr.tsub) {
								// Return de tipo incorrecto
								errores+="Error semántico - Línea "+((SentContext)_localctx).RETURN.getLine()+
								": return de tipo incorrecto (esperado '"+pproc.peek().tsub()+
								"', encontrado '"+((SentContext)_localctx).expr.tsub+"')\n";
							} else if(profCondRep==0) {
								// Return correcto
								pproc.peek().setReturnEncontrado(true);
							}
						}
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				((SentContext)_localctx).RETURN = match(RETURN);
				setState(274);
				match(SEMI);

						Simbolo procedure;
						if(pproc.size()==0) {
							// Return fuera de una función
							errores+="Error semántico - Línea "+((SentContext)_localctx).RETURN.getLine()+": return fuera de función\n";
						} else {
							procedure=pproc.peek();
							if (procedure.getT()==Simbolo.Tipo.FUNC) {
								// Return vacío en una función
								errores+="Error semántico - Línea "+((SentContext)_localctx).RETURN.getLine()+
								": return vacío en una función)\n";
							}
						}
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				((SentContext)_localctx).referencia = referencia(true);
				setState(277);
				((SentContext)_localctx).ASSIGN = match(ASSIGN);
				setState(278);
				((SentContext)_localctx).expr = expr();
				setState(279);
				match(SEMI);

						if(((SentContext)_localctx).referencia.s!=null) {
							if(((SentContext)_localctx).referencia.s.getT()==Simbolo.Tipo.CONST) {
								errores+="Error semántico - Línea "+((SentContext)_localctx).ASSIGN.getLine()+": "+((SentContext)_localctx).referencia.s.getId()+
								" es una constante\n";
							} else{
								Simbolo.TSub tsubyacente;
								if(((SentContext)_localctx).referencia.dt!=null && ((SentContext)_localctx).referencia.dimCorrectas) {
									tsubyacente = ((SentContext)_localctx).referencia.dt.tsubt(); // Tabla bien usada
								} else {
									tsubyacente = ((SentContext)_localctx).referencia.s.tsub(); // Demás casos
								}
								if(((SentContext)_localctx).referencia.s.getT()==Simbolo.Tipo.FUNC || tsubyacente==Simbolo.TSub.NULL) {
									errores+="Error semántico - Línea "+((SentContext)_localctx).ASSIGN.getLine()+
									": no se pueden asignar valores a esta referencia\n";
								} else if(tsubyacente!=((SentContext)_localctx).expr.tsub) {
										errores+="Error semántico - Línea "+((SentContext)_localctx).ASSIGN.getLine()+
										": asignación de tipo incorrecto (esperado '"+tsubyacente+
										"', encontrado '"+((SentContext)_localctx).expr.tsub+"')\n";
								}
							}
						}
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(282);
				((SentContext)_localctx).referencia = referencia(false);
				setState(283);
				((SentContext)_localctx).SEMI = match(SEMI);

						if(((SentContext)_localctx).referencia.s!=null) {
							if(((SentContext)_localctx).referencia.s.getT()!=Simbolo.Tipo.FUNC && ((SentContext)_localctx).referencia.s.getT()!=Simbolo.Tipo.PROC) {
								// Tiene que ser función o procedimiento
								errores+="Error semántico - Línea "+((SentContext)_localctx).SEMI.getLine()+
								": se esperaba una función o un procedimiento\n";
							}
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
	public static class ContcaseContext extends ParserRuleContext {
		public Token SWITCH;
		public ExprContext expr;
		public TerminalNode SWITCH() { return getToken(testParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(testParser.BEGIN, 0); }
		public Contcase_Context contcase_() {
			return getRuleContext(Contcase_Context.class,0);
		}
		public ContcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterContcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitContcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitContcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContcaseContext contcase() throws RecognitionException {
		ContcaseContext _localctx = new ContcaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ContcaseContext)_localctx).SWITCH = match(SWITCH);
			setState(289);
			((ContcaseContext)_localctx).expr = expr();

					if(((ContcaseContext)_localctx).expr.tsub!=Simbolo.TSub.INT) {
						errores+="Error semántico - Línea "+((ContcaseContext)_localctx).SWITCH.getLine()+
						": tipos incompatibles (esperado 'INT', encontrado '"+((ContcaseContext)_localctx).expr.tsub+"')\n";
					}
				
			setState(291);
			match(BEGIN);

					profCondRep++;
				
			setState(293);
			contcase_();
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
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public Contcase_Context contcase_() {
			return getRuleContext(Contcase_Context.class,0);
		}
		public Contcase_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contcase_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterContcase_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitContcase_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitContcase_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contcase_Context contcase_() throws RecognitionException {
		Contcase_Context _localctx = new Contcase_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_contcase_);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				caso();
				setState(296);
				contcase_();
				}
				break;
			case DEFAULT:
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
	public static class CasoContext extends ParserRuleContext {
		public Token CASE;
		public ExprContext expr;
		public TerminalNode CASE() { return getToken(testParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(testParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(testParser.SEMI, 0); }
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((CasoContext)_localctx).CASE = match(CASE);
			setState(302);
			((CasoContext)_localctx).expr = expr();

				if(((CasoContext)_localctx).expr.tsub!=Simbolo.TSub.INT) {
					errores+="Error semántico - Línea "+((CasoContext)_localctx).CASE.getLine()+
					": tipos incompatibles (esperado 'INT', encontrado '"+((CasoContext)_localctx).expr.tsub+"')\n";
				}

			setState(304);
			match(T__3);
			setState(305);
			sents();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(306);
				match(BREAK);
				setState(307);
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
		public TerminalNode DEFAULT() { return getToken(testParser.DEFAULT, 0); }
		public SentsContext sents() {
			return getRuleContext(SentsContext.class,0);
		}
		public EndcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEndcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEndcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEndcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndcaseContext endcase() throws RecognitionException {
		EndcaseContext _localctx = new EndcaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_endcase);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(DEFAULT);
				setState(311);
				match(T__3);
				setState(312);
				sents();
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
		public boolean asignacion;
		public Simbolo s;
		public Tabla dt;
		public boolean dimCorrectas;
		public Token ID;
		public IdxContext idx;
		public ContIdxContext contIdx;
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(testParser.RPAREN, 0); }
		public ContIdxContext contIdx() {
			return getRuleContext(ContIdxContext.class,0);
		}
		public ReferenciaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState, boolean asignacion) {
			super(parent, invokingState);
			this.asignacion = asignacion;
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitReferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitReferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenciaContext referencia(boolean asignacion) throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState(), asignacion);
		enterRule(_localctx, 30, RULE_referencia);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((ReferenciaContext)_localctx).ID = match(ID);

						try {
							((ReferenciaContext)_localctx).s = ts.consulta(((ReferenciaContext)_localctx).ID.getText());
							if(_localctx.asignacion) {
								_localctx.s.setInicializada(true);
							} else {
								if(!_localctx.s.isInicializada()) {
									errores+="Error semántico - Línea "+((ReferenciaContext)_localctx).ID.getLine()+": '"+((ReferenciaContext)_localctx).ID.getText()+
									"' no ha sido inicializada\n";
								}
							}
						} catch(TablaSimbolos.TablaSimbolosException e) {
							errores+="Error semántico - Línea "+((ReferenciaContext)_localctx).ID.getLine()+": "+e.getMessage()+"\n";
							((ReferenciaContext)_localctx).s = null;
						}
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((ReferenciaContext)_localctx).idx = idx();
				setState(319);
				match(T__0);

						((ReferenciaContext)_localctx).dt =  ((ReferenciaContext)_localctx).idx.dt;
						((ReferenciaContext)_localctx).s =  ((ReferenciaContext)_localctx).idx.t;
						if(_localctx.dt!=null) {
							// Comprobar la cantidad de indirecciones usadas
							int d = _localctx.dt.dimensiones();
							if(((ReferenciaContext)_localctx).idx.dimensiones<d) {
								errores+="Error semántico - Línea "+(((ReferenciaContext)_localctx).idx!=null?(((ReferenciaContext)_localctx).idx.start):null).getLine()+
								": la tabla tiene más dimensiones\n";
								((ReferenciaContext)_localctx).dimCorrectas = false;
							} else if(((ReferenciaContext)_localctx).idx.dimensiones>d){
								errores+="Error semántico - Línea "+(((ReferenciaContext)_localctx).idx!=null?(((ReferenciaContext)_localctx).idx.start):null).getLine()+
								": la tabla no tiene tantas dimensiones\n";
								((ReferenciaContext)_localctx).dimCorrectas = false;
							} else {
								((ReferenciaContext)_localctx).dimCorrectas = true;
							}
						}
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				((ReferenciaContext)_localctx).ID = match(ID);
				setState(323);
				match(LPAREN);
				setState(324);
				match(RPAREN);

						try {
							((ReferenciaContext)_localctx).s = ts.consulta(((ReferenciaContext)_localctx).ID.getText());
							if(_localctx.s.getNext()!=null) {
								errores+="Error semántico - Línea "+((ReferenciaContext)_localctx).ID.getLine()+": falta(n) argumento(s) para "+
								((ReferenciaContext)_localctx).ID.getText()+"\n";
							}
						} catch(TablaSimbolos.TablaSimbolosException e) {
							errores+="Error semántico - Línea "+((ReferenciaContext)_localctx).ID.getLine()+": "+e.getMessage()+"\n";
							((ReferenciaContext)_localctx).s = null;
						}
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				((ReferenciaContext)_localctx).contIdx = contIdx();
				setState(327);
				match(RPAREN);

						((ReferenciaContext)_localctx).s = ((ReferenciaContext)_localctx).contIdx.met;
					
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
		public Simbolo t;
		public int dimensiones;
		public Tabla dt;
		public Token ID;
		public ExprContext expr;
		public Idx_Context idx_;
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdxContext idx() throws RecognitionException {
		IdxContext _localctx = new IdxContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((IdxContext)_localctx).ID = match(ID);
			setState(333);
			match(T__1);
			setState(334);
			((IdxContext)_localctx).expr = expr();

				int d = 1;
				try {
					((IdxContext)_localctx).t =  ts.consulta(((IdxContext)_localctx).ID.getText());
				} catch(TablaSimbolos.TablaSimbolosException e) {
					errores+="Error semántico - Línea "+((IdxContext)_localctx).ID.getLine()+": "+e.getMessage()+"\n";
				}
				if(((IdxContext)_localctx).expr.tsub!=Simbolo.TSub.INT) {
					errores+="Error semántico - Línea "+(((IdxContext)_localctx).expr!=null?(((IdxContext)_localctx).expr.start):null).getLine()+": "+(((IdxContext)_localctx).expr!=null?_input.getText(((IdxContext)_localctx).expr.start,((IdxContext)_localctx).expr.stop):null)+
					" no es un valor numérico\n";
				}
				if(_localctx.t!=null) {
					((IdxContext)_localctx).dt = _localctx.t.getDt();
					if(_localctx.dt==null) {
						errores+="Error semántico - Línea "+((IdxContext)_localctx).ID.getLine()+": "+((IdxContext)_localctx).ID.getText()+
						" no es una tabla\n";
					}
				}

			setState(336);
			((IdxContext)_localctx).idx_ = idx_(d);

				((IdxContext)_localctx).dimensiones =  ((IdxContext)_localctx).idx_.dimensiones;

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
		public int dimensiones1;
		public int dimensiones;
		public ExprContext expr;
		public Idx_Context idx_;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Idx_Context idx_() {
			return getRuleContext(Idx_Context.class,0);
		}
		public Idx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Idx_Context(ParserRuleContext parent, int invokingState, int dimensiones1) {
			super(parent, invokingState);
			this.dimensiones1 = dimensiones1;
		}
		@Override public int getRuleIndex() { return RULE_idx_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterIdx_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitIdx_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitIdx_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idx_Context idx_(int dimensiones1) throws RecognitionException {
		Idx_Context _localctx = new Idx_Context(_ctx, getState(), dimensiones1);
		enterRule(_localctx, 34, RULE_idx_);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(T__0);
				setState(340);
				match(T__1);
				setState(341);
				((Idx_Context)_localctx).expr = expr();

						if(((Idx_Context)_localctx).expr.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((Idx_Context)_localctx).expr!=null?(((Idx_Context)_localctx).expr.start):null).getLine()+": "+(((Idx_Context)_localctx).expr!=null?_input.getText(((Idx_Context)_localctx).expr.start,((Idx_Context)_localctx).expr.stop):null)+
							" no es un valor numérico\n";
						}
						int d = _localctx.dimensiones1 + 1;
					
				setState(343);
				((Idx_Context)_localctx).idx_ = idx_(d);

						((Idx_Context)_localctx).dimensiones = ((Idx_Context)_localctx).idx_.dimensiones;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

					((Idx_Context)_localctx).dimensiones = _localctx.dimensiones1;

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
		public Simbolo met;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterContIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitContIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitContIdx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContIdxContext contIdx() throws RecognitionException {
		ContIdxContext _localctx = new ContIdxContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contIdx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((ContIdxContext)_localctx).ID = match(ID);
			setState(350);
			match(LPAREN);
			setState(351);
			((ContIdxContext)_localctx).expr = expr();

					Deque<Simbolo.TSub> pparams=new ArrayDeque<Simbolo.TSub>();
					try {
						((ContIdxContext)_localctx).met = ts.consulta(((ContIdxContext)_localctx).ID.getText());
						pparams.add(((ContIdxContext)_localctx).expr.tsub);
					} catch(TablaSimbolos.TablaSimbolosException e) {
						errores+="Error semántico - Línea "+((ContIdxContext)_localctx).ID.getLine()+": "+e.getMessage()+"\n";
						((ContIdxContext)_localctx).met = null;
					}
				
			setState(353);
			contIdx_(pparams);

					if(_localctx.met!=null) {
						Simbolo.TSub aux;
						Simbolo param=_localctx.met;
						param=param.getNext();
						while(pparams.size()!=0) {
							aux=pparams.remove();
							if(param==null) {
								errores+="Error semántico - Línea "+((ContIdxContext)_localctx).ID.getLine()+
								": demasiados argumentos para "+((ContIdxContext)_localctx).ID.getText()+"\n";
								break;
							} else if(aux!=param.tsub()) {
								errores+="Error semántico - Línea "+((ContIdxContext)_localctx).ID.getLine()+
								": tipos incompatibles (esperado '"+param.tsub()+
								"', encontrado '"+aux+"')\n";
								break;
							}
							param=param.getNext();
						}
						if(param!=null) {
							errores+="Error semántico - Línea "+((ContIdxContext)_localctx).ID.getLine()+": falta(n) argumento(s) para "+
							((ContIdxContext)_localctx).ID.getText()+"\n";
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
	public static class ContIdx_Context extends ParserRuleContext {
		public Deque<Simbolo.TSub> pparams;
		public ExprContext expr;
		public TerminalNode COMMA() { return getToken(testParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContIdx_Context contIdx_() {
			return getRuleContext(ContIdx_Context.class,0);
		}
		public ContIdx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ContIdx_Context(ParserRuleContext parent, int invokingState, Deque<Simbolo.TSub> pparams) {
			super(parent, invokingState);
			this.pparams = pparams;
		}
		@Override public int getRuleIndex() { return RULE_contIdx_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterContIdx_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitContIdx_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitContIdx_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContIdx_Context contIdx_(Deque<Simbolo.TSub> pparams) throws RecognitionException {
		ContIdx_Context _localctx = new ContIdx_Context(_ctx, getState(), pparams);
		enterRule(_localctx, 38, RULE_contIdx_);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(COMMA);
				setState(357);
				((ContIdx_Context)_localctx).expr = expr();

					_localctx.pparams.add(((ContIdx_Context)_localctx).expr.tsub);

				setState(359);
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
		public Simbolo.TSub tsub;
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((ExprContext)_localctx).exprOr = exprOr();

					((ExprContext)_localctx).tsub = ((ExprContext)_localctx).exprOr.tsub;
				
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
		public Simbolo.TSub tsub;
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOrContext exprOr() throws RecognitionException {
		ExprOrContext _localctx = new ExprOrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((ExprOrContext)_localctx).exprAnd = exprAnd();
			setState(368);
			((ExprOrContext)_localctx).exprOr_ = exprOr_();

					if(((ExprOrContext)_localctx).exprOr_.tsub!=null) {
						if(((ExprOrContext)_localctx).exprAnd.tsub!=((ExprOrContext)_localctx).exprOr_.tsub) {
							errores+="Error semántico - Línea "+(((ExprOrContext)_localctx).exprOr_!=null?(((ExprOrContext)_localctx).exprOr_.start):null).getLine()+
							": tipos incompatibles (esperado "+((ExprOrContext)_localctx).exprAnd.tsub+","+
							" encontrado "+((ExprOrContext)_localctx).exprOr_.tsub+")\n";
						}
						((ExprOrContext)_localctx).tsub = ((ExprOrContext)_localctx).exprOr_.tsub;
					} else {
						((ExprOrContext)_localctx).tsub = ((ExprOrContext)_localctx).exprAnd.tsub;
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
		public Simbolo.TSub tsub;
		public ExprAndContext exprAnd;
		public TerminalNode OR() { return getToken(testParser.OR, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprOr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprOr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprOr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOr_Context exprOr_() throws RecognitionException {
		ExprOr_Context _localctx = new ExprOr_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprOr_);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(OR);
				setState(372);
				((ExprOr_Context)_localctx).exprAnd = exprAnd();
				setState(373);
				exprOr_();

						if(((ExprOr_Context)_localctx).exprAnd.tsub!=Simbolo.TSub.BOOLEAN){
							errores+="Error semántico - Línea "+(((ExprOr_Context)_localctx).exprAnd!=null?(((ExprOr_Context)_localctx).exprAnd.start):null).getLine()+
								": tipos incompatibles (esperado BOOLEAN, encontrado "+((ExprOr_Context)_localctx).exprAnd.tsub+")\n";
						}
						((ExprOr_Context)_localctx).tsub = Simbolo.TSub.BOOLEAN;
					
				}
				break;
			case T__0:
			case T__3:
			case RPAREN:
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
		public Simbolo.TSub tsub;
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAndContext exprAnd() throws RecognitionException {
		ExprAndContext _localctx = new ExprAndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((ExprAndContext)_localctx).exprNot = exprNot();
			setState(380);
			((ExprAndContext)_localctx).exprAnd_ = exprAnd_();

					if(((ExprAndContext)_localctx).exprAnd_.tsub!=null) {
						if(((ExprAndContext)_localctx).exprNot.tsub!=((ExprAndContext)_localctx).exprAnd_.tsub) {
							errores+="Error semántico - Línea "+(((ExprAndContext)_localctx).exprAnd_!=null?(((ExprAndContext)_localctx).exprAnd_.start):null).getLine()+
							": tipos incompatibles (esperado "+((ExprAndContext)_localctx).exprNot.tsub+","+
							" encontrado "+((ExprAndContext)_localctx).exprAnd_.tsub+")\n";
						}
						((ExprAndContext)_localctx).tsub = ((ExprAndContext)_localctx).exprAnd_.tsub;
					} else {
						((ExprAndContext)_localctx).tsub = ((ExprAndContext)_localctx).exprNot.tsub;
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
		public Simbolo.TSub tsub;
		public ExprNotContext exprNot;
		public TerminalNode AND() { return getToken(testParser.AND, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprAnd_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprAnd_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprAnd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAnd_Context exprAnd_() throws RecognitionException {
		ExprAnd_Context _localctx = new ExprAnd_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprAnd_);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(AND);
				setState(384);
				((ExprAnd_Context)_localctx).exprNot = exprNot();
				setState(385);
				exprAnd_();

						if(((ExprAnd_Context)_localctx).exprNot.tsub!=Simbolo.TSub.BOOLEAN){
							errores+="Error semántico - Línea "+(((ExprAnd_Context)_localctx).exprNot!=null?(((ExprAnd_Context)_localctx).exprNot.start):null).getLine()+
								": tipos incompatibles (esperado BOOLEAN, encontrado "+((ExprAnd_Context)_localctx).exprNot.tsub+")\n";
						}
						((ExprAnd_Context)_localctx).tsub = Simbolo.TSub.BOOLEAN;
					
				}
				break;
			case T__0:
			case T__3:
			case RPAREN:
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
		public Simbolo.TSub tsub;
		public ExprCompContext exprComp;
		public TerminalNode NOT() { return getToken(testParser.NOT, 0); }
		public ExprCompContext exprComp() {
			return getRuleContext(ExprCompContext.class,0);
		}
		public ExprNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNotContext exprNot() throws RecognitionException {
		ExprNotContext _localctx = new ExprNotContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprNot);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(NOT);
				setState(392);
				((ExprNotContext)_localctx).exprComp = exprComp();

						if(((ExprNotContext)_localctx).exprComp.tsub!=Simbolo.TSub.BOOLEAN) {
							errores+="Error semántico - Línea "+(((ExprNotContext)_localctx).exprComp!=null?(((ExprNotContext)_localctx).exprComp.start):null).getLine()+
							": tipos incompatibles (esperado BOOLEAN, encontrado "+((ExprNotContext)_localctx).exprComp.tsub+")\n";
						}
						((ExprNotContext)_localctx).tsub = Simbolo.TSub.BOOLEAN;

					
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
				setState(395);
				((ExprNotContext)_localctx).exprComp = exprComp();

						((ExprNotContext)_localctx).tsub = ((ExprNotContext)_localctx).exprComp.tsub;
					
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
		public Simbolo.TSub tsub;
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCompContext exprComp() throws RecognitionException {
		ExprCompContext _localctx = new ExprCompContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((ExprCompContext)_localctx).exprAdit = exprAdit();
			setState(401);
			((ExprCompContext)_localctx).exprComp_ = exprComp_();

					if(((ExprCompContext)_localctx).exprComp_.tsub!=null) {
						if(((ExprCompContext)_localctx).exprAdit.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprCompContext)_localctx).exprComp_!=null?(((ExprCompContext)_localctx).exprComp_.start):null).getLine()+
							": tipos incompatibles (esperado INT,"+
							" encontrado "+((ExprCompContext)_localctx).exprComp_.tsub+")\n";
							((ExprCompContext)_localctx).tsub = Simbolo.TSub.BOOLEAN;
						}
						((ExprCompContext)_localctx).tsub = ((ExprCompContext)_localctx).exprComp_.tsub;
					} else {
						((ExprCompContext)_localctx).tsub = ((ExprCompContext)_localctx).exprAdit.tsub;
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
		public Simbolo.TSub tsub;
		public ExprAditContext exprAdit;
		public TerminalNode OPREL() { return getToken(testParser.OPREL, 0); }
		public ExprAditContext exprAdit() {
			return getRuleContext(ExprAditContext.class,0);
		}
		public ExprComp_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComp_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExprComp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprComp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprComp_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprComp_Context exprComp_() throws RecognitionException {
		ExprComp_Context _localctx = new ExprComp_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprComp_);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(OPREL);
				setState(405);
				((ExprComp_Context)_localctx).exprAdit = exprAdit();

						if(((ExprComp_Context)_localctx).exprAdit.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprComp_Context)_localctx).exprAdit!=null?(((ExprComp_Context)_localctx).exprAdit.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprComp_Context)_localctx).exprAdit.tsub+")\n";
						}
						((ExprComp_Context)_localctx).tsub = Simbolo.TSub.BOOLEAN;
					
				}
				break;
			case T__0:
			case T__3:
			case RPAREN:
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
		public Simbolo.TSub tsub;
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprAdit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprAdit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprAdit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAditContext exprAdit() throws RecognitionException {
		ExprAditContext _localctx = new ExprAditContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exprAdit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			((ExprAditContext)_localctx).exprMult = exprMult();
			setState(412);
			((ExprAditContext)_localctx).exprAdit_ = exprAdit_();

					if(((ExprAditContext)_localctx).exprAdit_.tsub!=null) {
						if(((ExprAditContext)_localctx).exprMult.tsub!=((ExprAditContext)_localctx).exprAdit_.tsub) {
							errores+="Error semántico - Línea "+(((ExprAditContext)_localctx).exprAdit_!=null?(((ExprAditContext)_localctx).exprAdit_.start):null).getLine()+
							": tipos incompatibles (esperado "+((ExprAditContext)_localctx).exprMult.tsub+","+
							" encontrado "+((ExprAditContext)_localctx).exprAdit_.tsub+")\n";
						}
						((ExprAditContext)_localctx).tsub = ((ExprAditContext)_localctx).exprAdit_.tsub;
					} else {
						((ExprAditContext)_localctx).tsub = ((ExprAditContext)_localctx).exprMult.tsub;
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
		public Simbolo.TSub tsub;
		public ExprMultContext exprMult;
		public TerminalNode ADD() { return getToken(testParser.ADD, 0); }
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdit_Context exprAdit_() {
			return getRuleContext(ExprAdit_Context.class,0);
		}
		public TerminalNode SUB() { return getToken(testParser.SUB, 0); }
		public ExprAdit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAdit_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExprAdit_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprAdit_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprAdit_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAdit_Context exprAdit_() throws RecognitionException {
		ExprAdit_Context _localctx = new ExprAdit_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprAdit_);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(ADD);
				setState(416);
				((ExprAdit_Context)_localctx).exprMult = exprMult();
				setState(417);
				exprAdit_();

						if(((ExprAdit_Context)_localctx).exprMult.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprAdit_Context)_localctx).exprMult!=null?(((ExprAdit_Context)_localctx).exprMult.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprAdit_Context)_localctx).exprMult.tsub+")\n";
						}
						((ExprAdit_Context)_localctx).tsub = Simbolo.TSub.INT;
					
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(SUB);
				setState(421);
				((ExprAdit_Context)_localctx).exprMult = exprMult();
				setState(422);
				exprAdit_();

						if(((ExprAdit_Context)_localctx).exprMult.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprAdit_Context)_localctx).exprMult!=null?(((ExprAdit_Context)_localctx).exprMult.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprAdit_Context)_localctx).exprMult.tsub+")\n";
						}
						((ExprAdit_Context)_localctx).tsub = Simbolo.TSub.INT;
					
				}
				break;
			case T__0:
			case T__3:
			case RPAREN:
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
		public Simbolo.TSub tsub;
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
			if ( listener instanceof testListener ) ((testListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultContext exprMult() throws RecognitionException {
		ExprMultContext _localctx = new ExprMultContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			((ExprMultContext)_localctx).exprNeg = exprNeg();
			setState(429);
			((ExprMultContext)_localctx).exprMult_ = exprMult_();

					if(((ExprMultContext)_localctx).exprMult_.tsub!=null) {
						if(((ExprMultContext)_localctx).exprNeg.tsub!=((ExprMultContext)_localctx).exprMult_.tsub) {
							errores+="Error semántico - Línea "+(((ExprMultContext)_localctx).exprMult_!=null?(((ExprMultContext)_localctx).exprMult_.start):null).getLine()+
							": tipos incompatibles (esperado "+((ExprMultContext)_localctx).exprMult_.tsub+","+
							" encontrado "+((ExprMultContext)_localctx).exprNeg.tsub+")\n";
						}
						((ExprMultContext)_localctx).tsub = ((ExprMultContext)_localctx).exprMult_.tsub;
					} else {
						((ExprMultContext)_localctx).tsub = ((ExprMultContext)_localctx).exprNeg.tsub;
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
		public Simbolo.TSub tsub;
		public ExprNegContext exprNeg;
		public TerminalNode MULT() { return getToken(testParser.MULT, 0); }
		public ExprNegContext exprNeg() {
			return getRuleContext(ExprNegContext.class,0);
		}
		public ExprMult_Context exprMult_() {
			return getRuleContext(ExprMult_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(testParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(testParser.MOD, 0); }
		public ExprMult_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMult_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExprMult_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprMult_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprMult_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMult_Context exprMult_() throws RecognitionException {
		ExprMult_Context _localctx = new ExprMult_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprMult_);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(MULT);
				setState(433);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(434);
				exprMult_();

						if(((ExprMult_Context)_localctx).exprNeg.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprMult_Context)_localctx).exprNeg.tsub+")\n";
						}
						((ExprMult_Context)_localctx).tsub = Simbolo.TSub.INT;
					
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(DIV);
				setState(438);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(439);
				exprMult_();

						if(((ExprMult_Context)_localctx).exprNeg.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprMult_Context)_localctx).exprNeg.tsub+")\n";
						} else if(((ExprMult_Context)_localctx).exprNeg.cero) {
							errores+="Error semántico - Línea "+(((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine()+
							": división por cero\n";
						}
						((ExprMult_Context)_localctx).tsub = Simbolo.TSub.INT;
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(MOD);
				setState(443);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(444);
				exprMult_();

						if(((ExprMult_Context)_localctx).exprNeg.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprMult_Context)_localctx).exprNeg.tsub+")\n";
						} else if(((ExprMult_Context)_localctx).exprNeg.cero) {
							errores+="Error semántico - Línea "+(((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine()+
							": módulo por cero\n";
						}
						((ExprMult_Context)_localctx).tsub = Simbolo.TSub.INT;
					
				}
				break;
			case T__0:
			case T__3:
			case RPAREN:
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
		public Simbolo.TSub tsub;
		public boolean cero;
		public PrimarioContext primario;
		public TerminalNode SUB() { return getToken(testParser.SUB, 0); }
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public ExprNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNegContext exprNeg() throws RecognitionException {
		ExprNegContext _localctx = new ExprNegContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprNeg);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(SUB);
				setState(451);
				((ExprNegContext)_localctx).primario = primario();

						if(((ExprNegContext)_localctx).primario.tsub!=Simbolo.TSub.INT) {
							errores+="Error semántico - Línea "+(((ExprNegContext)_localctx).primario!=null?(((ExprNegContext)_localctx).primario.start):null).getLine()+
							": tipos incompatibles (esperado INT, encontrado "+((ExprNegContext)_localctx).primario.tsub+")\n";
						}
						((ExprNegContext)_localctx).tsub = Simbolo.TSub.INT;
						((ExprNegContext)_localctx).cero = ((ExprNegContext)_localctx).primario.cero;
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				((ExprNegContext)_localctx).primario = primario();

						((ExprNegContext)_localctx).tsub = ((ExprNegContext)_localctx).primario.tsub;
						((ExprNegContext)_localctx).cero = ((ExprNegContext)_localctx).primario.cero;
					
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
		public Simbolo.TSub tsub;
		public boolean cero;
		public ExprContext expr;
		public ReferenciaContext referencia;
		public LiteralContext literal;
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(testParser.RPAREN, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPrimario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPrimario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primario);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(LPAREN);
				setState(460);
				((PrimarioContext)_localctx).expr = expr();
				setState(461);
				match(RPAREN);

						((PrimarioContext)_localctx).tsub = ((PrimarioContext)_localctx).expr.tsub;
						((PrimarioContext)_localctx).cero = false;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				((PrimarioContext)_localctx).referencia = referencia(false);

						if(((PrimarioContext)_localctx).referencia.s==null) {
							errores+="Error semántico - Línea "+(((PrimarioContext)_localctx).referencia!=null?(((PrimarioContext)_localctx).referencia.start):null).getLine()+
							": tipos incompatibles (encontrado NULL)\n";
							((PrimarioContext)_localctx).tsub = Simbolo.TSub.NULL;
						} else {
							((PrimarioContext)_localctx).tsub = ((PrimarioContext)_localctx).referencia.s.tsub();
							if(((PrimarioContext)_localctx).referencia.s.getT()==Simbolo.Tipo.CONST && ((PrimarioContext)_localctx).referencia.s.tsub()==Simbolo.TSub.INT) {
								((PrimarioContext)_localctx).cero = ((PrimarioContext)_localctx).referencia.s.getValor().equals("0");
							} else if(((PrimarioContext)_localctx).referencia.dt!=null && ((PrimarioContext)_localctx).referencia.dimCorrectas) {
								((PrimarioContext)_localctx).tsub = ((PrimarioContext)_localctx).referencia.s.getDt().tsubt(); // Para los elementos de tablas
							}
						}
					
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				((PrimarioContext)_localctx).literal = literal();

						((PrimarioContext)_localctx).tsub = ((PrimarioContext)_localctx).literal.tsub;
						((PrimarioContext)_localctx).cero = ((PrimarioContext)_localctx).literal.cero;
					
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
		public Simbolo.TSub tsub;
		public TerminalNode INTEGER() { return getToken(testParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(testParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tipo);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(INTEGER);

						((TipoContext)_localctx).tsub = Simbolo.TSub.INT;
					
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(BOOLEAN);

						((TipoContext)_localctx).tsub = Simbolo.TSub.BOOLEAN;
					
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(STRING);

						((TipoContext)_localctx).tsub = Simbolo.TSub.STRING;
					
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
		public Simbolo.TSub tsub;
		public boolean cero;
		public Token LiteralInteger;
		public TerminalNode LiteralInteger() { return getToken(testParser.LiteralInteger, 0); }
		public TerminalNode LiteralBoolean() { return getToken(testParser.LiteralBoolean, 0); }
		public TerminalNode LiteralString() { return getToken(testParser.LiteralString, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				((LiteralContext)_localctx).LiteralInteger = match(LiteralInteger);

						((LiteralContext)_localctx).tsub = Simbolo.TSub.INT;
						((LiteralContext)_localctx).cero = ((LiteralContext)_localctx).LiteralInteger.getText().equals("0");
					
				}
				break;
			case LiteralBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(LiteralBoolean);

						((LiteralContext)_localctx).tsub = Simbolo.TSub.BOOLEAN;
						((LiteralContext)_localctx).cero = false;
					
				}
				break;
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(LiteralString);

						((LiteralContext)_localctx).tsub = Simbolo.TSub.STRING;
						((LiteralContext)_localctx).cero = false;
					
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
		"\u0004\u00010\u01e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f\u0000"+
		"N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"r\b\u0001\n\u0001\f\u0001u\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0080\b\u0001\n\u0001\f\u0001\u0083\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0089\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0093\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a1\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a8\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ae\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b4\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c0\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00d5\b\n\n\n\f\n\u00d8\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00e4\b\n\n\n\f\n\u00e7\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00f0\b\n\n\n\f\n\u00f3\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0104\b\n\n\n\f\n\u0107\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u011f\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u012c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0135\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u013b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u014b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u015c\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u016b\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u017a\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0186\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u018f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u019a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01ab\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c1\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01ca\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01d7\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01df"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01e7\b#\u0001#"+
		"\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0000\u01f6\u0000"+
		"H\u0001\u0000\u0000\u0000\u0002\u0088\u0001\u0000\u0000\u0000\u0004\u008a"+
		"\u0001\u0000\u0000\u0000\u0006\u00a7\u0001\u0000\u0000\u0000\b\u00ad\u0001"+
		"\u0000\u0000\u0000\n\u00af\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000"+
		"\u0000\u0000\u000e\u00c1\u0001\u0000\u0000\u0000\u0010\u00c5\u0001\u0000"+
		"\u0000\u0000\u0012\u00cc\u0001\u0000\u0000\u0000\u0014\u011e\u0001\u0000"+
		"\u0000\u0000\u0016\u0120\u0001\u0000\u0000\u0000\u0018\u012b\u0001\u0000"+
		"\u0000\u0000\u001a\u012d\u0001\u0000\u0000\u0000\u001c\u013a\u0001\u0000"+
		"\u0000\u0000\u001e\u014a\u0001\u0000\u0000\u0000 \u014c\u0001\u0000\u0000"+
		"\u0000\"\u015b\u0001\u0000\u0000\u0000$\u015d\u0001\u0000\u0000\u0000"+
		"&\u016a\u0001\u0000\u0000\u0000(\u016c\u0001\u0000\u0000\u0000*\u016f"+
		"\u0001\u0000\u0000\u0000,\u0179\u0001\u0000\u0000\u0000.\u017b\u0001\u0000"+
		"\u0000\u00000\u0185\u0001\u0000\u0000\u00002\u018e\u0001\u0000\u0000\u0000"+
		"4\u0190\u0001\u0000\u0000\u00006\u0199\u0001\u0000\u0000\u00008\u019b"+
		"\u0001\u0000\u0000\u0000:\u01aa\u0001\u0000\u0000\u0000<\u01ac\u0001\u0000"+
		"\u0000\u0000>\u01c0\u0001\u0000\u0000\u0000@\u01c9\u0001\u0000\u0000\u0000"+
		"B\u01d6\u0001\u0000\u0000\u0000D\u01de\u0001\u0000\u0000\u0000F\u01e6"+
		"\u0001\u0000\u0000\u0000HL\u0006\u0000\uffff\uffff\u0000IK\u0003\u0002"+
		"\u0001\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0000\u0000\u0001"+
		"QR\u0006\u0000\uffff\uffff\u0000R\u0001\u0001\u0000\u0000\u0000ST\u0003"+
		"D\"\u0000TU\u0005-\u0000\u0000UZ\u0006\u0001\uffff\uffff\u0000VW\u0005"+
		"\u001e\u0000\u0000WX\u0003(\u0014\u0000XY\u0006\u0001\uffff\uffff\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u001c\u0000\u0000]\u0089\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0006\u0000\u0000_`\u0003D\"\u0000`a\u0005"+
		"-\u0000\u0000ab\u0006\u0001\uffff\uffff\u0000bc\u0005\u001e\u0000\u0000"+
		"cd\u0003F#\u0000de\u0005\u001c\u0000\u0000ef\u0006\u0001\uffff\uffff\u0000"+
		"f\u0089\u0001\u0000\u0000\u0000gh\u0003\u0004\u0002\u0000hi\u0005\u0001"+
		"\u0000\u0000ij\u0005\u001c\u0000\u0000j\u0089\u0001\u0000\u0000\u0000"+
		"kl\u0005\u0007\u0000\u0000lm\u0003D\"\u0000mn\u0003\n\u0005\u0000no\u0005"+
		"\u0019\u0000\u0000os\u0006\u0001\uffff\uffff\u0000pr\u0003\u0002\u0001"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0003\u0010\b\u0000wx\u0005\u001a\u0000\u0000xy\u0006"+
		"\u0001\uffff\uffff\u0000y\u0089\u0001\u0000\u0000\u0000z{\u0005\b\u0000"+
		"\u0000{|\u0003\n\u0005\u0000|}\u0005\u0019\u0000\u0000}\u0081\u0006\u0001"+
		"\uffff\uffff\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u0010\b\u0000"+
		"\u0085\u0086\u0005\u001a\u0000\u0000\u0086\u0087\u0006\u0001\uffff\uffff"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088S\u0001\u0000\u0000\u0000"+
		"\u0088^\u0001\u0000\u0000\u0000\u0088g\u0001\u0000\u0000\u0000\u0088k"+
		"\u0001\u0000\u0000\u0000\u0088z\u0001\u0000\u0000\u0000\u0089\u0003\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0003D\"\u0000\u008b\u008c\u0005-\u0000"+
		"\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u0092\u0006\u0002\uffff"+
		"\uffff\u0000\u008e\u008f\u0003\b\u0004\u0000\u008f\u0090\u0005\u0003\u0000"+
		"\u0000\u0090\u0091\u0006\u0002\uffff\uffff\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0003\b\u0004"+
		"\u0000\u0095\u0096\u0006\u0002\uffff\uffff\u0000\u0096\u0097\u0003\u0006"+
		"\u0003\u0000\u0097\u0098\u0006\u0002\uffff\uffff\u0000\u0098\u0005\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b\u0005"+
		"\u0002\u0000\u0000\u009b\u00a0\u0006\u0003\uffff\uffff\u0000\u009c\u009d"+
		"\u0003\b\u0004\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0006"+
		"\u0003\uffff\uffff\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009c"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\b\u0004\u0000\u00a3\u00a4\u0006"+
		"\u0003\uffff\uffff\u0000\u00a4\u00a5\u0003\u0006\u0003\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u0099"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u0007"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000\u00aa\u00ae"+
		"\u0006\u0004\uffff\uffff\u0000\u00ab\u00ac\u0005-\u0000\u0000\u00ac\u00ae"+
		"\u0006\u0004\uffff\uffff\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\t\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005-\u0000\u0000\u00b0\u00b1\u0006\u0005\uffff\uffff\u0000\u00b1\u00b3"+
		"\u0005\u0017\u0000\u0000\u00b2\u00b4\u0003\f\u0006\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0018\u0000\u0000\u00b6\u000b\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0003\u000e\u0007\u0000\u00b8\u00b9\u0005"+
		"\u001b\u0000\u0000\u00b9\u00ba\u0006\u0006\uffff\uffff\u0000\u00ba\u00bb"+
		"\u0003\f\u0006\u0000\u00bb\u00c0\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003"+
		"\u000e\u0007\u0000\u00bd\u00be\u0006\u0006\uffff\uffff\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00bf\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c0\r\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003"+
		"D\"\u0000\u00c2\u00c3\u0005-\u0000\u0000\u00c3\u00c4\u0006\u0007\uffff"+
		"\uffff\u0000\u00c4\u000f\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\u0014"+
		"\n\u0000\u00c6\u00c7\u0003\u0012\t\u0000\u00c7\u0011\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0003\u0014\n\u0000\u00c9\u00ca\u0003\u0012\t\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u0013\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u000e\u0000\u0000"+
		"\u00cf\u00d0\u0003(\u0014\u0000\u00d0\u00d1\u0006\n\uffff\uffff\u0000"+
		"\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00d6\u0006\n\uffff\uffff\u0000"+
		"\u00d3\u00d5\u0003\u0002\u0001\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u0010\b\u0000\u00da"+
		"\u00db\u0006\n\uffff\uffff\u0000\u00db\u00dc\u0005\u001a\u0000\u0000\u00dc"+
		"\u011f\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de"+
		"\u00df\u0003(\u0014\u0000\u00df\u00e0\u0006\n\uffff\uffff\u0000\u00e0"+
		"\u00e1\u0005\u0019\u0000\u0000\u00e1\u00e5\u0006\n\uffff\uffff\u0000\u00e2"+
		"\u00e4\u0003\u0002\u0001\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\u0010\b\u0000\u00e9\u00ea"+
		"\u0006\n\uffff\uffff\u0000\u00ea\u00eb\u0005\u001a\u0000\u0000\u00eb\u00ec"+
		"\u0005\u000f\u0000\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000\u00ed\u00f1"+
		"\u0006\n\uffff\uffff\u0000\u00ee\u00f0\u0003\u0002\u0001\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0003\u0010\b\u0000\u00f5\u00f6\u0006\n\uffff\uffff\u0000\u00f6\u00f7"+
		"\u0005\u001a\u0000\u0000\u00f7\u011f\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0003\u0016\u000b\u0000\u00f9\u00fa\u0003\u001c\u000e\u0000\u00fa\u00fb"+
		"\u0006\n\uffff\uffff\u0000\u00fb\u00fc\u0005\u001a\u0000\u0000\u00fc\u011f"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\r\u0000\u0000\u00fe\u00ff\u0003"+
		"(\u0014\u0000\u00ff\u0100\u0006\n\uffff\uffff\u0000\u0100\u0101\u0005"+
		"\u0019\u0000\u0000\u0101\u0105\u0006\n\uffff\uffff\u0000\u0102\u0104\u0003"+
		"\u0002\u0001\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001"+
		"\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0003\u0010\b\u0000\u0109\u010a\u0006\n"+
		"\uffff\uffff\u0000\u010a\u010b\u0005\u001a\u0000\u0000\u010b\u011f\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0005\t\u0000\u0000\u010d\u010e\u0003("+
		"\u0014\u0000\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0110\u0006\n\uffff"+
		"\uffff\u0000\u0110\u011f\u0001\u0000\u0000\u0000\u0111\u0112\u0005\t\u0000"+
		"\u0000\u0112\u0113\u0005\u001c\u0000\u0000\u0113\u011f\u0006\n\uffff\uffff"+
		"\u0000\u0114\u0115\u0003\u001e\u000f\u0000\u0115\u0116\u0005\u001e\u0000"+
		"\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\u0118\u0005\u001c\u0000\u0000"+
		"\u0118\u0119\u0006\n\uffff\uffff\u0000\u0119\u011f\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0003\u001e\u000f\u0000\u011b\u011c\u0005\u001c\u0000\u0000"+
		"\u011c\u011d\u0006\n\uffff\uffff\u0000\u011d\u011f\u0001\u0000\u0000\u0000"+
		"\u011e\u00ce\u0001\u0000\u0000\u0000\u011e\u00dd\u0001\u0000\u0000\u0000"+
		"\u011e\u00f8\u0001\u0000\u0000\u0000\u011e\u00fd\u0001\u0000\u0000\u0000"+
		"\u011e\u010c\u0001\u0000\u0000\u0000\u011e\u0111\u0001\u0000\u0000\u0000"+
		"\u011e\u0114\u0001\u0000\u0000\u0000\u011e\u011a\u0001\u0000\u0000\u0000"+
		"\u011f\u0015\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0010\u0000\u0000"+
		"\u0121\u0122\u0003(\u0014\u0000\u0122\u0123\u0006\u000b\uffff\uffff\u0000"+
		"\u0123\u0124\u0005\u0019\u0000\u0000\u0124\u0125\u0006\u000b\uffff\uffff"+
		"\u0000\u0125\u0126\u0003\u0018\f\u0000\u0126\u0017\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0003\u001a\r\u0000\u0128\u0129\u0003\u0018\f\u0000\u0129"+
		"\u012c\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0127\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u0019\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0011\u0000\u0000\u012e"+
		"\u012f\u0003(\u0014\u0000\u012f\u0130\u0006\r\uffff\uffff\u0000\u0130"+
		"\u0131\u0005\u0004\u0000\u0000\u0131\u0134\u0003\u0010\b\u0000\u0132\u0133"+
		"\u0005\u0013\u0000\u0000\u0133\u0135\u0005\u001c\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u001b"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0012\u0000\u0000\u0137\u0138"+
		"\u0005\u0004\u0000\u0000\u0138\u013b\u0003\u0010\b\u0000\u0139\u013b\u0001"+
		"\u0000\u0000\u0000\u013a\u0136\u0001\u0000\u0000\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u001d\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"-\u0000\u0000\u013d\u014b\u0006\u000f\uffff\uffff\u0000\u013e\u013f\u0003"+
		" \u0010\u0000\u013f\u0140\u0005\u0001\u0000\u0000\u0140\u0141\u0006\u000f"+
		"\uffff\uffff\u0000\u0141\u014b\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"-\u0000\u0000\u0143\u0144\u0005\u0017\u0000\u0000\u0144\u0145\u0005\u0018"+
		"\u0000\u0000\u0145\u014b\u0006\u000f\uffff\uffff\u0000\u0146\u0147\u0003"+
		"$\u0012\u0000\u0147\u0148\u0005\u0018\u0000\u0000\u0148\u0149\u0006\u000f"+
		"\uffff\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u013c\u0001"+
		"\u0000\u0000\u0000\u014a\u013e\u0001\u0000\u0000\u0000\u014a\u0142\u0001"+
		"\u0000\u0000\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014b\u001f\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005-\u0000\u0000\u014d\u014e\u0005\u0002"+
		"\u0000\u0000\u014e\u014f\u0003(\u0014\u0000\u014f\u0150\u0006\u0010\uffff"+
		"\uffff\u0000\u0150\u0151\u0003\"\u0011\u0000\u0151\u0152\u0006\u0010\uffff"+
		"\uffff\u0000\u0152!\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0001\u0000"+
		"\u0000\u0154\u0155\u0005\u0002\u0000\u0000\u0155\u0156\u0003(\u0014\u0000"+
		"\u0156\u0157\u0006\u0011\uffff\uffff\u0000\u0157\u0158\u0003\"\u0011\u0000"+
		"\u0158\u0159\u0006\u0011\uffff\uffff\u0000\u0159\u015c\u0001\u0000\u0000"+
		"\u0000\u015a\u015c\u0006\u0011\uffff\uffff\u0000\u015b\u0153\u0001\u0000"+
		"\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c#\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0005-\u0000\u0000\u015e\u015f\u0005\u0017\u0000\u0000"+
		"\u015f\u0160\u0003(\u0014\u0000\u0160\u0161\u0006\u0012\uffff\uffff\u0000"+
		"\u0161\u0162\u0003&\u0013\u0000\u0162\u0163\u0006\u0012\uffff\uffff\u0000"+
		"\u0163%\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001b\u0000\u0000\u0165"+
		"\u0166\u0003(\u0014\u0000\u0166\u0167\u0006\u0013\uffff\uffff\u0000\u0167"+
		"\u0168\u0003&\u0013\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u016b"+
		"\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\'\u0001\u0000\u0000\u0000\u016c\u016d\u0003"+
		"*\u0015\u0000\u016d\u016e\u0006\u0014\uffff\uffff\u0000\u016e)\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0003.\u0017\u0000\u0170\u0171\u0003,\u0016\u0000"+
		"\u0171\u0172\u0006\u0015\uffff\uffff\u0000\u0172+\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0005+\u0000\u0000\u0174\u0175\u0003.\u0017\u0000\u0175\u0176"+
		"\u0003,\u0016\u0000\u0176\u0177\u0006\u0016\uffff\uffff\u0000\u0177\u017a"+
		"\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0173"+
		"\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a-\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u00032\u0019\u0000\u017c\u017d\u00030\u0018"+
		"\u0000\u017d\u017e\u0006\u0017\uffff\uffff\u0000\u017e/\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005*\u0000\u0000\u0180\u0181\u00032\u0019\u0000\u0181"+
		"\u0182\u00030\u0018\u0000\u0182\u0183\u0006\u0018\uffff\uffff\u0000\u0183"+
		"\u0186\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185"+
		"\u017f\u0001\u0000\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186"+
		"1\u0001\u0000\u0000\u0000\u0187\u0188\u0005,\u0000\u0000\u0188\u0189\u0003"+
		"4\u001a\u0000\u0189\u018a\u0006\u0019\uffff\uffff\u0000\u018a\u018f\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u00034\u001a\u0000\u018c\u018d\u0006\u0019"+
		"\uffff\uffff\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0187\u0001"+
		"\u0000\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018f3\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u00038\u001c\u0000\u0191\u0192\u00036\u001b\u0000"+
		"\u0192\u0193\u0006\u001a\uffff\uffff\u0000\u01935\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0005\u001d\u0000\u0000\u0195\u0196\u00038\u001c\u0000\u0196"+
		"\u0197\u0006\u001b\uffff\uffff\u0000\u0197\u019a\u0001\u0000\u0000\u0000"+
		"\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0194\u0001\u0000\u0000\u0000"+
		"\u0199\u0198\u0001\u0000\u0000\u0000\u019a7\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0003<\u001e\u0000\u019c\u019d\u0003:\u001d\u0000\u019d\u019e\u0006"+
		"\u001c\uffff\uffff\u0000\u019e9\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"%\u0000\u0000\u01a0\u01a1\u0003<\u001e\u0000\u01a1\u01a2\u0003:\u001d"+
		"\u0000\u01a2\u01a3\u0006\u001d\uffff\uffff\u0000\u01a3\u01ab\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0005&\u0000\u0000\u01a5\u01a6\u0003<\u001e\u0000"+
		"\u01a6\u01a7\u0003:\u001d\u0000\u01a7\u01a8\u0006\u001d\uffff\uffff\u0000"+
		"\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000"+
		"\u01aa\u019f\u0001\u0000\u0000\u0000\u01aa\u01a4\u0001\u0000\u0000\u0000"+
		"\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab;\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0003@ \u0000\u01ad\u01ae\u0003>\u001f\u0000\u01ae\u01af\u0006"+
		"\u001e\uffff\uffff\u0000\u01af=\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"\'\u0000\u0000\u01b1\u01b2\u0003@ \u0000\u01b2\u01b3\u0003>\u001f\u0000"+
		"\u01b3\u01b4\u0006\u001f\uffff\uffff\u0000\u01b4\u01c1\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0005(\u0000\u0000\u01b6\u01b7\u0003@ \u0000\u01b7"+
		"\u01b8\u0003>\u001f\u0000\u01b8\u01b9\u0006\u001f\uffff\uffff\u0000\u01b9"+
		"\u01c1\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005)\u0000\u0000\u01bb\u01bc"+
		"\u0003@ \u0000\u01bc\u01bd\u0003>\u001f\u0000\u01bd\u01be\u0006\u001f"+
		"\uffff\uffff\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c0\u01b0\u0001\u0000\u0000\u0000\u01c0\u01b5\u0001"+
		"\u0000\u0000\u0000\u01c0\u01ba\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c1?\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005&\u0000"+
		"\u0000\u01c3\u01c4\u0003B!\u0000\u01c4\u01c5\u0006 \uffff\uffff\u0000"+
		"\u01c5\u01ca\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003B!\u0000\u01c7\u01c8"+
		"\u0006 \uffff\uffff\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01caA\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0005\u0017\u0000\u0000\u01cc\u01cd\u0003"+
		"(\u0014\u0000\u01cd\u01ce\u0005\u0018\u0000\u0000\u01ce\u01cf\u0006!\uffff"+
		"\uffff\u0000\u01cf\u01d7\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003\u001e"+
		"\u000f\u0000\u01d1\u01d2\u0006!\uffff\uffff\u0000\u01d2\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0003F#\u0000\u01d4\u01d5\u0006!\uffff\uffff"+
		"\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01cb\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d0\u0001\u0000\u0000\u0000\u01d6\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d7C\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\n\u0000\u0000"+
		"\u01d9\u01df\u0006\"\uffff\uffff\u0000\u01da\u01db\u0005\u000b\u0000\u0000"+
		"\u01db\u01df\u0006\"\uffff\uffff\u0000\u01dc\u01dd\u0005\f\u0000\u0000"+
		"\u01dd\u01df\u0006\"\uffff\uffff\u0000\u01de\u01d8\u0001\u0000\u0000\u0000"+
		"\u01de\u01da\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dfE\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\u0014\u0000\u0000\u01e1"+
		"\u01e7\u0006#\uffff\uffff\u0000\u01e2\u01e3\u0005\u0015\u0000\u0000\u01e3"+
		"\u01e7\u0006#\uffff\uffff\u0000\u01e4\u01e5\u0005\u0016\u0000\u0000\u01e5"+
		"\u01e7\u0006#\uffff\uffff\u0000\u01e6\u01e0\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7"+
		"G\u0001\u0000\u0000\u0000!LZs\u0081\u0088\u0092\u00a0\u00a7\u00ad\u00b3"+
		"\u00bf\u00cc\u00d6\u00e5\u00f1\u0105\u011e\u012b\u0134\u013a\u014a\u015b"+
		"\u016a\u0179\u0185\u018e\u0199\u01aa\u01c0\u01c9\u01d6\u01de\u01e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}