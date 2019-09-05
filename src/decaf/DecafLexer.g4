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

PRESRV : 'boolean'|'break'|'callout'|'class'|'continue'|'else'|'if'|'for'|'int'|'return'|'void';

BOOLEANS: 'true'|'false';

INT : ('0'..'9');

ID  :
  ('a'..'z' | 'A'..'Z' | '_' )+ | ('a'..'z' | 'A'..'Z' | '_' | INT)+;


WS_ : (' ' | '\n' | '\t' | '	' ) -> skip;

SL_COMMENT : '//' CHARS* '\n' -> skip;

//CHAR : '\'' (ESC|~'\'') '\'';
//STRING : '"' (ESC|~'"')* '"' | '\'' (ESC|~'"') '\'';

fragment CHARS :
  ( 'a'..'z' | 'A'..'Z' ) | INT | BACKS | WSPACE | SIMBOLS;

MUNDCHAR :
  '\'' (CHARS) '\'' ;

STRING_ :
  '\"' (CHARS)+ '\"';



fragment BACKS :
  '\\n' | '\\t' | '\\\\' | '\\"' | '\\\'';

fragment WSPACE : 
   (' ')+;

fragment SIMBOLS:
   '.' | ',' | ':' | '?';

OPAR:
'+'|'-'|'*'|'/';
OPLOG:
'&&'|'||';
OPRE:
'<'|'<='|'=!'|'>'|'=>'|'==';
// '-'?INT (para negativo ser opcional)

