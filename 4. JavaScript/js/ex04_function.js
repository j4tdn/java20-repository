console.log('Lesson 04 - Function');

console.log('---------------------');

let array = [1, 2, 3, 4, 6, 5];

function filter(array, test) {
	let res = [];
	for(let val of array){
		if(test(val)){
			res.push(val);
		}
	}
	return res;
}

var res = find(array, val => val % 2 == 0)
console.log(res)