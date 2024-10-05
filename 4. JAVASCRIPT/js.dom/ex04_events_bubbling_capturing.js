const output = document.querySelector("#output");

// e.target        : this
// e.currentTarget : .... bubbling
// mặc địch: event bubbling - con -> cha
// bubbling: bắt event cho element cha, fire con, element cha cũng ăn event

// function handleClick(e) {
//   // output.textContent += `You clicked on a ${e.target.tagName} element\n`;
//   output.textContent += `You clicked on a ${e.currentTarget.tagName} element\n`;
// }

// const container = document.querySelector("#container");
// container.addEventListener("click", handleClick);


const btn = document.querySelector("button");
const box = document.querySelector("div");
const video = document.querySelector("video");

btn.addEventListener("click", () => box.classList.remove("hidden"));
video.addEventListener("click", (e) => {
  e.stopPropagation();
  video.play();
});
box.addEventListener("click", () => box.classList.add("hidden"));