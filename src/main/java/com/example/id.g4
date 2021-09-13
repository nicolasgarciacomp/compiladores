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

INST_A : ID ESP '=' ESP (OP_A)+ PYC ;
INST_R : PA OP_R PC ESP OPERACION_L ESP PA OP_R PC ;
INST_R_ : OP_R ESP OPERACION_L ESP OP_R ;
INST_N : OPERACION_N ESP PA OP_R PC ;

WHILE : 'while' ESP PA (OP_R | INST_R_)+ PC WS LLA (WS+ INST_A)+ WS+ LLC ;

INSTRUCCION : TIPO ESP ID PYC
            | TIPO ESP ID ESP '=' ESP ID PYC
            | TIPO ESP (ID', ')+ ID PYC
            | TIPO ESP ((ID ESP '= ' (ID | NUMERO) ', ') | (ID ', '))+ ((ID ESP '= ' (ID | NUMERO) PYC) | (ID PYC))
            ;

s : WHILE { System.out.println("WHILE ->" + $WHILE.getText() + "<--"); } s
  | OP_A { System.out.println("OP_A ->" + $OP_A.getText() + "<--"); } s
  | OP_R { System.out.println("OP_R ->" + $OP_R.getText() + "<--"); } s
  | INST_A { System.out.println("INST_A ->" + $INST_A.getText() + "<--"); } s
  | INST_R { System.out.println("INST_R ->" + $INST_R.getText() + "<--"); } s
  | INST_N { System.out.println("INST_N ->" + $INST_N.getText() + "<--"); } s
  | INSTRUCCION { System.out.println("INSTRUCCION ->" + $INSTRUCCION.getText() + "<--"); } s
  | ID { System.out.println("ID ->" + $ID.getText() + "<--"); } s
  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO { System.out.println("Otro ->" + $OTRO.getText() + "<--"); } s
  | EOF
  ;
