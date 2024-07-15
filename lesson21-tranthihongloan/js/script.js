let cwwElement = document.querySelector('.current-window-width');

window.onload = function() {
	cwwElement.textContent = window.innerWidth;
}

window.onresize = function() {
	cwwElement.textContent = window.innerWidth;
}