package view;

import java.text.Normalizer;

public class Ex03ChangeSign {
	public static void main(String[] args) {
		String input = "Em có yêu anh không anh để anh biết còn chờ\r\n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		
		String result = removeSign(input);
		System.out.println(result);
	}
	
	public static String removeSign(String input) {
        String regex = "\\p{InCombiningDiacriticalMarks}+";
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll(regex, "").replaceAll("đ", "d").replaceAll("Đ", "D");
    }
}
