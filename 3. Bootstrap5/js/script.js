let wdw = document.querySelector('.current-window-width');

window.onload = function() {
	wdw.textContent = window.innerWidth;
}