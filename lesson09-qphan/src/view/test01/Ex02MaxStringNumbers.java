package view.test01;

import java.util.Arrays;

public class Ex02MaxStringNumbers {
	
	public static void main(String[] args) {
		String[] sequences = {"aa6b%^546__c688e22h", "01a2b3456cde478", "aa6b326c6e22h"};
		
		int[] numbers = new int[sequences.length];
		int k = 0;
		for (String sequence: sequences) {
			numbers[k++] = getValidMaxNumber(sequence);
		}
		Arrays.sort(numbers); // workaround for sorting ascending
		System.out.println("result --> " + Arrays.toString(numbers));
	}
	
	// text = aa6b%^546__c688e22h
	// thực hiện cắt chuỗi theo 1 hoặc nhiều ký tự chữ cái --> [a-z]+
	//                          những ký tự ko phải là số  --> [^0-9]+
	private static int getValidMaxNumber(String text) {
		String[] numbersAsText = text.split("[^0-9]+");
		int max = 0;
		for(String numberAsText: numbersAsText) {
			if (!numberAsText.isEmpty()) {
				int number = Integer.parseInt(numberAsText);
				if (max < number) {
					max = number;
				}
			}
		}
		return max;
		
	}
}
