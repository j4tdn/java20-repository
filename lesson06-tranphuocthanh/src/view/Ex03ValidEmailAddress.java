package view;

/**
 * Acceptable email prefix formats:
  + Allowed letter(a-z), numbers, underscores(_), periods(.), dashed(-)
  + An underscores(_), periods(.), dashed(-) must be followed 
    by one or more letter or number	
 */

import java.util.Scanner;

public class Ex03ValidEmailAddress {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			try {
				System.out.println(isValidEmailAddress("mail.com"));
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				System.out.println("Please enter a valid email address!");
			}
		}

		// System.out.println(isValidEmailAddress("mail.com"));
		ip.close();
	}

	private static String isValidEmailAddress(String specifiedDomain) {
		String prefix = manualInput("Enter prefix: ");
		String domain = manualInput("Enter domain: ");

//		String[] words = prefix.split("[a-z0-9_.-]+");
//		if (words.length != 0) {
//			throw new IllegalArgumentException(
//					"prefix only allowed letter(a-z), numbers, " + "underscores, periods, dashes !");
//		}

		if (!prefix.matches("[0-9a-z-._]+")) {
			throw new IllegalArgumentException("An underscores(_), periods(.), dashed(-) must be followed by one or more letter or number !");
		}
		
//		String[] specialValidChar = {"-", ".", "_"};
//		for (String each: specialValidChar) {
//			if (prefix.startsWith(each) || prefix.endsWith(each)) {
//				throw new IllegalArgumentException("underscores, periods, dashed cannot be the first or the last!");
//			}
//		}
		
		String regex1 = "[a-z0-9]+"; 
		
		if (!prefix.matches(regex1)) {
			String regex2 = "regex1 + [-._]regex1";
			if (!prefix.matches(regex2)) {
				throw new IllegalArgumentException(
						"An underscores(_), periods(.), dashed(-) must be followed by one or more letter or number !");
			}
		}

		if (domain.compareTo(specifiedDomain) != 0) {
			throw new IllegalArgumentException("domain must be: " + specifiedDomain);
		}

		return prefix + "@" + domain + " --> true";
	}

	private static String manualInput(String text) {
		System.out.print(text);
		return ip.nextLine();
	}
}
