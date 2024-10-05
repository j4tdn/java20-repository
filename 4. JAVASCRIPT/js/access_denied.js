var counter = 10;
var testRunning = 0;
var remaningSecondsLabel = document.querySelector('.remaning-seconds'); 
let running = setInterval(function() {
	remaningSecondsLabel.textContent = counter;
	if (counter === 0) {
		window.location.href = "index.html";
		clearInterval(running);
	} else {
		counter --;
	}
}, 1000);