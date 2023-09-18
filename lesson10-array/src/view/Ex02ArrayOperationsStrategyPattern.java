package view;

import static utils.ArrayUtils.generate;

import java.util.Arrays;

import functional.Condition;

public class Ex02ArrayOperationsStrategyPattern {
	
	/*
	Đề bài: Cho danh sách các số nguyên dương [1, 20]
	Yêu cầu:
		+ Tìm những phần tử là số lẻ trong mảng
		+ Tìm những phần tử là số chẵn trong mảng
		+ Tìm những phần tử là số nguyên tố trong mảng
		+ Tìm những phần tử là số hạnh phúc trong mảng
	*/

	public static void main(String[] args) {

		int[] numbers = { 2, 9, 3, 7, 17, 22, 40, 56, 44 };

		// Dùng anonymous class
		generate("Tìm những phần tử là số lẻ trong mảng", getNumbers(numbers, new Condition() {
			@Override
			public boolean test(int number) {
				return (number % 2 != 0);
			}
		}));

		// Dùng anonymous function: danh sách tham số -> {...}
		generate("Tìm những phần tử là số chẵn trong mảng", getNumbers(numbers, number -> number % 2 == 0));

		// Dùng anonymous function: danh sách tham số -> {...}
		generate("Tìm những phần tử là số nguyên tố trong mảng", getNumbers(numbers, number -> isPrime(number)));

	}

	// Tìm những phần tử là số lẻ trong mảng
	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers)
			if (condition.test(number))
				result[count++] = number;
		return Arrays.copyOfRange(result, 0, count);
	}

	// Kiểm tra số nguyên tố
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return true;
		return false;
	}

}
