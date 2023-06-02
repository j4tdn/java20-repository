import java.util.Scanner;

public class Bai5 {
	private static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText;
		boolean check = false;
		do {
			System.out.print("Nhập số nguyên dương: ");
			numberAsText = sc.nextLine();
			if (numberAsText.matches("\\d+") && numberAsText.length() >= 2) {
				int number = Integer.parseInt(numberAsText);
				if (number <= 0)
					check = true;
				else {
					System.out.println(number + " là số đối xứng: " + isPalindrome(number));
					break;
				}
			} else if (!numberAsText.matches("\\d+")) {
				check = true;
			}
		} while (check);
	}
}
