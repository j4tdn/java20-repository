package view;

import java.util.Arrays;

public class Ex02OrderDivisible {
	public static void main(String[] args) {
		int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int[] result = ordering(numbers);
		System.out.println("result: " + Arrays.toString(result));
	}
	
	private static int[] ordering(int[] numbers) {
		int lenght = numbers.length;
		
		
		int[] a5 = new int[lenght];
		int a5Running = 0;
		
		int[] optA57 = new int[lenght];
		int optA57Running = 0;
		
		int[] a7 = new int[lenght];
		int a7Running = 0;
		
		for(int number: numbers) {
			if(number % 35 == 0 || number % 5 != 0 && number % 7 != 0) {
				optA57[optA57Running++] = number;
				continue;
			}
			if(number % 7 == 0) {
				a7[a7Running++] = number;
				continue;
			}
			if(number % 5 == 0) {
				a5[a5Running++] = number;
				continue;
			}
		}
		a7 = Arrays.copyOfRange(a7, 0, a7Running);
		optA57 = Arrays.copyOfRange(optA57, 0, optA57Running);
		a5 = Arrays.copyOfRange(a5, 0, a5Running);
		// gộp mãng a5, a57, a7 vào result 
		// int[] --> mỗi phần tử sẽ là int --> int[] a = {1,2, 3}
		// int [][] --> mỗi phần tử sẽ là int[] --> int[][] a = {{1,2, 3}, int[] a0 = {1,2, 3};
		//														 {3,2, 3},
		//														 {3,3, 3}
		//															}
		
		int[] result = new int[lenght];
 		int i = 0;
		for(int number: a7) {
			result[i++] = number;
		}
		for(int number: optA57) {
			result[i++] = number;
		}
		for(int number: a5) {
			result[i++] = number;
		}
		return result;
	}
}