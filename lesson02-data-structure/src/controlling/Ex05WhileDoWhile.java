package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		// duyệt và in số < n
		int n = 8;
		int i = 1;
		// while(exp)
		// trong khi exp true --> thực thi {}
		// exp false --> out
		while (i < n) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\n===============\n");
		i = 1;
		while (true) {
			System.out.print(i + " ");
			i++;
			// điều kiện dừng
			if (i == n)
				break;
		}

		System.out.println("\n===============\n");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i < n);

		// while: kiểm tra điều kiện từ lúc đầu mới vào
		// --> hầu hết sử dụng.
		// do while: bỏ qua lần kiểm tra đầu

		// nhập vào 1 số nguyên hợp lệ, nếu nhập sai yêu cầu lại
		// kiểm tra số đó có phải nguyên tố không

		System.out.println("\n===============\n");
		// --> performance --> bufferReader
		Scanner ip = new Scanner(System.in);
		// ip.nextLine --> aa, ab23, 122
		// require: nhập vào tất cả các kí tự phải là số
		// solution:
		// cách 1: validation
		// --> kiểm tra ip.nextLine là hợp lệ trc khi Integer.parseInt(ip.nextLine())
		// cách 2:
		// --> cho nhập thoải mái --> sai --> quăng lỗi exception
		// dùng code bắt lỗi exception và yêu cầu nhập lại

		String text = "";
		// validation text is a number
		do {
			System.out.print("enter number: ");
			text = ip.nextLine();
			if (isNumber(text)) break;
		} while (true);
		
		int number = Integer.parseInt(text);

		System.out.println("is prime: " + isPrime(number));
		ip.close();
		// thoát hàm main --> return; (trả về void)
		// thoát chương trình ---> system.exit(0);
	}

	private static boolean isNumber(String text) {
		// index --> [0, length)
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter))
				return false;
		}
		return true;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return number < 2 ? false : true;
	}
}