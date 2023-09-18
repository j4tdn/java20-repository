package view;

import java.util.Arrays;

public class Ex04Crud {
	
	public static void main(String[] args) {
		
		int[] numbers = { 2, 9, 3, 7, 17 };
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString(add(numbers, 3, 15)));
		
		System.out.println(Arrays.toString(remove(numbers, 3)));
		
		reverse(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static int[] add(int[] numbers, int index, int newValue) {
		if (index < 0 || index > numbers.length - 1)
			return numbers;
		
		// Step 1: Create a new array with size = preSize + 1
		int[] result = new int[numbers.length + 1];
		
		// Step 2: Copy elements from origin(numbers) to result(target)
		for (int i = 0; i < numbers.length; i++) 
			result[i] = numbers[i];
		
		// Step 3: Shift right
		for (int i = result.length - 1; i > index; i--)
			result[i] = result[i - 1];
		
		// Step 4: Assign new element into index k
		result[index] = newValue;
		
		return result;
	}
	
	private static int[] remove(int[] numbers, int index) {
		if (index < 0 || index > numbers.length - 1)
			return numbers;
		int[] result = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) 
			result[i] = numbers[i];
		for (int i = index; i < numbers.length - 1; i++)
			result[i] = result[i + 1];
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
