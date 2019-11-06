parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program	    : CLASS ID CHAVESQ field_decl* method_decl* CHAVEDIR EOF;

field_decl  : (type_id | type_id COLCHETESQ int_literal COLCHETEDIR) (VIRGULA type_id2 | VIRGULA type_id2 COLCHETESQ int_literal COLCHETEDIR)* PONTOVIRGULA;

method_decl : (type | VOID ) ID PARENTESESESQ (type_id (VIRGULA type_id | type_id COLCHETESQ int_literal COLCHETEDIR)(VIRGULA type_id2 | VIRGULA type_id2 COLCHETESQ int_literal COLCHETEDIR)*)* PARENTESESDIR block;

block	    : CHAVESQ var_decl* statement* CHAVEDIR;

var_decl    : type_id (VIRGULA ID)* PONTOVIRGULA;

type_id : type ID (VIRGULA ID)*;

type_id2 : type? ID;
 
type	    : T_INT | BOOL;

statement   : location assign_op expr PONTOVIRGULA 
	    | method_call PONTOVIRGULA 
	    | IF PARENTESESESQ expr PARENTESESDIR block (ELSE block)?
	    | FOR ID IGUAL expr VIRGULA expr block
  	    | RETURN  expr? PONTOVIRGULA
	    | BREAK PONTOVIRGULA
	    | CONTINUE PONTOVIRGULA
	    | block;


assign_op   : IGUAL 
	    | MAISIGUAL
	    | MENOSIGUAL;


method_call : method_name PARENTESESESQ ((expr) (VIRGULA expr)*)? PARENTESESDIR | CALL PARENTESESESQ STRING (VIRGULA callout_arg)* PARENTESESDIR;
	   

method_name : ID;


location    : ID
	    | ID COLCHETESQ expr COLCHETEDIR;

expr	    : location
	    | method_call
	    | literal
	    | expr bin_op expr
	    | SUBTRACAO expr
	    | EXCLAMACAO expr
	    | PARENTESESESQ expr PARENTESESDIR;

	
callout_arg : expr | string_literal;


bin_op	    : arith_op | rel_op | eq_op | cond_op;


arith_op    : ADICAO | SUBTRACAO | MULTIPLICACAO | BARRA  | PORCENTAGEM;


rel_op	    : MENORQUE | MAIORQUE | MENORIGUAL | MAIORIGUAL ;


eq_op 	    : IGUALIGUAL | DIFERENTED;


cond_op	    : AND | BARRABARRA;


literal	    : int_literal | char_literal | bool_literal;


alpha_num   : alpha | digit;


alpha 	    : LET;


digit	    : NUM;


hex_digit   : digit | LET+;


int_literal : decimal_literal | hex_literal;


decimal_literal : NUM;


hex_literal : HEXLIT;


bool_literal : BOOLEAN;


char_literal : CHAR ;


string_literal : STRING ;


