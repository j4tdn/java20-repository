const submitButton = document.querySelector(".sbm");

submitButton.addEventListener("click", () => {
	console.log("addEventListener int --> " + randomInt(10));
});
submitButton.addEventListener("click", () =>  {
	console.log("addEventListener color --> " + randomColor());
});

submitButton.onclick = () => {
	console.log("onclick color --> " + randomColor());
}
submitButton.onclick = () => {
	console.log("onclick int --> " + randomInt(10));
}

function randomInt(bound) {
	return Math.floor(Math.random() * (bound + 1)) ;
}

function randomColor() {
	return `rgb(${randomInt(255)} ${randomInt(255)} ${randomInt(255)})`;
}