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

BOOLEANS: 'true'|'false';

INT :  ('0'..'9')+ | HEXN;

HEXN : '0' 'x' (INT|LETRAS)+ ;

ID : LETRAS (LETRAS | '_' | INT)*;

WS_ : (' ' | '\n' | '\t' | '	' ) -> skip;

SL_COMMENT : '//' (CHARS|'\'')* '\n' -> skip;

MUNDCHAR :
  '\'' (CHARS) '\'' ;

STRING_ :
  '\"' (CHARS)+ '\"';

//operadores
OPPOS: '+' ;
OPNEG: '-' ;
OPMUL: '*' ;
OPDIV: '/' ;
OPIGU: '=' ;
OPMIG: '+=' ;
OPMME: '-=' ;

DIF: ! ;

OPLOG:
'&&'|'||';


OPMEN: '<' ;
OPMAI: '>' ;
OPMENI: '<=' ;
OPMAII: '>=' ;
OPCIG: '==' ;
OPDIF: '!=' ;

PVIRG :
  ';';

COMMA :
  ',';


fragment CHARS : LETRAS | INT | BACKS | WSPACE | SIMBOLS;

fragment LETRAS : ('a'..'z' | 'A'..'Z');

fragment BACKS : '\\n' | '\\t' | '\\\\' | '\\"' | '\\\'';

fragment WSPACE : (' ')+;

fragment SIMBOLS: '.' | ',' | ':' | '?' | ';';


// '-'?INT (para negativo ser opcional)

