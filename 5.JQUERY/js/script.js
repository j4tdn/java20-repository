// Đảm bảo HTML đã được render
$(document).ready(function(){

	let title =$('.title');
	let lorem1 =$('.lorem1');
	let lorem2 =$('.lorem2');

	console.log(title);
	console.log(paragraph);

	title.css('color', 'green');
	title.css('font-weight','bold')

	lorem2.css('color',title.css('color'));

	let lr1Style ={
		color :'red',
		text-decoration: 'underline'
	}

	lorem1.css(lr1Style);


	// Event Handling

	let togglerButton =$('toggler');
	let togglerBlock =$('.block'); 
	togglerButton.on('click',function(){
		togglerBlock.toggleClass('invisible');
	})

	let fc =$('.form-fc');
	let avatar = $('.avatar');
	fc.on('change',function(){
		let selectedFile =this.files[0];
		let fr = new FileReader();
		//load / copy file data to web browser memory

		if(selectedFile){
			fr.readAsDataURL(selectedFile);
		}
		fr.onload =function(e){
			//console.log(e.target.result)
			avatar.attr('src',e.target.result);
		}
	})



	let uploadButton =$('.upload');
	uploadButton.on('click',function(){
		fc.click();
	})

})