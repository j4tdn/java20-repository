package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str;
		System.out.println("Nhập chuỗi: ");
		str = sc.nextLine();
		System.out.println(removeAccent(str));
	}

	public static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}

}