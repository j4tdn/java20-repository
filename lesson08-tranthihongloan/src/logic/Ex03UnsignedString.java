package logic;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03UnsignedString {
	public static void main(String[] args) {
		String chuoiCoDau = "Em có yêu anh không anh để anh biết còn chờ";

		String chuoiKhongDau = removeDiacritics(chuoiCoDau);

		System.out.println("Chuỗi không dấu: " + chuoiKhongDau);
	}

	public static String removeDiacritics(String input) {
		String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
		return normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}
}
