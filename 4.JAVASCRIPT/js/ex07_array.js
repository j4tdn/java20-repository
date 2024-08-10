console.log("LESSON 07 - Array Data Structure");
console.log("---------------");


Array.prototype.insert = function(posToBeInserted, newValue) {
	this.splice(posToBeInserted,0,newValue);
};

Array.prototype.forEach = function (element) {
	console.log("forEach, do nothing");
}
let elements =["A1","B2","C3","D4","Z5"];

let another =["X1","X2"];

elements.push("W9");
elements.push("H10", "L11");

elements.push(another);
elements.unshift("K0")
console.log(elements);

elements.forEach(e => console.log("ex ==>"+e));