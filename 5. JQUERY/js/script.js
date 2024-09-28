/*Đảm bảo HTML document đã được renderer*/
$(document).ready(function() {

	let title = $('.title');
	let lorem1 = $('.lorem1');
	let lorem2 = $('.lorem2');

	title.css('color', 'green');
	title.css('font-weight', 'bold');

	lorem2.css('color', title.css('color'));

	let lr1Styles = {
		color: 'red',
		textDecoration: 'underline'
	};

	lorem1.css(lr1Styles);

	/*==== Event Handling ====*/

	let toggleButton = $('.toggler');
	let toggleBlock = $('.block');

	toggleButton.on('click', function() {
		toggleBlock.toggleClass('invisible');
	})

	let fc = $('.form-fc');
	
	fc.on('change', function() {
		let selectedFile = this.files[0];
		let avatar = $('.avatar');
		
		let fr = new FileReader();

		// load/copy file data to web browser memory
		if (selectedFile) {
			fr.readAsDataURL(selectedFile);
		}

		fr.onload = function(e) {
			avatar.attr('src', e.target.result);
		}
	})

	let uploadButton = $('.upload');
	uploadButton.on('click', function() {
		fc.click();
	})
})