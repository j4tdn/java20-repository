package string;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03ChangeToUnsignedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi Tiếng Việt có dấu: ");
        String input = scanner.nextLine();

        String result = removeAccents(input);
        System.out.println("\nChuỗi không dấu: " + result);
    }

    public static String removeAccents(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("\\p{M}", "");
        return normalized;
    }
}
