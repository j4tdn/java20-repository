package view.d1;

import java.util.Arrays;

public class Ex04SumOfDistinctExceptMinMax {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 8, 1, 9, 2, 5, 9};
		
		System.out.println("numbers --> " + Arrays.toString(numbers));
		
		System.out.println("========================");
		
		System.out.println("distinct --> " + Arrays.toString(distinct(numbers)));
	}
	
	public static int[] distinct(int[] numbers) {
		int length = numbers.length;
		
		int[] result = new int[length];
		int count = 0;
		
		// isOverlap
		boolean[] flags = new boolean[length];
		
		for (int i = 0; i < numbers.length; i++) {
			if (!flags[i]) {
				processDistinctIfOverlap(i, numbers, flags);
				
				// still false after checking
				if (!flags[i]) {
					result[count++] = numbers[i];
				}
			}
		}
		
		return Arrays.copyOf(result, count);
	}
	
	private static void processDistinctIfOverlap(int checkPos, int[] numbers, boolean[] flags) {
		for (int i = 0; i < numbers.length; i++) {
			if (!flags[i] && i != checkPos && numbers[checkPos] == numbers[i]) {
				flags[i] = true;
				flags[checkPos] = false;
			}
		}
	}
	
	private static void processUniqueIfOverlap(int checkPos, int[] numbers, boolean[] flags) {
		for (int i = 0; i < numbers.length; i++) {
			if (!flags[i] && i != checkPos && numbers[checkPos] == numbers[i]) {
				flags[i] = true;
				flags[checkPos] = true;
			}
		}
	}
}
