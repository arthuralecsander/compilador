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


WS_ : (' ' | '\n' | '\t' | '	' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

//CHAR : '\'' (ESC|~'\'') '\'';
//STRING : '"' (ESC|~'"')* '"' | '\'' (ESC|~'"') '\'';

fragment
ESC :  '\\' ('n'|'"');


INT :
  ('0'..'9');

CHARS :
  ( 'a'..'z' | 'A'..'Z' ) | INT;

MUNDCHAR :
  '\'' CHARS '\'';

STRING :
  '\"' CHARS+ '\"';

PRESRV :
  'boolean'|'break'|'callout'|'class'|'continue'|'else'|'false'|'for'|'int'|'return'|'true'|'void';

BACKS :
  '\''('\\n' | '\\t' | '\\\\' | '\\"')'\'';

MISS :
  '\''+;

// '-'?INT (para negativo ser opcional)

