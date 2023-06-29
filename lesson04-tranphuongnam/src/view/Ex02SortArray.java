package view;

import java.util.Random;

public class Ex02SortArray {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(5, 101); // Số lượng phần tử mảng
		int[] numbers = new int[n];
		for(int i = 0 ; i < n;i++) {
			numbers[i] = rd.nextInt(100);
		}
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n***** Array after sorted *****");
		int[] result = findExpectedArrays(numbers);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	private static int[] findExpectedArrays(int[] numbers) {
		int[] result = new int[numbers.length];
		int iResult = 0;

		int[] divisible5And7 = new int[numbers.length];
		int iDivisible5And7 = 0;

		int[] divisible5 = new int[numbers.length];
		int iDivisible5 = 0;

		for (int number : numbers) {
			if (number % 7 == 0 && number % 5 != 0) {
				result[iResult++] = number;
			} else if (number % 5 == 0 && number % 7 != 0) {
				divisible5[iDivisible5++] = number;
			} else {
				divisible5And7[iDivisible5And7++] = number;
			}
		}

		for (int number : divisible5And7) {
			if (number != 0) {
				result[iResult++] = number;
			}
		}

		for (int number : divisible5) {
			if (number != 0) {
				result[iResult++] = number;
			}
		}
		return result;
	}
}
