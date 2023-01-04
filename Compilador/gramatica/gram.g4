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


compilationUnit
    : packageDeclaration? importDeclaration* typeDeclaration*
    ;

packageDeclaration
    : PACKAGE qualifiedName ';'
    ;

importDeclaration
    : IMPORT STATIC? qualifiedName ('.' '*')? ';'
    ;

typeDeclaration
    : classOrInterfaceModifier*
      (classDeclaration | enumDeclaration | interfaceDeclaration)
    | ';'
    ;

modifier
    : classOrInterfaceModifier
    | VOLATILE
    ;

classOrInterfaceModifier
    : PUBLIC
    | PROTECTED
    | PRIVATE
    | STATIC
    | ABSTRACT
    | FINAL    // FINAL for class only -- does not apply to interfaces
    | STRICTFP
    ;

variableModifier
    : FINAL
    ;

classDeclaration
    : CLASS identifier typeParameters?
      (EXTENDS typeType)?
      classBody
    ;

typeParameters
    : '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    : identifier (EXTENDS typeBound)?
    ;

typeBound
    : typeType ('&' typeType)*
    ;

enumDeclaration
    : ENUM identifier (IMPLEMENTS typeList)? '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    : enumConstant (',' enumConstant)*
    ;

enumConstant
    : identifier arguments? classBody?
    ;

enumBodyDeclarations
    : ';' classBodyDeclaration*
    ;

interfaceDeclaration
    : INTERFACE identifier typeParameters? (EXTENDS typeList)? (PERMITS typeList)? interfaceBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

interfaceBody
    : '{' interfaceBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | STATIC? block
    | modifier* memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    | genericMethodDeclaration
    | constructorDeclaration
    | genericConstructorDeclaration
    | classDeclaration
    | enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    : typeTypeOrVoid identifier formalParameters ('[' ']')*
      (THROWS qualifiedNameList)?
      methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

genericMethodDeclaration
    : typeParameters methodDeclaration
    ;

genericConstructorDeclaration
    : typeParameters constructorDeclaration
    ;

constructorDeclaration
    : identifier formalParameters (THROWS qualifiedNameList)? constructorBody=block
    ;

compactConstructorDeclaration
    : modifier* identifier constructorBody=block
    ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;

interfaceBodyDeclaration
    : modifier* interfaceMemberDeclaration
    | ';'
    ;

interfaceMemberDeclaration
    : constDeclaration
    | interfaceMethodDeclaration
    | genericInterfaceMethodDeclaration
    | interfaceDeclaration
    | classDeclaration
    | enumDeclaration
    ;

constDeclaration
    : typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : identifier ('[' ']')* '=' variableInitializer
    ;

// Early versions of Java allows brackets after the method name, eg.
// public int[] return2DArray() [] { ... }
// is the same as
// public int[][] return2DArray() { ... }
interfaceMethodDeclaration
    : interfaceMethodModifier* interfaceCommonBodyDeclaration
    ;

// Java8
interfaceMethodModifier
    : PUBLIC
    | ABSTRACT
    | DEFAULT
    | STATIC
    ;

genericInterfaceMethodDeclaration
    : interfaceMethodModifier* typeParameters interfaceCommonBodyDeclaration
    ;

interfaceCommonBodyDeclaration
    : typeTypeOrVoid identifier formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody
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
    | ((EXTENDS | SUPER) typeType)?
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
    : typeType (identifier '.')* THIS
    ;



formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier* typeType '...' variableDeclaratorId
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
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | localTypeDeclaration
    | statement
    ;

localVariableDeclaration
    : variableModifier* (VAR identifier '=' expression | typeType variableDeclarators)
    ;


identifier
    : IDENTIFIER
//    | VAR
    ;


typeIdentifier  // Identifiers that are not restricted for type declarations
    : IDENTIFIER
    ;

localTypeDeclaration
    : classOrInterfaceModifier*
      (classDeclaration | interfaceDeclaration)
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | RETURN expression? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=identifier ':' statement
    ;

typeList
    : typeType (',' typeType)*
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

explicitGenericInvocationSuffix
    : SUPER superSuffix
    | identifier arguments
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
    | THIS '(' expressionList? ')'
    | SUPER '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      (
         identifier
       | methodCall
       | THIS
       //| NEW nonWildcardTypeArguments? innerCreator
       | SUPER superSuffix
       //| explicitGenericInvocation
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
    | THIS
    | SUPER
    | literal
    | identifier
    | typeTypeOrVoid '.' CLASS
    ;

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