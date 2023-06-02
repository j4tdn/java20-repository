import java.util.Scanner;

public class Bai8 {
	private static boolean prime(int a) {
		if (a > 1) {
			for (int i = a - 1; i >= 2; i--)
				if (a % i == 0)
					return false;
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText;
		int count = 0;
		do {
			System.out.print("Nhập số nguyên dương: ");
			numberAsText = sc.nextLine();
			if (!numberAsText.matches("\\d+")) {
				count++;
			} else {
				int number = Integer.parseInt(numberAsText);
				if (number > 1) {
					System.out.println(number + " là số nguyên tố: " + prime(number));
					break;
				} else {
					count++;
				}
			}
		} while (count < 6);
		if (count == 6)
			System.out.println("Bạn đã nhập sai quá 5 lần!");
	}
}
