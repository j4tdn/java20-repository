package view;

import java.util.Arrays;

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		String string1 = "12abu02muzk586cyx";
		System.out.println("string1 ==> " + string1);
		System.out.println("getMaxValidNumber string1 ==> " + getMaxValidNumber(string1));
		
		System.out.println("\n=========================\n");
		
		String string2 = "Uyk892nn1234uxo2";
		System.out.println("string2 ==> " + string2);
		System.out.println("getMaxValidNumber string2 ==> " + getMaxValidNumber(string2));
	}

	private static int getMaxValidNumber(String input) {
		int n = input.length();
		int[] result = new int[n];
		int count = 0;
		int i = 0;
		while (i < n) {
			if (Character.isDigit(input.charAt(i))) {
				result[count] = Character.getNumericValue(input.charAt(i++));
				while (i < n && Character.isDigit(input.charAt(i))) {
					result[count] = result[count] * 10 + Character.getNumericValue(input.charAt(i++));
				}
				count++;
			}
			i++;
		}
		result = Arrays.copyOfRange(result, 0, count);

		return getMaxNumberArray(result);
	}
	
	private static int getMaxNumberArray(int[] arr) {
		int max = arr[0];
		for(int n : arr) {
			if(max < n)
				max = n;
		}
		return max;
	}
}

