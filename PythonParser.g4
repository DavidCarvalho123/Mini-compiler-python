parser grammar PythonParser;
options { tokenVocab=PythonLexer; }

code: (stat | condicional | func | func_call | loop_while | loop_for)* EOF;

stat: (expr | query) NEWLINE;

expr
    : ids
    | numeros
    | expr (PLUS|MINUS|MULT|DIV|FLOOR_DIV|MOD|EXP) expr // operacoesComExpressoes
    | LPAREN expr RPAREN // expressoesEntreParenteses
    | func_call
    ;
ids: ID;

numeros: DIGITS;



query
    : booleans
    | query (AND|OR) query //operacoesBooleanasEntreQuerys
    | NOT query //operacoesBooleanasEntreQuerys
    | LPAREN query RPAREN
    | expr (EQ|NEQ|LT|LTE|GT|GTE) expr
    | func_call
    ;

booleans
    : TRUE
    | FALSE
    ;






condicional
: IF query COLON stat+
| IF query COLON stat+ ELSE COLON stat+
| IF query COLON stat+ (ELIF query COLON stat+)+ ELSE COLON stat+
;

func
    : DEF ID LPAREN param_list? RPAREN COLON stat+
    ;

func_call
    : ID LPAREN args_list? RPAREN
    ;

args_list
    : expr (COMMA expr)*
    ;
    
param_list
    : param (COMMA param)*
    ;

param
    : ID (COLON TYPE)?(ASSIGN expr)?
    ;



loop_while
    : WHILE expr COLON stat+
    ;

loop_for
    : FOR ID IN expr COLON stat+
    ;