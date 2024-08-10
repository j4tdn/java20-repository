const person = {
  name: ["Bob", "Smith"],
  age: 32,
  bio: function () {
    console.log(`${this.name[0]} ${this.name[1]} is ${this.age} years old.`);
  },
  introduceSelf: function () {
    console.log(`Hi! I'm ${this.name[0]}.`);
  },
};

person.age =38;
person.bio();
person.introduceSelf();

console.log(person);

//using function to create class/object

let Item = function()
function Item(id, name, salesPrice){
  this.id =id;
  this.name =name;
  this.salesPrice = salesPrice;

 this.exporItem = function(){
  console.log(`Item#export ==> ${this.id} ${this.name} ${this.salesPrice}`);
  }
}

let item1 = new Item(1,"Item 1", 101);
let item2 = new Item(2,"Item 2", 201);
item1.exportItem();

item2.exportItem();