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
			    
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(65);
				main();
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(68);
				decl();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			sentsVoid();
			setState(75);
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
			setState(78);
			match(MAIN);
			setState(79);
			match(BEGIN);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
				{
				{
				setState(80);
				decl();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			sents();
			setState(87);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((DeclContext)_localctx).type = type();
				setState(90);
				((DeclContext)_localctx).ID = match(ID);

				            try{
				                symbolTable.insert(((DeclContext)_localctx).ID.getText(),new Symbol(((DeclContext)_localctx).ID.getText(),null,Symbol.Types.VAR,((DeclContext)_localctx).type.dataType));
				            } catch (SymbolTable.SymbolTableException e) {
				                errors+="Error semántico en línea " + ((DeclContext)_localctx).ID.getLine() + ": variable '" + ((DeclContext)_localctx).ID.getText() +
				                "' previamente declarada\n";
				            }
				        
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(92);
					match(ASSIGN);
					setState(93);
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

				setState(98);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(CONSTANT);
				setState(101);
				((DeclContext)_localctx).type = type();
				setState(102);
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
				        
				setState(104);
				match(ASSIGN);
				setState(105);
				((DeclContext)_localctx).literal = literal();
				setState(106);
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
				setState(109);
				arrayDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				((DeclContext)_localctx).FUNCTION = match(FUNCTION);
				setState(111);
				((DeclContext)_localctx).type = type();
				setState(112);
				((DeclContext)_localctx).header = header(((DeclContext)_localctx).type.dataType);
				setState(113);
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
				        
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(115);
					decl();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				sents();
				setState(122);
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
			setState(127);
			type();
			setState(128);
			match(ID);
			setState(129);
			match(LBRACK);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(130);
				number();
				setState(131);
				match(T__0);
				}
				break;
			}
			setState(135);
			number();
			setState(136);
			match(RBRACK);
			setState(137);
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
			setState(139);
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
		enterRule(_localctx, 10, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((HeaderContext)_localctx).ID = match(ID);

				        if(_localctx.dataType != null) {
			                // Función
			                ((HeaderContext)_localctx).procedure =  new Symbol(((HeaderContext)_localctx).ID.getText(), null, Symbol.Types.FUNC, _localctx.dataType);
			            } else {
			                // Procedimiento
			                ((HeaderContext)_localctx).procedure =  new Symbol(((HeaderContext)_localctx).ID.getText(), null, Symbol.Types.PROC, Symbol.DataTypes.NULL);
			            }
				    
			setState(143);
			match(LPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				setState(144);
				params(_localctx.procedure);
				}
			}

			setState(147);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				param();
				setState(150);
				match(COMMA);
				setState(151);
				params(_localctx.prev.getNext());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
		public Symbol symbol;
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
			setState(156);
			type();
			setState(157);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
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
			setState(163);
			sent();
			setState(164);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case WHILE:
			case DO:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				sent();
				setState(167);
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
		enterRule(_localctx, 22, RULE_sent);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((SentContext)_localctx).IF = match(IF);
				setState(173);
				((SentContext)_localctx).expr = expr();

					        if(((SentContext)_localctx).expr.dataType!=Symbol.DataTypes.BOOLEAN) {
				                errors+="Error semántico en línea " + ((SentContext)_localctx).IF.getLine() +
				                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + ((SentContext)_localctx).expr.dataType + "')\n";
				            }
					    
				setState(175);
				match(BEGIN);

					        depthCondition ++;
					        symbolTable = symbolTable.blockIn();
					    
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

					        depthCondition --;
				            symbolTable = symbolTable.blockOut();
					    
				setState(185);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((SentContext)_localctx).IF = match(IF);
				setState(188);
				((SentContext)_localctx).expr = expr();

					        if(((SentContext)_localctx).expr.dataType!=Symbol.DataTypes.BOOLEAN) {
				                errors+="Error semántico en línea " + ((SentContext)_localctx).IF.getLine() +
				                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + ((SentContext)_localctx).expr.dataType + "')\n";
				            }
					    
				setState(190);
				match(BEGIN);

					        depthCondition ++;
					        symbolTable = symbolTable.blockIn();
					    
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(192);
					decl();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				sents();

				            symbolTable = symbolTable.blockOut();
					    
				setState(200);
				match(END);
				setState(201);
				match(ELSE);
				setState(202);
				match(BEGIN);

					        symbolTable = symbolTable.blockIn();
					    
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(204);
					decl();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				sents();

					        depthCondition --;
				            symbolTable = symbolTable.blockOut();
					    
				setState(212);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(WHILE);
				setState(215);
				expr();
				setState(216);
				match(BEGIN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 944L) != 0) {
					{
					{
					setState(217);
					decl();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				sents();
				setState(224);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(DO);
				setState(227);
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
				sents();
				setState(235);
				match(END);
				setState(236);
				match(WHILE);
				setState(237);
				expr();
				setState(238);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				((SentContext)_localctx).RETURN = match(RETURN);
				setState(241);
				((SentContext)_localctx).expr = expr();
				setState(242);
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
				setState(245);
				((SentContext)_localctx).RETURN = match(RETURN);
				setState(246);
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
				setState(248);
				((SentContext)_localctx).reference = reference(true);
				setState(249);
				((SentContext)_localctx).ASSIGN = match(ASSIGN);
				setState(250);
				((SentContext)_localctx).expr = expr();
				setState(251);
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
				setState(254);
				((SentContext)_localctx).reference = reference(false);
				setState(255);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
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
				setState(262);
				idx();
				setState(263);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(ID);
				setState(266);
				match(LPAREN);
				setState(267);
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
			setState(270);
			match(ID);
			setState(271);
			match(LBRACK);
			setState(272);
			expr();
			setState(273);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
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
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(COMMA);
				setState(284);
				expr();
				setState(285);
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
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 34, RULE_exprOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((ExprOrContext)_localctx).exprAnd = exprAnd();
			setState(294);
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
		enterRule(_localctx, 36, RULE_exprOr_);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(OR);
				setState(298);
				((ExprOr_Context)_localctx).exprAnd = exprAnd();
				setState(299);
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
		enterRule(_localctx, 38, RULE_exprAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((ExprAndContext)_localctx).exprNot = exprNot();
			setState(306);
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
		enterRule(_localctx, 40, RULE_exprAnd_);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(AND);
				setState(310);
				((ExprAnd_Context)_localctx).exprNot = exprNot();
				setState(311);
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
		enterRule(_localctx, 42, RULE_exprNot);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(NOT);
				setState(318);
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
				setState(321);
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
		enterRule(_localctx, 44, RULE_exprComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			((ExprCompContext)_localctx).exprAdit = exprAdit();
			setState(327);
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
		enterRule(_localctx, 46, RULE_exprComp_);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPREL:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(OPREL);
				setState(331);
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
		enterRule(_localctx, 48, RULE_exprAdit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((ExprAditContext)_localctx).exprMult = exprMult();
			setState(338);
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
		enterRule(_localctx, 50, RULE_exprAdit_);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(ADD);
				setState(342);
				((ExprAdit_Context)_localctx).exprMult = exprMult();
				setState(343);
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
				setState(346);
				match(SUB);
				setState(347);
				((ExprAdit_Context)_localctx).exprMult = exprMult();
				setState(348);
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
		enterRule(_localctx, 52, RULE_exprMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((ExprMultContext)_localctx).exprNeg = exprNeg();
			setState(355);
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
		enterRule(_localctx, 54, RULE_exprMult_);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(MULT);
				setState(359);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(360);
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
				setState(363);
				match(DIV);
				setState(364);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(365);
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
				setState(368);
				match(MOD);
				setState(369);
				((ExprMult_Context)_localctx).exprNeg = exprNeg();
				setState(370);
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
		enterRule(_localctx, 56, RULE_exprNeg);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(SUB);
				setState(377);
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
				setState(380);
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
		enterRule(_localctx, 58, RULE_primary);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(LPAREN);
				setState(386);
				((PrimaryContext)_localctx).expr = expr();
				setState(387);
				match(RPAREN);

					        ((PrimaryContext)_localctx).dataType =  ((PrimaryContext)_localctx).expr.dataType;
				            ((PrimaryContext)_localctx).zero =  false;
					    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
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
				setState(393);
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
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(INTEGER);

				    		((TypeContext)_localctx).dataType =  Symbol.DataTypes.INT;
				    	
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(BOOLEAN);

				    		((TypeContext)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
				    	
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
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
		enterRule(_localctx, 62, RULE_literal);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((LiteralContext)_localctx).LiteralInteger = match(LiteralInteger);

				            ((LiteralContext)_localctx).dataType =  Symbol.DataTypes.INT;
				            ((LiteralContext)_localctx).zero =  ((LiteralContext)_localctx).LiteralInteger.getText().equals("0");
				        
				}
				break;
			case LiteralBoolean:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(LiteralBoolean);

				            ((LiteralContext)_localctx).dataType =  Symbol.DataTypes.BOOLEAN;
				            ((LiteralContext)_localctx).zero =  false;
				        
				}
				break;
			case LiteralString:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
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
		"\u0004\u00011\u019f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0003\u0000C\b\u0000"+
		"\u0001\u0000\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001R\b\u0001\n\u0001\f\u0001U\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002u\b\u0002"+
		"\n\u0002\f\u0002x\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002~\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0092\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u009b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003"+
		"\b\u00a2\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00b3\b\u000b\n\u000b\f\u000b\u00b6\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c2\b\u000b\n"+
		"\u000b\f\u000b\u00c5\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ce\b\u000b\n"+
		"\u000b\f\u000b\u00d1\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00db"+
		"\b\u000b\n\u000b\f\u000b\u00de\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e6\b\u000b\n\u000b"+
		"\f\u000b\u00e9\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0103\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u011a\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0121\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0130\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u013c\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0145\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0150\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0161\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0177\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0180\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u018d\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0195\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u019d\b\u001f\u0001\u001f\u0000\u0000 \u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>\u0000\u0001\u0002\u0000\u0012\u0012..\u01ab\u0000"+
		"@\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004}\u0001"+
		"\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b\u008b\u0001\u0000"+
		"\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u009a\u0001\u0000\u0000"+
		"\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000"+
		"\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000"+
		"\u0000\u0016\u0102\u0001\u0000\u0000\u0000\u0018\u010c\u0001\u0000\u0000"+
		"\u0000\u001a\u010e\u0001\u0000\u0000\u0000\u001c\u0119\u0001\u0000\u0000"+
		"\u0000\u001e\u0120\u0001\u0000\u0000\u0000 \u0122\u0001\u0000\u0000\u0000"+
		"\"\u0125\u0001\u0000\u0000\u0000$\u012f\u0001\u0000\u0000\u0000&\u0131"+
		"\u0001\u0000\u0000\u0000(\u013b\u0001\u0000\u0000\u0000*\u0144\u0001\u0000"+
		"\u0000\u0000,\u0146\u0001\u0000\u0000\u0000.\u014f\u0001\u0000\u0000\u0000"+
		"0\u0151\u0001\u0000\u0000\u00002\u0160\u0001\u0000\u0000\u00004\u0162"+
		"\u0001\u0000\u0000\u00006\u0176\u0001\u0000\u0000\u00008\u017f\u0001\u0000"+
		"\u0000\u0000:\u018c\u0001\u0000\u0000\u0000<\u0194\u0001\u0000\u0000\u0000"+
		">\u019c\u0001\u0000\u0000\u0000@B\u0006\u0000\uffff\uffff\u0000AC\u0003"+
		"\u0002\u0001\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CG\u0001\u0000\u0000\u0000DF\u0003\u0004\u0002\u0000ED\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0003"+
		"\u0010\b\u0000KL\u0005\u0000\u0000\u0001LM\u0006\u0000\uffff\uffff\u0000"+
		"M\u0001\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000\u0000OS\u0005\u0019"+
		"\u0000\u0000PR\u0003\u0004\u0002\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003\u0012\t\u0000"+
		"WX\u0005\u001a\u0000\u0000X\u0003\u0001\u0000\u0000\u0000YZ\u0003<\u001e"+
		"\u0000Z[\u0005.\u0000\u0000[`\u0006\u0002\uffff\uffff\u0000\\]\u0005\u001f"+
		"\u0000\u0000]^\u0003 \u0010\u0000^_\u0006\u0002\uffff\uffff\u0000_a\u0001"+
		"\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0005\u001c\u0000\u0000c~\u0001\u0000\u0000"+
		"\u0000de\u0005\u0004\u0000\u0000ef\u0003<\u001e\u0000fg\u0005.\u0000\u0000"+
		"gh\u0006\u0002\uffff\uffff\u0000hi\u0005\u001f\u0000\u0000ij\u0003>\u001f"+
		"\u0000jk\u0005\u001c\u0000\u0000kl\u0006\u0002\uffff\uffff\u0000l~\u0001"+
		"\u0000\u0000\u0000m~\u0003\u0006\u0003\u0000no\u0005\u0005\u0000\u0000"+
		"op\u0003<\u001e\u0000pq\u0003\n\u0005\u0000qr\u0005\u0019\u0000\u0000"+
		"rv\u0006\u0002\uffff\uffff\u0000su\u0003\u0004\u0002\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u0003\u0012\t\u0000z{\u0005\u001a\u0000\u0000{|\u0006\u0002\uffff\uffff"+
		"\u0000|~\u0001\u0000\u0000\u0000}Y\u0001\u0000\u0000\u0000}d\u0001\u0000"+
		"\u0000\u0000}m\u0001\u0000\u0000\u0000}n\u0001\u0000\u0000\u0000~\u0005"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0003<\u001e\u0000\u0080\u0081\u0005"+
		".\u0000\u0000\u0081\u0085\u0005\u0017\u0000\u0000\u0082\u0083\u0003\b"+
		"\u0004\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0003\b\u0004"+
		"\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008a\u0005\u001c\u0000"+
		"\u0000\u008a\u0007\u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0000\u0000"+
		"\u0000\u008c\t\u0001\u0000\u0000\u0000\u008d\u008e\u0005.\u0000\u0000"+
		"\u008e\u008f\u0006\u0005\uffff\uffff\u0000\u008f\u0091\u0005\u0015\u0000"+
		"\u0000\u0090\u0092\u0003\f\u0006\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\u0016\u0000\u0000\u0094\u000b\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0003\u000e\u0007\u0000\u0096\u0097\u0005\u001b\u0000\u0000"+
		"\u0097\u0098\u0003\f\u0006\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0003\u000e\u0007\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009a"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\r\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0003<\u001e\u0000\u009d\u009e\u0005.\u0000\u0000\u009e\u000f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0003\u0012\t\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u0016\u000b"+
		"\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u0013\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u0016\u000b\u0000\u00a7\u00a8\u0003\u0014\n\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\f\u0000\u0000\u00ad\u00ae"+
		"\u0003 \u0010\u0000\u00ae\u00af\u0006\u000b\uffff\uffff\u0000\u00af\u00b0"+
		"\u0005\u0019\u0000\u0000\u00b0\u00b4\u0006\u000b\uffff\uffff\u0000\u00b1"+
		"\u00b3\u0003\u0004\u0002\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0012\t\u0000\u00b8\u00b9"+
		"\u0006\u000b\uffff\uffff\u0000\u00b9\u00ba\u0005\u001a\u0000\u0000\u00ba"+
		"\u0103\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc\u00bd"+
		"\u0003 \u0010\u0000\u00bd\u00be\u0006\u000b\uffff\uffff\u0000\u00be\u00bf"+
		"\u0005\u0019\u0000\u0000\u00bf\u00c3\u0006\u000b\uffff\uffff\u0000\u00c0"+
		"\u00c2\u0003\u0004\u0002\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0012\t\u0000\u00c7\u00c8"+
		"\u0006\u000b\uffff\uffff\u0000\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9"+
		"\u00ca\u0005\r\u0000\u0000\u00ca\u00cb\u0005\u0019\u0000\u0000\u00cb\u00cf"+
		"\u0006\u000b\uffff\uffff\u0000\u00cc\u00ce\u0003\u0004\u0002\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0003\u0012\t\u0000\u00d3\u00d4\u0006\u000b\uffff\uffff\u0000\u00d4"+
		"\u00d5\u0005\u001a\u0000\u0000\u00d5\u0103\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\n\u0000\u0000\u00d7\u00d8\u0003 \u0010\u0000\u00d8\u00dc"+
		"\u0005\u0019\u0000\u0000\u00d9\u00db\u0003\u0004\u0002\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0003\u0012\t\u0000\u00e0\u00e1\u0005\u001a\u0000\u0000\u00e1\u0103\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005\u000b\u0000\u0000\u00e3\u00e7\u0005"+
		"\u0019\u0000\u0000\u00e4\u00e6\u0003\u0004\u0002\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003"+
		"\u0012\t\u0000\u00eb\u00ec\u0005\u001a\u0000\u0000\u00ec\u00ed\u0005\n"+
		"\u0000\u0000\u00ed\u00ee\u0003 \u0010\u0000\u00ee\u00ef\u0005\u001c\u0000"+
		"\u0000\u00ef\u0103\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0006\u0000"+
		"\u0000\u00f1\u00f2\u0003 \u0010\u0000\u00f2\u00f3\u0005\u001c\u0000\u0000"+
		"\u00f3\u00f4\u0006\u000b\uffff\uffff\u0000\u00f4\u0103\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005\u0006\u0000\u0000\u00f6\u00f7\u0005\u001c\u0000"+
		"\u0000\u00f7\u0103\u0006\u000b\uffff\uffff\u0000\u00f8\u00f9\u0003\u0018"+
		"\f\u0000\u00f9\u00fa\u0005\u001f\u0000\u0000\u00fa\u00fb\u0003 \u0010"+
		"\u0000\u00fb\u00fc\u0005\u001c\u0000\u0000\u00fc\u00fd\u0006\u000b\uffff"+
		"\uffff\u0000\u00fd\u0103\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\u0018"+
		"\f\u0000\u00ff\u0100\u0005\u001c\u0000\u0000\u0100\u0101\u0006\u000b\uffff"+
		"\uffff\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00ac\u0001\u0000"+
		"\u0000\u0000\u0102\u00bb\u0001\u0000\u0000\u0000\u0102\u00d6\u0001\u0000"+
		"\u0000\u0000\u0102\u00e2\u0001\u0000\u0000\u0000\u0102\u00f0\u0001\u0000"+
		"\u0000\u0000\u0102\u00f5\u0001\u0000\u0000\u0000\u0102\u00f8\u0001\u0000"+
		"\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0103\u0017\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005.\u0000\u0000\u0105\u010d\u0006\f\uffff"+
		"\uffff\u0000\u0106\u0107\u0003\u001a\r\u0000\u0107\u0108\u0005\u0018\u0000"+
		"\u0000\u0108\u010d\u0001\u0000\u0000\u0000\u0109\u010a\u0005.\u0000\u0000"+
		"\u010a\u010b\u0005\u0015\u0000\u0000\u010b\u010d\u0005\u0016\u0000\u0000"+
		"\u010c\u0104\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000"+
		"\u010c\u0109\u0001\u0000\u0000\u0000\u010d\u0019\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005.\u0000\u0000\u010f\u0110\u0005\u0017\u0000\u0000\u0110"+
		"\u0111\u0003 \u0010\u0000\u0111\u0112\u0003\u001c\u000e\u0000\u0112\u001b"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0018\u0000\u0000\u0114\u0115"+
		"\u0005\u0017\u0000\u0000\u0115\u0116\u0003 \u0010\u0000\u0116\u0117\u0003"+
		"\u001c\u000e\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u001d\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\u001b\u0000\u0000\u011c\u011d\u0003 \u0010\u0000\u011d\u011e\u0003\u001e"+
		"\u000f\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000"+
		"\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u001f\u0001\u0000\u0000\u0000\u0122\u0123\u0003\"\u0011"+
		"\u0000\u0123\u0124\u0006\u0010\uffff\uffff\u0000\u0124!\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u0003$\u0012\u0000\u0127"+
		"\u0128\u0006\u0011\uffff\uffff\u0000\u0128#\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005,\u0000\u0000\u012a\u012b\u0003&\u0013\u0000\u012b\u012c\u0003"+
		"$\u0012\u0000\u012c\u012d\u0006\u0012\uffff\uffff\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0129\u0001"+
		"\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130%\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0003*\u0015\u0000\u0132\u0133\u0003(\u0014\u0000"+
		"\u0133\u0134\u0006\u0013\uffff\uffff\u0000\u0134\'\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005+\u0000\u0000\u0136\u0137\u0003*\u0015\u0000\u0137\u0138"+
		"\u0003(\u0014\u0000\u0138\u0139\u0006\u0014\uffff\uffff\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0135"+
		"\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c)\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0005-\u0000\u0000\u013e\u013f\u0003,\u0016"+
		"\u0000\u013f\u0140\u0006\u0015\uffff\uffff\u0000\u0140\u0145\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0003,\u0016\u0000\u0142\u0143\u0006\u0015\uffff"+
		"\uffff\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u013d\u0001\u0000"+
		"\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0145+\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u00030\u0018\u0000\u0147\u0148\u0003.\u0017\u0000\u0148"+
		"\u0149\u0006\u0016\uffff\uffff\u0000\u0149-\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\u001e\u0000\u0000\u014b\u014c\u00030\u0018\u0000\u014c\u014d"+
		"\u0006\u0017\uffff\uffff\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u014a\u0001\u0000\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150/\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u00034\u001a\u0000\u0152\u0153\u00032\u0019\u0000\u0153\u0154\u0006\u0018"+
		"\uffff\uffff\u0000\u01541\u0001\u0000\u0000\u0000\u0155\u0156\u0005&\u0000"+
		"\u0000\u0156\u0157\u00034\u001a\u0000\u0157\u0158\u00032\u0019\u0000\u0158"+
		"\u0159\u0006\u0019\uffff\uffff\u0000\u0159\u0161\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005\'\u0000\u0000\u015b\u015c\u00034\u001a\u0000\u015c"+
		"\u015d\u00032\u0019\u0000\u015d\u015e\u0006\u0019\uffff\uffff\u0000\u015e"+
		"\u0161\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160"+
		"\u0155\u0001\u0000\u0000\u0000\u0160\u015a\u0001\u0000\u0000\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u01613\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u00038\u001c\u0000\u0163\u0164\u00036\u001b\u0000\u0164\u0165\u0006\u001a"+
		"\uffff\uffff\u0000\u01655\u0001\u0000\u0000\u0000\u0166\u0167\u0005(\u0000"+
		"\u0000\u0167\u0168\u00038\u001c\u0000\u0168\u0169\u00036\u001b\u0000\u0169"+
		"\u016a\u0006\u001b\uffff\uffff\u0000\u016a\u0177\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005)\u0000\u0000\u016c\u016d\u00038\u001c\u0000\u016d\u016e"+
		"\u00036\u001b\u0000\u016e\u016f\u0006\u001b\uffff\uffff\u0000\u016f\u0177"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0005*\u0000\u0000\u0171\u0172\u0003"+
		"8\u001c\u0000\u0172\u0173\u00036\u001b\u0000\u0173\u0174\u0006\u001b\uffff"+
		"\uffff\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000"+
		"\u0000\u0000\u0176\u0166\u0001\u0000\u0000\u0000\u0176\u016b\u0001\u0000"+
		"\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000"+
		"\u0000\u0000\u01777\u0001\u0000\u0000\u0000\u0178\u0179\u0005\'\u0000"+
		"\u0000\u0179\u017a\u0003:\u001d\u0000\u017a\u017b\u0006\u001c\uffff\uffff"+
		"\u0000\u017b\u0180\u0001\u0000\u0000\u0000\u017c\u017d\u0003:\u001d\u0000"+
		"\u017d\u017e\u0006\u001c\uffff\uffff\u0000\u017e\u0180\u0001\u0000\u0000"+
		"\u0000\u017f\u0178\u0001\u0000\u0000\u0000\u017f\u017c\u0001\u0000\u0000"+
		"\u0000\u01809\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0015\u0000\u0000"+
		"\u0182\u0183\u0003 \u0010\u0000\u0183\u0184\u0005\u0016\u0000\u0000\u0184"+
		"\u0185\u0006\u001d\uffff\uffff\u0000\u0185\u018d\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0003\u0018\f\u0000\u0187\u0188\u0006\u001d\uffff\uffff\u0000"+
		"\u0188\u018d\u0001\u0000\u0000\u0000\u0189\u018a\u0003>\u001f\u0000\u018a"+
		"\u018b\u0006\u001d\uffff\uffff\u0000\u018b\u018d\u0001\u0000\u0000\u0000"+
		"\u018c\u0181\u0001\u0000\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000"+
		"\u018c\u0189\u0001\u0000\u0000\u0000\u018d;\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0005\u0007\u0000\u0000\u018f\u0195\u0006\u001e\uffff\uffff\u0000"+
		"\u0190\u0191\u0005\b\u0000\u0000\u0191\u0195\u0006\u001e\uffff\uffff\u0000"+
		"\u0192\u0193\u0005\t\u0000\u0000\u0193\u0195\u0006\u001e\uffff\uffff\u0000"+
		"\u0194\u018e\u0001\u0000\u0000\u0000\u0194\u0190\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0195=\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0005\u0012\u0000\u0000\u0197\u019d\u0006\u001f\uffff\uffff\u0000"+
		"\u0198\u0199\u0005\u0013\u0000\u0000\u0199\u019d\u0006\u001f\uffff\uffff"+
		"\u0000\u019a\u019b\u0005\u0014\u0000\u0000\u019b\u019d\u0006\u001f\uffff"+
		"\uffff\u0000\u019c\u0196\u0001\u0000\u0000\u0000\u019c\u0198\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d?\u0001\u0000\u0000"+
		"\u0000\u001eBGS`v}\u0085\u0091\u009a\u00a1\u00aa\u00b4\u00c3\u00cf\u00dc"+
		"\u00e7\u0102\u010c\u0119\u0120\u012f\u013b\u0144\u014f\u0160\u0176\u017f"+
		"\u018c\u0194\u019c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}