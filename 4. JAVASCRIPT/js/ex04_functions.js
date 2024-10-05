console.log("LESSON 04 - Fuctions");

console.log("------------------");

var x1 = 6;
var y1 = 2;

// Function constructor
const multiply1 = new Function("x", "y", "return x * y");
console.log('multiple1(function constructor) --> ' + multiply1(x1, y1));

// Function declaration
// --> Hỗ trợ hoisting(có thể sử dụng function đó trước khi khai báo)
function multiply2(x, y) {
	return x * y;
}
console.log('multiple2(function declaration) --> ' + multiply2(x1, y1));

// Function expression(anonymous function)
var multiply3 = function(x, y) {
	return x * y;
}
console.log('multiple3(function expression) --> ' + multiply3(x1, y1));

// Function expression(function has own name)
var multiply4 = function func(x, y) {
	return x * y;
}
console.log('multiple4(function expression) --> ' + multiply4(x1, y1));

// Function arrow
var multiply5 = (x, y) => x * y;
console.log('multiply5(function arrow) --> ' + multiply5(x1, y1));

// Method
var o1 = {
	v1: 'a',
	multiply6: function(x, y) {
		return x * y;
	},
}

console.log('multiply6(method) --> ' + o1.multiply6(x1, y1));

// Nested function: Là function bên trong function
var test = function (x, y) {
	var text = "logging"
	
	function multiply7() {
		console.log(text + " >>> ")
		return x * y;
	}

	return multiply7();

}
console.log('multiply7(nested function) --> ' + test(x1, y1));

// IFFE (Immediate Invoked Funtion Expression)
(function() {
	console.log("IIFE>> foo1");
})();

void function() {
	console.log("IIFE>> foo2");
}();

(function(text) {
	console.log("IIFE>> text --> " + text);
})("Da Nang");

var multiply8 = (function(x, y) {
	return x * y;
})(x1, y1);
console.log("multiply8(iife) -> " + multiply8);


// closure function
function sup(name) {
	var num = 7;

	function get() {
		return num + name;
	};

	return get;
}

// var ss = sup("Teo");
// console.log("ss >>> " + ss());

console.log("ss >>> " + sup("Teo")());

// callback function(strategy pattern)
// pass function as a function parameter

// Trong function có tham số là 1 function #
// function # gọi là callback function

function doSomething(action) {
	console.log("== ready for action ==")
	action();
}

function playGame() {
	console.log("Play Game");
}

function playBadminton() {
	console.log("Play Badminton");
}

doSomething(playGame);
doSomething(playBadminton);
doSomething(function() {
	console.log("Play Football");
})
doSomething(() => console.log("Do Nothing"));

// Cho mảng
// Tìm các phần tử lẻ
// Tìm các phần tử chẵn
function filter(elements, test) {
	var result = [];
	for (var element of elements) {
		if (test(element)) {
			result.push(element);
		}
	}
	return result;
}

var result = filter([1,2,3,4,5,6], nb => nb % 2 == 0);
console.log(result);




