package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		// Duyệt và in ra các số nguyên dương < n
		int n = 8;
		int i = 1;

		// while(expression)
		// trong khi biểu thức đang true --> thực thi {}
		// biểu thức false --> thoát khỏi while

//		while (i < 8) {
//			System.out.println(i + " ");
//			i++;
//		}
//
//		System.out.println("=================");
//
//		while (true) {
//			System.out.println(i++ + " ");
//			i++;
//			if (i == 8) {
//				break;
//			}
//		}
		// while: kiểm tra điều kiện từ lúc đầu mới vào
		// --> hầu hết sử dụng while (...)
		// do while: bỏ qua lần kiểm tra điều kiện đầu tiên

		// nhập vào 1 số nguyên hợp lệ, nếu nhập sai, yêu cầu nhập lại
		// kiểm tra số đó có phải là số nguyên tố hay không

		Scanner ip = new Scanner(System.in);

		// cách 1: validation
		// --> kiểm tra ip.nextLine là hợp lệ trước khi Integer.parseInt(ip.nextLine())

		// cách 2:
		// --> cho nhập thoả mái --> sai --> Integer.parseInt(ip.nextLine()) quăng lỗi
		// exception
		// dùng code để bắt lỗi exception và yêu cầu người dùng nhập lại

		// String text= ip.nextLine();
		String text = "";
		do {
			System.out.println("Enter number: ");
			text = ip.nextLine();
			// điều kiện dừng
			if (isNumber(text)) {
				break;
			}
		} while (true);

		// validation text is a number
		int number = Integer.parseInt(text);

		System.out.println("is prime: " + isPrime(number));
//		ip.close();

		// thoát hàm main --> return; ( thoát hàm trả về void)
		// thoát ctrinh --> system.exit(0)
	}

	private static boolean isNumber(String text) {
		// length = 9
		// index --> [0, length)
		for (int i = 0; i <= text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return number < 2 ? false : true;
	}

}
