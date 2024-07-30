console.log("LESSON 07 - Array Data Structure");

console.log("------------------");

// prototype: Array
// create new function
Array.prototype.insert = function(posToBeInserted, newValue) {
	this.splice(posToBeInserted, 0, newValue);
};

// prototype: Array
// override function
Array.prototype.forEach = function(element) {
	console.log("forEach, do nothing");
};

let elements = ["A1", "B2", "C3", "D4", "Z5"];

let another = ["X1", "X2"]

elements.push("W9", "W10", ...another);

elements.unshift("K0");

elements.insert(2, 'JAVA1920-Test');

console.log(elements);

elements.forEach(e => console.log("ex ==> " + e));





