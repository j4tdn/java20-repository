package view;

import java.util.Arrays;

public class Ex02MaxStringNumber {
	public static void main(String[] args) {
		String[] sequences = {"aa6b546c6e22h", "aa6b326c6e...*22h", "aa6b3226c6e22h"};
	
	int[] numbers = new int[sequences.length];
	int k = 0;
		for(String sequence : sequences) {
			numbers[k++] = getValidMaxNumber(sequence);
		}
		Arrays.sort(numbers);
		System.out.println("result: " + Arrays.toString(numbers));
		
	}
	
	private static int getValidMaxNumber(String text) {
		//thuc hien cat chu theo 1 hoac nhieu chu cai "[a-z]+"
		//							nhung ky tu ko phai so --> "[^0-9]+" --> \\d+
		String[] numberAsTest = text.split("[^0-9]+");
		
		int max = 0;
		
		for(String number: numberAsTest) {
			if(!number.isEmpty()) {
				int numbers = Integer.parseInt(number);
				if(max < numbers) {
					max = numbers;
				}
			}
		}
		
		return max;
		
	}
}
