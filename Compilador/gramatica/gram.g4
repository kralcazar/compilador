/*

Autores: Crist Alcazar y Joan Campaner

*/

grammar gram;

//TODO: DE MOMENTO LOS IMPORTS NO SON NECESARIOS

@header {
package gram;

}
/*
import compilador.*;
import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
*/

//LEXER

//Start variable
compilationUnit
    : classBodyDeclaration EOF
    ;

classBodyDeclaration
    : ';'
    | block
    | memberDeclaration
    ;

enumDeclaration
    : ENUM identifier '{' enumConstants? '}'
    ;

enumConstants
    : enumConstant (',' enumConstant)*
    ;
enumConstant
    : identifier arguments?
    ;

memberDeclaration
    : methodDeclaration
    | enumDeclaration
    | fieldDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    : typeTypeOrVoid identifier formalParameters ('[' ']')* methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;

constDeclaration
    : typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : identifier ('[' ']')* '=' variableInitializer
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : identifier ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

classOrInterfaceType
    : (identifier typeArguments? '.')* typeIdentifier typeArguments?
    ;

typeArgument
    : typeType
    ;


qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' ( receiverParameter?
          | receiverParameter (',' formalParameterList)?
          | formalParameterList?
          ) ')'
    ;

receiverParameter
    : typeType (identifier '.')*
    ;



formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : typeType variableDeclaratorId
    ;

lastFormalParameter
    : typeType '...' variableDeclaratorId
    ;


qualifiedName
    : identifier ('.' identifier)*
    ;

literal
    : DECIMAL_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;


// STATEMENTS / BLOCKS

block
    : '{' statement* '}'
    ;

identifier
    : IDENTIFIER
//    | VAR
    ;


typeIdentifier  // Identifiers that are not restricted for type declarations
    : IDENTIFIER
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | RETURN expression? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=identifier ':' statement
    ;

typeType
    : (classOrInterfaceType | primitiveType)
    ;

primitiveType
    : BOOLEAN
    | INT
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

superSuffix
    : arguments
    | '.' typeArguments? identifier arguments?
    ;


arguments
    : '(' expressionList? ')'
    ;

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : identifier '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      (
         identifier
       | methodCall
      )
    | expression '[' expression ']'
    | methodCall
    //| NEW creator
    | '(' typeType ('&' typeType)* ')' expression
    | prefix=('+'|'-') expression
    | expression =('+'|'-') expression
    | expression =('>' | '<') expression
    | expression ='&&' expression
    | expression ='||' expression
    | <assoc=right> expression
      expression
    ;

classType
    : (classOrInterfaceType '.')? identifier typeArguments?
    ;

primary
    : '(' expression ')'
    | literal
    | identifier
    ;

// PARSER

// Palabras clave
INT:        'entero';
BOOLEAN:    'boleano';
ENUM:               'enum';
VOID:               'void';
IF:                 'if';
ELSE:               'else';
RETURN:             'return';

// Literales
NULL_LITERAL:       'null';
DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;

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

IDENTIFIER:         Letter LetterOrDigit*;

// Reglas de fragment

//TODO: NO SE SI ES NECESARIO
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
//    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
//FINTODO;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // los caracteres "clásicos" de JAVA, usados para respetar el tipo de dato primitivo char de las primeras versiones de JAVA
    | ~[\u0000-\u007F\uD800-\uDBFF] // cubre todos los caracteres por encima de 0x7F que no son sustituídos por versiones nuevas de JAVA
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // cubre los pares de códigos sustituídos UTF-16 desde U+10000 a U+10FFFF
    ;