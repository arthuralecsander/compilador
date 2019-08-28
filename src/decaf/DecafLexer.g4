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

ID  :
  ('a'..'z' | 'A'..'Z')+;

MUNDCHAR :
  '\'' ('a'..'z' | 'A'..'Z' | '0'..'9')'\'';

PRESRV :
  'boolean'|'break'|'callout'|'class'|'continue'|'else'|'false'|'for'|'int'|'return'|'true'|'void';

WS_ : (' ' | '\n' | '/t' | '//' | '	' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

//CHAR : '\'' (ESC|~'\'') '\'';
STRING : '"' (ESC|~'"')* '"' | '\'' (ESC|~'"') '\'';

fragment
ESC :  '\\' ('n'|'"');
