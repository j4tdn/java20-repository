const wishItem = document.getElementByName("wish");

const pTags =document.getElementByTagName("p");

const classes =document.getElementByClassName("red-text");

const = mainItem = document.getElementById("main");

const qRedTextItems = document.querySelectorAll(*"[class = 'red-text]");

const qRedTextItemsSelector = document.querySelectorAll(*"[name = 'wish]");


generate("wishItem",wishItem);//return NodeList
generate("pTags",pTags); // HTMLCollection [i] [i]
generate("classes",classes); //HTML Collection .item[i] [i]
generate("mainTeam",mainItem); // return object
generate("qWishItems",qWishItems);


// generate("mainTeam",()=> console.dir(mainItem
// 	)); use runable thay cho object

function generate(prefix, object){
	console.log(prefix);
	console.log(object)
	console.log("=======")
}