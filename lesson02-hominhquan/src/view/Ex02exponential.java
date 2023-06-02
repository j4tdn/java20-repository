package view;

import java.util.Scanner;

public class Ex02exponential {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int maxAttempts = 5;
		int attempts = 0;
		int n = 0;
		while (attempts < maxAttempts) {
			System.out.print("Nhập n: ");
            String input = ip.nextLine();
			try {
				n = Integer.parseInt(input);
				System.out.println(isPowerOf2(n));
				break;
			} catch (NumberFormatException e) {
				System.out.println("nhap loi. vui long nhap lai.");
			}
			attempts++;
		}
		if (attempts == maxAttempts) {
			System.out.println("Đã vượt quá số lần nhập. Thoát chương trình.");
		}
	}

	private static boolean isPowerOf2(int input) {
		
		double log = Math.log(input) / Math.log(2);
		
		return Math.ceil(log) == Math.floor(log);
	}
}
