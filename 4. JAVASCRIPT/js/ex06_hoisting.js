console.log("LESSON 06 - Hoisting");

console.log("------------------");

/*
 
  Works with

  + declaration functions
  + global variables (scope var)

*/

calculateAge(1998);

function calculateAge(yob) {
	let thisYear = new Date().getFullYear();
    let age = thisYear - yob + 1;

    console.log("Calculated Age ===> " + age);
}

console.log("------------------");

text = "Hello";

var text;

console.log(`Text --> ${text}`);



