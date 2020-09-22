package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
%state multilinecomment
L=[a-zA-Z_]
P = L+
D=[0-9]+
espacio=[ ,\t,\r]+
caracter = "'"[^]"'"|"'""'"
%{
    public String lexeme;
%}
%%
<YYINITIAL>{
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}
("/*")  {yybegin(multilinecomment);}
{caracter} {lexeme=yytext(); return Caracter;}
/* Salto de linea */
( "\n" ) {return Linea;}
/* Comillas */
( "\'" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( integer ) {lexeme=yytext(); return Int;}


/* Tipos de datos */
( character) {lexeme=yytext(); return Character;}

/* Tipos de datos */
( boolean) {lexeme=yytext(); return Boolean;}


/* Palabra reservada open-test */
( "open-test" ) {lexeme=yytext(); return OpenTest;}

/* Palabra reservada close-test */
("close-test") {lexeme=yytext(); return CloseTest;}

/* Palabra reservada or */
( "or") {lexeme=yytext(); return Or;}

/* Palabra reservada Then */
( "then") {lexeme=yytext(); return Then;}

/* Palabra reservada Define */
( define ) {lexeme=yytext(); return Define;}

/* Palabra reservada as */
( as ) {lexeme=yytext(); return As;}


/* Palabra reservada Throw */
( throw ) {lexeme=yytext(); return THrow;}

/* Palabra reservada Println */
( throwln ) {lexeme=yytext(); return Throwln;}

/* Palabra reservada Eat */
( eat ) {lexeme=yytext(); return Eat;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}



/* Palabra reservada For */
( open-for ) {lexeme=yytext(); return OpenFor;}
/* Palabra reservada For */
( close-for ) {lexeme=yytext(); return CloseFor;}

/* Operador Igual */
( ":=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "open-main" ) {lexeme=yytext(); return Main;}

/* Marcador de fin de algoritmo */
( "close-main" ) {lexeme=yytext(); return CloseMain;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Identificador */
{L}+ ({L}+|{D})* {lexeme=yytext(); return Identificador;}

/* Identificador */
{L} {lexeme=yytext(); return L;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}
}

<multilinecomment>{
    ("*/") {yybegin(YYINITIAL);}
    .  {}
    ("\n") {return Linea;}
}