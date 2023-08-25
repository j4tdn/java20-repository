package utils;

import java.util.Arrays;

public class StringUtils {
	private StringUtils() {

	}

	public static int[] getNumberArrayToString(String input) {
		String[] split = input.split("\\D+");
		int[] result = new int[split.length];
		int running = 0;
		for(String str : split) {
			try {
				result[running++] = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	
	
	// Selection Sort
	private static int[] sortAscending(int[] input) {
		int[] result = new int[input.length];
		for (int i = 0; i < input.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[min] > input[j]) {
					min = j;
				}
			}
			result[i] = input[min];
			result[min] = input[i];
		}
		return result;
	}
	
	//Hàm in n số lớn nhất trong mảng
	public static void getLargestNumbers(int[] a, int n) {
		a = sortAscending(a);
		System.out.print("Get the top " + n + " elements --> ");
		for(int i = a.length - 1; i >= a.length - n; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	//loại bỏ khoảng trắng thừa
	public static String removeExtraSpaces(String input) {
		String[] tokens = input.trim().split("\\s+");
		return String.join(" ", tokens);
	}
	
	//Đảo  ngược chuỗi
	public static String revert(String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
