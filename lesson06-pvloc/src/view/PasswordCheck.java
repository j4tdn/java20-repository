
	package view;
	import java.util.Scanner;
	import java.util.regex.Pattern;

	/**
	 * Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
	 * Mật khẩu phải thỏa mãn các điều kiện sau đây. 
	 * Lặp lại các bước kiểm tra điều kiện cho đến khi đăng ký tài khoản thành công.
	 * Nếu thông tin nhập vào không hợp lệ sẽ ném ra các ngoại lệ, lỗi tương ứng, 
	 * sau đó thông báo cho người dùng biết và cho phép nhập lại.
	 * ~!@#$%^&*()-=+[]{}|;:,.<>/?
	 */
	public class PasswordCheck {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String password = null;
			do {
				System.out.print("Enter your password: ");
				password = sc.nextLine();
				try {
					if (isValid(password)) {
						System.out.println("Password is valid!");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} while (true);

		}

		private static boolean isValid(String password) throws Exception {
			if (password.length() < 8) {
				throw new Exception("Password must contain at least 8 character!!!");
			}
			if (password.length() > 256) {
				throw new Exception("Password must contain at most 256 characters!!!");
			}
			if (!Pattern.matches(".*[a-z].*", password)) {
				throw new Exception("Password must contain at least 1 lowercase aphabetic character (a,b,c,..)");
			}
			if (!Pattern.matches(".*[A-Z].*", password)) {
				throw new Exception("Password must contain at least 1 uppercase aphabetic character (A,B,C,..)");
			}
			if (!Pattern.matches(".*[0-9].*", password)) {
				throw new Exception("Password must contain at least 1 number (1, 2, 3, ...)!!!");
			}
			if (!Pattern.matches(".*[^a-zA-Z0-9].*", password)) {
				throw new Exception("Password must contain at least 1 special character (A, B, C, ...)!!!");
			}
			if (password.contains("Anna")) {
				throw new Exception("Password must not contain your name!!!");
			}
			if (password.contains("@gmail.com")) {
				throw new Exception("Password must not contain your email!!!");
			}

			return true;
		}

	}

