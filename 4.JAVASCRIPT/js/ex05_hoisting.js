
/*
	works with

	+ declaration functions
	+ global variables (scope var)

*/

function calculateAge(yob){
	
	let thisYear = new Date().getFullYear();
	let age = thisYear - yob +1;

	console.log("Calculated Age ==> "+age);
}
calculateAge(2003)


text = "Hello";
console.log(`Text --> ${text}`);