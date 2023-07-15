package view.d1;

import java.util.Arrays;

import functional.Conditional;

public class Ex04SumOfDistinctExceptMinMaxStrategy {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 8, 1, 9, 2, 5, 9};
		
		System.out.println("numbers --> " + Arrays.toString(numbers));
		
		System.out.println("========================");
		
		System.out.println("distinct --> " + Arrays.toString(distinct(numbers)));
		System.out.println("unique --> " + Arrays.toString(unique(numbers)));
	}
	
	public static int[] distinct(int[] numbers) {
		return getNonOverlapElements(numbers, (array, checkPos) -> array[checkPos] = false);
	}
	
	public static int[] unique(int[] numbers) {
		return getNonOverlapElements(numbers, (array, checkPos) -> array[checkPos] = true);
	}
	
	public static int[] getNonOverlapElements(int[] numbers, Conditional cdn) {
		int length = numbers.length;
		int[] result = new int[length];
		int count = 0;
		
		// isOverlap
		boolean[] flags = new boolean[length];
		for (int i = 0; i < numbers.length; i++) {
			if (!flags[i]) {
				processIfOverlap(i, numbers, flags, cdn);
				// still false after checking
				if (!flags[i]) {
					result[count++] = numbers[i];
				}
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	private static void processIfOverlap(int checkPos, int[] numbers, boolean[] flags, Conditional cdn) {
		for (int i = 0; i < numbers.length; i++) {
			if (!flags[i] && i != checkPos && numbers[checkPos] == numbers[i]) {
				flags[i] = true;
				cdn.process(flags, checkPos);
			}
		}
	}
}
