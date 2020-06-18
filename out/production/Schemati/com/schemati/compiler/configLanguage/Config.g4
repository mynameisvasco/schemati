grammar Config;

@header {
package com.schemati.compiler.configLanguage.antlr4;
}

prog: headers scene;

headers: header*;
header: 'include' '<' FilePath '>';

load: 'fromHeader' '(' ID ')';

scene: 'scene' '{' title width height scale background '}';
title: 'title:' var ',';
width: 'width:' var ',';
height: 'height:' var ',';
scale: 'scale:' var ',';
background: 'background:' var;

var: (String | Int | Double | Hex ) #VarLocal |
    load #VarLoad;

WS: [ \t\r\n]+ -> skip ;
Int: [0-9]+;
ID: [a-zA-Z0-9]+;
Hex: '#'[a-fA-F0-9]+;
String: '"'.*?'"';
Double: [0-9]+'.'[0-9]+;
FilePath: [a-zA-Z0-9/\\.-]+;
