package view;

import java.util.Arrays;

public class Ex02GatherNumbers {
	public static void main(String[] args) {
		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 7 == 0 && number % 5 != 0) {
				result[count++] = number;
			}
		}

		for (int number : numbers) {
			if ((number % 5 == 0 && number % 7 == 0) || (number % 5 != 0 && number % 7 != 0)) {
				result[count++] = number;
			}
		}

		for (int number : numbers) {
			if (number % 5 == 0 && number % 7 != 0) {
				result[count++] = number;
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
