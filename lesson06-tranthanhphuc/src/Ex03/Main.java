package Ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			System.out.print("Nhập email: ");
			String email = ip.nextLine();
			try {
				if (isValidEmail(email)) {
					System.out.println(email);
					break;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
		ip.close();
	}
	private static boolean isValidEmail(String email) {
		if (!email.endsWith("@gmail.com"))
			throw new RuntimeException("Hậu tố phải là '@gmail.com'");
	return true;

	}
}
