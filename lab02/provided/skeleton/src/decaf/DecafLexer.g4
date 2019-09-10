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

INT : ('0'..'9')+;

//ID  : ('a'..'z' | 'A'..'Z' | '_' )+ | ('a'..'z' | 'A'..'Z' | '_' | INT)+;
ID : LETRAS (LETRAS | '_' | INT)*;

WS_ : (' ' | '\n' | '\t' | '	' ) -> skip;

SL_COMMENT : '//' (CHARS|'\'')* '\n' -> skip;

//CHAR : '\'' (ESC|~'\'') '\'';
//STRING : '"' (ESC|~'"')* '"' | '\'' (ESC|~'"') '\'';

fragment CHARS :
  LETRAS | INT | BACKS | WSPACE | SIMBOLS;

MUNDCHAR :
  '\'' (CHARS) '\'' ;

STRING_ :
  '\"' (CHARS)+ '\"';

SEMICOLON :
  ';';

COMMA :
  ',';


fragment LETRAS : ('a'..'z' | 'A'..'Z');

fragment BACKS : '\\n' | '\\t' | '\\\\' | '\\"' | '\\\'';

fragment WSPACE : (' ')+;

fragment SIMBOLS: '.' | ',' | ':' | '?' | ';';

OPAR:
'+'|'-'|'*'|'/'|'=';

OPLOG:
'&&'|'||';

OPRE:
'<'|'<='|'!='|'>'|'=>'|'==';

// '-'?INT (para negativo ser opcional)

