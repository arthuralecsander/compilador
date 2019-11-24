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

method_decl : (type | VOID ) ID PARENTESESESQ (type_id (VIRGULA type_id | type_id COLCHETESQ int_literal COLCHETEDIR)(VIRGULA type_id2 | VIRGULA type_id2 COLCHETESQ int_literal COLCHETEDIR)*)* PARENTESESDIR block_decl;

block_decl  : CHAVESQ var_decl* statement_decl* CHAVEDIR;

var_decl    : type_id (VIRGULA ID)* PONTOVIRGULA;

type_id : type ID (VIRGULA ID)*;

type_id2 : type? ID;
 
type	    : T_INT | BOOL;

statement_decl   : location_decl assign_op expr_decl PONTOVIRGULA 
	    | method_call PONTOVIRGULA 
	    | IF PARENTESESESQ expr_decl PARENTESESDIR block_decl (ELSE block_decl)?
	    | FOR ID IGUAL expr_decl VIRGULA expr_decl block_decl
  	    | RETURN  expr_decl? PONTOVIRGULA
	    | BREAK PONTOVIRGULA
	    | CONTINUE PONTOVIRGULA
	    | block_decl;


assign_op   : IGUAL 
	    | MAISIGUAL
	    | MENOSIGUAL;


method_call : method_name PARENTESESESQ ((expr_decl) (VIRGULA expr_decl)*)? PARENTESESDIR | CALL PARENTESESESQ STRING (VIRGULA callout_arg)* PARENTESESDIR;
	   

method_name : ID;


location_decl    : ID
	    | ID COLCHETESQ expr_decl COLCHETEDIR;

expr_decl	    : location_decl
	    | method_call
	    | literal
	    | expr_decl bin_op expr_decl
	    | SUBTRACAO expr_decl
	    | EXCLAMACAO expr_decl
	    | PARENTESESESQ expr_decl PARENTESESDIR;

	
callout_arg : expr_decl | string_literal;


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


