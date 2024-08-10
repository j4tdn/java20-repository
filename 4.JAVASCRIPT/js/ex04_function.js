console.log("LESSON 04  - Functions");
console.log("--------------");


var x1 =6;
var y1 =2;

const multiply = new Function("x","y","return x*y");
console.log('multiple(function constructor --> '+multiply(x1,y1));


//Function declaration
//-> Hỗ trợ hoisting( có thể sử dụng function đó trước khi khai báo)
function multiply2(x,y){
	return x * y;

}
console.log('multiple(function constructor --> '+multiply2(x1,y1));

//Function expression(anonymous function)
var multiply3 = function(x, y){
	return x*y;
}

console.log('multiple(function constructor --> '+multiply3(x1,y1));

var multiply4 = function func(x, y){
	return x*y;
}

console.log('multiple(function constructor --> '+multiply4(x1,y1));


//Function arrow

var multiply5 = (x,y)=> x*y;
console.log('multiple(function constructor --> '+multiply5(x1,y1));


//Method 
var o1 = {
	v1:'a',
	multiply6 : function(x,y){
		return x*y;
	},
}

console.log('multiple(function constructor --> '+o1.multiply6(x1,y1))

//Nested Function: Là function bên trong  function
 var test = function (x,y) {
	var text ="logging"

	 function multiply7(){
		console.log(text +">>> x * y");
		return x *y;
	}
	return multiply7();
}
console.log('multiple(function constructor --> '+test(x1,y1));



// IFFE (thực thi hàm nhanh chóng không dùng nhiều lần)
(function foo(){
	console.log("IFFE  >> foo1");
})()

void function(){
	console.log("IIFE >> foo2")
}

(function(text){
	console.log("IFFE  >> text -->"+text);
})("Da Nang");

var multiply8 = (function(x,y){
	return x*y;
})(x1,y1);
console.log("multiple8(iife -->" + multiply8)


//closure function
function sup(name){
	var num =7;

	function get(){
		return num+name;
	};
	return get;
}
var ss =sup("teo")

function doSomeThing(action){
	console.log("== ready for action ==")
	action();

}
function playGame(){
	console.log("play game");
}

doSomeThing(playGame)
doSomeThing()

//Cho mảng
//Timf cac phần tử chẵn
// Tìm các phần tử lẻ

filter(elements, Predicate<T> predicate){
	for(var element of elements){
		if(test(element)){
			console.log("matched condition --> "+element)
		}
	}
	return result;
}

function filter(elements,test){
	var result = [];
	for(var element of elements){
		if(test(element)){
			result.push(element);
		}
	}
	return result;

}
var result  =filter([1,2,3,4,5,6], nb => nb %2 ==0);
console.log(result);



