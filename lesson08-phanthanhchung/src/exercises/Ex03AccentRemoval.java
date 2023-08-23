package exercises;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03AccentRemoval {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hãy nhập vào một chuỗi Tiếng Việt có dấu: ");
        String test = sc.nextLine();
        System.out.println("Chuỗi Tiếng Việt sau khi bỏ dấu là: " + removeAccent(test));
    }

    private static String removeAccent(String test){
        String s = Normalizer.normalize(test, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}
