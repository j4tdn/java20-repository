package controlling;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// for
		//		_ Biết trước điều kiện dừng
		//		_ Duyệt các phần tử trong mảng, danh sách (for-index/for-each)
		for (int i = 0; i < 10; i += 2) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
				
		System.out.println("\n--------------------\n");
		
		// while
		//		_ Kiểm tra điều kiện từ lúc đầu
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0)
				System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println("\n--------------------\n");
		
		// do while
		//		_ Bỏ qua lần kiểm tra đầu tiên
		
		// Viết chương trình nhập vào 1 số nguyên hợp lệ kiểm tra phải số nguyên tố không
		// Nếu nhập sai thì nhập lại
		Scanner sc = new Scanner(System.in);
		String text;
		do {
			System.out.print("Enter number: ");
			text = sc.nextLine();
		} while (!isNumber(text));
		int number = Integer.parseInt(text);
		System.out.println("--> is prime: " + isPrime(number));
		sc.close();
	}
	
	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (Character.isDigit(letter))
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
