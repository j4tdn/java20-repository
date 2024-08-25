let btnAdd = document.querySelector('.btn-add');
let tfText = document.querySelector('.todo-text');
let message = document.querySelector('.message');
let tasks = document.querySelector('.tasks');


// disable button add default
toggleButton(false);

tfText.addEventListener('keyup', (e) => {
	let newText = tfText.value.trim();
	firedTfTextEvents(newText);
	if (newText && e.which === 13) {
		tasks.appendChild(createNewTask(newText));
		tfText.value = '';
	}
});

/* fire event when click 'X' */
tfText.addEventListener('search', () => {
	let newText = tfText.value.trim();
	firedTfTextEvents(newText);
});


function firedTfTextEvents(newText) {
	if (newText) {
		toggleMessage(false);
		toggleButton(true);
	} else {
		toggleMessage(true);
		toggleButton(false);
	}
}

function toggleButton(enable) {
	if (enable) {
		btnAdd.disabled = false;
	} else {
		btnAdd.disabled = true;
	}
}

function toggleMessage(visible) {
	if (visible) {
		message.classList.remove('invisible');
	} else {
		message.classList.add('invisible');
	}
}

function createNewTask(newText) {
	let newTask = document.createElement('li');
	newTask.setAttribute('class', 'task');

	// div cbx
	let div = document.createElement('div');
	div.setAttribute('class', 'cbx-block');

	let input = document.createElement('input');
	input.setAttribute('type', 'checkbox');
	input.setAttribute('class', 'cbx');

	div.appendChild(input);


	// p content
	let p = document.createElement('p');
	p.setAttribute('class', 'task-content');
	p.textContent = newText;

	// btn remove
	let button = document.createElement('button');
	button.setAttribute('class', 'btn-remove');

	newTask.appendChild(div);
	newTask.appendChild(p);
	newTask.appendChild(button);

	return newTask;
}

