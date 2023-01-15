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
		RULE_program = 0, RULE_main = 1, RULE_decl = 2, RULE_arrayDecl = 3, RULE_arrayDecl_ = 4, 
		RULE_number = 5, RULE_header = 6, RULE_params = 7, RULE_param = 8, RULE_sentsVoid = 9, 
		RULE_sents = 10, RULE_sents_ = 11, RULE_sent = 12, RULE_reference = 13, 
		RULE_idx = 14, RULE_idx_ = 15, RULE_contIdx = 16, RULE_contIdx_ = 17, 
		RULE_expr = 18, RULE_exprOr = 19, RULE_exprOr_ = 20, RULE_exprAnd = 21, 
		RULE_exprAnd_ = 22, RULE_exprNot = 23, RULE_exprComp = 24, RULE_exprComp_ = 25, 
		RULE_exprAdit = 26, RULE_exprAdit_ = 27, RULE_exprMult = 28, RULE_exprMult_ = 29, 
		RULE_exprNeg = 30, RULE_primary = 31, RULE_type = 32, RULE_literal = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decl", "arrayDecl", "arrayDecl_", "number", "header", 
			"params", "param", "sentsVoid", "sents", "sents_", "sent", "reference", 
			"idx", "idx_", "contIdx", "contIdx_", "expr", "exprOr", "exprOr_", "exprAnd", 
			"exprAnd_", "exprNot", "exprComp", "exprComp_", "exprAdit", "exprAdit_", 
			"exprMult", "exprMult_", "exprNeg", "primary", "type", "literal"
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


	public SymbolTable symbolTable;
	int depthCondition;
	String errors="";
	String folder;
	Deque<Symbol> proceduresStack = new ArrayDeque<Symbol>();

	//El constructor aquí no hace nada (de momento)
	public eGramParser(TokenStream input, String folder){
		this(input);
		this.folder=folder;
	}

	// Se sobreescribe la salida del error otorgada por Antlr4 según el contenido de la misma
	@Override
	public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException ex)
	{
		String notificacion = "Error sintáctico - Línea " + offendingToken.getLine()
		+ ", Columna " + offendingToken.getCharPositionInLine() + ": \n\t ";
		String expected = msg;

		//TODO: MODIFICAR PARA "HACERLO NUESTRO"
		if(expected.contains("expecting")){
			expected = expected.substring(expected.indexOf("expecting") + 10);
			notificacion += "encontrado: '" + offendingToken.getText() + "' esperado: "+ expected;
		}else if(expected.contains("missing")){
			expected = expected.substring(expected.indexOf("missing") + 8);
			expected = expected.substring(0, expected.indexOf("at") - 1);
			notificacion += "encontrado: '" + offendingToken.getText() + "', falta "+ expected;
		}else if(expected.contains("alternative")){ //HE EMPEZADO A MODIFICAR ESTA SALIDA AL DETECTAR COMO SE MUESTRAN LOS ERRORES EN ANTLR4
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

			    	symbolTable = new SymbolTable(folder);
			    	// Insertar operaciones de input/output
			    	try {
			    		symbolTable.insert("read", new Symbol("read", null, Symbol.Types.FUNC, Symbol.DataTypes.STRING));
			    		Symbol arg = new Symbol("argBool", null, Symbol.Types.ARG, Symbol.DataTypes.BOOLEAN);
			    		symbolTable.insert("printb", new Symbol("printb", arg,Symbol.Types.PROC, Symbol.DataTypes.NULL));
			    		arg = new Symbol("argInt", null,Symbol.Types.ARG,Symbol.DataTypes.INT);
			    		symbolTable.insert("printi", new Symbol("printi", arg, Symbol.Types.PROC, Symbol.DataTypes.NULL));
			    		arg = new Symbol("argString", null, Symbol.Types.ARG, Symbol.DataTypes.STRING);
			    		symbolTable.insert("prints", new Symbol("prints", arg, Symbol.Types.PROC, Symbol.DataTypes.NULL));
			    	} catch (SymbolTable.SymbolTableException e) {}
			    
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(69);
				main();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(72);
				decl();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			sentsVoid();
			setState(79);
			match(EOF);

			        symbolTable.blockOut();
			        if(!errors.isEmpty()) {
			            throw new RuntimeException(errors);
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
		public Token ID;
		public ExprContext expr;
		public LiteralContext literal;
		public Token FUNCTION;
		public HeaderContext header;
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((DeclContext)_localctx).type = type();
				setState(94);
				((DeclContext)_localctx).ID = match(ID);

				            try{
				                symbolTable.insert(((DeclContext)_localctx).ID.getText(),new Symbol(((DeclContext)_localctx).ID.getText(),null,Symbol.Types.VAR,((DeclContext)_localctx).type.dataType));
				            } catch (SymbolTable.SymbolTableException e) {
				                errors+="Error semántico en línea " + ((DeclContext)_localctx).ID.getLine() + ": variable '" + ((DeclContext)_localctx).ID.getText() +
				                "' previamente declarada\n";
				            }
				        
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(96);
					match(ASSIGN);
					setState(97);
					((DeclContext)_localctx).expr = expr();

					            try{
					                symbolTable.get(((DeclContext)_localctx).ID.getText()).setInitialized(true);
					            } catch (SymbolTable.SymbolTableException e) {
					                errors += "Error semántico en línea " + ((DeclContext)_localctx).ID.getLine() + ": variable '" + ((DeclContext)_localctx).ID.getText() + "' no existe\n";
					            }

					            if(((DeclContext)_localctx).expr.dataType != ((DeclContext)_localctx).type.dataType) {
					                errors += "Error semántico en línea " + ((DeclContext)_localctx).ID.getLine() + ": tipos incompatibles (esperado '" +
					                ((DeclContext)_localctx).type.dataType + "', encontrado '" + ((DeclContext)_localctx).expr.dataType + "')\n";
					            }
					        
					}
				}

				setState(102);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(CONSTANT);
				setState(105);
				((DeclContext)_localctx).type = type();
				setState(106);
				((DeclContext)_localctx).ID = match(ID);

				        	Symbol symbol = null;
				        	try {
				        		symbolTable.insert(((DeclContext)_localctx).ID.getText(), new Symbol(((DeclContext)_localctx).ID.getText(), null, Symbol.Types.CONST, ((DeclContext)_localctx).type.dataType));
				        		symbol = symbolTable.get(((DeclContext)_localctx).ID.getText());
				        		symbol.setInitialized(true);
				        	} catch (SymbolTable.SymbolTableException e) {
				        		errors+="Error semántico en línea " + ((DeclContext)_localctx).ID.getLine() + ": constante '" + ((DeclContext)_localctx).ID.getText() +
				        		"' ya declarada\n";
				        	}
				        
				setState(108);
				match(ASSIGN);
				setState(109);
				((DeclContext)_localctx).literal = literal();
				setState(110);
				match(SEMI);

				            if(((DeclContext)_localctx).literal.dataType!=((DeclContext)_localctx).type.dataType) {
				                errors += "Error semántico en línea " + ((DeclContext)_localctx).ID.getLine() + ": tipos incompatibles (esperado '"+
				                ((DeclContext)_localctx).type.dataType + "')\n";
				            }
				            if(symbol != null) {
				                switch(((DeclContext)_localctx).literal.dataType) {
				                    case INT:
				                        symbol.setValue((((DeclContext)_localctx).literal!=null?_input.getText(((DeclContext)_localctx).literal.start,((DeclContext)_localctx).literal.stop):null));
				                        break;
				                    case BOOLEAN:
				                        //TODO: COMPROBAR PORQUE ESCRIBE LAS BOLEANAS A -1 Y 0
				                        if((((DeclContext)_localctx).literal!=null?_input.getText(((DeclContext)_localctx).literal.start,((DeclContext)_localctx).literal.stop):null).equals("true")) {
				                            symbol.setValue("-1");
				                        } else {
				                            symbol.setValue("0");
				                        }
				                        break;
				                    case STRING:
				                        symbol.setValue((((DeclContext)_localctx).literal!=null?_input.getText(((DeclContext)_localctx).literal.start,((DeclContext)_localctx).literal.stop):null));
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
				setState(113);
				arrayDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				((DeclContext)_localctx).FUNCTION = match(FUNCTION);
				setState(115);
				((DeclContext)_localctx).type = type();
				setState(116);
				((DeclContext)_localctx).header = header(((DeclContext)_localctx).type.dataType);
				setState(117);
				match(BEGIN);

				            try {
				                symbolTable.insert(((DeclContext)_localctx).header.procedure.getId(),((DeclContext)_localctx).header.procedure);
				            } catch (SymbolTable.SymbolTableException e) {
				                errors += "Error semántico en línea " + ((DeclContext)_localctx).FUNCTION.getLine() + ": " + e.getMessage() + "\n";
				            }
				            symbolTable = symbolTable.blockIn();
				            proceduresStack.push(((DeclContext)_localctx).header.procedure);
				            Symbol parameter = ((DeclContext)_localctx).header.procedure.getNext();
				            while (parameter != null) {
				                Symbol aux = new Symbol(parameter);
				                aux.setInitialized(true);
				                aux.setNext(null);
				                try {
				                    symbolTable.insert(aux.getId(),aux);
				                } catch (SymbolTable.SymbolTableException e) {
				                    errors += "Error semántico en línea " + ((DeclContext)_localctx).FUNCTION.getLine() + ": " + e.getMessage() + "\n";
				                }
				                parameter = parameter.getNext();
				            }
				        
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(119);
					decl();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				sents();
				setState(126);
				match(END);

				            symbolTable = symbolTable.blockOut();
				            proceduresStack.pop();
				            if(!((DeclContext)_localctx).header.procedure.isReturnFound()) {
				                errors += "Error semántico en línea " + ((DeclContext)_localctx).FUNCTION.getLine() +
				                ": 'devolver' no encontrado para la función '" + ((DeclContext)_localctx).header.procedure.getId() + "'\n";
				            }
				            if(depthCondition != 0) {
				                errors += "Error semántico - Línea " + ((DeclContext)_localctx).FUNCTION.getLine() +
				                ": no se puede definir una función en una estructura condicional o repetitiva\n";
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
	public static class ArrayDeclContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public NumberContext number;
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
		public ArrayDecl_Context arrayDecl_() {
			return getRuleContext(ArrayDecl_Context.class,0);
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
			setState(131);
			((ArrayDeclContext)_localctx).type = type();
			setState(132);
			((ArrayDeclContext)_localctx).ID = match(ID);
			setState(133);
			match(LBRACK);

				        Symbol symbol = new Symbol(((ArrayDeclContext)_localctx).ID.getText(), null, Symbol.Types.VAR, Symbol.DataTypes.NULL);
			            Table table = new Table(((ArrayDeclContext)_localctx).type.dataType);
			            symbol.setTable(table);
			            try{
			                symbolTable.insert(((ArrayDeclContext)_localctx).ID.getText(), symbol);
			            } catch (SymbolTable.SymbolTableException e) {
			                errors += "Error semántico en línea " + ((ArrayDeclContext)_localctx).ID.getLine() + ": variable '" + ((ArrayDeclContext)_localctx).ID.getText() +
			                "' ya declarada\n";
			            }
			            int bottomLimit = 0;
			            boolean limits = false;
				    
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(135);
				((ArrayDeclContext)_localctx).number = number();
				setState(136);
				match(T__0);

				            // Permitimos la entrada pero advertimos sobre el uso de variables
				            if(((ArrayDeclContext)_localctx).number.isConstant) {
				                errors += "Error semántico en línea " + ((ArrayDeclContext)_localctx).ID.getLine() +
				                ": los límites del índice deben ser valores constantes\n";
				            }
				            bottomLimit = ((ArrayDeclContext)_localctx).number.value;
				            limits = true;
				        
				}
				break;
			}
			setState(141);
			((ArrayDeclContext)_localctx).number = number();

				        if(!((ArrayDeclContext)_localctx).number.isConstant) {
			                errors += "Error semántico en línea " + ((ArrayDeclContext)_localctx).ID.getLine() +
			                ": los límites del índice deben ser valores constantes\n";
			            }
			            int upperLimit = ((ArrayDeclContext)_localctx).number.value;
			            if(!limits) {
			                // Caso en el que se indica el tamaño
			                if(upperLimit < 1) {
			                    errors+="Error semántico en línea "+ ((ArrayDeclContext)_localctx).ID.getLine() +
			                    ": una tabla no puede ser de tamaño 0\n";
			                } else {
			                    upperLimit--; // Si se indica el tamaño, hay que corregir el limite superior
			                }
			            } else {
			                // Caso en el que se indican los limites
			                if(bottomLimit > upperLimit) {
			                    errors+="Error semántico en línea " + (((ArrayDeclContext)_localctx).number!=null?(((ArrayDeclContext)_localctx).number.start):null).getLine() +
			                    ": el límite inferior no puede ser mayor al superior\n";
			                }
			            }
			            table.setIndex(bottomLimit, upperLimit);
				    
			setState(143);
			arrayDecl_(table);

				        table.init();
				    
			setState(145);
			match(RBRACK);
			setState(146);
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
	public static class ArrayDecl_Context extends ParserRuleContext {
		public Table table;
		public NumberContext number;
		public TerminalNode RBRACK() { return getToken(eGramParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(eGramParser.LBRACK, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ArrayDecl_Context arrayDecl_() {
			return getRuleContext(ArrayDecl_Context.class,0);
		}
		public ArrayDecl_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArrayDecl_Context(ParserRuleContext parent, int invokingState, Table table) {
			super(parent, invokingState);
			this.table = table;
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).enterArrayDecl_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eGramListener ) ((eGramListener)listener).exitArrayDecl_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eGramVisitor ) return ((eGramVisitor<? extends T>)visitor).visitArrayDecl_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDecl_Context arrayDecl_(Table table) throws RecognitionException {
		ArrayDecl_Context _localctx = new ArrayDecl_Context(_ctx, getState(), table);
		enterRule(_localctx, 8, RULE_arrayDecl_);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(RBRACK);
				setState(149);
				match(LBRACK);

				            int bottomLimit = 0;
				            boolean limits = false;
				        
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(151);
					((ArrayDecl_Context)_localctx).number = number();
					setState(152);
					match(T__0);

					            if(((ArrayDecl_Context)_localctx).number.isConstant) {
					                errors += "Error semántico en línea " + (((ArrayDecl_Context)_localctx).number!=null?(((ArrayDecl_Context)_localctx).number.start):null).getLine() +
					                ": los límites del índice deben ser valores constantes\n";
					            }
					            bottomLimit = ((ArrayDecl_Context)_localctx).number.value;
					            limits = true;
					        
					}
					break;
				}
				setState(157);
				((ArrayDecl_Context)_localctx).number = number();

				            if(!((ArrayDecl_Context)_localctx).number.isConstant) {
				                errors += "Error semántico en línea " + (((ArrayDecl_Context)_localctx).number!=null?(((ArrayDecl_Context)_localctx).number.start):null).getLine() +
				                ": los límites del índice deben ser valores constantes\n";
				            }
				            int upperLimit = ((ArrayDecl_Context)_localctx).number.value;
				            if(!limits) { // Caso en el que se indica el tamaño
				                if(upperLimit < 1) {
				                    errors+="Error semántico en línea "+ (((ArrayDecl_Context)_localctx).number!=null?(((ArrayDecl_Context)_localctx).number.start):null).getLine() +
				                    ": una tabla no puede ser de tamaño 0\n";
				                } else {
				                    upperLimit--; // Si se indica el tamaño, hay que corregir el limite superior
				                }
				            } else { // Caso en el que se indican los limites
				                if(bottomLimit > upperLimit) {
				                    errors+="Error semántico en línea " + (((ArrayDecl_Context)_localctx).number!=null?(((ArrayDecl_Context)_localctx).number.start):null).getLine() +
				                    ": el límite inferior no puede ser mayor al superior\n";
				                }
				            }
				            table.setIndex(bottomLimit, upperLimit);
				        
				setState(159);
				arrayDecl_(_localctx.table);
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
		public boolean isConstant;
		public Token ID;
		public Token LiteralInteger;
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
		enterRule(_localctx, 10, RULE_number);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((NumberContext)_localctx).ID = match(ID);

					        Symbol symbol = null;
				            try {
				                symbol = symbolTable.get(((NumberContext)_localctx).ID.getText());
				            } catch (SymbolTable.SymbolTableException e) {
				                errors += "Error semántico en línea " + ((NumberContext)_localctx).ID.getLine() + ": "+e.getMessage() + "\n";
				            }
				            if(symbol != null && symbol.getType() == Symbol.Types.CONST) {
				                ((NumberContext)_localctx).value =  Integer.parseInt(symbol.getValue());
				                ((NumberContext)_localctx).isConstant =  true;
				            } else {
				                errors += "Error semántico en línea " + ((NumberContext)_localctx).ID.getLine() +
				                ": el limite debe ser un literal o una constante\n";
				                ((NumberContext)_localctx).value =  0;
				                ((NumberContext)_localctx).isConstant =  false;
				            }
					    
				}
				break;
			case LiteralInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				((NumberContext)_localctx).LiteralInteger = match(LiteralInteger);

					        ((NumberContext)_localctx).value =  Integer.parseInt(((NumberContext)_localctx).LiteralInteger.getText());
				            ((NumberContext)_localctx).isConstant =  true;
					    
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
	public static class HeaderContext extends ParserRuleContext {
		public Symbol.DataTypes dataType;
		public Symbol procedure;
		public Token ID;
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
		enterRule(_localctx, 12, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((HeaderContext)_localctx).ID = match(ID);

				        if(_localctx.dataType != null) {
			                // Función
			                ((HeaderContext)_localctx).procedure =  new Symbol(((HeaderContext)_localctx).ID.getText(), null, Symbol.Types.FUNC, _localctx.dataType);
			            } else {
			                // Procedimiento
			                ((HeaderContext)_localctx).procedure =  new Symbol(((HeaderContext)_localctx).ID.getText(), null, Symbol.Types.PROC, Symbol.DataTypes.NULL);
			            }
				    
			setState(172);
			match(LPAREN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				setState(173);
				params(_localctx.procedure);
				}
			}

			setState(176);
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
		public ParamContext param;
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
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((ParamsContext)_localctx).param = param();
				setState(179);
				match(COMMA);

				            _localctx.prev.setNext(((ParamsContext)_localctx).param.symbol);
				        
				setState(181);
				params(_localctx.prev.getNext());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((ParamsContext)_localctx).param = param();

				            _localctx.prev.setNext(((ParamsContext)_localctx).param.symbol);
				        
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
		public Symbol symbol;
		public TypeContext type;
		public Token ID;
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
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((ParamContext)_localctx).type = type();
			setState(189);
			((ParamContext)_localctx).ID = match(ID);

				        ((ParamContext)_localctx).symbol =  new Symbol(((ParamContext)_localctx).ID.getText(), null, Symbol.Types.ARG, ((ParamContext)_localctx).type.dataType);
				    
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
		enterRule(_localctx, 18, RULE_sentsVoid);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
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
		enterRule(_localctx, 20, RULE_sents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			sent();
			setState(197);
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
		enterRule(_localctx, 22, RULE_sents_);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				sent();
				setState(200);
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
		public Token IF;
		public ExprContext expr;
		public Token WHILE;
		public Token RETURN;
		public ReferenceContext reference;
		public Token ASSIGN;
		public Token SEMI;
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
		enterRule(_localctx, 24, RULE_sent);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((SentContext)_localctx).IF = match(IF);
				setState(206);
				((SentContext)_localctx).expr = expr();

					        if(((SentContext)_localctx).expr.dataType!=Symbol.DataTypes.BOOLEAN) {
				                errors+="Error semántico en línea " + ((SentContext)_localctx).IF.getLine() +
				                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + ((SentContext)_localctx).expr.dataType + "')\n";
				            }
					    
				setState(208);
				match(BEGIN);

					        depthCondition ++;
					        symbolTable = symbolTable.blockIn();
					    
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

					        depthCondition --;
				            symbolTable = symbolTable.blockOut();
					    
				setState(218);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((SentContext)_localctx).IF = match(IF);
				setState(221);
				((SentContext)_localctx).expr = expr();

					        if(((SentContext)_localctx).expr.dataType != Symbol.DataTypes.BOOLEAN) {
				                errors+="Error semántico en línea " + ((SentContext)_localctx).IF.getLine() +
				                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + ((SentContext)_localctx).expr.dataType + "')\n";
				            }
					    
				setState(223);
				match(BEGIN);

					        depthCondition ++;
					        symbolTable = symbolTable.blockIn();
					    
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(225);
					decl();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				sents();

				            symbolTable = symbolTable.blockOut();
					    
				setState(233);
				match(END);
				setState(234);
				match(ELSE);
				setState(235);
				match(BEGIN);

					        symbolTable = symbolTable.blockIn();
					    
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(237);
					decl();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				sents();

					        depthCondition --;
				            symbolTable = symbolTable.blockOut();
					    
				setState(245);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				((SentContext)_localctx).WHILE = match(WHILE);
				setState(248);
				((SentContext)_localctx).expr = expr();

					        if(((SentContext)_localctx).expr.dataType != Symbol.DataTypes.BOOLEAN){
					            errors += "Error semántico en línea " + ((SentContext)_localctx).WHILE.getLine() +
				                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + ((SentContext)_localctx).expr.dataType + "')\n";
					        }
					    
				setState(250);
				match(BEGIN);

					        depthCondition ++;
					        symbolTable = symbolTable.blockIn();
					    
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
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

				            depthCondition --;
				            symbolTable = symbolTable.blockOut();
				        
				setState(260);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(DO);
				setState(263);
				match(BEGIN);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(264);
					decl();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				sents();
				setState(271);
				match(END);
				setState(272);
				match(WHILE);
				setState(273);
				expr();
				setState(274);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				((SentContext)_localctx).RETURN = match(RETURN);
				setState(277);
				((SentContext)_localctx).expr = expr();
				setState(278);
				match(SEMI);

					        Symbol procedure;
				            if(proceduresStack.size()==0) {
				                // Return fuera de una función
				                errors += "Error semántico en línea " + ((SentContext)_localctx).RETURN.getLine() + ": devolver fuera de función\n";
				            } else {
				                procedure = proceduresStack.peek();
				                if (procedure.getType() == Symbol.Types.PROC) {
				                    // Devolver no vacío en un procedimiento
				                    errors += "Error semántico en línea " + ((SentContext)_localctx).RETURN.getLine() +
				                    ": devolver de expresión en un procedimiento\n";
				                } else if(procedure.dataType() != ((SentContext)_localctx).expr.dataType) {
				                    // Devolver de tipo incorrecto
				                    errors += "Error semántico en línea " + ((SentContext)_localctx).RETURN.getLine() +
				                    ": devolver de tipo incorrecto (esperado '" + proceduresStack.peek().dataType() +
				                    "', encontrado '" + ((SentContext)_localctx).expr.dataType + "')\n";
				                } else if(depthCondition == 0) {
				                    // Devolver correcto

				                    //TODO: PORQUE VUELVE A HACER PEEK EN VEZ DE PILLAR LA REFERENCIA procedure
				                    proceduresStack.peek().setReturnFound(true);
				                }
				            }
					    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				((SentContext)_localctx).RETURN = match(RETURN);
				setState(282);
				match(SEMI);

					        Symbol procedure;
				            if(proceduresStack.size()==0) {
				                // Devolver fuera de una función
				                errors += "Error semántico en línea " + ((SentContext)_localctx).RETURN.getLine() + ": devolver fuera de función\n";
				            } else {
				                procedure = proceduresStack.peek();
				                if (procedure.getType() == Symbol.Types.FUNC) {
				                    // Devolver vacío en una función
				                    errors += "Error semántico en línea " + ((SentContext)_localctx).RETURN.getLine() +
				                    ": devolver vacío en una función)\n";
				                }
				            }
					    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				((SentContext)_localctx).reference = reference(true);
				setState(285);
				((SentContext)_localctx).ASSIGN = match(ASSIGN);
				setState(286);
				((SentContext)_localctx).expr = expr();
				setState(287);
				match(SEMI);

					        if(((SentContext)_localctx).reference.symbol != null) {
				                if(((SentContext)_localctx).reference.symbol.getType() == Symbol.Types.CONST) {
				                    errors += "Error semántico en línea " + ((SentContext)_localctx).ASSIGN.getLine() + ": " + ((SentContext)_localctx).reference.symbol.getId() +
				                    " es una constante\n";
				                } else{
				                    Symbol.DataTypes underlType;
				                    if(((SentContext)_localctx).reference.table != null && ((SentContext)_localctx).reference.dimCheck) {
				                        underlType = ((SentContext)_localctx).reference.table.dataType();
				                    } else {
				                        underlType = ((SentContext)_localctx).reference.symbol.dataType();
				                    }
				                    if(((SentContext)_localctx).reference.symbol.getType() == Symbol.Types.FUNC || underlType == Symbol.DataTypes.NULL) {
				                        errors += "Error semántico en línea " + ((SentContext)_localctx).ASSIGN.getLine() +
				                        ": no se pueden asignar valores a esta referencia\n";
				                    } else if(underlType != ((SentContext)_localctx).expr.dataType) {
				                            errors+="Error semántico en línea " + ((SentContext)_localctx).ASSIGN.getLine() +
				                            ": asignación de tipo incorrecto (esperado '"+ underlType +
				                            "', encontrado '"+((SentContext)_localctx).expr.dataType+"')\n";
				                    }
				                }
				            }
					    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				((SentContext)_localctx).reference = reference(false);
				setState(291);
				((SentContext)_localctx).SEMI = match(SEMI);

					    if(((SentContext)_localctx).reference.symbol != null) {
				            if(((SentContext)_localctx).reference.symbol.getType() != Symbol.Types.FUNC && ((SentContext)_localctx).reference.symbol.getType() != Symbol.Types.PROC) {
				                // Tiene que ser función o procedimiento
				                errors += "Error semántico en línea " + ((SentContext)_localctx).SEMI.getLine() +
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
	public static class ReferenceContext extends ParserRuleContext {
		public boolean assign;
		public Symbol symbol;
		public Table table;
		public boolean dimCheck;
		public Token ID;
		public IdxContext idx;
		public ContIdxContext contIdx;
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
		enterRule(_localctx, 26, RULE_reference);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((ReferenceContext)_localctx).ID = match(ID);

					        try {
				                ((ReferenceContext)_localctx).symbol =  symbolTable.get(((ReferenceContext)_localctx).ID.getText());
				                if(_localctx.assign) {
				                    _localctx.symbol.setInitialized(true);
				                } else {
				                    if(!_localctx.symbol.isInitialized()) {
				                        errors += "Error semántico en línea " + ((ReferenceContext)_localctx).ID.getLine() + ": '" + ((ReferenceContext)_localctx).ID.getText() +
				                        "' no ha sido inicializada\n";
				                    }
				                }
				            } catch (SymbolTable.SymbolTableException e) {
				                errors += "Error semántico en línea " + ((ReferenceContext)_localctx).ID.getLine() + ": " + e.getMessage() + "\n";
				                ((ReferenceContext)_localctx).symbol =  null;
				            }
					    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				((ReferenceContext)_localctx).idx = idx();
				setState(299);
				match(RBRACK);

					        ((ReferenceContext)_localctx).table =  ((ReferenceContext)_localctx).idx.table;
					        ((ReferenceContext)_localctx).symbol =  ((ReferenceContext)_localctx).idx.symbol;
					        if(_localctx.table != null) {
				                // Comprobar la cantidad de indirecciones usadas
				                int dim = _localctx.table.getDimension();
				                ((ReferenceContext)_localctx).dimCheck =  false;
				                if(((ReferenceContext)_localctx).idx.dimension < dim) {
				                    errors+="Error semántico en línea " + (((ReferenceContext)_localctx).idx!=null?(((ReferenceContext)_localctx).idx.start):null).getLine() +
				                    ": la tabla tiene más dimensiones\n";
				                } else if(((ReferenceContext)_localctx).idx.dimension > dim){
				                    errors+="Error semántico en línea " + (((ReferenceContext)_localctx).idx!=null?(((ReferenceContext)_localctx).idx.start):null).getLine() +
				                    ": la tabla no tiene tantas dimensiones\n";
				                } else {
				                    ((ReferenceContext)_localctx).dimCheck =  true;
				                }
				            }
					    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				((ReferenceContext)_localctx).ID = match(ID);
				setState(303);
				match(LPAREN);
				setState(304);
				match(RPAREN);

					        try {
				                ((ReferenceContext)_localctx).symbol =  symbolTable.get(((ReferenceContext)_localctx).ID.getText());
				                if(_localctx.symbol.getNext() != null) {
				                    errors+="Error semántico en línea " + ((ReferenceContext)_localctx).ID.getLine() + ": falta(n) argumento(s) para " +
				                    ((ReferenceContext)_localctx).ID.getText() + "\n";
				                }
				            } catch (SymbolTable.SymbolTableException e) {
				                errors += "Error semántico en línea " + ((ReferenceContext)_localctx).ID.getLine() + ": " + e.getMessage() + "\n";
				                ((ReferenceContext)_localctx).symbol =  null;
				            }
					    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				((ReferenceContext)_localctx).contIdx = contIdx();
				setState(307);
				match(RPAREN);

					        ((ReferenceContext)_localctx).symbol =  ((ReferenceContext)_localctx).contIdx.procedure;
					    
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
		public Symbol symbol;
		public int dimension;
		public Table table;
		public Token ID;
		public ExprContext expr;
		public Idx_Context idx_;
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
		enterRule(_localctx, 28, RULE_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((IdxContext)_localctx).ID = match(ID);
			setState(313);
			match(LBRACK);
			setState(314);
			((IdxContext)_localctx).expr = expr();

				        int dim = 1;
			            try {
			                ((IdxContext)_localctx).symbol =  symbolTable.get(((IdxContext)_localctx).ID.getText());
			            } catch (SymbolTable.SymbolTableException e) {
			                errors += "Error semántico en línea " + ((IdxContext)_localctx).ID.getLine() + ": " + e.getMessage() + "\n";
			            }
			            if(((IdxContext)_localctx).expr.dataType != Symbol.DataTypes.INT) {
			                errors += "Error semántico en línea " + (((IdxContext)_localctx).expr!=null?(((IdxContext)_localctx).expr.start):null).getLine() + ": " + (((IdxContext)_localctx).expr!=null?_input.getText(((IdxContext)_localctx).expr.start,((IdxContext)_localctx).expr.stop):null) +
			                " no es un valor numérico\n";
			            }
			            if(_localctx.symbol != null) {
			                ((IdxContext)_localctx).table =  _localctx.symbol.getTable();
			                if(_localctx.table == null) {
			                    errors += "Error semántico en línea " + ((IdxContext)_localctx).ID.getLine() + ": " + ((IdxContext)_localctx).ID.getText() +
			                    " no es una tabla\n";
			                }
			            }
				    
			setState(316);
			((IdxContext)_localctx).idx_ = idx_(dim);

				        ((IdxContext)_localctx).dimension =  ((IdxContext)_localctx).idx_.dimension;
				    
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
		public int dimension_;
		public int dimension;
		public ExprContext expr;
		public Idx_Context idx_;
		public TerminalNode RBRACK() { return getToken(eGramParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(eGramParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Idx_Context idx_() {
			return getRuleContext(Idx_Context.class,0);
		}
		public Idx_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Idx_Context(ParserRuleContext parent, int invokingState, int dimension_) {
			super(parent, invokingState);
			this.dimension_ = dimension_;
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

	public final Idx_Context idx_(int dimension_) throws RecognitionException {
		Idx_Context _localctx = new Idx_Context(_ctx, getState(), dimension_);
		enterRule(_localctx, 30, RULE_idx_);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(RBRACK);
				setState(320);
				match(LBRACK);
				setState(321);
				((Idx_Context)_localctx).expr = expr();

					        if(((Idx_Context)_localctx).expr.dataType != Symbol.DataTypes.INT) {
				                errors += "Error semántico en línea " + (((Idx_Context)_localctx).expr!=null?(((Idx_Context)_localctx).expr.start):null).getLine() + ": " + (((Idx_Context)_localctx).expr!=null?_input.getText(((Idx_Context)_localctx).expr.start,((Idx_Context)_localctx).expr.stop):null) +
				                " no es un valor numérico\n";
				            }
				            int dim = _localctx.dimension_ + 1;
					    
				setState(323);
				((Idx_Context)_localctx).idx_ = idx_(dim);

					        ((Idx_Context)_localctx).dimension =  ((Idx_Context)_localctx).idx_.dimension;
					    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

					        ((Idx_Context)_localctx).dimension =  _localctx.dimension_;
					    
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
		public Symbol procedure;
		public Token ID;
		public ExprContext expr;
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
		enterRule(_localctx, 32, RULE_contIdx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((ContIdxContext)_localctx).ID = match(ID);
			setState(330);
			match(LPAREN);
			setState(331);
			((ContIdxContext)_localctx).expr = expr();

				        Deque<Symbol.DataTypes> pparams=new ArrayDeque<Symbol.DataTypes>();
			            try {
			                ((ContIdxContext)_localctx).procedure =  symbolTable.get(((ContIdxContext)_localctx).ID.getText());
			                pparams.add(((ContIdxContext)_localctx).expr.dataType);
			            } catch (SymbolTable.SymbolTableException e) {
			                errors += "Error semántico en línea " + ((ContIdxContext)_localctx).ID.getLine() + ": " + e.getMessage() + "\n";
			                ((ContIdxContext)_localctx).procedure =  null;
			            }
				    
			setState(333);
			contIdx_(pparams);

				        if(_localctx.procedure != null) {
			                Symbol.DataTypes aux;
			                Symbol param = _localctx.procedure;
			                param = param.getNext();
			                while(pparams.size() != 0) {
			                    aux = pparams.remove();
			                    if(param == null) {
			                        errors += "Error semántico en línea " + ((ContIdxContext)_localctx).ID.getLine() +
			                        ": demasiados argumentos para " + ((ContIdxContext)_localctx).ID.getText() + "\n";
			                        break;
			                    } else if(aux != param.dataType()) {
			                        errors += "Error semántico en línea " + ((ContIdxContext)_localctx).ID.getLine() +
			                        ": tipos incompatibles (esperado '" + param.dataType() +
			                        "', encontrado '" + aux + "')\n";
			                        break;
			                    }
			                    param = param.getNext();
			                }
			                if(param != null) {
			                    errors += "Error semántico en línea " + ((ContIdxContext)_localctx).ID.getLine() + ": falta(n) argumento(s) para " +
			                    ((ContIdxContext)_localctx).ID.getText() + "\n";
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
		public Deque<Symbol.DataTypes> pparams;
		public ExprContext expr;
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
		enterRule(_localctx, 34, RULE_contIdx_);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(COMMA);
				setState(337);
				((ContIdx_Context)_localctx).expr = expr();

					        _localctx.pparams.add(((ContIdx_Context)_localctx).expr.dataType);
					    
				setState(339);
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
		enterRule(_localctx, 36, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((ExprContext)_localctx).exprOr = exprOr();

			            ((ExprContext)_localctx).dataType =  ((ExprContext)_localctx).exprOr.dataType;
			        
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
		enterRule(_localctx, 38, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((ExprOrContext)_localctx).exprAnd = exprAnd();
			setState(348);
			((ExprOrContext)_localctx).exprOr_ = exprOr_();

			            if(((ExprOrContext)_localctx).exprOr_.dataType != null) {
			                if(((ExprOrContext)_localctx).exprAnd.dataType != ((ExprOrContext)_localctx).exprOr_.dataType) {
			                    errors += "Error semántico en línea " + (((ExprOrContext)_localctx).exprOr_!=null?(((ExprOrContext)_localctx).exprOr_.start):null).getLine() +
			                    ": tipos incompatibles (esperado " + ((ExprOrContext)_localctx).exprAnd.dataType + "," +
			                    " encontrado " + ((ExprOrContext)_localctx).exprOr_.dataType + ")\n";
			                }
			                ((ExprOrContext)_localctx).dataType =  ((ExprOrContext)_localctx).exprOr_.dataType;
			            } else {
			                ((ExprOrContext)_localctx).dataType =  ((ExprOrContext)_localctx).exprAnd.dataType;
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
		public Symbol.DataTypes dataType;
		public ExprAndContext exprAnd;
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
		enterRule(_localctx, 40, RULE_exprOr_);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(OR);
				setState(352);
				((ExprOr_Context)_localctx).exprAnd = exprAnd();
				setState(353);
				exprOr_();

					        if(((ExprOr_Context)_localctx).exprAnd.dataType != Symbol.DataTypes.BOOLEAN){
				                errors += "Error semántico en línea " + (((ExprOr_Context)_localctx).exprAnd!=null?(((ExprOr_Context)_localctx).exprAnd.start):null).getLine() +
				                    ": tipos incompatibles (esperado BOOLEAN, encontrado " + ((ExprOr_Context)_localctx).exprAnd.dataType + ")\n";
				            }
				            ((ExprOr_Context)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
					    
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
		enterRule(_localctx, 42, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((ExprAndContext)_localctx).exprNot = exprNot();
			setState(360);
			((ExprAndContext)_localctx).exprAnd_ = exprAnd_();

				        if(((ExprAndContext)_localctx).exprAnd_.dataType != null) {
			                if(((ExprAndContext)_localctx).exprNot.dataType != ((ExprAndContext)_localctx).exprAnd_.dataType) {
			                    errors += "Error semántico en línea " + (((ExprAndContext)_localctx).exprAnd_!=null?(((ExprAndContext)_localctx).exprAnd_.start):null).getLine() +
			                    ": tipos incompatibles (esperado "+((ExprAndContext)_localctx).exprNot.dataType + "," +
			                    " encontrado "+((ExprAndContext)_localctx).exprAnd_.dataType + ")\n";
			                }
			                ((ExprAndContext)_localctx).dataType =  ((ExprAndContext)_localctx).exprAnd_.dataType;
			            } else {
			                ((ExprAndContext)_localctx).dataType =  ((ExprAndContext)_localctx).exprNot.dataType;
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
		public Symbol.DataTypes dataType;
		public ExprNotContext exprNot;
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
		enterRule(_localctx, 44, RULE_exprAnd_);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(AND);
				setState(364);
				((ExprAnd_Context)_localctx).exprNot = exprNot();
				setState(365);
				exprAnd_();

					        if(((ExprAnd_Context)_localctx).exprNot.dataType != Symbol.DataTypes.BOOLEAN){
				                errors += "Error semántico en línea " + (((ExprAnd_Context)_localctx).exprNot!=null?(((ExprAnd_Context)_localctx).exprNot.start):null).getLine() +
				                    ": tipos incompatibles (esperado BOOLEAN, encontrado " + ((ExprAnd_Context)_localctx).exprNot.dataType + ")\n";
				            }
				            ((ExprAnd_Context)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
					    
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
		public ExprCompContext exprComp;
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
		enterRule(_localctx, 46, RULE_exprNot);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(NOT);
				setState(372);
				((ExprNotContext)_localctx).exprComp = exprComp();

				            if(((ExprNotContext)_localctx).exprComp.dataType != Symbol.DataTypes.BOOLEAN) {
				                errors += "Error semántico en línea " + (((ExprNotContext)_localctx).exprComp!=null?(((ExprNotContext)_localctx).exprComp.start):null).getLine() +
				                ": tipos incompatibles (esperado BOOLEAN, encontrado " + ((ExprNotContext)_localctx).exprComp.dataType + ")\n";
				            }
				            ((ExprNotContext)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
					    
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
				setState(375);
				((ExprNotContext)_localctx).exprComp = exprComp();

				            ((ExprNotContext)_localctx).dataType =  ((ExprNotContext)_localctx).exprComp.dataType;
					    
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
		enterRule(_localctx, 48, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((ExprCompContext)_localctx).exprAdit = exprAdit();
			setState(381);
			((ExprCompContext)_localctx).exprComp_ = exprComp_();

			            if(((ExprCompContext)_localctx).exprComp_.dataType != null) {
			                if(((ExprCompContext)_localctx).exprAdit.dataType != Symbol.DataTypes.INT) {
			                    errors+="Error semántico en línea " + (((ExprCompContext)_localctx).exprComp_!=null?(((ExprCompContext)_localctx).exprComp_.start):null).getLine() +
			                    ": tipos incompatibles (esperado INT," +
			                    " encontrado " + ((ExprCompContext)_localctx).exprComp_.dataType + ")\n";
			                    ((ExprCompContext)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
			                }
			                ((ExprCompContext)_localctx).dataType =  ((ExprCompContext)_localctx).exprComp_.dataType;
			            } else {
			                ((ExprCompContext)_localctx).dataType =  ((ExprCompContext)_localctx).exprAdit.dataType;
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
		public Symbol.DataTypes dataType;
		public ExprAditContext exprAdit;
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
		enterRule(_localctx, 50, RULE_exprComp_);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(OPREL);
				setState(385);
				((ExprComp_Context)_localctx).exprAdit = exprAdit();

				            if(((ExprComp_Context)_localctx).exprAdit.dataType != Symbol.DataTypes.INT) {
				                errors+="Error semántico en línea " + (((ExprComp_Context)_localctx).exprAdit!=null?(((ExprComp_Context)_localctx).exprAdit.start):null).getLine() +
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprComp_Context)_localctx).exprAdit.dataType + ")\n";
				            }
				            ((ExprComp_Context)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
				        
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
		enterRule(_localctx, 52, RULE_exprAdit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((ExprAditContext)_localctx).exprMult = exprMult();
			setState(392);
			((ExprAditContext)_localctx).exprAdit_ = exprAdit_();

			            if(((ExprAditContext)_localctx).exprAdit_.dataType != null) {
			                if(((ExprAditContext)_localctx).exprMult.dataType != ((ExprAditContext)_localctx).exprAdit_.dataType) {
			                    errors+="Error semántico en línea " + (((ExprAditContext)_localctx).exprAdit_!=null?(((ExprAditContext)_localctx).exprAdit_.start):null).getLine() +
			                    ": tipos incompatibles (esperado " + ((ExprAditContext)_localctx).exprMult.dataType + "," +
			                    " encontrado " + ((ExprAditContext)_localctx).exprAdit_.dataType + ")\n";
			                }
			                ((ExprAditContext)_localctx).dataType =  ((ExprAditContext)_localctx).exprAdit_.dataType;
			            } else {
			                ((ExprAditContext)_localctx).dataType =  ((ExprAditContext)_localctx).exprMult.dataType;
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
		public Symbol.DataTypes dataType;
		public ExprMultContext exprMult;
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
		enterRule(_localctx, 54, RULE_exprAdit_);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(ADD);
				setState(396);
				((ExprAdit_Context)_localctx).exprMult = exprMult();
				setState(397);
				exprAdit_();

				            if(((ExprAdit_Context)_localctx).exprMult.dataType != Symbol.DataTypes.INT) {
				                errors += "Error semántico en línea " + (((ExprAdit_Context)_localctx).exprMult!=null?(((ExprAdit_Context)_localctx).exprMult.start):null).getLine() +
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprAdit_Context)_localctx).exprMult.dataType + ")\n";
				            }
				            ((ExprAdit_Context)_localctx).dataType =  Symbol.DataTypes.INT;
				        
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(SUB);
				setState(401);
				((ExprAdit_Context)_localctx).exprMult = exprMult();
				setState(402);
				exprAdit_();

				            if(((ExprAdit_Context)_localctx).exprMult.dataType != Symbol.DataTypes.INT) {
				                errors += "Error semántico en línea " + (((ExprAdit_Context)_localctx).exprMult!=null?(((ExprAdit_Context)_localctx).exprMult.start):null).getLine() +
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprAdit_Context)_localctx).exprMult.dataType + ")\n";
				            }
				            ((ExprAdit_Context)_localctx).dataType =  Symbol.DataTypes.INT;
					    
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
		enterRule(_localctx, 56, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			((ExprMultContext)_localctx).exprNeg = exprNeg();
			setState(409);
			((ExprMultContext)_localctx).exprMult_ = exprMult_();

				        if(((ExprMultContext)_localctx).exprMult_.dataType != null) {
			                if(((ExprMultContext)_localctx).exprNeg.dataType != ((ExprMultContext)_localctx).exprMult_.dataType) {
			                    errors+="Error semántico en línea " + (((ExprMultContext)_localctx).exprMult_!=null?(((ExprMultContext)_localctx).exprMult_.start):null).getLine() +
			                    ": tipos incompatibles (esperado "+ ((ExprMultContext)_localctx).exprMult_.dataType + "," +
			                    " encontrado " + ((ExprMultContext)_localctx).exprNeg.dataType + ")\n";
			                }
			                ((ExprMultContext)_localctx).dataType =  ((ExprMultContext)_localctx).exprMult_.dataType;
			            } else {
			                ((ExprMultContext)_localctx).dataType =  ((ExprMultContext)_localctx).exprNeg.dataType;
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
		public Symbol.DataTypes dataType;
		public ExprNegContext exprNeg;
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
		enterRule(_localctx, 58, RULE_exprMult_);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(MULT);
				setState(413);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(414);
				exprMult_();

				            if(((ExprMult_Context)_localctx).exprNeg.dataType != Symbol.DataTypes.INT) {
				                errors += "Error semántico en línea " + (((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine() +
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprMult_Context)_localctx).exprNeg.dataType + ")\n";
				            }
				            ((ExprMult_Context)_localctx).dataType =  Symbol.DataTypes.INT;
					    
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(DIV);
				setState(418);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(419);
				exprMult_();

				            if(((ExprMult_Context)_localctx).exprNeg.dataType != Symbol.DataTypes.INT) {
				                errors += "Error semántico en línea " + (((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine() +
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprMult_Context)_localctx).exprNeg.dataType + ")\n";
				            } else if(((ExprMult_Context)_localctx).exprNeg.zero) {
				                errors+="Error semántico en línea " + (((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine() +
				                ": división por cero\n";
				            }
				            ((ExprMult_Context)_localctx).dataType =  Symbol.DataTypes.INT;
					    
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(MOD);
				setState(423);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(424);
				exprMult_();

					        if(((ExprMult_Context)_localctx).exprNeg.dataType != Symbol.DataTypes.INT) {
				                errors += "Error semántico en línea " + (((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine() +
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprMult_Context)_localctx).exprNeg.dataType + ")\n";
				            } else if(((ExprMult_Context)_localctx).exprNeg.zero) {
				                errors+="Error semántico en línea " + (((ExprMult_Context)_localctx).exprNeg!=null?(((ExprMult_Context)_localctx).exprNeg.start):null).getLine() +
				                ": módulo por cero\n";
				            }
						    ((ExprMult_Context)_localctx).dataType =  Symbol.DataTypes.INT;
					    
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
		public PrimaryContext primary;
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
		enterRule(_localctx, 60, RULE_exprNeg);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(SUB);
				setState(431);
				((ExprNegContext)_localctx).primary = primary();

				            if(((ExprNegContext)_localctx).primary.dataType != Symbol.DataTypes.INT) {
				                errors+="Error semántico en línea " + (((ExprNegContext)_localctx).primary!=null?(((ExprNegContext)_localctx).primary.start):null).getLine()+
				                ": tipos incompatibles (esperado INT, encontrado " + ((ExprNegContext)_localctx).primary.dataType +")\n";
				            }
					        ((ExprNegContext)_localctx).dataType =  Symbol.DataTypes.INT;
				            ((ExprNegContext)_localctx).zero =  ((ExprNegContext)_localctx).primary.zero;
					    
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				((ExprNegContext)_localctx).primary = primary();

					        ((ExprNegContext)_localctx).dataType =  ((ExprNegContext)_localctx).primary.dataType;
				            ((ExprNegContext)_localctx).zero =  ((ExprNegContext)_localctx).primary.zero;
					    
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
		public ExprContext expr;
		public ReferenceContext reference;
		public LiteralContext literal;
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
		enterRule(_localctx, 62, RULE_primary);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(LPAREN);
				setState(440);
				((PrimaryContext)_localctx).expr = expr();
				setState(441);
				match(RPAREN);

					        ((PrimaryContext)_localctx).dataType =  ((PrimaryContext)_localctx).expr.dataType;
				            ((PrimaryContext)_localctx).zero =  false;
					    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				((PrimaryContext)_localctx).reference = reference(false);

					        if(((PrimaryContext)_localctx).reference.symbol == null) {
				                errors += "Error semántico en línea " + (((PrimaryContext)_localctx).reference!=null?(((PrimaryContext)_localctx).reference.start):null).getLine()+
				                ": tipos incompatibles (encontrado NULL)\n";
				                ((PrimaryContext)_localctx).dataType =  Symbol.DataTypes.NULL;
				            } else {
				                ((PrimaryContext)_localctx).dataType = ((PrimaryContext)_localctx).reference.symbol.dataType();
				                if(((PrimaryContext)_localctx).reference.symbol.getType() == Symbol.Types.CONST && ((PrimaryContext)_localctx).reference.symbol.dataType() == Symbol.DataTypes.INT) {
				                    ((PrimaryContext)_localctx).zero =  ((PrimaryContext)_localctx).reference.symbol.getValue().equals("0");
				                } else if(((PrimaryContext)_localctx).reference.table != null && ((PrimaryContext)_localctx).reference.dimCheck) {
				                    ((PrimaryContext)_localctx).dataType =  ((PrimaryContext)_localctx).reference.symbol.getTable().dataType();
				                }
				            }
					    
				}
				break;
			case LiteralInteger:
			case LiteralBoolean:
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				((PrimaryContext)_localctx).literal = literal();

				            ((PrimaryContext)_localctx).dataType =  ((PrimaryContext)_localctx).literal.dataType;
				            ((PrimaryContext)_localctx).zero =  ((PrimaryContext)_localctx).literal.zero;
				        
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
		enterRule(_localctx, 64, RULE_type);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(INTEGER);

				    		((TypeContext)_localctx).dataType =  Symbol.DataTypes.INT;
				    	
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(BOOLEAN);

				    		((TypeContext)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
				    	
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(STRING);

				    		((TypeContext)_localctx).dataType =  Symbol.DataTypes.STRING;
				        
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
		public Symbol.DataTypes dataType;
		public boolean zero;
		public Token LiteralInteger;
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
		enterRule(_localctx, 66, RULE_literal);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((LiteralContext)_localctx).LiteralInteger = match(LiteralInteger);

				            ((LiteralContext)_localctx).dataType =  Symbol.DataTypes.INT;
				            ((LiteralContext)_localctx).zero =  ((LiteralContext)_localctx).LiteralInteger.getText().equals("0");
				        
				}
				break;
			case LiteralBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(LiteralBoolean);

				            ((LiteralContext)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
				            ((LiteralContext)_localctx).zero =  false;
				        
				}
				break;
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(LiteralString);

				            ((LiteralContext)_localctx).dataType =  Symbol.DataTypes.STRING;
				            ((LiteralContext)_localctx).zero =  false;
				        
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
		"\u0004\u00011\u01d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0003\u0000G\b\u0000\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f"+
		"\u0000M\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001V\b\u0001\n\u0001\f\u0001Y\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002e\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002y\b\u0002\n\u0002\f\u0002|\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0082\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00af\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00bb\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\t\u00c3\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00cc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00d4\b\f\n\f\f\f\u00d7\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e3"+
		"\b\f\n\f\f\f\u00e6\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00ef\b\f\n\f\f\f\u00f2\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00fe\b\f\n"+
		"\f\f\f\u0101\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u010a\b\f\n\f\f\f\u010d\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0127\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0137\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0148"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0157\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0166"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0172"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u017b\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0186\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0197\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01ad\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01b6\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01c3\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01cb\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01d3\b!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000"+
		"\u0000\u01e3\u0000D\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000"+
		"\u0004\u0081\u0001\u0000\u0000\u0000\u0006\u0083\u0001\u0000\u0000\u0000"+
		"\b\u00a2\u0001\u0000\u0000\u0000\n\u00a8\u0001\u0000\u0000\u0000\f\u00aa"+
		"\u0001\u0000\u0000\u0000\u000e\u00ba\u0001\u0000\u0000\u0000\u0010\u00bc"+
		"\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000\u0000\u0000\u0014\u00c4"+
		"\u0001\u0000\u0000\u0000\u0016\u00cb\u0001\u0000\u0000\u0000\u0018\u0126"+
		"\u0001\u0000\u0000\u0000\u001a\u0136\u0001\u0000\u0000\u0000\u001c\u0138"+
		"\u0001\u0000\u0000\u0000\u001e\u0147\u0001\u0000\u0000\u0000 \u0149\u0001"+
		"\u0000\u0000\u0000\"\u0156\u0001\u0000\u0000\u0000$\u0158\u0001\u0000"+
		"\u0000\u0000&\u015b\u0001\u0000\u0000\u0000(\u0165\u0001\u0000\u0000\u0000"+
		"*\u0167\u0001\u0000\u0000\u0000,\u0171\u0001\u0000\u0000\u0000.\u017a"+
		"\u0001\u0000\u0000\u00000\u017c\u0001\u0000\u0000\u00002\u0185\u0001\u0000"+
		"\u0000\u00004\u0187\u0001\u0000\u0000\u00006\u0196\u0001\u0000\u0000\u0000"+
		"8\u0198\u0001\u0000\u0000\u0000:\u01ac\u0001\u0000\u0000\u0000<\u01b5"+
		"\u0001\u0000\u0000\u0000>\u01c2\u0001\u0000\u0000\u0000@\u01ca\u0001\u0000"+
		"\u0000\u0000B\u01d2\u0001\u0000\u0000\u0000DF\u0006\u0000\uffff\uffff"+
		"\u0000EG\u0003\u0002\u0001\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GK\u0001\u0000\u0000\u0000HJ\u0003\u0004\u0002\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NO\u0003\u0012\t\u0000OP\u0005\u0000\u0000\u0001PQ\u0006\u0000\uffff"+
		"\uffff\u0000Q\u0001\u0001\u0000\u0000\u0000RS\u0005\u0002\u0000\u0000"+
		"SW\u0005\u0019\u0000\u0000TV\u0003\u0004\u0002\u0000UT\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0003"+
		"\u0014\n\u0000[\\\u0005\u001a\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000"+
		"]^\u0003@ \u0000^_\u0005.\u0000\u0000_d\u0006\u0002\uffff\uffff\u0000"+
		"`a\u0005\u001f\u0000\u0000ab\u0003$\u0012\u0000bc\u0006\u0002\uffff\uffff"+
		"\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u001c\u0000\u0000g\u0082"+
		"\u0001\u0000\u0000\u0000hi\u0005\u0004\u0000\u0000ij\u0003@ \u0000jk\u0005"+
		".\u0000\u0000kl\u0006\u0002\uffff\uffff\u0000lm\u0005\u001f\u0000\u0000"+
		"mn\u0003B!\u0000no\u0005\u001c\u0000\u0000op\u0006\u0002\uffff\uffff\u0000"+
		"p\u0082\u0001\u0000\u0000\u0000q\u0082\u0003\u0006\u0003\u0000rs\u0005"+
		"\u0005\u0000\u0000st\u0003@ \u0000tu\u0003\f\u0006\u0000uv\u0005\u0019"+
		"\u0000\u0000vz\u0006\u0002\uffff\uffff\u0000wy\u0003\u0004\u0002\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0003\u0014\n\u0000~\u007f\u0005\u001a\u0000\u0000\u007f"+
		"\u0080\u0006\u0002\uffff\uffff\u0000\u0080\u0082\u0001\u0000\u0000\u0000"+
		"\u0081]\u0001\u0000\u0000\u0000\u0081h\u0001\u0000\u0000\u0000\u0081q"+
		"\u0001\u0000\u0000\u0000\u0081r\u0001\u0000\u0000\u0000\u0082\u0005\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0003@ \u0000\u0084\u0085\u0005.\u0000"+
		"\u0000\u0085\u0086\u0005\u0017\u0000\u0000\u0086\u008b\u0006\u0003\uffff"+
		"\uffff\u0000\u0087\u0088\u0003\n\u0005\u0000\u0088\u0089\u0005\u0001\u0000"+
		"\u0000\u0089\u008a\u0006\u0003\uffff\uffff\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0003\n\u0005"+
		"\u0000\u008e\u008f\u0006\u0003\uffff\uffff\u0000\u008f\u0090\u0003\b\u0004"+
		"\u0000\u0090\u0091\u0006\u0003\uffff\uffff\u0000\u0091\u0092\u0005\u0018"+
		"\u0000\u0000\u0092\u0093\u0005\u001c\u0000\u0000\u0093\u0007\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0018\u0000\u0000\u0095\u0096\u0005\u0017"+
		"\u0000\u0000\u0096\u009b\u0006\u0004\uffff\uffff\u0000\u0097\u0098\u0003"+
		"\n\u0005\u0000\u0098\u0099\u0005\u0001\u0000\u0000\u0099\u009a\u0006\u0004"+
		"\uffff\uffff\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0097\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0003\n\u0005\u0000\u009e\u009f\u0006\u0004"+
		"\uffff\uffff\u0000\u009f\u00a0\u0003\b\u0004\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u0094\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\t\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005.\u0000\u0000\u00a5\u00a9\u0006\u0005\uffff\uffff"+
		"\u0000\u00a6\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a9\u0006\u0005\uffff"+
		"\uffff\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u000b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005.\u0000"+
		"\u0000\u00ab\u00ac\u0006\u0006\uffff\uffff\u0000\u00ac\u00ae\u0005\u0015"+
		"\u0000\u0000\u00ad\u00af\u0003\u000e\u0007\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u0016\u0000\u0000\u00b1\r\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0003\u0010\b\u0000\u00b3\u00b4\u0005\u001b\u0000\u0000"+
		"\u00b4\u00b5\u0006\u0007\uffff\uffff\u0000\u00b5\u00b6\u0003\u000e\u0007"+
		"\u0000\u00b6\u00bb\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0010\b\u0000"+
		"\u00b8\u00b9\u0006\u0007\uffff\uffff\u0000\u00b9\u00bb\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b2\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bb\u000f\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003@ \u0000\u00bd"+
		"\u00be\u0005.\u0000\u0000\u00be\u00bf\u0006\b\uffff\uffff\u0000\u00bf"+
		"\u0011\u0001\u0000\u0000\u0000\u00c0\u00c3\u0003\u0014\n\u0000\u00c1\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0018\f\u0000\u00c5\u00c6\u0003\u0016\u000b\u0000\u00c6\u0015\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0003\u0018\f\u0000\u00c8\u00c9\u0003\u0016"+
		"\u000b\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u0017\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\f\u0000"+
		"\u0000\u00ce\u00cf\u0003$\u0012\u0000\u00cf\u00d0\u0006\f\uffff\uffff"+
		"\u0000\u00d0\u00d1\u0005\u0019\u0000\u0000\u00d1\u00d5\u0006\f\uffff\uffff"+
		"\u0000\u00d2\u00d4\u0003\u0004\u0002\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u0014\n\u0000"+
		"\u00d9\u00da\u0006\f\uffff\uffff\u0000\u00da\u00db\u0005\u001a\u0000\u0000"+
		"\u00db\u0127\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\f\u0000\u0000\u00dd"+
		"\u00de\u0003$\u0012\u0000\u00de\u00df\u0006\f\uffff\uffff\u0000\u00df"+
		"\u00e0\u0005\u0019\u0000\u0000\u00e0\u00e4\u0006\f\uffff\uffff\u0000\u00e1"+
		"\u00e3\u0003\u0004\u0002\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\u0014\n\u0000\u00e8\u00e9"+
		"\u0006\f\uffff\uffff\u0000\u00e9\u00ea\u0005\u001a\u0000\u0000\u00ea\u00eb"+
		"\u0005\r\u0000\u0000\u00eb\u00ec\u0005\u0019\u0000\u0000\u00ec\u00f0\u0006"+
		"\f\uffff\uffff\u0000\u00ed\u00ef\u0003\u0004\u0002\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003"+
		"\u0014\n\u0000\u00f4\u00f5\u0006\f\uffff\uffff\u0000\u00f5\u00f6\u0005"+
		"\u001a\u0000\u0000\u00f6\u0127\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\n\u0000\u0000\u00f8\u00f9\u0003$\u0012\u0000\u00f9\u00fa\u0006\f\uffff"+
		"\uffff\u0000\u00fa\u00fb\u0005\u0019\u0000\u0000\u00fb\u00ff\u0006\f\uffff"+
		"\uffff\u0000\u00fc\u00fe\u0003\u0004\u0002\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u0014"+
		"\n\u0000\u0103\u0104\u0006\f\uffff\uffff\u0000\u0104\u0105\u0005\u001a"+
		"\u0000\u0000\u0105\u0127\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u000b"+
		"\u0000\u0000\u0107\u010b\u0005\u0019\u0000\u0000\u0108\u010a\u0003\u0004"+
		"\u0002\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0003\u0014\n\u0000\u010f\u0110\u0005\u001a\u0000"+
		"\u0000\u0110\u0111\u0005\n\u0000\u0000\u0111\u0112\u0003$\u0012\u0000"+
		"\u0112\u0113\u0005\u001c\u0000\u0000\u0113\u0127\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\u0006\u0000\u0000\u0115\u0116\u0003$\u0012\u0000\u0116"+
		"\u0117\u0005\u001c\u0000\u0000\u0117\u0118\u0006\f\uffff\uffff\u0000\u0118"+
		"\u0127\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0006\u0000\u0000\u011a"+
		"\u011b\u0005\u001c\u0000\u0000\u011b\u0127\u0006\f\uffff\uffff\u0000\u011c"+
		"\u011d\u0003\u001a\r\u0000\u011d\u011e\u0005\u001f\u0000\u0000\u011e\u011f"+
		"\u0003$\u0012\u0000\u011f\u0120\u0005\u001c\u0000\u0000\u0120\u0121\u0006"+
		"\f\uffff\uffff\u0000\u0121\u0127\u0001\u0000\u0000\u0000\u0122\u0123\u0003"+
		"\u001a\r\u0000\u0123\u0124\u0005\u001c\u0000\u0000\u0124\u0125\u0006\f"+
		"\uffff\uffff\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u00cd\u0001"+
		"\u0000\u0000\u0000\u0126\u00dc\u0001\u0000\u0000\u0000\u0126\u00f7\u0001"+
		"\u0000\u0000\u0000\u0126\u0106\u0001\u0000\u0000\u0000\u0126\u0114\u0001"+
		"\u0000\u0000\u0000\u0126\u0119\u0001\u0000\u0000\u0000\u0126\u011c\u0001"+
		"\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127\u0019\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005.\u0000\u0000\u0129\u0137\u0006\r"+
		"\uffff\uffff\u0000\u012a\u012b\u0003\u001c\u000e\u0000\u012b\u012c\u0005"+
		"\u0018\u0000\u0000\u012c\u012d\u0006\r\uffff\uffff\u0000\u012d\u0137\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005.\u0000\u0000\u012f\u0130\u0005\u0015"+
		"\u0000\u0000\u0130\u0131\u0005\u0016\u0000\u0000\u0131\u0137\u0006\r\uffff"+
		"\uffff\u0000\u0132\u0133\u0003 \u0010\u0000\u0133\u0134\u0005\u0016\u0000"+
		"\u0000\u0134\u0135\u0006\r\uffff\uffff\u0000\u0135\u0137\u0001\u0000\u0000"+
		"\u0000\u0136\u0128\u0001\u0000\u0000\u0000\u0136\u012a\u0001\u0000\u0000"+
		"\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u0132\u0001\u0000\u0000"+
		"\u0000\u0137\u001b\u0001\u0000\u0000\u0000\u0138\u0139\u0005.\u0000\u0000"+
		"\u0139\u013a\u0005\u0017\u0000\u0000\u013a\u013b\u0003$\u0012\u0000\u013b"+
		"\u013c\u0006\u000e\uffff\uffff\u0000\u013c\u013d\u0003\u001e\u000f\u0000"+
		"\u013d\u013e\u0006\u000e\uffff\uffff\u0000\u013e\u001d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\u0018\u0000\u0000\u0140\u0141\u0005\u0017\u0000"+
		"\u0000\u0141\u0142\u0003$\u0012\u0000\u0142\u0143\u0006\u000f\uffff\uffff"+
		"\u0000\u0143\u0144\u0003\u001e\u000f\u0000\u0144\u0145\u0006\u000f\uffff"+
		"\uffff\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0148\u0006\u000f"+
		"\uffff\uffff\u0000\u0147\u013f\u0001\u0000\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u001f\u0001\u0000\u0000\u0000\u0149\u014a\u0005"+
		".\u0000\u0000\u014a\u014b\u0005\u0015\u0000\u0000\u014b\u014c\u0003$\u0012"+
		"\u0000\u014c\u014d\u0006\u0010\uffff\uffff\u0000\u014d\u014e\u0003\"\u0011"+
		"\u0000\u014e\u014f\u0006\u0010\uffff\uffff\u0000\u014f!\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\u001b\u0000\u0000\u0151\u0152\u0003$\u0012\u0000"+
		"\u0152\u0153\u0006\u0011\uffff\uffff\u0000\u0153\u0154\u0003\"\u0011\u0000"+
		"\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000"+
		"\u0156\u0150\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0157#\u0001\u0000\u0000\u0000\u0158\u0159\u0003&\u0013\u0000\u0159\u015a"+
		"\u0006\u0012\uffff\uffff\u0000\u015a%\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0003*\u0015\u0000\u015c\u015d\u0003(\u0014\u0000\u015d\u015e\u0006\u0013"+
		"\uffff\uffff\u0000\u015e\'\u0001\u0000\u0000\u0000\u015f\u0160\u0005,"+
		"\u0000\u0000\u0160\u0161\u0003*\u0015\u0000\u0161\u0162\u0003(\u0014\u0000"+
		"\u0162\u0163\u0006\u0014\uffff\uffff\u0000\u0163\u0166\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u015f\u0001\u0000\u0000"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166)\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0003.\u0017\u0000\u0168\u0169\u0003,\u0016\u0000\u0169\u016a"+
		"\u0006\u0015\uffff\uffff\u0000\u016a+\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005+\u0000\u0000\u016c\u016d\u0003.\u0017\u0000\u016d\u016e\u0003,"+
		"\u0016\u0000\u016e\u016f\u0006\u0016\uffff\uffff\u0000\u016f\u0172\u0001"+
		"\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016b\u0001"+
		"\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172-\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0005-\u0000\u0000\u0174\u0175\u00030\u0018\u0000"+
		"\u0175\u0176\u0006\u0017\uffff\uffff\u0000\u0176\u017b\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u00030\u0018\u0000\u0178\u0179\u0006\u0017\uffff\uffff"+
		"\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0173\u0001\u0000\u0000"+
		"\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017b/\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u00034\u001a\u0000\u017d\u017e\u00032\u0019\u0000\u017e\u017f"+
		"\u0006\u0018\uffff\uffff\u0000\u017f1\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005\u001e\u0000\u0000\u0181\u0182\u00034\u001a\u0000\u0182\u0183\u0006"+
		"\u0019\uffff\uffff\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0186"+
		"\u0001\u0000\u0000\u0000\u0185\u0180\u0001\u0000\u0000\u0000\u0185\u0184"+
		"\u0001\u0000\u0000\u0000\u01863\u0001\u0000\u0000\u0000\u0187\u0188\u0003"+
		"8\u001c\u0000\u0188\u0189\u00036\u001b\u0000\u0189\u018a\u0006\u001a\uffff"+
		"\uffff\u0000\u018a5\u0001\u0000\u0000\u0000\u018b\u018c\u0005&\u0000\u0000"+
		"\u018c\u018d\u00038\u001c\u0000\u018d\u018e\u00036\u001b\u0000\u018e\u018f"+
		"\u0006\u001b\uffff\uffff\u0000\u018f\u0197\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005\'\u0000\u0000\u0191\u0192\u00038\u001c\u0000\u0192\u0193"+
		"\u00036\u001b\u0000\u0193\u0194\u0006\u001b\uffff\uffff\u0000\u0194\u0197"+
		"\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u018b"+
		"\u0001\u0000\u0000\u0000\u0196\u0190\u0001\u0000\u0000\u0000\u0196\u0195"+
		"\u0001\u0000\u0000\u0000\u01977\u0001\u0000\u0000\u0000\u0198\u0199\u0003"+
		"<\u001e\u0000\u0199\u019a\u0003:\u001d\u0000\u019a\u019b\u0006\u001c\uffff"+
		"\uffff\u0000\u019b9\u0001\u0000\u0000\u0000\u019c\u019d\u0005(\u0000\u0000"+
		"\u019d\u019e\u0003<\u001e\u0000\u019e\u019f\u0003:\u001d\u0000\u019f\u01a0"+
		"\u0006\u001d\uffff\uffff\u0000\u01a0\u01ad\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005)\u0000\u0000\u01a2\u01a3\u0003<\u001e\u0000\u01a3\u01a4\u0003"+
		":\u001d\u0000\u01a4\u01a5\u0006\u001d\uffff\uffff\u0000\u01a5\u01ad\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005*\u0000\u0000\u01a7\u01a8\u0003<\u001e"+
		"\u0000\u01a8\u01a9\u0003:\u001d\u0000\u01a9\u01aa\u0006\u001d\uffff\uffff"+
		"\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ac\u019c\u0001\u0000\u0000\u0000\u01ac\u01a1\u0001\u0000\u0000"+
		"\u0000\u01ac\u01a6\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad;\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\'\u0000\u0000"+
		"\u01af\u01b0\u0003>\u001f\u0000\u01b0\u01b1\u0006\u001e\uffff\uffff\u0000"+
		"\u01b1\u01b6\u0001\u0000\u0000\u0000\u01b2\u01b3\u0003>\u001f\u0000\u01b3"+
		"\u01b4\u0006\u001e\uffff\uffff\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b5\u01ae\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b6=\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u0015\u0000\u0000\u01b8"+
		"\u01b9\u0003$\u0012\u0000\u01b9\u01ba\u0005\u0016\u0000\u0000\u01ba\u01bb"+
		"\u0006\u001f\uffff\uffff\u0000\u01bb\u01c3\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0003\u001a\r\u0000\u01bd\u01be\u0006\u001f\uffff\uffff\u0000\u01be"+
		"\u01c3\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003B!\u0000\u01c0\u01c1\u0006"+
		"\u001f\uffff\uffff\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01b7"+
		"\u0001\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c2\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c3?\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005"+
		"\u0007\u0000\u0000\u01c5\u01cb\u0006 \uffff\uffff\u0000\u01c6\u01c7\u0005"+
		"\b\u0000\u0000\u01c7\u01cb\u0006 \uffff\uffff\u0000\u01c8\u01c9\u0005"+
		"\t\u0000\u0000\u01c9\u01cb\u0006 \uffff\uffff\u0000\u01ca\u01c4\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01cbA\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u0012"+
		"\u0000\u0000\u01cd\u01d3\u0006!\uffff\uffff\u0000\u01ce\u01cf\u0005\u0013"+
		"\u0000\u0000\u01cf\u01d3\u0006!\uffff\uffff\u0000\u01d0\u01d1\u0005\u0014"+
		"\u0000\u0000\u01d1\u01d3\u0006!\uffff\uffff\u0000\u01d2\u01cc\u0001\u0000"+
		"\u0000\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d3C\u0001\u0000\u0000\u0000!FKWdz\u0081\u008b\u009b\u00a2"+
		"\u00a8\u00ae\u00ba\u00c2\u00cb\u00d5\u00e4\u00f0\u00ff\u010b\u0126\u0136"+
		"\u0147\u0156\u0165\u0171\u017a\u0185\u0196\u01ac\u01b5\u01c2\u01ca\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}