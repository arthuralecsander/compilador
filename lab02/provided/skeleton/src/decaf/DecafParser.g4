parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: CLASS ID LCURLY (field_dec* method_decl*) RCURLY EOF;

field_dec: (type ID | type ID LBRAC INT RBRAC) PVIRG ;

method_decl: (type | VOID ) ID LPAR (type ID (COMMA type ID)*)? RPAR block ;

block: LCURLY var_dec* state RCURLY ;

var_dec: type ID (COMMA type ID)* PVIRG ;

type: INTV | BOOLEAN ;

state: 	loc assign_op expr PVIRG
	| method_call PVIRG
	| IF LPAR expr RPAR (ELSE block)? 
	| FOR ID OPIGU expr COMMA expr block
	| RETURN expr?
	| BREAK PVIRG
	| CONTINUE PVIRG
	| block;

assign_op:	  OPIGU
		| OPMIG
		| OPMME ;

method_call: method_name ;

loc: ;

method_name: ;


expr: ;

