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


submitButton.addEventListener("click", () => {
	console.log("addEventListener int --> " + randomInt(10));
});

/*-----------------------------------*/

/*const btnEvent1 = document.querySelector(".btn-e1");
btnEvent1.addEventListener("click", (e) => {
	e.target.style.backgroundColor = randomColor();
});

const btnEvent2 = document.querySelector(".btn-e2");
btnEvent2.addEventListener("click", (e) => {
	e.target.style.backgroundColor = randomColor();
});

const btnEvent3 = document.querySelector(".btn-e3");
btnEvent3.addEventListener("click", (e) => {
	e.target.style.backgroundColor = randomColor();
});

const btnEvent4 = document.querySelector(".btn-e4");
btnEvent4.addEventListener("click", (e) => {
	e.target.style.backgroundColor = randomColor();
});*/

document.querySelector(".btne-container").addEventListener("click", (e) => {
	const classListAsString = e.target.classList.value;
	if (classListAsString.includes("btn-e")) {
	 	e.target.style.backgroundColor = randomColor();
	}
})

const input1 = document.querySelector(".input1");
const input2 = document.querySelector(".input2");

// keyup: fire event khi nhả, kết thúc key
input1.addEventListener("keyup", (e) => {
	console.log("input1 keyup --> " + input1.value);
})

// keydown: fire event khi vừa nhấn vào key
// input2.addEventListener("keydown", (e) => {
// 	console.log("input2 keydown --> " + input2.value);
// })

input2.addEventListener("keyup", (e) => {
	if (e.keyCode === 13) {
		console.log("form is submitted ...");
	}
})

/*prevent default behavior */
const form = document.querySelector(".form-2");
const fname = document.getElementById("fname");
const lname = document.getElementById("lname");
const para = document.querySelector(".p2");

form.addEventListener("submit", (e) => {
  if (fname.value === "" || lname.value === "") {
    e.preventDefault();
    para.textContent = "You need to fill in both names!";
  }
});