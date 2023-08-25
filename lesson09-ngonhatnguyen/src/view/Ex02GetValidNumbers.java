package view;

import java.util.Arrays;

public class Ex02GetValidNumbers {
	public static void main(String[] args) {
		String string = "12abu02muzk586cyx 01a2b3456cde478 aa6b326c6e22h";
		System.out.println("Chuỗi đầu vào --> " + string);
		int[] result = getMaxValidNumbers(getStrings(string));
		System.out.println(Arrays.toString(getStrings(string)));
		
		System.out.println("\nCác số lớn nhất nhận từ các xâu đã cho:\n  " + Arrays.toString(result));
		
	}
	
	private static String[] getStrings(String str) {
		String[] strs = null;
		
		if (str.indexOf(" ") != -1) {
			strs = str.split(" ");
		}
		
		return strs;
	}

	private static int getMaxValidNumber(String input) {
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
		return getMax(result);
	}
	
	private static int getMax(int[] arr) {
		int max = arr[0];
		for(int n : arr) {
			if(max < n)
				max = n;
		}
		return max;
	}
	
	private static int[] getMaxValidNumbers(String... strings) {
		int[] maxNums = new int[strings.length];
		
		for (int i = 0; i < strings.length; i++) {
			maxNums[i] = getMaxValidNumber(strings[i]);
		}
		
		for (int i = 0; i < maxNums.length - 1; i++) {
			for (int j = i + 1; j < maxNums.length; j++) {
				if (maxNums[i] > maxNums[j]) {
					int tmp = maxNums[i];
					maxNums[i] = maxNums[j];
					maxNums[j] = tmp;
				}
			}
		}
		
		return maxNums;
	}
}
