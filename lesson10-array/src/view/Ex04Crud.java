package view;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex04Crud {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		// Create = Add
		// Read   = Get
		// Update = Set
		// Delete = Remove
		
		System.out.println("Array before add --> " + Arrays.toString(numbers));
		ArraysUtils.generate("Add 999 for index 2 to numbers",
				add(numbers, 2, 999));
		
		ArraysUtils.generate("Remove element at index 2",
				remove(numbers, 2));
		
		reverse(numbers);
		
		ArraysUtils.generate("Array reverse", numbers);
	}
	
	
	private static int[] add(int[] number, int index, int newValue) {
		int[] result = new int[number.length + 1];
		int count = 0;
		// B1: Copy 
		for(int i = 0 ; i < number.length;i++) {
			result[i] = number[i];
		}
		
		//B2: Pos
		for(int i = number.length;i > index;i--) {
			result[i] = result[i-1];
		}
		
		//B3: Add
		result[index] = newValue;
	
		return result;
	}
	
	private static int[] remove(int[] number, int index) {
		int[] result = new int[number.length];
		// B1: Copy 
		for(int i = 0 ; i < number.length;i++) {
			result[i] = number[i];
		}
		
		//B2: Pos
		for(int i = index;i < number.length - 1;i++) {
			result[i] = result[i+1];
		}
		
		return Arrays.copyOfRange(result, 0, result.length - 1);
	}
	
	private static void reverse(int[] number) {
		int n = number.length;
		for(int i = 0 ; i < n/2;i++) {
			int temp = number[i];
			number[i] = number[n-i-1];
			number[n-i-1] = temp;
		}
	}
}
