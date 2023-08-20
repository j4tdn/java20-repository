import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();

        String formattedName = formatFullName(fullName);

        System.out.println("Họ tên đã được định dạng: " + formattedName);
    }

    public static String formatFullName(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder formattedName = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                formattedName.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        return formattedName.toString().trim();
    }
}