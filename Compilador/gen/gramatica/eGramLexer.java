// Generated from java-escape by ANTLR 4.11.1
package gramatica;

package gram;
import Main.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class eGramLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MAIN", "VARIABLE", "CONSTANT", "FUNCTION", "RETURN", "INTEGER", 
			"BOOLEAN", "STRING", "WHILE", "DO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"BREAK", "LiteralInteger", "DecimalLiteral", "DecimalPositivo", "LiteralBoolean", 
			"LiteralString", "LetrasString", "LetraString", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "BEGIN", "END", "COMMA", "SEMI", "COLON", "OPREL", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "GT", "LT", "GE", "LE", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "ID", "LETRA", "LETRADIGITO", "WS", "BLOCK_COMMENT", 
			"LINE_COMMENT"
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


	public eGramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "eGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00001\u016b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00dd\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00e1\b\u0013\n\u0013\f\u0013\u00e4\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00f4\b\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00f8\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u00fd"+
		"\b\u0016\u000b\u0016\f\u0016\u00fe\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u011b\b!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00011\u00011\u00051\u0143\b1\n1\f1\u0146\t1\u00012\u00012\u0001"+
		"3\u00013\u00014\u00044\u014d\b4\u000b4\f4\u014e\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00055\u0157\b5\n5\f5\u015a\t5\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00056\u0165\b6\n6\f6\u0168\t6\u0001"+
		"6\u00016\u0001\u0158\u00007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000"+
		"\'\u0000)\u0013+\u0014-\u0000/\u00001\u00153\u00165\u00177\u00189\u0019"+
		";\u001a=\u001b?\u001cA\u001dC\u001eE\u001fG I!K\"M#O$Q%S&U\'W(Y)[*]+_"+
		",a-c.e\u0000g\u0000i/k0m1\u0001\u0000\u0007\u0001\u000019\u0001\u0000"+
		"09\u0005\u0000\n\n\r\r\"\"$$\\\\\u0004\u0000$$AZ__az\u0005\u0000$$09A"+
		"Z__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0172\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k"+
		"\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0001o\u0001\u0000"+
		"\u0000\u0000\u0003r\u0001\u0000\u0000\u0000\u0005y\u0001\u0000\u0000\u0000"+
		"\u0007}\u0001\u0000\u0000\u0000\t\u0083\u0001\u0000\u0000\u0000\u000b"+
		"\u008b\u0001\u0000\u0000\u0000\r\u0094\u0001\u0000\u0000\u0000\u000f\u0098"+
		"\u0001\u0000\u0000\u0000\u0011\u009f\u0001\u0000\u0000\u0000\u0013\u00a7"+
		"\u0001\u0000\u0000\u0000\u0015\u00b0\u0001\u0000\u0000\u0000\u0017\u00b6"+
		"\u0001\u0000\u0000\u0000\u0019\u00b9\u0001\u0000\u0000\u0000\u001b\u00be"+
		"\u0001\u0000\u0000\u0000\u001d\u00c5\u0001\u0000\u0000\u0000\u001f\u00ca"+
		"\u0001\u0000\u0000\u0000!\u00d2\u0001\u0000\u0000\u0000#\u00d8\u0001\u0000"+
		"\u0000\u0000%\u00dc\u0001\u0000\u0000\u0000\'\u00de\u0001\u0000\u0000"+
		"\u0000)\u00f3\u0001\u0000\u0000\u0000+\u00f5\u0001\u0000\u0000\u0000-"+
		"\u00fc\u0001\u0000\u0000\u0000/\u0100\u0001\u0000\u0000\u00001\u0102\u0001"+
		"\u0000\u0000\u00003\u0104\u0001\u0000\u0000\u00005\u0106\u0001\u0000\u0000"+
		"\u00007\u0108\u0001\u0000\u0000\u00009\u010a\u0001\u0000\u0000\u0000;"+
		"\u010c\u0001\u0000\u0000\u0000=\u010e\u0001\u0000\u0000\u0000?\u0110\u0001"+
		"\u0000\u0000\u0000A\u0112\u0001\u0000\u0000\u0000C\u011a\u0001\u0000\u0000"+
		"\u0000E\u011c\u0001\u0000\u0000\u0000G\u011e\u0001\u0000\u0000\u0000I"+
		"\u0121\u0001\u0000\u0000\u0000K\u0124\u0001\u0000\u0000\u0000M\u0126\u0001"+
		"\u0000\u0000\u0000O\u0128\u0001\u0000\u0000\u0000Q\u012b\u0001\u0000\u0000"+
		"\u0000S\u012e\u0001\u0000\u0000\u0000U\u0130\u0001\u0000\u0000\u0000W"+
		"\u0132\u0001\u0000\u0000\u0000Y\u0134\u0001\u0000\u0000\u0000[\u0136\u0001"+
		"\u0000\u0000\u0000]\u0138\u0001\u0000\u0000\u0000_\u013b\u0001\u0000\u0000"+
		"\u0000a\u013e\u0001\u0000\u0000\u0000c\u0140\u0001\u0000\u0000\u0000e"+
		"\u0147\u0001\u0000\u0000\u0000g\u0149\u0001\u0000\u0000\u0000i\u014c\u0001"+
		"\u0000\u0000\u0000k\u0152\u0001\u0000\u0000\u0000m\u0160\u0001\u0000\u0000"+
		"\u0000op\u0005.\u0000\u0000pq\u0005.\u0000\u0000q\u0002\u0001\u0000\u0000"+
		"\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000tu\u0005d\u0000\u0000"+
		"uv\u0005i\u0000\u0000vw\u0005c\u0000\u0000wx\u0005e\u0000\u0000x\u0004"+
		"\u0001\u0000\u0000\u0000yz\u0005v\u0000\u0000z{\u0005a\u0000\u0000{|\u0005"+
		"r\u0000\u0000|\u0006\u0001\u0000\u0000\u0000}~\u0005c\u0000\u0000~\u007f"+
		"\u0005o\u0000\u0000\u007f\u0080\u0005n\u0000\u0000\u0080\u0081\u0005s"+
		"\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082\b\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005f\u0000\u0000\u0084\u0085\u0005u\u0000\u0000\u0085"+
		"\u0086\u0005n\u0000\u0000\u0086\u0087\u0005c\u0000\u0000\u0087\u0088\u0005"+
		"i\u0000\u0000\u0088\u0089\u0005o\u0000\u0000\u0089\u008a\u0005n\u0000"+
		"\u0000\u008a\n\u0001\u0000\u0000\u0000\u008b\u008c\u0005d\u0000\u0000"+
		"\u008c\u008d\u0005e\u0000\u0000\u008d\u008e\u0005v\u0000\u0000\u008e\u008f"+
		"\u0005o\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090\u0091\u0005v"+
		"\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0093\u0005r\u0000\u0000"+
		"\u0093\f\u0001\u0000\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095"+
		"\u0096\u0005n\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u000e\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005l\u0000\u0000\u0099\u009a\u0005o\u0000"+
		"\u0000\u009a\u009b\u0005g\u0000\u0000\u009b\u009c\u0005i\u0000\u0000\u009c"+
		"\u009d\u0005c\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e\u0010\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005p\u0000\u0000\u00a0\u00a1\u0005a\u0000"+
		"\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2\u00a3\u0005a\u0000\u0000\u00a3"+
		"\u00a4\u0005b\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a5\u00a6\u0005"+
		"a\u0000\u0000\u00a6\u0012\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005m\u0000"+
		"\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa"+
		"\u00ab\u0005n\u0000\u0000\u00ab\u00ac\u0005t\u0000\u0000\u00ac\u00ad\u0005"+
		"r\u0000\u0000\u00ad\u00ae\u0005a\u0000\u0000\u00ae\u00af\u0005s\u0000"+
		"\u0000\u00af\u0014\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005h\u0000\u0000"+
		"\u00b1\u00b2\u0005a\u0000\u0000\u00b2\u00b3\u0005c\u0000\u0000\u00b3\u00b4"+
		"\u0005e\u0000\u0000\u00b4\u00b5\u0005r\u0000\u0000\u00b5\u0016\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005s\u0000\u0000\u00b7\u00b8\u0005i\u0000\u0000"+
		"\u00b8\u0018\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005s\u0000\u0000\u00ba"+
		"\u00bb\u0005i\u0000\u0000\u00bb\u00bc\u0005n\u0000\u0000\u00bc\u00bd\u0005"+
		"o\u0000\u0000\u00bd\u001a\u0001\u0000\u0000\u0000\u00be\u00bf\u0005s\u0000"+
		"\u0000\u00bf\u00c0\u0005w\u0000\u0000\u00c0\u00c1\u0005i\u0000\u0000\u00c1"+
		"\u00c2\u0005t\u0000\u0000\u00c2\u00c3\u0005c\u0000\u0000\u00c3\u00c4\u0005"+
		"h\u0000\u0000\u00c4\u001c\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005c\u0000"+
		"\u0000\u00c6\u00c7\u0005a\u0000\u0000\u00c7\u00c8\u0005s\u0000\u0000\u00c8"+
		"\u00c9\u0005e\u0000\u0000\u00c9\u001e\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005d\u0000\u0000\u00cb\u00cc\u0005e\u0000\u0000\u00cc\u00cd\u0005f"+
		"\u0000\u0000\u00cd\u00ce\u0005a\u0000\u0000\u00ce\u00cf\u0005u\u0000\u0000"+
		"\u00cf\u00d0\u0005l\u0000\u0000\u00d0\u00d1\u0005t\u0000\u0000\u00d1 "+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005b\u0000\u0000\u00d3\u00d4\u0005"+
		"r\u0000\u0000\u00d4\u00d5\u0005e\u0000\u0000\u00d5\u00d6\u0005a\u0000"+
		"\u0000\u00d6\u00d7\u0005k\u0000\u0000\u00d7\"\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0003%\u0012\u0000\u00d9$\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0003\'\u0013\u0000\u00db\u00dd\u00050\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd&\u0001\u0000"+
		"\u0000\u0000\u00de\u00e2\u0007\u0000\u0000\u0000\u00df\u00e1\u0007\u0001"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3(\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005v\u0000\u0000\u00e6\u00e7\u0005e\u0000\u0000\u00e7"+
		"\u00e8\u0005r\u0000\u0000\u00e8\u00e9\u0005d\u0000\u0000\u00e9\u00ea\u0005"+
		"a\u0000\u0000\u00ea\u00eb\u0005d\u0000\u0000\u00eb\u00ec\u0005e\u0000"+
		"\u0000\u00ec\u00ed\u0005r\u0000\u0000\u00ed\u00f4\u0005o\u0000\u0000\u00ee"+
		"\u00ef\u0005f\u0000\u0000\u00ef\u00f0\u0005a\u0000\u0000\u00f0\u00f1\u0005"+
		"l\u0000\u0000\u00f1\u00f2\u0005s\u0000\u0000\u00f2\u00f4\u0005o\u0000"+
		"\u0000\u00f3\u00e5\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f4*\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\"\u0000\u0000"+
		"\u00f6\u00f8\u0003-\u0016\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005\"\u0000\u0000\u00fa,\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0003/\u0017\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff.\u0001\u0000\u0000\u0000\u0100\u0101\b\u0002"+
		"\u0000\u0000\u01010\u0001\u0000\u0000\u0000\u0102\u0103\u0005(\u0000\u0000"+
		"\u01032\u0001\u0000\u0000\u0000\u0104\u0105\u0005)\u0000\u0000\u01054"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005[\u0000\u0000\u01076\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005]\u0000\u0000\u01098\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005{\u0000\u0000\u010b:\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005}\u0000\u0000\u010d<\u0001\u0000\u0000\u0000\u010e\u010f\u0005,"+
		"\u0000\u0000\u010f>\u0001\u0000\u0000\u0000\u0110\u0111\u0005;\u0000\u0000"+
		"\u0111@\u0001\u0000\u0000\u0000\u0112\u0113\u0005:\u0000\u0000\u0113B"+
		"\u0001\u0000\u0000\u0000\u0114\u011b\u0003G#\u0000\u0115\u011b\u0003I"+
		"$\u0000\u0116\u011b\u0003K%\u0000\u0117\u011b\u0003M&\u0000\u0118\u011b"+
		"\u0003O\'\u0000\u0119\u011b\u0003Q(\u0000\u011a\u0114\u0001\u0000\u0000"+
		"\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000"+
		"\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011bD\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005=\u0000\u0000\u011dF\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005=\u0000\u0000\u011f\u0120\u0005=\u0000\u0000\u0120H\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005!\u0000\u0000\u0122\u0123\u0005=\u0000\u0000"+
		"\u0123J\u0001\u0000\u0000\u0000\u0124\u0125\u0005>\u0000\u0000\u0125L"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0005<\u0000\u0000\u0127N\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005>\u0000\u0000\u0129\u012a\u0005=\u0000\u0000"+
		"\u012aP\u0001\u0000\u0000\u0000\u012b\u012c\u0005<\u0000\u0000\u012c\u012d"+
		"\u0005=\u0000\u0000\u012dR\u0001\u0000\u0000\u0000\u012e\u012f\u0005+"+
		"\u0000\u0000\u012fT\u0001\u0000\u0000\u0000\u0130\u0131\u0005-\u0000\u0000"+
		"\u0131V\u0001\u0000\u0000\u0000\u0132\u0133\u0005*\u0000\u0000\u0133X"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005/\u0000\u0000\u0135Z\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0005%\u0000\u0000\u0137\\\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005&\u0000\u0000\u0139\u013a\u0005&\u0000\u0000\u013a"+
		"^\u0001\u0000\u0000\u0000\u013b\u013c\u0005|\u0000\u0000\u013c\u013d\u0005"+
		"|\u0000\u0000\u013d`\u0001\u0000\u0000\u0000\u013e\u013f\u0005!\u0000"+
		"\u0000\u013fb\u0001\u0000\u0000\u0000\u0140\u0144\u0003e2\u0000\u0141"+
		"\u0143\u0003g3\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145d\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0007\u0003\u0000\u0000\u0148f\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0007\u0004\u0000\u0000\u014ah\u0001\u0000\u0000\u0000"+
		"\u014b\u014d\u0007\u0005\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u00064\u0000\u0000\u0151j\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0005/\u0000\u0000\u0153\u0154\u0005*\u0000\u0000\u0154\u0158\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\t\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005*\u0000\u0000"+
		"\u015c\u015d\u0005/\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u00065\u0000\u0000\u015fl\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"/\u0000\u0000\u0161\u0162\u0005/\u0000\u0000\u0162\u0166\u0001\u0000\u0000"+
		"\u0000\u0163\u0165\b\u0006\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u00066\u0000\u0000\u016a"+
		"n\u0001\u0000\u0000\u0000\u000b\u0000\u00dc\u00e2\u00f3\u00f7\u00fe\u011a"+
		"\u0144\u014e\u0158\u0166\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}