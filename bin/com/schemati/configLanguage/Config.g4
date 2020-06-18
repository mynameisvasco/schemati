grammar Config;

@header {
package com.schemati.compiler.configLanguage.gen;
}

prog: stat+?;
stat: expr;
expr: element+;

element:
	'element' elementName = String '{' identifier ',' inputNodes ',' outputNodes ',' image '}' ',';

identifier: 'identifier' ':' identifierName = String;
inputNodes:
	'inputNodes' ':' '[' coordinatesObjs = Coordinates+ ']';
outputNodes:
	'outputNodes' ':' '[' coordinatesObjs = Coordinates+ ']';
image: 'image' ':' imageUrl = String;

String: '"' [A-Za-z]+ '"';
Coordinates: '{' 'x' ':' [0-9]+ ',' 'y' ':' [0-9]+ '}' ',';