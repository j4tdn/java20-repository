package view;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex04Crud {
	public static void main(String[] args) {
		
		int[] numbers = {2, 9, 3, 7, 17};
		
		// Create = Add(int i, int newValue)
		// Read   = Get
		// Update = Set
		// Delete = Remove
		
		ArraysUtils.generate("numbers prototype", numbers);
		
		ArraysUtils.generate("numbers after add new element(3, 99)", add(numbers, 3, 999));
		
		ArraysUtils.generate("numbers after remove element(2)", remove(numbers, 1));
		
		reverse(numbers);
		
		ArraysUtils.generate("numbers reverse", numbers);
	}
	
	private static int[] add(int[] numbers, int index, int newValue) {
		if (index < 0 || index > numbers.length - 1) {
			return numbers;
		}
		
		int[] result = new int[numbers.length + 1];
		
		// B1: Copy elements from origin(numbers) to result(target)
		for (int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		
		// System.out.println("B1 --> " + Arrays.toString(result));
		
		// B2: Shift right one unit from index+1 to length-1 in target array
		for (int i = result.length - 1; i > index; i--) {
			result[i] = result[i-1];
		}
		
		// System.out.println("B2 --> " + Arrays.toString(result));
		
		// B3: Assign new element
		result[index] = newValue;
		
		// System.out.println("B3 --> " + Arrays.toString(result));
		
		return result;
	}
	
	private static int[] remove(int[] numbers, int index) {
		if (index < 0 || index > numbers.length - 1) {
			return numbers;
		}
		
		int[] result = new int[numbers.length];
		
		// B1: Copy elements from origin(numbers) to result(target)
		for (int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		
		// B2: Shift left one unit from index+1 to length-1 in target array
		for (int i = index; i < numbers.length - 1; i++) {
			result[i] = result[i+1];
		}
		
		// B3: Return elements from 0 to numbers.length - 1
		return Arrays.copyOfRange(result, 0, numbers.length - 1);
	}
	
	private static void reverse(int[] numbers) {
		int length = numbers.length;
		for (int i = 0; i < length/2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[length - i - 1];
			numbers[length - i - 1] = tmp;
		}
	}
}