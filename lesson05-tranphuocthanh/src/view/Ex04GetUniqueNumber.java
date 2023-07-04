package view;

import java.util.Arrays;

public class Ex04GetUniqueNumber {
	public static void main(String[] args) {
		int[] numbers = { 3, 15, 21, 0, 15, 17, 21 };
		int[] result = getUniqueNumber(numbers);
		sort(result);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getUniqueNumber(int[] numbers) {
		boolean[] check = new boolean[numbers.length];
		int[] result = new int[numbers.length];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (check[i] == true)
				continue;
			for (int j = 0; j < numbers.length; j++) {
				if (i != j && numbers[i] == numbers[j]) {
					check[j] = true;
					check[i] = true;
				}
			}
		}
		for (int i = 0; i < check.length; i++) {
			if (!check[i]) {
				result[count++] = numbers[i];
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	private static void sort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
				}
			}
		}
	}
}
