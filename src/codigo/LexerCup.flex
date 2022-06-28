package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
P=[^0-9a-zA-Z\n\t ]?
espaco=[ ]+
espacoString=[ ,\\t,\\r,\\n]+
bN=[\n]+
bT=[\t]+
bR=[\r]+
%{
  private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
{espaco} {/*Ignore*/}
{bN} {/*Ignore*/}
{bT} {/*Ignore*/}
{bR} {/*Ignore*/}
"//".* {/*Ignore*/}
"#" {return new Symbol(sym.Hash, yychar, yyline, yytext());}
"include" {return new Symbol(sym.Include, yychar, yyline, yytext());}
"<stdio.h>" {return new Symbol(sym.Lib, yychar, yyline, yytext());}
"define" {return new Symbol(sym.Constante, yychar, yyline, yytext());}
"int" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"double" {return new Symbol(sym.Double, yychar, yyline, yytext());}
"void" {return new Symbol(sym.Void, yychar, yyline, yytext());}
"char" {return new Symbol(sym.Char, yychar, yyline, yytext());}
"float" {return new Symbol(sym.Float, yychar, yyline, yytext());}
"if" {return new Symbol(sym.If, yychar, yyline, yytext());}
"else" {return new Symbol(sym.Else, yychar, yyline, yytext());}
"scanf" {return new Symbol(sym.Scanf, yychar, yyline, yytext());}
"printf" {return new Symbol(sym.Printf, yychar, yyline, yytext());}
"main" {return new Symbol(sym.Main, yychar, yyline, yytext());}
"return" {return new Symbol(sym.Return, yychar, yyline, yytext());}
"while" {return new Symbol(sym.Enquanto, yychar, yyline, yytext());}
"for" {return new Symbol(sym.Para, yychar, yyline, yytext());}
"&&" {return new Symbol(sym.AndAnd, yychar, yyline, yytext());}
"||" {return new Symbol(sym.Or, yychar, yyline, yytext());}
"==" {return new Symbol(sym.Equal, yychar, yyline, yytext());}
"_" {return new Symbol(sym.Underline, yychar, yyline, yytext());}
"("  {return new Symbol(sym.AbreP, yychar, yyline, yytext());}
")"  {return new Symbol(sym.FechaP, yychar, yyline, yytext());}
"[" {return new Symbol(sym.AbreCO, yychar, yyline, yytext());}
"]" {return new Symbol(sym.FechaCO, yychar, yyline, yytext());}
"{" {return new Symbol(sym.AbreCH, yychar, yyline, yytext());}
"}" {return new Symbol(sym.FechaCH, yychar, yyline, yytext());}
"+" {return new Symbol(sym.Soma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Subtracao, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Divisao, yychar, yyline, yytext());}
"\'" {return new Symbol(sym.AspasSimples, yychar, yyline, yytext());}
"\"" {return new Symbol(sym.AspasDuplas, yychar, yyline, yytext());}
"\\" {return new Symbol(sym.ContraBarra, yychar, yyline, yytext());}
"!" {return new Symbol(sym.Not, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Resto, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacao, yychar, yyline, yytext());}
"<" {return new Symbol(sym.Menor, yychar, yyline, yytext());}
">" {return new Symbol(sym.Maior, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Recebe, yychar, yyline, yytext());}
"\\n" {return new Symbol(sym.PulaLinha, yychar, yyline, yytext());}
"\\t" {return new Symbol(sym.Tab, yychar, yyline, yytext());}
"!=" {return new Symbol(sym.Diferente, yychar, yyline, yytext());}
">=" {return new Symbol(sym.MaiorIgual, yychar, yyline, yytext());}
"<=" {return new Symbol(sym.MenorIgual, yychar, yyline, yytext());}
"." {return new Symbol(sym.Ponto, yychar, yyline, yytext());}
"," {return new Symbol(sym.Vir, yychar, yyline, yytext());}
";" {return new Symbol(sym.Pv, yychar, yyline, yytext());}
"&" {return new Symbol(sym.And, yychar, yyline, yytext());}
"++" {return new Symbol(sym.Incremento, yychar, yyline, yytext());}
"--" {return new Symbol(sym.Decremento, yychar, yyline, yytext());}
{L}({L}|{D})* {return new Symbol(sym.Id, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
{D}({L}|{D})* {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
(\"({espacoString} | {P} | {L} | {D})+ \") {return new Symbol(sym.String, yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}