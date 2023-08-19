package string;

import java.util.Scanner;

public class Ex02NameFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào họ và tên: ");
        String fullName = scanner.nextLine();

        String[] words = fullName.split("\\s+");
        StringBuilder formattedName = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String formattedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                formattedName.append(formattedWord).append(" ");
            }
        }

        String result = formattedName.toString().trim();
        System.out.println("Họ tên đã định dạng: " + result);
    }
}
