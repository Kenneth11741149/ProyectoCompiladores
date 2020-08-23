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
asignacion = "="

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
main = main
true = true
false = false
integerdecl = integer
booleandecl = boolean
characterdecl = character
if = if
else = else
then = then
switch = switch
case = case
break = break
for = for
oprel = "<"|">"|"=="|"!="
mathop = "+"|"-"|"*"|"/"|"^"
logicalop = {true}|{false}

%{
    public String globalacum = "";
%}


%%
<YYINITIAL>{
    {main}      {String output = "<"+yytext()+",MAIN reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {quote}     {   globalacum = "\"";
                    yybegin(String);
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
    {switch}    {String output = "<"+yytext()+",SWITCH reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {case}    {String output = "<"+yytext()+",CASE reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {break}    {String output = "<"+yytext()+",BREAK reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
                }
    {if}    {String output = "<"+yytext()+",IF reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
            }
    {else}    {String output = "<"+yytext()+",ELSE reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {then}    {String output = "<"+yytext()+",THEN reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {for}    {String output = "<"+yytext()+",FOR reserved word>, linea: "+yyline+" columna: "+yycolumn;
                System.out.println(output); 
              }
    {puntocoma} {String output = "<"+yytext()+",Punto y Coma>, linea: "+yyline+" columna: "+yycolumn;
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
