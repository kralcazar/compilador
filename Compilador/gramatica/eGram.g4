grammar eGram;

@header {
package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
}


//Esto de momento nada.
/*
@parser::members {
public SymbolTable ts;
int depthCondition;
String errors="";
String folder;
Deque<Symbol> proceduresStack = new ArrayDeque<Symbol>();
public gramParser(TokenStream input,String folder){
	this(input);
	this.folder=folder;
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
}

@lexer::members {
@Override
public void recover(RecognitionException ex)
{
	throw new RuntimeException("Error léxico -  "+ex.getMessage());
}
}
*/

//Aquí empieza el programa.
//Puede tener declaración main o no
//Además tiene declaraciones y sentencias y un EOF
program:
    main? decl* sentsVoid EOF;

//La estructura es indice {
    //decl* sents
// }
main:
    MAIN BEGIN decl* sents END
    ;
decl:
    type ID ( ASSIGN expr )? SEMI
    | CONSTANT type ID ASSIGN literal SEMI
    | arrayDecl
    | FUNCTION type header[$type.dataType] BEGIN decl* sents END
    ;

arrayDecl:
	type ID /*{Tuple tuple = new Tuple($type.dataType); }*/ LBRACK ( number '..' )? number /*arrayDecl_[tuple]*/ RBRACK SEMI;

/* Para añadir más dimensiones
arrayDecl_[Tuple tuple]:
    RBRACK LBRACK ( number '..' )? number arrayDecl_[$tuple]
    |;//lambda
*/
number returns[int value, boolean constant]:
	ID
	| LiteralInteger;

header[Symbol.DataTypes dataType] returns[Symbol s]:
	ID LPAREN params[$s]? RPAREN ;

params[Symbol prev]:
	param COMMA params[$prev.getNext()]
	| param;

param returns[Symbol s]:
	type ID;

sentsVoid:
    sents
    |;
sents:
    sent sents_;

sents_:
    sent sents_
    |;

sent:
	IF expr BEGIN decl* sents END
	| IF expr BEGIN decl* sents END ELSE BEGIN decl* sents END
//	| switchcase endcase END
	| WHILE expr BEGIN decl* sents END
	| DO BEGIN decl* sents END WHILE expr SEMI
	| RETURN expr SEMI
	| RETURN SEMI
	| reference[true] ASSIGN expr SEMI
	| reference[false] SEMI;

/*
switchcase:
	SWITCH expr BEGIN switchcase_;

switchcase_:
    casei switchcase_
    |; // lambda

casei:
	CASE expr COLON sents (BREAK SEMI)?;

endcase:
    DEFAULT COLON sents
    |;
*/
//reference[boolean assign] returns[Symbol s, Tuple tuple, boolean dimCheck]:
//He quitado Tuple porque me da error
reference[boolean assign] returns[Symbol s, boolean dimCheck]:
	ID
	| idx RBRACK
	| ID LPAREN RPAREN;
//	| contIdx RPAREN; //da error
//idx returns[Symbol s, int dim, Tuple tuple]:
//La variable d da error en compilador, la he modificado por dim y añadido $
idx returns[Symbol s, int dim]:
	ID LBRACK expr idx_[$dim];

idx_[int dim1] returns[int dim]:
	RBRACK LBRACK expr  idx_[$dim]
	|;

//da error la variable pparams
/*
contIdx returns[Symbol s]:
	ID LPAREN expr contIdx_[pparams];
*/
contIdx_[Deque<Symbol.DataTypes> pparams]:
	COMMA expr contIdx_[$pparams]
	|; // lambda

// Expresiones
expr returns[Symbol.DataTypes dataType]:
	exprOr;

// Expresión de OR
exprOr returns[Symbol.DataTypes dataType]:
	exprAnd exprOr_;

exprOr_ returns[Symbol.DataTypes dataType]:
	OR exprAnd exprOr_
	|; //lambda

// Expresión de AND
exprAnd returns[Symbol.DataTypes dataType]:
	exprNot exprAnd_;

exprAnd_ returns[Symbol.DataTypes dataType]:
	AND exprNot exprAnd_
	|; //lambda

// Expresión de NOT
exprNot returns[Symbol.DataTypes dataType]:
	NOT exprComp
	| exprComp;

// Expresión comparativa
exprComp returns[Symbol.DataTypes dataType]:
	exprAdit exprComp_;

exprComp_ returns[Symbol.DataTypes dataType]:
	OPREL exprAdit
	|; //lambda

// Expresión aditiva
exprAdit returns[Symbol.DataTypes dataType]:
	exprMult exprAdit_;

exprAdit_ returns[Symbol.DataTypes dataType]:
	ADD exprMult exprAdit_
	| SUB exprMult exprAdit_
	|; //lambda

// Expresión multiplicativa
exprMult returns[Symbol.DataTypes dataType]:
	exprNeg exprMult_;

exprMult_
	returns[Symbol.DataTypes dataType]:
	MULT exprNeg exprMult_
	| DIV exprNeg exprMult_
	| MOD exprNeg exprMult_
	|; //lambda

// Expresión de negación
exprNeg returns[Symbol.DataTypes dataType, boolean zero]:
	SUB primary
	| primary;

primary returns[Symbol.DataTypes dataType, boolean zero]:
	LPAREN expr RPAREN
	| reference[false]
	| literal;

type returns[Symbol.DataTypes dataType]:
	INTEGER
	| BOOLEAN
	| STRING;

literal returns[Symbol.DataTypes dataType, boolean zero]:
	LiteralInteger
	| LiteralBoolean
	| LiteralString;




// Palabras reservadas
MAIN: 'indice';
VARIABLE: 'var';
CONSTANT: 'const';
FUNCTION: 'funcion';
RETURN: 'devolver';
// Tipos
INTEGER: 'ent';
BOOLEAN: 'logico';
STRING: 'palabra';
// Operaciones
WHILE: 'mientras';
DO: 'hacer';
IF: 'si';
ELSE: 'sino';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
// Enteros
LiteralInteger: DecimalLiteral;
fragment DecimalLiteral: DecimalPositivo | '0';
fragment DecimalPositivo: [1-9][0-9]*;
// Booleans
LiteralBoolean: 'verdadero' | 'falso';
// Cadenas
LiteralString: '"' LetrasString? '"';
fragment LetrasString: LetraString+;
fragment LetraString: ~[$"\\\r\n];
// Separadores
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
BEGIN: '{';
END: '}';
COMMA: ',';
SEMI: ';';
COLON: ':';
// Operadores
OPREL: EQUAL | NOTEQUAL | GT | LT | GE | LE;
ASSIGN: '=';
EQUAL: '==';
NOTEQUAL: '!=';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
MOD: '%';
AND: '&&';
OR: '||';
NOT: '!';
// Identificador
ID: LETRA LETRADIGITO*;
fragment LETRA: [a-zA-Z$_];
fragment LETRADIGITO: [a-zA-Z$_0-9];
// Espacios en blanco y saltos de línea y comentarios
WS: [ \r\n\t]+ -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;