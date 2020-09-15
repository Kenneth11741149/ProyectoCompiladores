package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]
P = L+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\'" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
(integer ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Tipos de datos */
( character) {return new Symbol(sym.Character, yychar, yyline, yytext());}


/* Tipos de datos */
( boolean) {return new Symbol(sym.Boolean, yychar, yyline, yytext());}


/* Palabra reservada Eat */
(eat) {return new Symbol(sym.Eat, yychar, yyline, yytext());}

/* Palabra reservada Throw */
(throw) {return new Symbol(sym.THrow, yychar, yyline, yytext());}

/* Palabra reservada Throwln */
(throwln) {return new Symbol(sym.Throwln, yychar, yyline, yytext());}

/* Palabra reservada open-test */
( "open-test" ) {return new Symbol(sym.OpenTest, yychar, yyline, yytext());}

/* Palabra reservada close-test */
( "close-test" ) {return new Symbol(sym.CloseTest, yychar, yyline, yytext());}

/* Palabra reservada then */
( "then") {return new Symbol(sym.Then, yychar, yyline, yytext());}

/* Palabra reservada Or */
( "or" ) {return new Symbol(sym.Or, yychar, yyline, yytext());}

/* Palabra Reservada Define */
( define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

/* Palabra Reservada As */
( as ) {return new Symbol(sym.As, yychar, yyline, yytext());}



/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}



/* Palabra reservada For */
( open-for ) {return new Symbol(sym.OpenFor, yychar, yyline, yytext());}

/* Palabra reservada For */
( close-for ) {return new Symbol(sym.CloseFor, yychar, yyline, yytext());}

/* Palabra reservada UNTIL */
( open-until ) {return new Symbol(sym.OpenUntil, yychar, yyline, yytext());}

/* Palabra reservada For */
( close-until ) {return new Symbol(sym.CloseUntil, yychar, yyline, yytext());}


/* Palabra reservada openmatch */
( open-match ) {return new Symbol(sym.OpenMatch, yychar, yyline, yytext());}

/* Palabra reservada closematch */
( close-match ) {return new Symbol(sym.CloseMatch, yychar, yyline, yytext());}

/* Palabra reservada when */
( when ) {return new Symbol(sym.When, yychar, yyline, yytext());}

/* Palabra reservada Stop */
( stop ) {return new Symbol(sym.Stop, yychar, yyline, yytext());}

/* Operador Igual */
( ":=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "open-main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Marcador de fin de algoritmo */
( "close-main" ) {return new Symbol(sym.CloseMain, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Identificador */
{L}+({L}+|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* letra */
{L} {return new Symbol(sym.L, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
