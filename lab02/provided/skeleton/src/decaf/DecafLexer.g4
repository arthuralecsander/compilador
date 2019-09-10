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

LPARENTESE: '(';
RPARENTESE: ')';

LBRACKETS: '[';
RBRACKETS: ']';

PRESRV : 'boolean'|'break'|'callout'|'class'|'continue'|'else'|'if'|'for'|'int'|'return'|'void';

BOOLEANS: 'true'|'false';

HEXN : '0' 'x' (INT|LETRAS)+ ;

INT :  ('0'..'9')+;

ID : LETRAS (LETRAS | '_' | INT)*;

WS_ : (' ' | '\n' | '\t' | '	' ) -> skip;

SL_COMMENT : '//' (CHARS|'\'')* '\n' -> skip;

MUNDCHAR :
  '\'' (CHARS) '\'' ;

STRING_ :
  '\"' (CHARS)+ '\"';

OPAR:
'+'|'-'|'*'|'/'|'=';

OPLOG:
'&&'|'||';

OPRE:
'<'|'<='|'!='|'>'|'=>'|'==';

SEMICOLON :
  ';';

COMMA :
  ',';


fragment CHARS : LETRAS | INT | BACKS | WSPACE | SIMBOLS;

fragment LETRAS : ('a'..'z' | 'A'..'Z');

fragment BACKS : '\\n' | '\\t' | '\\\\' | '\\"' | '\\\'';

fragment WSPACE : (' ')+;

fragment SIMBOLS: '.' | ',' | ':' | '?' | ';';


// '-'?INT (para negativo ser opcional)

