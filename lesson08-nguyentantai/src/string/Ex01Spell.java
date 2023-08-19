package string;

import java.util.Scanner;

public class Ex01Spell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi kí tự: ");
        String input = scanner.nextLine();

        // Kiểm tra và in ra các kí tự tiếng Việt có dấu và khoảng trắng
        System.out.println("Các kí tự trên một dòng:");
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || c == ' ') {
                System.out.println(c);
            }
        }

        System.out.println("\nCác từ trên mỗi dòng:");
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nChuỗi đảo ngược theo kí tự:");
        String reversedChar = new StringBuilder(input).reverse().toString();
        System.out.println(reversedChar);

        System.out.println("\nChuỗi đảo ngược theo từ:");
        String[] reversedWords = new StringBuilder(String.join(" ", words)).reverse().toString().split("\\s+");
        for (String word : reversedWords) {
            System.out.println(word);
        }
    }
}
