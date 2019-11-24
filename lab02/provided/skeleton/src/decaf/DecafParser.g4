parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program	    : CLASS ID CHAVESQ (var_decl+)* method_decl* CHAVEDIR EOF;


method_decl : (type | VOID ) ID PARENTESESESQ ((var_decl)+ PONTEXT* )? PARENTESESDIR block_decl  ;

block_decl  : CHAVESQ var_decl* statement_decl* CHAVEDIR;

var_decl    : type (ID pont* )* array_decl? pont*;

type_id : type ID (VIRGULA ID)*;
 
type	    : T_INT | BOOL;

statement_decl   : location_decl assign_op expr_decl pont 
	    | method_call pont 
	    | IF PARENTESESESQ expr_decl PARENTESESDIR block_decl (ELSE block_decl)?
	    | FOR ID IGUAL expr_decl VIRGULA expr_decl block_decl
  	    | RETURN  expr_decl? pont
	    | BREAK pont
	    | CONTINUE pont
	    | block_decl;


assign_op   : IGUAL 
	    | MAISIGUAL
	    | MENOSIGUAL;


method_call : method_name PARENTESESESQ ((expr_decl) (VIRGULA expr_decl)*)? PARENTESESDIR |
 CALL PARENTESESESQ STRING_ (VIRGULA callout_arg)* PARENTESESDIR;
	   

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

	
callout_arg : expr_decl | STRING_;

pont: PONTOVIRGULA | VIRGULA | EXCLAMACAO ;

bin_op	    : arith_op | rel_op | eq_op | cond_op;
arith_op    : ADICAO | SUBTRACAO | MULTIPLICACAO | BARRA  | PORCENTAGEM;
rel_op	    : MENORQUE | MAIORQUE | MENORIGUAL | MAIORIGUAL ;
eq_op 	    : IGUALIGUAL | DIFERENTED;
cond_op	    : AND | BARRABARRA;
literal	    : int_literal | MUNDCHAR | BOOLEAN;
int_literal : INT; 
array_decl: COLCHETESQ INT COLCHETEDIR;