package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%column
%char
%state multilinecomment
L=[a-zA-Z_]
P = L+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
caracter = "'"[^]"'"|"'""'"
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yyline, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yyline);
    }
%}
%%
<YYINITIAL>{
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

("/*")  {yybegin(multilinecomment);}
{caracter} {return new Symbol(sym.Caracter, yycolumn, yyline, yytext());}
/* Comillas */
( "\'" ) {return new Symbol(sym.Comillas, yycolumn, yyline, yytext());}

/* Tipos de datos */
(integer ) {return new Symbol(sym.Int, yycolumn, yyline, yytext());}

/* Tipos de datos */
( character) {return new Symbol(sym.Character, yycolumn, yyline, yytext());}


/* Tipos de datos */
( boolean) {return new Symbol(sym.Boolean, yycolumn, yyline, yytext());}


/* Palabra reservada Eat */
(eat) {return new Symbol(sym.Eat, yycolumn, yyline, yytext());}

/* Palabra reservada Throw */
(throw) {return new Symbol(sym.THrow, yycolumn, yyline, yytext());}

/* Palabra reservada Throwln */
(throwln) {return new Symbol(sym.Throwln, yycolumn, yyline, yytext());}

/* Palabra reservada open-test */
( "open-test" ) {return new Symbol(sym.OpenTest, yycolumn, yyline, yytext());}

/* Palabra reservada close-test */
( "close-test" ) {return new Symbol(sym.CloseTest, yycolumn, yyline, yytext());}

/* Palabra reservada then */
( "then") {return new Symbol(sym.Then, yycolumn, yyline, yytext());}

/* Palabra reservada Or */
( "or" ) {return new Symbol(sym.Or, yycolumn, yyline, yytext());}

/* Palabra Reservada Define */
( define ) {return new Symbol(sym.Define, yycolumn, yyline, yytext());}

/* Palabra Reservada As */
( as ) {return new Symbol(sym.As, yycolumn, yyline, yytext());}



/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yycolumn, yyline, yytext());}



/* Palabra reservada For */
( open-for ) {return new Symbol(sym.OpenFor, yycolumn, yyline, yytext());}

/* Palabra reservada For */
( close-for ) {return new Symbol(sym.CloseFor, yycolumn, yyline, yytext());}

/* Palabra reservada open */
( open-method ) {return new Symbol(sym.OpenMethod, yycolumn, yyline, yytext());}

/* Palabra reservada For */
( close-method ) {return new Symbol(sym.CloseMethod, yycolumn, yyline, yytext());}

/* Palabra reservada UNTIL */
( open-until ) {return new Symbol(sym.OpenUntil, yycolumn, yyline, yytext());}

/* Palabra reservada For */
( close-until ) {return new Symbol(sym.CloseUntil, yycolumn, yyline, yytext());}


/* Palabra reservada openmatch */
( open-match ) {return new Symbol(sym.OpenMatch, yycolumn, yyline, yytext());}

/* Palabra reservada closematch */
( close-match ) {return new Symbol(sym.CloseMatch, yycolumn, yyline, yytext());}

/* Palabra reservada when */
( when ) {return new Symbol(sym.When, yycolumn, yyline, yytext());}

/* Palabra reservada Stop */
( stop ) {return new Symbol(sym.Stop, yycolumn, yyline, yytext());}

/* Operador Igual */
( ":=" ) {return new Symbol(sym.Igual, yycolumn, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yycolumn, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yycolumn, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yycolumn, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yycolumn, yyline, yytext());}



/* Operadores logicos */
( "&") {return new Symbol(sym.AND, yycolumn, yyline, yytext());}

/* Operadores logicos */
( "!") {return new Symbol(sym.NOT, yycolumn, yyline, yytext());}
/* Operadores logicos */
( "|") {return new Symbol(sym.OR, yycolumn, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yycolumn, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yycolumn, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yycolumn, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yycolumn, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yycolumn, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yycolumn, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yycolumn, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yycolumn, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yycolumn, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yycolumn, yyline, yytext());}


/* Corchete de cierre */
( "return" ) {return new Symbol(sym.Return, yycolumn, yyline, yytext());}


/* Marcador de inicio de algoritmo */
( "open-main" ) {return new Symbol(sym.Main, yycolumn, yyline, yytext());}

/* Marcador de fin de algoritmo */
( "close-main" ) {return new Symbol(sym.CloseMain, yycolumn, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yycolumn, yyline, yytext());}

/* coma */
( "," ) {return new Symbol(sym.Coma, yycolumn, yyline, yytext());}

/* Identificador */
{L}+({L}+|{D})* {return new Symbol(sym.Identificador, yycolumn, yyline, yytext());}

/* letra */
{L} {return new Symbol(sym.L, yycolumn, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yycolumn, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yycolumn, yyline, yytext());}
}

<multilinecomment>{
    ("*/") {yybegin(YYINITIAL);}
    .  {}
    ("\n") {}
}