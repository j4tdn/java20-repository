package view;

import java.util.Scanner;

public class Ex03ValidEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String email;

		do {
			System.out.print("\nEnter email-address: ");
			email = sc.nextLine();
			if (!isValidEmail(email)) {
				System.out.println("Acceptable email:\nFrefix formats:");
				System.out.println(" . Allow characters: letters(a-z), numbers, underscores, periods and dashes");
				System.out.println(" . The first character must be a letter(a-z)");
				System.out.println(" . The last character must not be an underscores, a period, or a dashes");
				System.out.println(
						" . An underscores(_), periods(.), dashed(-) must be followed by one or more letter or number!");
				System.out.println("Domain formats:\n . Require to contain 'mail.com'");
			}
		} while (!isValidEmail(email));

		sc.close();

		System.out.println("Create Email Succesful!!!");
		sc.close();
	}

	private static boolean isValidEmail(String email) {
		// kiểm tra email có bắt đầu bằng chữ cái và có đuôi @mail.com
		if (!email.endsWith("@mail.com") || !Character.isLetter(email.charAt(0))) {
			return false;
		}
		String special = "-_.";
		String[] parts = email.split("@");
		
		// kiểm tra kí tự cuối cùng của chuỗi prefix phải là chữ hoặc số
		String prefix = parts[0];
		if (!Character.isLetter(prefix.charAt(prefix.length() - 1))
				&& !Character.isDigit(prefix.charAt(prefix.length() - 1))) {
			return false;
		}
		
		// kiểm tra các kí tự đặt biệt khác '.', '-', '_'
		int countSpec = 0;
		for (int i = 0; i < prefix.length(); i++) {
			if (!Character.isLetterOrDigit(prefix.charAt(i)) && Character.compare(prefix.charAt(i), '-') != 0
					&& Character.compare(prefix.charAt(i), '_') != 0 && Character.compare(prefix.charAt(i), '.') != 0) {
				countSpec++;
			}

		}

		if (countSpec != 0) {
			return false;
		}
		
		// kiểm tra các kí tự đặc biệt kề nhau
		// còn sót trường hợp  'abc.def..k@mail.com'
		for (int j = 0; j < special.length(); j++) {
			int pos = prefix.indexOf(special.charAt(j));

			if (pos != -1 && !Character.isLetterOrDigit(prefix.charAt(pos + 1))) {
				return false;
			}
		}

		return true;
	}
}
