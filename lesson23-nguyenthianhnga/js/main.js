let add_btn = document.querySelector('.add__btn');
let add_description = document.querySelector('.add__description'); 
let add_value = document.querySelector('.add__value'); 
let add_type = document.querySelector('.add__type');
const incomeList = document.querySelector('.income__list');
const budgetValue = document.querySelector('.budget__value');
const incomeValue = document.querySelector('.budget__income--value');
const expensesValue = document.querySelector('.budget__expenses--value'); 
const expensesPercentage = document.querySelector('.budget__expenses--percentage');

let totalIncome = 0;
let totalExpenses = 0;

const today = new Date();
const month = today.toLocaleString('default', { month: 'long' }); 
const year = today.getFullYear();
const monthYear = `${month} ${year}`;

document.querySelector('.budget__title--month').textContent = monthYear;
budgetValue.textContent = totalIncome - totalExpenses;

add_btn.addEventListener('click', function() {
    let description = add_description.value.trim(); 
    let value = parseFloat(add_value.value); 

    if (description && !isNaN(value) && value > 0) {
        if (add_type.value === 'inc') {
            addInc(description, value);
            toggleMessage();
        } else {
            addExp(description, value); 
            toggleMessage();
        }
    }
});

function toggleMessage() {
  
   document.querySelector('.add__description').value = '';
    document.querySelector('.add__value').value = '';
 
}
function toggleButton(disable) {
    add_btn.disabled = disable;
}

function addInc(description, value) {
    totalIncome += value; 
    incomeValue.textContent = totalIncome.toFixed(2); 
    budgetValue.textContent = totalIncome - totalExpenses;

    const expensesPercentageOfTotal = calculatePercentage(totalExpenses, totalIncome);
    expensesPercentage.textContent = Math.round(expensesPercentageOfTotal) + '%';

    const html = `
        <li>
            <span>${description}</span>
            <div class="list__income">
                +<span class="income-value">${value.toFixed(2)}</span>
                <span class="remove"><i class="fa-regular fa-circle-xmark"></i></span>
            </div>
        </li>
    `;
    incomeList.insertAdjacentHTML('beforeend', html);
    attachRemoveEvent(incomeList.lastElementChild.querySelector('.remove'), 'inc', value);
}

function addExp(description, value) {
    if ((totalExpenses + value) > totalIncome) {
        alert("Total expenditure cannot exceed total income.");
        return;
    }

    totalExpenses += value;
    budgetValue.textContent = totalIncome - totalExpenses;

    const expensesPercentageOfTotal = calculatePercentage(totalExpenses, totalIncome);
    expensesPercentage.textContent = Math.round(expensesPercentageOfTotal) + '%';

    const html = `
        <li>
            <span>${description}</span>
            <div class="list__expenses">
                -<span class="expenses-value">${value.toFixed(2)}</span>
                <span class="percent">${Math.round((value / totalExpenses) * 100)}%</span>
                <span class="remove"><i class="fa-regular fa-circle-xmark"></i></span>
            </div>
        </li>
    `;

    const expensesList = document.querySelector('.expenses__list');
    expensesList.insertAdjacentHTML('beforeend', html);
    expensesValue.textContent = totalExpenses.toFixed(2);
    attachRemoveEvent(expensesList.lastElementChild.querySelector('.remove'), 'exp', value);
}

function attachRemoveEvent(removeButton, type, value) {
    removeButton.addEventListener('click', () => {
        const li = removeButton.closest('li');
        if (type === 'inc') {
            totalIncome -= value; 
            incomeValue.textContent = totalIncome.toFixed(2);
        } else {
            totalExpenses -= parseFloat(li.querySelector('.expenses-value').textContent); 
            expensesValue.textContent = totalExpenses.toFixed(2);
        }

        budgetValue.textContent = (totalIncome - totalExpenses).toFixed(2);
        li.remove();
    });
}

function calculatePercentage(value, total) {
    if (total > 0) {
        return (value / total) * 100;
    } else {
        return 0;
    }
}
