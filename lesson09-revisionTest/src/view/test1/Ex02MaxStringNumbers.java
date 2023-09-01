package view.test1;

import java.util.Arrays;

public class Ex02MaxStringNumbers {

	public static void main(String[] args) {
		String[] sequences = { "dfaf", "aa6b326c6e22h", "aa6b1234c6e22h078567" };
		
		int[] numbers = new int[sequences.length];
		int k = 0;
		
		for (String sequence: sequences) {
			numbers[k++] = getValidMaxNumber(sequence);
		}
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static int getValidMaxNumber(String text) {
		// cắt theo những kí tự chữ --> [a-z]+
		// những kí tự khác số --> [^0-9]+

		String[] numbersAsText = (text.split("[^0-9]+"));
		int max = 0;

		for (String numberAsText : numbersAsText) {
			if (!numberAsText.isEmpty()) {
				max = Math.max(max, Integer.parseInt(numberAsText));
			}
		}
		return max;
	}

}
