package exercises;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

//Bài này em xem trên mạng :3
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String result = sc.nextLine();
		System.out.println("Chuỗi khi nhập: " + result);
		System.out.println("Chuỗi sau khi loại bỏ dấu: " +removeAccent(result));
	}
	
	public static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}
}