parser grammar PythonParser;
options { tokenVocab=PythonLexer; }

code: (stat | condicional | func | func_call | loop_while | loop_for)* EOF;

stat: (expr | query) NEWLINE;

expr
    : ids
    | numeros
    | operacoesComExpressoes
    | expressoesEntreParenteses
    | func_call
    ;
ids: ID;

numeros: DIGITS;

operacoesComExpressoes
    : expr (PLUS|MINUS|MULT|DIV|FLOOR_DIV|MOD|EXP) expr;

expressoesEntreParenteses
    : LPAREN expr RPAREN;





query
    : booleans
    | operacoesBooleanasEntreQuerys
    | queryEntreParenteses
    | relacoesEntreExpressoes
    ;

booleans
    : TRUE
    | FALSE
    ;

operacoesBooleanasEntreQuerys
    : query (AND|OR) query
    | NOT query
    ;

queryEntreParenteses
    : LPAREN query RPAREN
    ;

relacoesEntreExpressoes
    : expr (EQ|NEQ|LT|LTE|GT|GTE) expr;






condicional
: IF expr COLON stat+
| IF expr COLON stat+ ELSE COLON stat+
| IF expr COLON stat+ (ELIF expr COLON stat+)+ ELSE COLON stat+
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