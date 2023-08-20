package view;

import java.text.Normalizer;
import java.util.Scanner;

public class Exercises03 {

	public static void main(String[] args) {
      

      
        String input = "Em có yêu anh không anh để anh biết còn chờ\r\n"
        		+ 		"Em xin lỗi em đã có thái độ không đúng với anh"	;

        String result = removeAccents(input);
        System.out.println("Chuỗi sau khi loại bỏ dấu:\n " + result);
    }

    public static String removeAccents(String input) {
        String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalizedString.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
