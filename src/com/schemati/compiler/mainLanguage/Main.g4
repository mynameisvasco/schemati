grammar Main;
@header {
package com.schemati.compiler.mainLanguage.antlr4;
}
prog: (stat | assignFunc | controlStruct | animStruct| print | startCtrl)*;
controlStruct:  (ifStat
              	| forStat);
animStruct: Anim LBr (atTimeDuring|atEventDuring)* RBr;
stat:
    (createVar
	| assignVar
	| changeArr
	| expr) Semicolon;
createVar: Type ID Equal e1 = expr;
assignVar: var Equal e1 = expr;
assignFunc: 'function' Type ID LPa typedArgs? RPa blockFunc;
changeArr: ID op = (AddArr | RemoveArr) expr (Comma expr)*;
returnStat: 'return' expr Semicolon;
print: Print expr Semicolon;
loopCtrl: (Break | Continue) Semicolon;
block: LBr (stat | controlStruct | animStruct | print)* (returnStat | loopCtrl)? RBr;
blockFunc: LBr (stat | controlStruct| animStruct | print)* returnStat? RBr;
ifStat: If LPa expr RPa block elseStat?;
elseStat: Else block;
atTimeDuring: At start=expr During during=expr block;
atEventDuring: At start=ID block;
forStat:
	For LPa Type ID each='in' ID RPa block
	| For LPa (createVar | assignVar) Semicolon end = expr Semicolon (expr|assignVar) RPa block;
startCtrl: Start ID;
expr:
	op = (Sub | Sum)  expr						    # ExprUnary
	| e1 = expr op = (Mult | Div | Mod) e2 = expr	# ExprMultDivMod
	| e1 = expr op = (Sum | Sub) e2 = expr			# ExprAddSub
	| LPa  expr RPa								    # ExprParenthesis
	| e1 = expr op = (
		EqGreater
		| EqLess
		| DblEqual
		| Greater
		| Less
		| NtEqual
	) e2 = expr										# ExprComp
	| vector2										# ExprVec
	| var  dbl=(DblPlus | DblMinus)                 # ExprVarDblOp
	| var                          	                # ExprVar
	| functionCall								    # ExprFunCall
	| Color											# ExprColor
	| Double										# ExprDouble
	| Boolean										# ExprBool
	| Integer										# ExprInteger
	| String										# ExprStr
	| Array                                         # ExprArray
	| Seconds                                       # ExprSeconds
	| Milliseconds                                  # ExprMilliseconds
	| Null											# ExprNull;
functionCall: ID LPa args? RPa attr*;
args: ID DblDots expr (Comma ID DblDots expr)*;
typedArgs: typeID (Comma typeID)*;
typeID : Type ID;
var: ID LRp index=expr RRp attr*     #VarArr
     | ID attr*                              #VarId ;
attr: Pointer ID;
vector2: LBr xVal=Integer Comma yVal=Integer RBr;
Type:
	'String' Array?
	| 'Void' Array?
	| 'Integer' Array?
	| 'Double' Array?
	| 'Boolean' Array?
	| 'Color' Array?
	| 'Vector2' Array?
	| 'Entity' Array?;

Print: 'print';
Break: 'break';
Continue: 'continue';
Start: 'start';
At: 'at';
During: 'during';
If: 'if';
Else: 'else';
For: 'for';
Null: 'null';
Anim: 'anim';
Boolean: 'false' | 'true';
Double: Integer'.'Integer;
Integer: [0-9]+;
Color: '#' [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f];
Seconds: Integer 's';
Milliseconds: Integer 'ms';
Array: '[]';
Void: 'Void';
LRp: '[';
RRp: ']';
Pointer: '->';
LBr: '{';
RBr: '}';
LPa: '(';
RPa: ')';
Comma: ',';
DblDots: ':';
Semicolon: ';';
DblPlus: '++';
DblMinus: '--';
Mult: '*';
Div: '/';
Mod: '%';
Sum: '+';
Sub: '-';
AddArr: '<<';
RemoveArr: '>>';
DblEqual: '==';
EqLess: '<=';
EqGreater: '>=';
Equal: '=';
NtEqual: '!=';
Less: '<';
Greater: '>';
ID: [_a-zA-Z] [_a-zA-Z0-9]*;
String: '"' .*? '"';
Comment: ('//' .*? '\r'? '\n' | '/*' .*? '*/') -> skip;
WS: [ \t\r\n]+ -> skip;