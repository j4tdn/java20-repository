let popAudio = new Audio('sounds/pop.mp3');

// số ball cần đạt được ở mỗi level
let totalScoreLeve1 = 10;
let totalScoreLeve2 = 15;
let totalScoreLeve2 = 20;

// sau bao lâu thì ball sẽ được tạo ra
let creatingTimeLevel1 = 500;
let creatingTimeLevel2 = 300;
let creatingTimeLevel2 = 200;

// sau bao lâu thì ball nó sẽ dịch chuyển 1px
let runningTimeLevel1 = 10;
let runningTimeLevel2 = 8;
let runningTimeLevel3 = 6;


let widowWidth = window.innerWidth;
let windowHeight = window.innerHeight;

let balloonWidth = 100;
let balloonHeight = 200;

let body = document.body;
let totalScoreElement = document.querySelector('.total-score');
let currentScoreElements = document.querySelectorAll('.current-score');
let wlContainerElement = document.querySelector('.balloon-wl-container');
let winBlock = document.querySelector('.win');
let looseBlock = document.querySelector('.loose');
let playAgainYesButton = document.querySelector('.play-again-yes');
let playAgainNoButton = document.querySelector('.play-again-no');

let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

let balloonId = 0;
let currentScore = 0;
let gameover =  false; // loose
let endgame = false; // win

const wlEnum = Object.freeze({
    WIN: 1,
    LOOSE: 0
});

startGame();

function startGame() {
	// gán điểm cần thắng theo level
	totalScoreElement.textContent = totalScoreLeve1;

	hideWlContainer();

	let createBallInterval = setInterval(() => {
		if (finishedGame()) {
			clearInterval(createBallInterval);
			let wlOption = gameover ? wlEnum.LOOSE : wlEnum.WIN;
			showWlContainer(wlOption);
		} else {
			createBall();
		}
	}, creatingTimeLevel1);
}

function createBall() {
	let balloon = document.createElement('div');
	balloon.id = balloonId++;

	let color = colors[random(colors.length)];
	balloon.className = `balloon balloon-${color}`;

	let pleft = random(widowWidth - balloonWidth + 1)
	balloon.style.left = pleft + 'px';

	// add pop event for baloon
	balloon.addEventListener('click', () => {
		if (!finishedGame()) {
			popAudio.play();
			balloon.remove();
			updateCurrentScore();

			// --- xử lý thắng ---
			if (currentScore === totalScoreLeve1) {
				endgame = true;
			}
		}
	})

	body.appendChild(balloon);

	running(balloon);
}

function running(balloon) {
	// số px mà balloon đã dịch chuyển từ dưới -> trên
	// sau mỗi khoảng thời gian dịch chuyển 1px
	let moved = 0;
	let runningBallInterval = setInterval(() => {
		// cho ball dịch chuyển với interval nếu như chưa bị remove bởi thread #
		let isExisting = document.querySelector('div[id="' + balloon.id + '"]') !== null;
		if (isExisting && moved === (windowHeight + balloonHeight + 1)) {
			balloon.remove();
			clearInterval(runningBallInterval);
			gameover = true;
			// console.log('balloon failed: ' + balloon.id);
		} else {
			balloon.style.top = (windowHeight - moved) + 'px';
			moved++;	
		}
	}, runningTimeLevel3);

}

function updateCurrentScore() {
	++currentScore;
	currentScoreElements.forEach((element) => {
		element.textContent = currentScore;
	})
}

function removeDisabledBalloonsForNewGame() {
	let balloons = document.querySelectorAll('.balloon');
	balloons.forEach(balloon => {
		balloon.remove();
		// console.log('balloon removed: ' + balloon.id);
	});
}

function hideWlContainer() {
	wlContainerElement.style.display = 'none';
	winBlock.style.display = 'none';
	looseBlock.style.display = 'none';
}

function showWlContainer(wlOption) {
	wlContainerElement.style.display = 'flex';

	if (wlOption === wlEnum.WIN) {
		winBlock.style.display = 'block';
		looseBlock.style.display = 'none';
	} else if (wlOption === wlEnum.LOOSE) {
		looseBlock.style.display = 'block';
		winBlock.style.display = 'none';
	}
	
}

function resetForNewGame() {
	currentScore = 0;
	gameover = false;
}

function finishedGame() {
	return gameover || endgame;
}

/*===================== EVENTS =====================*/
playAgainNoButton.addEventListener('click', () => {
	hideWlContainer();
});

playAgainYesButton.addEventListener('click', () => {
	hideWlContainer();
	removeDisabledBalloonsForNewGame();
	resetForNewGame();
	startGame();
});


/*===================== UTIL METHODS =====================*/
function random(bound) {
	return Math.floor(Math.random() * bound);
}