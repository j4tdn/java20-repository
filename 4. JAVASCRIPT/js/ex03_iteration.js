console.log("LESSON 03 - Loop and Interation");

console.log("------------------");

var text = "js is a loosly data type";

console.log("forIn -> forIndex");
for(var i in text) {
	console.log("i --> " + i);
}

console.log("forOf -> forEach");
for(var letter of text) {
	console.log("letter --> " + letter);
}