parser grammar PythonParser;
options { tokenVocab=PythonLexer; }

code: (stat | condicional | func | func_call | loop_while | loop_for)* EOF?;

stat: (expr | query | assignment) (NEWLINE | EOF?);

expr
    : expr (PLUS|MINUS) term // operacoesComExpressoes
    | term 
    ;

term
    : term (MULT|DIV|FLOOR_DIV|MOD) factor
    | factor
    ;

factor
    : base EXP factor
    | base
    ;

base
    : LPAREN expr RPAREN // expressoesEntreParenteses
    | func_call
    | ids
    | numeros
    ;

ids: ID;

numeros: NUMBER;



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

assignment
    : ID (ASSIGN|ADD_ASSIGN|SUB_ASSIGN|MUL_ASSIGN|DIV_ASSIGN|FLOOR_DIV_ASSIGN|MOD_ASSIGN|EXP_ASSIGN) expr
    ;



condicional
: IF query COLON stat+
| IF query COLON stat+ ELSE COLON stat+
| IF query COLON stat+ (ELIF query COLON stat+)+ ELSE COLON stat+
;

func
    : DEF ID LPAREN param_list? RPAREN COLON stat* return_stmt?
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

return_stmt
    : RETURN expr? (NEWLINE | EOF)
    ;


loop_while
    : WHILE query COLON stat+
    ;

loop_for
    : FOR ID IN expr COLON stat+
    ;