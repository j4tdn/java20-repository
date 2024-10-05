console.log("LESSON 05 - Scope");

console.log("------------------");


(function() {
	{
		var v1 = "v1";
		var v2 = "v2";

		let l1 = "l1";
		let c2 = "c2";

		console.log("inner l1Scope --> " + l1);
		console.log("inner c2Scope --> " + c2);
	}

	console.log("v1Scope --> " + v1);
	console.log("v1Scope --> " + v2);

	// console.log("l1Scope --> " + l1);
	// console.log("c2Scope --> " + c2);

})();

const x1 = "Teo";
// x1 = "Teo Le";
console.log(x1);

const p1 = {
	x: "Teo"
}

p1.x = "Teo Le"

console.log(p1);

/*

let/const: block scope

const: hằng số, ko thể gán lại =

var: function scope
   : when declare var prop/function
     --> save global object(windows)

*/