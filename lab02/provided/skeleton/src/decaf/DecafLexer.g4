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


INT :  ('0'..'9')+ | HEXN;

HEXN : '0' 'x' (INT|LETRAS)+ ;

MUNDCHAR :  '\'' (CHARS) '\'' ;
STRING_ :  '\"' (CHARS | CARAC)+ '\"';

fragment CARAC : '\\' ('\'' | '\"' | '\\' | ID) ;

ID  : (LETRAS|'_') (LETRAS|'_'|INT)*;	

WS_ : (' ' | '\n'|'\t' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

fragment CHARS : LETRAS | INT | BACKS | WSPACE | SIMBOLS;

fragment ESC :  '\\' ('n'|'t'|'"'|'\\');

fragment WSPACE : (' ')+;

fragment BACKS : ('\\\"'|'.'|','|'\\\''|':' | 'n');

fragment SIMBOLS: '.' | ',' | ':' | '?' | ';' | '%' ;

fragment LETRAS :  ('a'..'z'|'A'..'Z');
