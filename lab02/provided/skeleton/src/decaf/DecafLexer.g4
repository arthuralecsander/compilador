lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

tokens
{
  TK_class
}

LCURLY : '{';
RCURLY : '}';

LPAR: '(';
RPAR: ')';

LBRAC: '[';
RBRAC: ']';

SL_COMMENT : '//' (CHARS | '\"'| '\'')* -> skip;

//SL_COMMENT: '//' ~[\n\t]* -> skip;

BOOLEAN: 'boolean' ; 
BREAK: 'break' ; 
CALLOUT: 'callout' ; 
CLASS: 'class' ;
CONTINUE: 'continue' ;
ELSE: 'else' ;
IF: 'if' ;
FOR: 'for' ;
INTV: 'int' ;
RETURN: 'return' ;
VOID: 'void' ;

//operadores
OPPOS: '+' ;
OPNEG: '-' ;
OPMUL: '*' ;
OPDIV: '/' ;
OPPER: '%' ;
OPIGU: '=' ;
OPMIG: '+=' ;
OPMME: '-=' ;

BOOLEANS: 'true'|'false';

INT :  ('0'..'9')+ | HEXN;

HEXN : '0' 'x' (INT|LETRAS)+ ;

ID : LETRAS (LETRAS | '_' | INT)*;

WS_ : (' ' | '\n' | '\t' | '	' ) -> skip;




MUNDCHAR :
  '\'' (CHARS) '\'' ;

STRING_ :
  '\"' (CHARS)+ '\"';




DIF: '!' ;

OPLOGE: '&&' ;
OPLOGO: '||' ;

//operadores


OPMEN: '<' ;
OPMAI: '>' ;
OPMENI: '<=' ;
OPMAII: '>=' ;
OPCIG: '==' ;
OPDIF: '!=' ;

PVIRG : ';';

COMMA : ',';


fragment CHARS : LETRAS | INT | BACKS | WSPACE | SIMBOLS;

fragment LETRAS : ('a'..'z' | 'A'..'Z');

fragment BACKS : '\\n' | '\\t' | '\\\\' | '\\"' | '\\\'';

fragment WSPACE : (' ')+;

fragment SIMBOLS: '.' | ',' | ':' | '?' | ';' | '%' | RPAR | LPAR  ;


// '-'?INT (para negativo ser opcional)

