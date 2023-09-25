package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04Crud {
	public static void main(String[] args) {
		int[] numbers = {2, 9, 56, 44};
		// create = add 
		// Read = get
		// update = set
		// delete = remove
	
		ArrayUtils.generate("numbers with add new elements(3, 990) ", add(numbers, 3, 990));
		ArrayUtils.generate("numbers with remove new elements(1) ", remove(numbers, 2));
		
		reverse(numbers);
		System.out.println("reverse: " + Arrays.toString(numbers));
	}
	private static int[] add(int[] numbers, int index, int newValue) {
		if(index < 0 || index > numbers.length - 1) {
			return numbers;
		}
		
		int[] result = new int[numbers.length + 1];
		
		// b1: coppy array
		for(int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		//b2: shift right one unit from index + 1 to length - 1
		for(int i = result.length - 1; i > index; i --) {
			result[i] = result[i - 1];
		}
		//b3: Assign new element
		result[index] = newValue;
	
		return result;
	}
	private static int[] remove (int[] numbers, int index) {
		int[] result = new int[numbers.length];
		
		//b1: copy elements from numbers to result
		for(int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		//b2: shift left one unit from index + 1 to length - 1
		
		for(int i = index; i< numbers.length - 1; i++) {
			result[i] = result[i+1];
		}
		//b3: return element from 0 to numbers.length - 1
		return Arrays.copyOfRange(result, 0, numbers.length - 1);
	}
	
	private static void reverse(int[] numbers) {
		int length = numbers.length;
		for(int i = 0; i < length /2 ; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[length  - 1- i];
			numbers[length  - 1- i] = tmp;
		}
	}
}
