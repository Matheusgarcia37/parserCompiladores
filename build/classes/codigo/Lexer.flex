package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
P=[^0-9a-zA-Z\n\t ]?
espaco=[ ]+
espacoString=[ ,\\t,\\r,\\n]+
quebraLinhaString=[\t,\r,\n]+
bN=[\n]+
bT=[\t]+
bR=[\r]+
%{
    public String lexeme;
%}
%%
{espaco} {/*Ignore*/}
{bN} {/*Ignore*/}
{bT} {/*Ignore*/}
{bR} {/*Ignore*/}
"//".* {/*Ignore*/}
"#" {lexeme=yytext(); return Hash;}
"include" {lexeme=yytext(); return Include;}
"<stdio.h>" {lexeme=yytext(); return Lib;}
"define" {lexeme=yytext(); return Constante;}
"int" {lexeme=yytext(); return Int;}
"double" {lexeme=yytext(); return Double;}
"void" {lexeme=yytext(); return Void;}
"char" {lexeme=yytext(); return Char;}
"float" {lexeme=yytext(); return Float;}
"if" {lexeme=yytext(); return If;}
"else" {lexeme=yytext(); return Else;}
"scanf" {lexeme=yytext(); return Scanf;}
"printf" {lexeme=yytext(); return Printf;}
"main" {lexeme=yytext(); return Main;}
"return" {lexeme=yytext(); return Return;}
"while" {lexeme=yytext(); return Enquanto;}
"for" {lexeme=yytext(); return Para;}
"&&" {lexeme=yytext(); return AndAnd;}
"||" {lexeme=yytext(); return Or;}
"==" {lexeme=yytext(); return Equal;}
"_" {lexeme=yytext(); return Underline;}
"("  {lexeme=yytext(); return AbreP;}
")"  {lexeme=yytext(); return FechaP;}
"[" {lexeme=yytext(); return AbreCO;}
"]" {lexeme=yytext(); return FechaCO;}
"{" {lexeme=yytext(); return AbreCH;}
"}" {lexeme=yytext(); return FechaCH;}
"+" {lexeme=yytext(); return Soma;}
"-" {lexeme=yytext(); return Subtracao;}
"/" {lexeme=yytext(); return Divisao;}
"\'" {lexeme=yytext(); return AspasSimples;}
"\"" {lexeme=yytext(); return AspasDuplas;}
"\\" {lexeme=yytext(); return ContraBarra;}
"!" {lexeme=yytext(); return Not;}
"%" {lexeme=yytext(); return Resto;}
"*" {lexeme=yytext(); return Multiplicacao;}
"<" {lexeme=yytext(); return Menor;}
">" {lexeme=yytext(); return Maior;}
"=" {lexeme=yytext(); return Recebe;}
"\n" {lexeme=yytext(); return ContLinha;}
"\\n" {lexeme=yytext(); return PulaLinha;}
"\\t" {lexeme=yytext(); return Tab;}
"!=" {lexeme=yytext(); return Diferente;}
">=" {lexeme=yytext(); return MaiorIgual;}
"<=" {lexeme=yytext(); return MenorIgual;}
"." {lexeme=yytext(); return Ponto;}
"," {lexeme=yytext(); return Vir;}
";" {lexeme=yytext(); return Pv;}
"&" {lexeme=yytext(); return And;}
"++" {lexeme=yytext(); return Incremento;}
"--" {lexeme=yytext(); return Decremento;}
{L}({L}|{D})* {lexeme=yytext(); return Id;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
{D}({L}|{D})* {lexeme=yytext(); return ERROR;}
(\"({espacoString} | {P} | {L} | {D})+ \") {lexeme=yytext(); return String;}
(\"({quebraLinhaString} | {espacoString} | {P} | {L} | {D})+ \") {lexeme=yytext(); return QuebraLinhaStringError;}
 . {lexeme=yytext(); return ERROR;}