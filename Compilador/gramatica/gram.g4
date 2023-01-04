/*

Autores: Crist Alcazar y Joan Campaner

*/

grammar gram;

//TODO: DE MOMENTO LOS IMPORTS NO SON NECESARIOS
@header {
package gram;
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
}


//LEXER



// PARSER

// Palabras clave
INT:        'entero';
BOOLEAN:    'boleano';

// Literales
NULL_LITERAL:       'null';

// Separadores
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';

// Operators
ASSIGN:             '=';
LT:                 '<';
EQUAL:              '==';
AND:                '&&';
OR:                 '||';
ADD:                '+';
SUB:                '-';


// Identificadores

IDENTIFIER:         Letra LetraODigito*;

// Reglas de fragment

//TODO: NO SE SI ES NECESARIO
fragment SecuenciaEscape
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
//    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
//FINTODO;

fragment Digitos
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetraODigito
    : Letra
    | [0-9]
    ;
fragment Letra
    : [a-zA-Z$_] // los caracteres "clásicos" de JAVA, usados para respetar el tipo de dato primitivo char de las primeras versiones de JAVA
    | ~[\u0000-\u007F\uD800-\uDBFF] // cubre todos los caracteres por encima de 0x7F que no son sustituídos por versiones nuevas de JAVA
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // cubre los pares de códigos sustituídos UTF-16 desde U+10000 a U+10FFFF
    ;