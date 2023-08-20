package Ex03;

import java.text.Normalizer;
import java.util.Scanner;

public class RemoveAccents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi tiếng Việt có dấu:");
        String input = scanner.nextLine();
        
        String result = removeAccents(input);
        
        System.out.println("Chuỗi không dấu: " + result);
    }
    
    public static String removeAccents(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Xóa các ký tự dấu
        normalized = normalized.replaceAll("\\p{M}", "");
        return normalized;
    }
}
