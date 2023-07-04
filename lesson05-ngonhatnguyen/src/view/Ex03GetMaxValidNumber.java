package view;

import java.util.Arrays;

public class Ex03GetMaxValidNumber {
	public static void main(String[] args) {
		String string = "12abu02muzk586cyx";
		System.out.println("Chuỗi đầu vào --> " + string);
		int[] result = getValidNumber(string);
		System.out.println("Các số hợp lệ --> " + Arrays.toString(result));
		System.out.println("Max --> " + getMaxNumber(result));
	}

	public static int[] getValidNumber(String input) {
		int n = input.length();
		int[] result = new int[n];
		int count = 0;
		int i = 0;
		while (i < n) {
			if (Character.isDigit(input.charAt(i))) {
				result[count] = Character.getNumericValue(input.charAt(i));
				i++;
				while (i < n && Character.isDigit(input.charAt(i))) {
					result[count] = result[count] * 10 + Character.getNumericValue(input.charAt(i));
					i++;
				}
				count++;
			}
			i++;
		}
		result = Arrays.copyOfRange(result, 0, count);
		return result;
	}
	
	public static int getMaxNumber(int[] arr) {
		int max = arr[0];
		for(int n : arr) {
			if(max < n)
				max = n;
		}
		return max;
	}
}
