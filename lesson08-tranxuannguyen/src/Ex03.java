import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi tiếng Việt có dấu: ");
        String input = scanner.nextLine();

        String output = removeDiacriticalMarks(input);

        System.out.println("Chuỗi không dấu: " + output);
    }

    public static String removeDiacriticalMarks(String input) {
        String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizedString).replaceAll("");
    }
}