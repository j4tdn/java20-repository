package logicproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03MaxNumberInString {
	public static void main(String[] args) {
		String st = "12abu02muzk586cyx";

		System.out.println(getMaxValidNumber(st));
	}

	public static int getMaxValidNumber(String str) {
		int max = 0;
		// Biểu thức chính quy để tìm các chuỗi số
		Pattern pattern = Pattern.compile("\\d+"); 
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			String number = matcher.group();
			int N = Integer.parseInt(number);
			if(N > max) {
				max = N;
			}
		}
		return max;
	}
}
