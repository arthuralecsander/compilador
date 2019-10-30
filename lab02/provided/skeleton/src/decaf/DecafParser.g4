parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: CLASS ID LCURLY field_decl* method_decl* RCURLY EOF;

field_decl: (type_id(COMMA type_id)* | type_id LBRAC INT RBRAC (COMMA type_id LBRAC INT RBRAC)*) PVIRG;

method_decl: (type | VOID) ID LPAR (type_id(COMMA type_id)*)? RPAR block;

block: LCURLY var_decl* state* RCURLY;

var_decl: type_id (COMMA ID)* PVIRG;

type_id: type ID (COMMA ID)*;

type: INTV | BOOLEAN;

state: 	loc assign_op expr PVIRG
	| method_call PVIRG
	| IF LPAR expr RPAR block (ELSE block)? 
	| FOR ID OPIGU expr COMMA expr block
	| RETURN expr? PVIRG
	| BREAK PVIRG
	| CONTINUE PVIRG
	| block;

assign_op:	  OPIGU
		| OPMIG
		| OPMME ;

method_call:	  method_name LPAR (expr (COMMA expr)*)? RPAR
		| CALLOUT LPAR STRING_ (COMMA callout_arg (COMMA callout_arg)*)? RPAR;

method_name: ID ;				

loc: ID
	|ID LBRAC expr RBRAC ;

expr: loc
	| method_call
	| literal 
	| expr bin_op expr
	| OPNEG expr
	| DIF expr
	| LPAR expr RPAR;

callout_arg: expr | STRING_ ;

bin_op: arith_op | rel_op | eq_op | cond_op ;

arith_op: OPPOS
	| OPNEG
	| OPMUL
	| OPDIV
	| OPPER;

rel_op:   OPMEN
	| OPMAI
	| OPMENI
	| OPMAII;

eq_op:    OPCIG
	| OPDIF ;

cond_op: OPLOGE
	|OPLOGO ;

literal: INT | MUNDCHAR| BOOLEANS ;


