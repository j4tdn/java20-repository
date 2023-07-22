package view.d1;

import java.util.Arrays;

public class Ex04SumOfDistinct {
	public static void main(String[] args) {
		int[] a = {1, 5 , 1, 8, 9, 2, 5, 9};
		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.toString(distinct(a)));
	}
	
	public static int[] distinct(int[] numbers) {
		int length = numbers.length;
		int[] result = new int[length];
		int count = 0;
		boolean[] flags = new boolean[length];
		
		for(int i = 0; i< numbers.length; i++) {
			if(!flags[i]) {
				processIfOverlap(i, numbers, flags);
				if(!flags[i]) {
					result[count++] = numbers[i];
				}
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	private static void processIfOverlap(int checkPos, int[] numbers, boolean[] flags) {
		for(int i = 0; i< numbers.length; i++) {
			if(!flags[i] && i != checkPos && numbers[checkPos] == numbers[i]) {
				flags[i] = true;
//				flags[checkPos] = true; unique
			}
		}
	}
}
