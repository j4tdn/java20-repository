let btnAdd = $('.btn-add');
let tfText = $('.todo-text');
let message = $('.message');
let tasks = $('.tasks');


// disable button add default
toggleButton(false);

/*======================= EVENT HANDLER =======================*/

// keyup cho tf, nhấn click button được --> tfText có giá trị
btnAdd.on('click', () => {
	let newText = tfText.val().trim();
	if (newText) {
		tasks.append(createNewTask(newText));
		tfText.val('');
	} else {
		toggleMessage(true);
	}
	toggleButton(false);
})

tfText.on('keyup', (e) => {
	let newText = tfText.val().trim();
	firedTfTextEvents(newText);
	if (newText && e.which === 13) {
		btnAdd.click();
	}
})

/* fire event when click 'X' */
tfText.on('search', () => {
	let newText = tfText.val().trim();
	firedTfTextEvents(newText);
});

tasks.on('click', (e) => {
	let currentTag = e.target;
	let parent = currentTag.parentElement;
	let classList = currentTag.classList;
	let task;
	
	if (classList.contains('cbx')) {
		task = parent.nextElementSibling;
		task.classList.toggle('task-done');
	} else if (classList.contains('btn-remove')) {
		task = currentTag.previousElementSibling;
		let confirmed = confirm(`Are You sure to delete '${task.textContent}' ?`);
		if (confirmed) {
			parent.remove();	
		}
	}
})


/*======================= UTIL METHODS =======================*/

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
		message.removeClass('invisible');
	} else {
		message.addClass('invisible');
	}
}

function createNewTask(newText) {
	let newTask = `<li class="task">
					<div class="cbx-block">
						<input class="cbx" type="checkbox">
					</div>
					<p class="task-content">${newText}</p>
					<button class="btn-remove"></button>
				</li>`;
	return newTask;
}

