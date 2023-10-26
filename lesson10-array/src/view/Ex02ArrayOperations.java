package view;

import static utils.ArrayUtils.generate;

import java.util.Arrays;

import functional.Condition;

public class Ex02ArrayOperations {

	/*
	 * cho danh sách các số nguyên dương [1, 20] yêu cầu: 
	 * + tìm các ptu lẻ + tìm các ptu chẵn 
	 * + tìm các ptu là số nguyên tố 
	 * + tìm các ptu là số hạnh phúc
	 * 
	 */

	public static void main(String[] args) {
		int[] numbers = { 2, 9, 3, 7, 17, 40, 56, 44 };

		generate("câu 1", getNumbers(numbers, n -> n % 2 != 0));

		generate("câu 2", getNumbers(numbers, n -> n % 2 == 0));

		generate("câu 3", getNumbers(numbers, n -> isPrime(n)));
	}

	// xd các biểu thức(hàm, chiến lược) truyền vào input, output là gì
	// từ input , output tìm chiến lược(strategy)
	// trong java ko hỗ trợ tham số qua hàm là một hàm
	// tham số chỉ ĐT, NT
	// --> Functional Interface để chứa strategy

	private static int[] getNumbers(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (condition.test(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
