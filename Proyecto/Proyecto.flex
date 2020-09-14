%%

%class Proyecto
%unicode
%int
%line
%column
%standalone
%state LineComment
%state MultiLineComment
%state String

// Foundational Definitions
letra=[a-zA-z]
digito=[0-9]

//Characters definition
puntocoma = ";"
colon = ":"
coma = ","
define = define
as = as
asignacion = ":="


leftpar = "("
rightpar = ")"

linecomment = "##"
leftcomment = "/#"
rightcomment = "#/"

leftbracket = "["
rightbracket = "]"

leftkey = "{"
rightkey = "}"

quote = "\""

newline = "\r"
//sssssss

variable = {letra}({letra}|{digito})*
numero = {digito}+
espacios = [ \n\r\t]+
// palabras reservadas
main = open-main
close-main = close-main
true = true
false = false
integerdecl = integer
booleandecl = boolean
characterdecl = character
arraydecl = list
if = open-test
close-if = close-test
else = or
then = then
switch = open-match
when = when
no-match = no-match
break = stop
close-switch = close-match
for = open-for
close-for = close-for
oprel = "<"|">"|"=="|"!="
mathop = "+"|"-"|"*"|"/"|"^"
logicalop = {true}|{false}
lectura = eat
print = throw
println = throwln
until= open-until
do = do
close-until = close-until
open-method = open-method
close-method = close-method


%{
    public String globalacum = "";
%}


%%
<YYINITIAL>{
    {main}      {String output = "<"+yytext()+",MAIN reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {close-main}      {String output = "<"+yytext()+",CLOSE-MAIN reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {quote}     {   globalacum = "\"";
                    yybegin(String);
                } 
    {lectura}   {String output = "<"+yytext()+",eat(lectura) reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                 }
    {throw}   {String output = "<"+yytext()+",throw(impresion) reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                 }
    {throwln}   {String output = "<"+yytext()+",throwln(lectura con salto de linea) reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                 }
    {linecomment} { globalacum = "<##"; 
                    yybegin(LineComment);
                    }
    {leftcomment} { globalacum = "</#";
                    yybegin(MultiLineComment);
                    }
    {integerdecl} {String output = "<"+yytext()+",Integer reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                    }
    {booleandecl} {String output = "<"+yytext()+",Boolean reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                    }
    {characterdecl} {String output = "<"+yytext()+",Character reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                    }
    {arraydecl}     {String output = "<"+yytext()+",Array reserved word>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                     }
    {switch}    {String output = "<"+yytext()+",OPEN-MATCH reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {close-switch}    {String output = "<"+yytext()+",CLOSE-MATCH reserved word>, linea: "+yyline+" columna: "+yycolumn;
                        System.out.println(output); 
                        }
    {when}    {String output = "<"+yytext()+",WHEN reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {no-match}  {String output = "<"+yytext()+",NO-MATCH reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {break}    {String output = "<"+yytext()+",STOP reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {if}    {String output = "<"+yytext()+",OPEN-TEST reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
            }
    {close-if}    {String output = "<"+yytext()+",CLOSE-TEST reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
            }
    {else}    {String output = "<"+yytext()+",OR reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {then}    {String output = "<"+yytext()+",THEN reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {until}   {String output = "<"+yytext()+",OPEN-UNTIL reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
               }
    {do}      {String output = "<"+yytext()+",DO reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }       
    {close-until}   {String output = "<"+yytext()+",CLOSE-UNTIL reserved word>, linea: "+yyline+" columna: "+yycolumn;
                        System.out.println(output); 
                    } 
    {for}    {String output = "<"+yytext()+",OPEN-FOR reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {close-for}    {String output = "<"+yytext()+",CLOSE-FOR reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {puntocoma} {String output = "<"+yytext()+",Punto y Coma>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);    
                }

    {coma}      {String output = "<"+yytext()+",Coma>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);  
                }
    {colon}     {String output = "<"+yytext()+",Colon>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);    
                }
    {asignacion}  {String output = "<"+yytext()+",Asignacion>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                  }
    {leftpar}  {String output = "<"+yytext()+",Left Parenthesis>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }
    {rightpar}  {String output = "<"+yytext()+",Right Parenthesis>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }
    {leftkey}     {String output = "<"+yytext()+",Left Key>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);    
                }
    {rightkey}     {String output = "<"+yytext()+",Right Key>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);    
                }

    {leftbracket}  {String output = "<"+yytext()+",Left Bracket>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }
    {rightbracket}  {String output = "<"+yytext()+",Right Bracket>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }
    {oprel}   {String output = "<"+yytext()+",Relational Operator>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
              }
    {mathop}   {String output = "<"+yytext()+",Math Operator>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
              } 
    {logicalop}   {String output = "<"+yytext()+",Logical Operator>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
              } 
    
    {numero}  {String output = "<"+yytext()+",NUMERO>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }          
    {variable}  {String output = "<"+yytext()+",ID>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }
    {open-method}  {String output = "<"+yytext()+",FUNCION>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                   } 
    {open-method}  {String output = "<"+yytext()+",FIN FUNCION>, linea: "+yyline+" columna: "+yycolumn;
                    System.out.println(output);
                    } 
    {espacios}   {}
    .           {String output = "<"+yytext()+",NOT CODED>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output);
                }
}
<String>{
    {quote} { globalacum += "\"";
              System.out.println("<"+globalacum+", String>");
              globalacum = "";
              yybegin(YYINITIAL);
            }
    . {globalacum += yytext();}
}

<LineComment>{
    {newline} { globalacum += ", Line Comment>";
                System.out.println(globalacum);
                globalacum = "";
                yybegin(YYINITIAL); 
                }
    . { globalacum += yytext(); }
}
<MultiLineComment>{
    {rightcomment} { globalacum += "#/, MultiLine Comment>"; 
                     System.out.println(globalacum);
                     globalacum = "";
                     yybegin(YYINITIAL);
                    }
    . { globalacum += yytext(); }
}
