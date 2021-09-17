grammar id;

@header {
package com.example;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

ID : (LETRA | DIGITO | '_')+ ;
NUMERO : DIGITO+ ;
OTRO : . ;
PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
PYC : ';' ;
COMA : ',' ;
ESP : ' ' ;
WS : (' '|'\t'|'\n'|'\r')+ {skip();} ;

TIPO : ('int' | 'long' | 'float' | 'double' | 'char') ;

OPERACION_A : ('+' | '-' | '*' | '/' | '%') ;
OPERADORES_R : ('<' | '<=' | '>' | '>=' | '==' | '!=') ;
OPERACION_L : ('&&' | '||') ;
OPERACION_N : '!' ;

OP_A : (ID | NUMERO) (ESP OPERACION_A ESP (ID | NUMERO))+ ;
OP_R : (ID | NUMERO) ESP OPERADORES_R ESP (ID | NUMERO) ;

ASIG : ID ESP '=' ESP (ID | NUMERO) PYC ;
INST_A : ID ESP '=' ESP (OP_A)+ PYC ;
INST_R : PA OP_R PC ESP OPERACION_L ESP PA OP_R PC ;
INST_R_ : OP_R ESP OPERACION_L ESP OP_R ;
INST_N : OPERACION_N ESP PA OP_R PC ;

WHILE : 'while' ESP PA (OP_R | INST_R_)+ PC (ESP LLA | WS LLA) (WS+ (INST_A | ASIG))+ WS+ LLC ;
FOR : 'for' ESP PA ASIG ESP OP_R PYC ESP ID ESP '=' ESP (OP_A)+ PC ;
IF : 'if' ESP PA (OP_R | INST_R_)+ PC (WS+ (INST_A | ASIG))+ WS+
   | 'if' ESP PA (OP_R | INST_R_)+ PC (WS+ (INST_A | ASIG))+ WS+ 'else' ESP LLA (WS+ (INST_A | ASIG))+ WS+ LLC;

DECLA : TIPO ESP ID PYC
      | TIPO ESP ID ESP '=' ESP ID PYC
      | TIPO ESP (ID', ')+ ID PYC
      | TIPO ESP ((ID ESP '= ' (ID | NUMERO) ', ') | (ID ', '))+ ((ID ESP '= ' (ID | NUMERO) PYC) | (ID PYC))
      ;

s : DECLA { System.out.println("DECLA ->" + $DECLA.getText() + "<--"); } s
  | ASIG { System.out.println("ASIG ->" + $ASIG.getText() + "<--"); } s
  | INST_A { System.out.println("INST_A ->" + $INST_A.getText() + "<--"); } s
  | WHILE { System.out.println("WHILE ->" + $WHILE.getText() + "<--"); } s
  | FOR { System.out.println("FOR ->" + $FOR.getText() + "<--"); } s
  | IF { System.out.println("IF ->" + $IF.getText() + "<--"); } s
  | OTRO { System.out.println("Otro ->" + $OTRO.getText() + "<--"); } s
  | EOF
  ;
