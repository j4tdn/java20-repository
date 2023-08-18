package view;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03ChangeToUnsignedString {
	public static void main(String[] args) {
		String s = "Nắng chiếu lung linh muôn hoa vàng";
		String s1 = "Mình xin lỗi mình xin lỗi được chưa";
		System.out.println(s);
		System.out.println(s1);
		System.out.println("\nRemove accent:");
		System.out.println(removeAccent(s));
		System.out.println(removeAccent(s1));
	}

	private static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("").replace('đ', 'd').replace('Đ', 'D');
	}
}
