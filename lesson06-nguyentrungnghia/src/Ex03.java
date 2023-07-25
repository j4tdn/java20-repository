import java.util.Scanner;

public class Ex03 {

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

		String[] array = email.split("gmail.com");
		String prefix = array[0];

		for (int i = 0; i < prefix.length() - 1; i++) 
			if (prefix.charAt(i) == '.' || prefix.charAt(i) == '_' || prefix.charAt(i) == '_')
				if (!Character.isLetterOrDigit(prefix.charAt(i + 1)))
					throw new RuntimeException("Sau các ký tự '.', '-', '_' phải là 1 chữ hoặc 1 số");

		return true;
	}

}
