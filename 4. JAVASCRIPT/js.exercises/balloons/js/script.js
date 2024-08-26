/*
	<div class="balloon balloon-#[rd]">
	position: absolute;
	top: 100vh;
	left: rand(0, windowWidth)
*/

let runningTimeLevel1 = 10;
let runningTimeLevel2 = 8;
let runningTimeLevel3 = 6;
let runningTimeLevel4 = 4;
let runningTimeLevel5 = 2;

let widowWidth = window.innerWidth;
let windowHeight = window.innerHeight;

let balloonWidth = 100;
let balloonHeight = 200;

let body = document.body;
let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

createBall();

function createBall() {
	let balloon = document.createElement('div');

	let color = colors[random(colors.length)];
	balloon.className = `balloon balloon-${color}`;

	let pleft = random(widowWidth - balloonWidth + 1)
	balloon.style.left = pleft + 'px';

	body.appendChild(balloon);

	running(balloon);
}

function running(balloon) {
	// số px mà balloon đã dịch chuyển từ dưới -> trên
	// sau mỗi khoảng thời gian dịch chuyển 1px
	let moved = 0;
	let runningInterval = setInterval(() => {
		if (moved === (windowHeight + balloonHeight + 1)) {
			balloon.remove();
			clearInterval(runningInterval);
		} else {
			balloon.style.top = (windowHeight - moved) + 'px';
			moved++;	
		}
	}, runningTimeLevel3);

}






/*===================== UTIL METHODS =====================*/
function random(bound) {
	return Math.floor(Math.random() * bound);
}