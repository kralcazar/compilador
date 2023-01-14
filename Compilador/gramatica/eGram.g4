grammar eGram;

@header {
package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
}

// Necesario para el analizador (parser), sobreescribe el constructor para guardar el directorio y la salida de errores para su personalización
@parser::members {
public SymbolTable symbolTable;
int depthCondition;
String errors="";
String folder;
Deque<Symbol> proceduresStack = new ArrayDeque<Symbol>();
//El constructor aquí no hace nada (de momento)
public eGramParser(TokenStream input,String folder){
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
}

@lexer::members {
@Override
public void recover(RecognitionException ex)
{
	throw new RuntimeException("Error léxico:  "+ex.getMessage());
}
}


//Aquí empieza el programa.
//Puede tener declaración main o no
//Además tiene declaraciones y sentencias y un EOF
program:
    //TODO: QUIZAS TENGAMOS QUE PONER ESTE BLOQUE DESPUÉS DEL MAIN,NOSE...
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
    }
    main? decl* sentsVoid EOF
    {
        symbolTable.blockOut();
        if(!errors.isEmpty()) {
            throw new RuntimeException(errors);
        }
     };

main:
    MAIN BEGIN decl* sents END
    ;

decl:
    type ID
        {
            try{
                symbolTable.insert($ID.getText(),new Symbol($ID.getText(),null,Symbol.Types.VAR,$type.dataType));
            } catch (SymbolTable.SymbolTableException e) {
                errors+="Error semántico en línea " + $ID.getLine() + ": variable '" + $ID.getText() +
                "' previamente declarada\n";
            }
        }
        ( ASSIGN expr
        {
            try{
                symbolTable.get($ID.getText()).setInitialized(true);
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": variable '" + $ID.getText() + "' no existe\n";
            }
            if($expr.dataType != $type.dataType) {
                errors += "Error semántico en línea " + $ID.getLine() + ": tipos incompatibles (esperado '" +
                $type.dataType + "', encontrado '" + $expr.dataType + "')\n";
            }
        }
        )? SEMI
    | CONSTANT type ID
        {
        	Symbol symbol = null;
        	try {
        		symbolTable.insert($ID.getText(), new Symbol($ID.getText(), null, Symbol.Types.CONST, $type.dataType));
        		symbol = symbolTable.get($ID.getText());
        		symbol.setInitialized(true);
        	} catch (SymbolTable.SymbolTableException e) {
        		errors+="Error semántico en línea " + $ID.getLine() + ": constante '" + $ID.getText() +
        		"' ya declarada\n";
        	}
        }
        ASSIGN literal SEMI
        {
            if($literal.dataType!=$type.dataType) {
                errors += "Error semántico en línea " + $ID.getLine() + ": tipos incompatibles (esperado '"+
                $type.dataType + "')\n";
            }
            if(symbol != null) {
                switch($literal.dataType) {
                    case INT:
                        symbol.setValue($literal.text);
                        break;
                    case BOOLEAN:
                        //TODO: COMPROBAR PORQUE ESCRIBE LAS BOLEANAS A -1 Y 0
                        if($literal.text.equals("true")) {
                            symbol.setValue("-1");
                        } else {
                            symbol.setValue("0");
                        }
                        break;
                    case STRING:
                        symbol.setValue($literal.text);
                        break;
                    default:
                        break;
                }
            }
        }
    | arrayDecl
    | FUNCTION type header[$type.dataType] BEGIN
        {
            try {
                symbolTable.insert($header.procedure.getId(),$header.procedure);
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $FUNCTION.getLine() + ": " + e.getMessage() + "\n";
            }
            symbolTable = symbolTable.blockIn();
            proceduresStack.push($header.procedure);
            Symbol parameter = $header.procedure.getNext();
            while (parameter != null) {
                Symbol aux = new Symbol(parameter);
                aux.setInitialized(true);
                aux.setNext(null);
                try {
                    symbolTable.insert(aux.getId(),aux);
                } catch (SymbolTable.SymbolTableException e) {
                    errors += "Error semántico en línea " + $FUNCTION.getLine() + ": " + e.getMessage() + "\n";
                }
                parameter = parameter.getNext();
            }
        }
        decl* sents END
        {
            symbolTable = symbolTable.blockOut();
            proceduresStack.pop();
            if(!$header.procedure.isReturnFound()) {
                errors += "Error semántico en línea " + $FUNCTION.getLine() +
                ": 'return' no encontrado para la función '" + $header.procedure.getId() + "'\n";
            }
            if(depthCondition != 0) {
                errors += "Error semántico - Línea " + $FUNCTION.getLine() +
                ": no se puede definir una función en una estructura condicional o repetitiva\n";
            }
        }
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

header[Symbol.DataTypes dataType] returns[Symbol procedure]:
	ID
	    {
	        if($dataType!=null) {
                // Función
                $procedure = new Symbol($ID.getText(), null, Symbol.Types.FUNC, $dataType);
            } else {
                // Procedimiento
                $procedure = new Symbol($ID.getText(), null, Symbol.Types.PROC, Symbol.DataTypes.NULL);
            }
	    }
	    LPAREN params[$procedure]? RPAREN ;

params[Symbol prev]:
	param COMMA params[$prev.getNext()]
	| param;

param returns[Symbol symbol]:
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