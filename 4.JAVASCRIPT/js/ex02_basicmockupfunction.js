console.log("LESSON 02");

alert("Hello user? Tests whether you are a BOT?");

var name = prompt("Fill your name");
if(name!=="null"){

	//name = null
	//!!name =false
	var submitedValue =+prompt("Hey "+ name+", submit result of(5+8) =?");

if(submitedValue ===13 ){
	var yesNoQues  = confirm("Click yes to move to User page");

	if(yesNoQues){
		window.location.href ='user.html';
	}
}
}

/* 
Các hàm hỗ trợ hiển thị propup cơ bản trong JavaScript 
--> alert(title): popup in ra
				: return void

--> confirm(question): popup đặt câu hỏi
					 : return boolean

--> prompt('question',[default]): popup đặt câu hỏi
								: return string


*/