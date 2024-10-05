
const wishItems = document.getElementsByName("wish");
const pTags = document.getElementsByTagName("p");
const classes = document.getElementsByClassName("red-text");
const mainItem = document.getElementById("main");

const qWishItems = document.querySelector("*[name = 'wish']");
const qRedTextItems = document.querySelectorAll("*[class = 'red-text']");
const qRedTextItemsSelector = document.querySelectorAll(".red-text");

generate("wishItems", wishItems); // NodeList       .item[i] [i]
generate("pTags", pTags);         // HTMLCollection .item[i] [i]
generate("classes", classes);
generate("mainItem", mainItem);
generate("qWishItems", qWishItems);
generate("qRedTextItems", qRedTextItems);
generate("qRedTextItemsSelector", qRedTextItemsSelector);


function generate(prefix, object) {
	console.log(prefix)
	console.log(object);
	console.log("=========");
}
