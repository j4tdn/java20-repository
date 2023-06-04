package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		// Duyện và in ra các số nguyên dương < n
		int n = 8;
		int i = 1;
		// while (expression)
		// trong khi biểu thức đang true --> thực thi {}
		// biểu thức false --> thoát khỏi while
		while (i < n) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n=======================\n");
		
		i = 1;
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i == 8) {
				break;
			}
		}
		
		System.out.println("\n=======================\n");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i < 8);
		
		// while: kiểm tra điều kiện từ lúc đầu mới vào
		// --> hầu hết sử dụng while
		// do while: bỏ qua lần kiểm tra điều kiện đầu tiên
		
		System.out.println("\n=======================\n");
		
		// Nhập vào 1 số nguyên hợp lệ, nếu nhập sai yêu cầu nhập lại
		// kiểm tra số đó có phải là số nguyên tố không
		
		// --> performance --> BufferReader
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		// sc.nextLine() != số
		// nguyên nhân: do người dùng nhập sai
		// yêu cầu: nhập vào tất cả các kí tự phải là số
		// cách xử lý
		// cách 1:
		//  --> kiểm tra ip.nextLine là hợp lệ trước khi Integer.parseInt()
		// cách 2:
		//  --> cho nhập thoải mái --> sai --> Integer.parseInt() quăng lỗi exception
		// dùng code để bắt lỗi exception và yêu caàu người dùng nhập lại
		
		String text = "";
		do {
			System.out.println("Enter number:");
			text = sc.nextLine();
		} while (!isNumber(text));
		// validation text is a number
		
		int number = Integer.parseInt(sc.nextLine());
		sc.close();
		
		System.out.println("is Prime: " + isPrime(number));
		
		// thoát hàm main --> return ; (kết thúc hàm trả về void)
		// thoát chương trình --> System.exit
	}
	
	private static boolean isNumber(String text) {
		// length = 9;
		// index --> [0, length)
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n < 2 ? false : true;
	}
}
