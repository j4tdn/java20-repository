package ex02numberarray;

import java.util.Arrays;

public class Ex02OrderDivisible {
	public static void main(String[] args) {
		
		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18, 70};
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		
		int[] result = ordering(numbers);
		System.out.println("result --> " + Arrays.toString(result));
	}
	
	private static int[] ordering(int[] numbers) {
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
		
		int[] result = new int[length];
		
		int i = 0;
		for (int number: a7) {
			result[i++] = number;
		}
		for (int number: optA57) {
			result[i++] = number;
		}
		for (int number: a5) {
			result[i++] = number;
		}
		return result;
	}
}
