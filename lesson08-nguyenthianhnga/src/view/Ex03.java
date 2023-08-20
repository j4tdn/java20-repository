package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input = "Em có yêu anh không anh để anh biết còn chờ\nEm xin lỗi em đã có thái độ không đúng với anh";
		System.out.println("Result: \n"+removeDiacritics(input));
		
	}
	private static String removeDiacritics(String st)
	{
		  String regex = "\\p{M}";
		  String nomallText = Normalizer.normalize(st, Normalizer.Form.NFD);
		  return Pattern.compile(regex).matcher(nomallText).replaceAll("").replaceAll("Đ", "D").replaceAll("đ", "d");
	}
}
