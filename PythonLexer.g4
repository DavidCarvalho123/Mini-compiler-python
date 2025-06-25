lexer grammar PythonLexer;

// Operadores Aritméticos;
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
FLOOR_DIV: '//';
MOD: '%';
EXP: '**';

// Operadores Relacionais;
EQ: '==';
NEQ: '!=';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';

// Operadores booleanos;
AND: 'and';
OR: 'or';
NOT: 'not';

// Símbolos de Atribuição;
ASSIGN: '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
FLOOR_DIV_ASSIGN: '//=';
MOD_ASSIGN: '%=';
EXP_ASSIGN: '**=';

LPAREN: '(';
RPAREN: ')';
NEWLINE: ('\r'?'\n')+;
COMMA: ',';

// Simbolos identificadores de tipos de dados;
// em python os tipos de dados são keywords, não existe declaração explicita de tipo de dados. (int a = 1 -> não funciona em python)

// Start block symbol
COLON: ':';

// Keywords

// Identificadores de blocos:
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
DEF: 'def';
TRY: 'try';
EXCEPT: 'except';
FINALLY: 'finally';
WITH: 'with';

// Tipos de dados
INT: 'int';
FLOAT: 'float';
STRING: 'str';
BOOL: 'bool';
LIST: 'list';
DICT: 'dict';
TUPLE: 'tuple';
NONE: 'None';
TRUE: 'True';
FALSE: 'False';

// Funções built-in;
PRINT: 'print';
INPUT: 'input';
LEN: 'len';

// Demais;
IMPORT: 'import';
FROM: 'from';
AS: 'as';
IN: 'in';
IS: 'is';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
PASS: 'pass';
GLOBAL: 'global';

// =========================
// IDENTIFIERS, LETTERS, DIGITS, WS -> skip
// =========================
TYPE: INT | FLOAT | STRING | BOOL | LIST | DICT | TUPLE | NONE | TRUE | FALSE;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
LETTER: [a-zA-Z];
NUMBER: [0-9]+('.'[0-9]+)?([eE][+|-]?[0-9]+)? ;
WS: [ \t\r\n]+ -> skip;