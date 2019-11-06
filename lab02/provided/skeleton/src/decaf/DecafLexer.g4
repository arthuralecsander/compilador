 lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}


PARENTESESDIR   : ')';	 
PARENTESESESQ   : '(';
CHAVEDIR        : '}';
CHAVESQ         : '{';
COLCHETEDIR	: ']';
COLCHETESQ	: '[';
PONTOVIRGULA	: ';';
VIRGULA		: ',';
BARRAVERTICAL	: '|';
BARRABARRA	: '||';
BARRA		: '/'; 
PORCENTAGEM	: '%'; 
AND        	: '&&';
BOOL		: 'boolean';
CALL		: 'callout';
CLASS		: 'class';
T_INT		: 'int';
RETURN		: 'return';
VOID		: 'void';
FOR		: 'for';
BREAK		: 'break';
CONTINUE	: 'continue';
ADICAO		: '+'	;
SUBTRACAO	: '-'	;
MULTIPLICACAO	: '*'	;
EXCLAMACAO	: '!'	;
DIFERENTED	: '!='	;
IGUAL		: '='	;
IGUALIGUAL	: '=='  ;
MAIORQUE	: '>'	;
MENORQUE	: '<'	;
MAIORIGUAL	: '>='	;
MENORIGUAL	: '<='	;
MAISIGUAL	: '+='	;
MENOSIGUAL	: '-='	;
BOOLEAN		: 'true'|'false';
IF	        : 'if';
ELSE		: 'else';



HEXLIT : (HEXDIGITO|NUM)+;

NUM : INT(INT)*;

CHAR : '\'' (ESC|NUM|LET)'\'';

STRING : '\"' (WS_|ESC|NUM|LET|SIMB)*'\"';

ID  : (LET|'_') (LET|'_'|NUM)*;	

WS_ : (' ' | '\n'|'\t' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

LET : LETR(LETR)*;
 

fragment
ESC :  '\\' ('n'|'t'|'"'|'\\');

fragment 
SIMB : ('\\\"'|'.'|','|'\\\''|'?'|':'|'%');

fragment
LETR :  ('a'..'z'|'A'..'Z');

fragment
HEXDIGITO : '0x'(NUM|'a'..'f'|'A'..'F')+; 

fragment
INT : ('0'..'9');


