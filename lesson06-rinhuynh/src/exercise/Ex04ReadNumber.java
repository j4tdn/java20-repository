package exercise;

import java.util.Scanner;

public class Ex04ReadNumber {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Nhập số (tối đa 3 chữ số): ");
		int num = sc.nextInt();
		System.out.println(readNumber(num));
	}

	private static String readNumber(int num) {
		
		String[] ones = { " ", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười",
						"Mười Một","Mười Hai", "Mười Ba", "Mười Bốn", "Mười Lăm",
						"Mười Sáu", "Mười Bảy", "Mười Tám", "Mười Chín" };
		
		String[] tens = { " ", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", 
						"Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi" };
		
		String hundreds = "Trăm";
		
		String result = "";

		int onesDigit = num % 10;
		int tmp = num / 10;
		int tensDigit = tmp % 10;
		int hundredsDigit = num / 100;
		
		if (num == 0) {
			return "Không";
		} else if (num < 20) {
			return result + ones[num];
		} else if (num < 100) {
			return result + tens[tensDigit] + " " + ones[onesDigit];
		} else {
			return result + ones[hundredsDigit] + " " + hundreds + " " + ((tensDigit == 0) ? "Lẻ" : tens[tensDigit]) + " " + ones[onesDigit];
		}
	}

}
