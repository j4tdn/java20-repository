package view;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex02ArrayOperations {
	public static void main(String[] args) {
		/*
		 
		 Đề bài: Cho danh sách các số nguyên dương [1, 20]
		 Yêu cầu:
			 + Tìm những phần tử là số lẻ trong mảng
			 + Tìm những phần tử là số chẵn trong mảng
			 + Tìm những phần tử là số nguyên tố trong mảng
			 + Tìm những phần tử là số hạnh phúc trong mảng
		 
		 */
		
		int[] numbers = {2, 9, 3, 7, 17, 22, 40, 56, 44};
		
		System.out.println();
		ArraysUtils.generate(
				"1. Tìm những phần tử là số lẻ trong mảng",
				getOddNumbers(numbers)
		);
		
		ArraysUtils.generate(
				"2. Tìm những phần tử là số chẵn trong mảng",
				getEvenNumbers(numbers)
		);
		
		ArraysUtils.generate(
				"3. Tìm những phần tử là số nguyên tố trong mảng",
				getPrimeNumbers(numbers)
		);
	}
	
	// Tìm những phần tử là số lẻ trong mảng
	private static int[] getOddNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// Tìm những phần tử là số chẵn trong mảng
	private static int[] getEvenNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Tìm những phần tử là số chẵn trong mảng
	private static int[] getPrimeNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isPrime(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
