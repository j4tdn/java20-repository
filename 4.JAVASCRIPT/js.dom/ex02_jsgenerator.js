const tasks = document.querySelector("#tasks");

//add to the end
const newTask = document.createElement("Task 04");
tasks.appendChild(newTask);

const newTaskZ2 = createTask("TaskZ2");
tasks.insertBefore(newTaskZ2,tasks.child[2]);

function createTask(text) {
	const newTask = document.createElement("li");
	newTask.textContent = text;
	return newTask;
}