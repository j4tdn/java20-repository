console.log("LESSON 08 - Object Type");

console.log("---------1---------");

let po = {
  name: [],
  age: 32,
  
  bio: function() {
    console.log(`${this.name[0]} ${this.name[1]} is ${this.age} years old.`);
  },
  
  introduceSelf: function() {
    console.log(`Hi! I'm ${this.name[0]}`);
  }
};
po.name = ["Bob", "Smith"];
po.age = 38;
po.bio();
po.introduceSelf();

po.address = "Milan";

console.log(po);

console.log("--------2----------");


// Using function to create class/object
function Item(id, name, salesPrice) {
	this.id = id;
	this.name = name;
	this.salesPrice = salesPrice;

	this.exportItem = function() {
		console.log(`Item#export ==> ${this.id} ${this.name} ${this.salesPrice}`);
	}
}

let item1 = new Item(1, "Item 1", 101);
let item2 = new Item(2, "Item 2", 201);

item1.exportItem();
item2.exportItem();

// Using class to create object

class Person {
  name;

  constructor(name) {
    this.name = name;
  }

  introduceSelf() {
    console.log(`Hi! I'm ${this.name}`);
  }
}

class Professor extends Person {
  teaches;

  constructor(name, teaches) {
    super(name);
    this.teaches = teaches;
  }

  introduceSelf() {
    console.log(
      `Professor --> My name is ${this.name}, and I will be your ${this.teaches} professor.`,
    );
  }

  grade(paper) {
    const grade = Math.floor(Math.random() * (5 - 1) + 1);
    console.log(grade);
  }
}

class Student extends Person {
  #year;

  constructor(name, year) {
    super(name);
    this.#year = year;
  }

  setYear(year) {
  	this.#year = year;
  }

  introduceSelf() {
    console.log(`Student --> Hi! I'm ${this.name}, and I'm in year ${this.#year}.`);
  }

  #canStudyArchery() {
    return this.#year > 1;
  }
}

let p1 = new Professor("Prof-A", "Teo");
let s1 = new Student("Student-B", 2003);

p1.teaches = "LeLe";
// s1.year = 1990;
s1.setYear(1990);

p1.introduceSelf();
s1.introduceSelf();

// console.log("isArchery --> " + s1.canStudyArchery())