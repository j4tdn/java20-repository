package exercises;

import java.io.IOException;

public class Ex04Demo {
	// Mảng chứa các chữ số viết tương ứng từ 0 đến 9
	private static String[] ones = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };

	// Mảng chứa các chữ số hàng chục viết tương ứng từ 10 đến 90 (cách 10)
	private static String[] tens = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi",
			"Bảy mươi", "Tám mươi", "Chín mươi" };

	public static String readNumber(int n) throws IOException {
		// Kiểm tra giới hạn số có tối đa 3 chữ số
		if (n < 0 || n >= 1000) {
			throw new IOException("Number must be in [0;1000)");
		}

		if (n == 0) {
			return "Không";
		}

		// Xử lý số hàng trăm
		int hundreds = n / 100;
		String result = (hundreds > 0) ? ones[hundreds] + " trăm" : "";

		// Xử lý số hàng chục và hàng đơn vị
		int remaining = n % 100;
		if (remaining != 0) {
			if (remaining < 10 && n > 10) {
				result += " lẻ " + ones[remaining];
			} else if (remaining < 20&& n > 10 ) {
				result += " mười " + ones[remaining % 10];
			} else {
				int onesDigit = remaining % 10;
				int tensDigit = remaining / 10;
				result += " " + tens[tensDigit] + " " + ones[onesDigit];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 5;
		int n3 = 25;
		int n4 = 1111;
		int n5 = 3221;
		int n6 = 820;
		int n7 = 219;

		try {
			System.out.println(n1 + " => " + readNumber(n1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(n2 + " => " + readNumber(n2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(n3 + " => " + readNumber(n3));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(n4 + " => " + readNumber(n4));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(n5 + " => " + readNumber(n5));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(n6 + " => " + readNumber(n6));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(n7 + " => " + readNumber(n7));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}