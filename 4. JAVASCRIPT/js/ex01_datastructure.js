"use strict";

/*
	Strict Mode
	--> ko được phép sử dụng biến chưa khai báo
*/

console.log("LESSON 01 - Data Structure");

console.log("------------------");

var propX;

console.log("propX0 --> " + propX);
console.log("propX0(type) --> " + (typeof propX));

propX = "Text of PropX";

console.log("propX1 --> " + propX);
console.log("propX1(type) --> " + (typeof propX));


propX = 88;

console.log("propX2 --> " + propX);

propX = new Date();

console.log("propX3 --> " + propX);
console.log("propX3(type) --> " + (typeof propX));

propX = {
	id: "101",
	name: "prop101"
};

console.log(propX);


/*
Inheritance vs Composition

Cấu trúc dữ liệu, có 2 loại

+ static type
  --> khi khai báo 1 biến phải đi kèm, ràng buộc với 1 KDL cụ thể lúc compile
  --> gán giá trị trong phạm vi của KDL đó(kiểu con(thừa kế, đa hình trong đối tượng))

  int a = 5;
  Book book = new Book();
  Book book = new TextBook();

+ dynamic(loosly) type
  --> khi khai báo 1 biến không đi kèm, ràng buộc với bất kỳ KDL nào
  --> gán giá trị bất kỳ nào cho biến đó
  --> KDL của nó sẽ biết được lúc runtime
  
  let/var/const a = ?;	 
 
  a = 5; // Number
  a = new Date(); // Date
  a = "text"; // String

  --> TypeScript: static type

*/ 