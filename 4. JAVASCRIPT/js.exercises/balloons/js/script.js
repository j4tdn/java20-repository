let popAudio = new Audio('sounds/pop.mp3');

// số ball cần đạt được ở mỗi level
let totalScoreLeve1 = 10;
let totalScoreLeve2 = 15;
let totalScoreLeve3 = 20;

// sau bao lâu thì ball sẽ được tạo ra
let creatingTimeLevel1 = 500;
let creatingTimeLevel2 = 300;
let creatingTimeLevel3 = 200;

// sau bao lâu thì ball nó sẽ dịch chuyển 1px
let runningTimeLevel1 = 10;
let runningTimeLevel2 = 8;
let runningTimeLevel3 = 6;

function BallProp(totalScore, creatingTime, runningTime) {
	this.totalScore = totalScore;
	this.creatingTime = creatingTime;
	this.runningTime = runningTime;
}

let levelProperties = new Map();
levelProperties.set(1, new BallProp(4, 500, 10));
levelProperties.set(2, new BallProp(6, 300, 8));
// levelProperties.set(3, new BallProp(20, 300, 10));

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
let playNextLevelButton = document.querySelector('.play-next-level');

let nextLevelElement = document.querySelector('.next-level');
let nthLevel = document.querySelector('.nth-level');
let cpElement = document.querySelector('.champion');

let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

let balloonId = 0;
let currentScore = 0;
let currentLevel = 1;
let gameover =  false; // loose
let endgame = false; // win

const wlEnum = Object.freeze({
    WIN: 1,
    LOOSE: 0
});

startGame(currentLevel);

function startGame(level) {
	let ballProp = levelProperties.get(level);

	// gán level hiện tại vào score block
	nthLevel.textContent = level;

	// gán điểm cần thắng theo level
	totalScoreElement.textContent = ballProp.totalScore;

	hideWlContainer();

	let createBallInterval = setInterval(() => {
		if (finishedGame()) {
			clearInterval(createBallInterval);
			let wlOption = gameover ? wlEnum.LOOSE : wlEnum.WIN;
			showWlContainer(wlOption);
		} else {
			createBall(ballProp.runningTime, ballProp.totalScore);
		}
	}, ballProp.creatingTime);
}

function createBall(runningTime, totalScore) {
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
			updateCurrentScore(++currentScore);

			// --- xử lý thắng ---
			if (currentScore === totalScore) {
				endgame = true;
				nextLevelElement.textContent = ++currentLevel;
			}
		}
	})

	body.appendChild(balloon);

	running(balloon, runningTime);
}

function running(balloon, runningTime) {
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
	}, runningTime);

}

function updateCurrentScore(score) {
	currentScoreElements.forEach((element) => {
		element.textContent = score;
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

		let levelProp = levelProperties.get(currentLevel);
		let hasNextLevel = !!levelProp;
		console.log('hasNextLevel --> ' + hasNextLevel);
		if (!hasNextLevel) {
			playNextLevelButton.style.display = 'none';
			cpElement.style.display = 'block';
		} else {
			cpElement.style.display = 'none';
		}

	} else if (wlOption === wlEnum.LOOSE) {
		looseBlock.style.display = 'block';
		winBlock.style.display = 'none';
	}
	
}

function resetForNewGame() {
	currentScore = 0;
	gameover = false;
	endgame = false;
}

function finishedGame() {
	return gameover || endgame;
}

function gaming() {
	hideWlContainer();
	removeDisabledBalloonsForNewGame();
	resetForNewGame();
	updateCurrentScore(0);
	startGame(currentLevel);
}

/*===================== EVENTS =====================*/
playAgainNoButton.addEventListener('click', () => {
	hideWlContainer();
});

playAgainYesButton.addEventListener('click', () => {
	gaming();
});

playNextLevelButton.addEventListener('click', () => {
	gaming();
});

/*===================== UTIL METHODS =====================*/
function random(bound) {
	return Math.floor(Math.random() * bound);
}