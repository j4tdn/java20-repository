package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04CRUD {

	public static void main(String[] args) {
		int[] numbers = { 2, 9, 3, 7, 17 };
		
		// create = add
		// read = get
		// update = set
		// delete = remove
		
		ArrayUtils.generate("numbers with add new element", add(numbers, 3, 4));
		System.out.println(Arrays.toString(numbers));
		ArrayUtils.generate("numbers with remove element", remove(numbers, 3));
		
		reverse(numbers);
		ArrayUtils.generate("reverse ", numbers);
	}

	private static int[] add(int[] numbers, int index, int newValue) {
		if (index < 0 || index > numbers.length - 1) {
			return numbers;
		}
		
		int[] result = new int[numbers.length + 1];
		
		// B1: copy elements from origin to result
		for (int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		
		// B2: shift right one unit from index + 1 to length -1 in result
		for (int i = result.length - 1; i > index; i--) {
			result[i] = result[i - 1];
		}
		
		// B3: assign
		result[index] = newValue;
		
		return result;
	}
	
	private static int[] remove(int[] numbers, int index) {
		if (index < 0 || index > numbers.length - 1) {
			return numbers;
		}
		
		int[] result = new int[numbers.length];
		
		// copy elements from origin to result
		for (int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		
		// shift left one unit from index + 1 to length -1 in target array
		for (int i = index; i < numbers.length - 1; i++) {
			result[i] = result[i + 1];
		}
		
		// return elements from 0 to numbers.length - 1
		return Arrays.copyOfRange(result, 0, result.length - 1);
	}
	
	private static void reverse(int[] numbers) {
		int length = numbers.length;
		for (int i = 0; i < length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[length - i - 1];
			numbers[length - i - 1] = tmp;
		}
	}
}
