package view;

import java.util.Arrays;

public class Ex02OrderDivisibleOptimize {
	public static void main(String[] args) {
		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 70, 18};
		
		int[][] result = ordering(numbers);
		
		for (int[] element: result) {
			System.out.print(Arrays.toString(element));
		}
	}
	
	private static int[][] ordering(int[] numbers) {
		int length = numbers.length;
		
		int[] a5 = new int[length];
		int a5Running = 0;
		
		int[] optA57 = new int[length];
		int optA57Running = 0;
		
		int[] a7 = new int[length];
		int a7Running = 0;
		
		for (int number: numbers) {
			if (number % 35 == 0) {
				optA57[optA57Running++] = number;
				continue;
			}
			if (number % 5 == 0) {
				a5[a5Running++] = number;
				continue;
			}
			if (number % 7 == 0) {
				a7[a7Running++] = number;
				continue;
			}
			optA57[optA57Running++] = number;
		}
		
		a5 = Arrays.copyOfRange(a5, 0, a5Running);
		optA57 = Arrays.copyOfRange(optA57, 0, optA57Running);
		a7 = Arrays.copyOfRange(a7, 0, a7Running);
		
		// Gộp a5, optA57, a7 vào result
		// int[] --> mỗi phần tử sẽ là int   --> int[] a = {1,2,3};
		// int[] --> mỗi phần tử sẽ là int[] --> int[][] a = { 
		//                                                     {1,2,3,5}, -- int[] a0 = a[0]
		//                                                     {3,3,3,5}
        //                                                     {2,1,5,6}
		//                                                   } 
		int[][] result = new int[3][length];
		result[0] = a7;
		result[1] = optA57;
		result[2] = a5;
		return result;
	}
}
