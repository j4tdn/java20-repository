let btnAdd = document.querySelector('.btn-add');
let tfText = document.querySelector('.todo-text');
let message = document.querySelector('.message');
let tasks = document.querySelector('.tasks');

// Xử lý sự kiện click cho nút "Add"
btnAdd.addEventListener('click', () => {
    let newText = tfText.value.trim();
    textEvent(newText);
    if (newText) {
        tasks.appendChild(createNewTask(newText));
        tfText.value = ''; // Xóa giá trị của input
        tfText.focus(); // Đặt lại tiêu điểm vào input
        toggleButton(false);
    }
});

// Hàm xử lý sự kiện văn bản
function textEvent(newText) {
    if (newText) {
        toggleMessage(false);
        toggleButton(true);
    } else {
        toggleMessage(true);
        toggleButton(false);
    }
}

// Hàm bật/tắt nút
function toggleButton(enable) {
    btnAdd.disabled = enable; // Nếu enable true, nút bị tắt
}

// Hàm hiển thị/ẩn thông báo
function toggleMessage(visible) {
    if (visible) {
        message.classList.remove('invisible'); // Hiển thị thông báo
    } else {
        message.classList.add('invisible'); // Ẩn thông báo
    }
}

// Hàm tạo nhiệm vụ mới
function createNewTask(newText) {
    let newTask = document.createElement('li');
    newTask.setAttribute('class', 'task');

    let div = document.createElement('div');
    div.setAttribute('class', 'cbx-block');

    let input = document.createElement('input');
    input.setAttribute('class', 'cbx-done');
    input.setAttribute('type', 'checkbox');

    div.appendChild(input);

    let taskContent = document.createElement('p');
    taskContent.setAttribute('class', 'task-content');
    taskContent.textContent = newText;

    let button = document.createElement('button');
    button.setAttribute('class', 'btn-remove');
  

    newTask.appendChild(div);
    newTask.appendChild(taskContent);
    newTask.appendChild(button);

  

    return newTask;
}


tasks.onclick = (e) => {
    const component = e.target;

    if (component.classList.contains('btn-remove')) {
        const parent = component.parentElement;
        const taskName = component.previousElementSibling.textContent;
        if (confirm(`Are you sure you want to delete the task "${taskName}"?`)) {
            parent.remove();
        }
    }
    if(component.classList.contains('cbx-done')){
    	 const taskContent = component.parentElement.nextElementSibling;
    	 taskContent.classList.toggle('complete');
    }

   
}

































// toggleButton(false);

// tfText.addEventListener('keyup',()=>
// 	addTfTextEvents());

// tfText.addEventListener('search',(e)=>{
// 	addTfTextEvents();
// 	if(newTask && e.which ===13){
// 		e.preventDefault();
// 		let task = createNewTask(newText);
// 		tasks.appendChild(task);
// 	}
// });

// function addTfTextEvents(callback){
// 	let newText =tfText.value.trim();
// 	if(newText){
// 		toggleMessage(false);
// 		toggleButton(true);
// 	}else{
// 		toggleMessage(true);
// 		toggleButton(false);
// 	}
// }

// function toggleButton(enable){
// 	let newText =tfText.value.trim();
// 	if(newText){
// 		btnAdd.disabled=false;
// 	}else{
// 		btnAdd.disabled=true;
// 	}
// }


// function toggleMessage(visible){
// 	if(visible){
// 		message.classList.remove('invisible');
// 	}else{
// 		message.classList.add('invisible');
// 	}
// }