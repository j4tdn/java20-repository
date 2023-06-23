package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		// Duyệt và in ra các số nguyên dương < n
		int n = 8;
		int i = 1;
		while (i < 8) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\n\n==================\n");

		i = 1;
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i == 8)
				break;
		}

		System.out.println("\n\n==================\n");

		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i < 8);

		System.out.println("\n\n==================\n");

		// Nhập vào 1 số nguyên hợp lệ, nếu nhập sai yêu cầu nhập lại
		// Kiểm tra số đó có phải là số nguyên tố hay không
		Scanner ip = new Scanner(System.in);

		String text = "";
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
		} while (!isNumber(text));

		int number = Integer.parseInt(text);
		System.out.println("--> is prime: " + isPrime(number));

		ip.close();
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter))
				return false;
		}
		return true;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return number < 2 ? false : true;
	}
}
