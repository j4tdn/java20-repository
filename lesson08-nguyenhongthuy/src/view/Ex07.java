package view;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cho xâu kí tự S bao gồm toàn các ký tự ‘a’ đến ‘z’, không quá 255 ký tự. “Dãy
 * con đúng” trong xâu S là dãy có các kí tự liền kề giống nhau Yêu cầu: Hãy
 * tính độ dài lớn nhất của dãy con đúng của dãy S. Hãy tính độ dài nhỏ nhất của
 * dãy con đúng của dãy S.
 * 
 * Example: ‘aaabaaabbaaaaa’ Độ dài lớn nhất của dãy con đúng : 5 “aaaaa” [9] Độ
 * dài nhỏ nhất của dãy con đúng: 1 “b” [3] Với [x] => bắt đầu từ vị trí x trong
 * xâu S
 *
 */
public class Ex07 {
	public static void main(String[] args) {
		String input = "aaabaaabbaaaaa";

		System.out.println("input --> " + input);
		
		System.out.println(Arrays.toString(getArraySubString(input)));
		System.out.println("Độ dài lớn nhất của dãy con đúng: " + getMaxLengthOfSubString(input));
		System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + getMinLengthOfSubString(input));
	}

	private static int getMaxLengthOfSubString(String input) {
		String[] tokens = getArraySubString(input);
		int max = tokens[0].length();
		for (String str : tokens) {
			if (str.length() > max) {
				max = str.length();
			}
		}
		return max;
	}

	private static int getMinLengthOfSubString(String input) {
		String[] tokens = getArraySubString(input);
		int min = tokens[0].length();
		for (String str : tokens) {
			if (str.length() < min) {
				min = str.length();
			}
		}
		return min;
	}

	private static String[] getArraySubString(String input) {
		Pattern pattern = Pattern.compile("(.)\\1*");

		Matcher matcher = pattern.matcher(input);
		String[] result = new String[1000];
		int i = 0;
		while (matcher.find()) {
			result[i++] = matcher.group();
		}
		return Arrays.copyOfRange(result, 0, i);
	}
}
