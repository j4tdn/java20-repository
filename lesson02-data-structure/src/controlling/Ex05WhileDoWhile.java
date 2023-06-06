package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		// Duyệt và in ra các số nguyên dương < n
		// Sử dụng for khi 
		// --> Biết trước vòng lặp, biết trước điều kiện dừng
		int n = 8;
		int i = 1;
		// while (expression)
		// trong khi biểu thúc đang true --> thực thi {}
		// biểu thức false --> thoát khỏi while
		while(i < 8) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n================\n");
		
		i = 1;
		while(true) {
			System.out.print(i + " ");
			i++;
			// điều kiện dừng 
			if(i == 8) break;
		}
		
		System.out.println("\n================\n");

		i = 1;
		do {
			System.out.println(i + " ");
			i++;
		} while(i < 8);
		
		// while: kiểm tra điều kiện từ lúc đầu mới vào
		// --> hầu hết sử dụng while(...)
		// do while: bỏ qua lần kiểm tra điều kiện đầu tiên
		
		System.out.println("\n\n==============\n");
		
		// Nhập vào 1 số nguyên hợp lệ, nếu nhập sai yêu cầu nhập lại
		// Kiểm tra số đó có phải là số nguyên tố hay không
		
		// --> performance --> BufferReader
		Scanner ip = new Scanner(System.in);
		String text = "";
		
		// validation text is a number
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
		} while (!isNumber(text));
		
		int number = Integer.parseInt(text);
		
		System.out.println("is prime: " + isPrime(number));
		
		ip.close();
		
		// thoát hàm main --> return; (kết thúc hàm trả về void)
		// thoát chương trình --> System.exit(0)
	}
	
	private static boolean isNumber(String text) {
		// length = 9
		// index --> [0, length)
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPrime(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return number < 2 ? false : true;
	}
}
