$(document).ready(function(){
	let totalBudget = $('.total-budget');
	let totalIncome = $('.total-income');
	let totalExpenses = $('.total-expenses');

	let descElement = $('.desc-field');
	let valElement = $('.val-field');
	let submit = $('.submit');
	let optElement = $('.select-opt select');

	let listIncomes = $('.income-block .lists');
	let listExpenses = $('.expenses-block .lists');

	// get date
	let date = $('.date');
	function getDateNow(){
		var currentDate = new Date();
		const month = currentDate.toLocaleString('default', { month: 'long' });
		var year = currentDate.getFullYear();
		date.text(month + ' ' +  year);
	}

	getDateNow();
	update('.income-value', totalIncome);
	update('.expenses-value', totalExpenses);
	updateBudget();
	updatePercentTotal();
	calPercent();

	// add budget
	submit.on('click', addBudget);

	$(document).on('keyup',(e)=> {
		if(e.keyCode === 13){
			addBudget();
		}
	})

	function addBudget () {
		let descVal = descElement.val().trim();
		let optVal = optElement.val();
		let priceVal = valElement.val();

		if(descVal !== '' && optVal === '+' && priceVal !== ''){
			let html = `<li>
			<span>${descVal}</span>
			<div>
			+<span class="income-value">${priceVal}</span>.00
			<span class="remove"><i class="fa-solid fa-x"></i></span>
			</div>
			</li>`;

			listIncomes.append(html);	
			update('.income-value', totalIncome);
		}

		if(descVal !== '' && optVal === '-' && priceVal !== ''){
			let html = `<li>
			<span>${descVal}</span>
			<div>
			-<span class="expenses-value">${priceVal}</span>.00
			<span class="percent none">10%</span>
			<span class="remove"><i class="fa-solid fa-x"></i></span>
			</div>
			</li>`;

			listExpenses.append(html);	
			update('.expenses-value', totalExpenses);
		}
		calPercent();
		updatePercentTotal();
		updateBudget();
		descElement.val('');
		optElement.val('+'); 
		valElement.val('');
	}


	function updateBudget(){
		let outlay = $('.outlay');
		let total = toFloat(totalIncome) - toFloat(totalExpenses);
		if(total > 0){
			totalBudget.text(numberFormat(total));
			outlay.text('+');
		}else {
			totalBudget.text(numberFormat(total*(-1)));
			outlay.text('-');
		}
	}

	function update(lists, className){
		let incomes = $(lists);
		let sum = 0;
		$.each(incomes, function(idx, val) {
			sum += toFloat($(val));
		})
		className.text(numberFormat(sum));
	}

	function updatePercentTotal(){
		let percent = $('.budget-top .percent');
		if(totalExpenses.text() !== '0'){
			percent.removeClass('none');
			percent.text(Math.floor(toFloat(totalExpenses)/toFloat(totalIncome)*100) + '%');
		}else {
			percent.addClass('none');
		}
	}

	function calPercent(){
		let percents = $('.expenses li .percent');
		$.each(percents, function(idx, val) {
			let prevSibVal = $(val).prev();
			$(val).removeClass('none');
			$(val).text(Math.floor(toFloat(prevSibVal)/toFloat(totalIncome)*100) + '%');
		})
	}
	

	$(document).on('click', function(e){
		if(e.target.classList.contains('remove') || e.target.classList.contains('fa-x')){
			$(e.target).closest('li').remove();
			
			update('.income-value', totalIncome);
			update('.expenses-value', totalExpenses);
			updatePercentTotal();
			updateBudget();
			calPercent();
		}
	})
	// utils
	function toFloat(element){
		return parseFloat(element.text().replace(/,/g, ''));
	//return parseFloat(element.text());
	}

	function numberFormat(number){
		return (number).toString().split("").reverse().join("").replace(/(\d{3})(?=\d)/g,"$1,").split("").reverse("").join("");
	}
})