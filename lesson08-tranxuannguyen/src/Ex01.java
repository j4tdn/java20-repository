import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi kí tự: ");
        String input = scanner.nextLine();

        System.out.println("Kết quả - In ra từng kí tự trên một dòng:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch);
        }

        System.out.println("Kết quả - In ra từng từ trên mỗi dòng:");
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Kết quả - Chuỗi đảo ngược theo kí tự:");
        StringBuilder reversedByCharacter = new StringBuilder(input).reverse();
        System.out.println(reversedByCharacter);

        System.out.println("Kết quả - Chuỗi đảo ngược theo từ:");
        String[] reversedWords = input.split("\\s+");
        StringBuilder reversedByWord = new StringBuilder();
        for (int i = reversedWords.length - 1; i >= 0; i--) {
            reversedByWord.append(reversedWords[i]).append(" ");
        }
        System.out.println(reversedByWord.toString().trim());
    }
}