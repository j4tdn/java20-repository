package view;

import java.util.Scanner;

public class Ex04ReadNumber {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number (3-digit number): ");
		int num = ip.nextInt();
		System.out.println(convertNumberToWord(num));
	}

	private static String convertNumberToWord(int num) {
		String[] ones = { " ", 
				"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười",
				"Mười Một","Mười Hai", "Mười Ba", "Mười Bốn", "Mười Lăm", "Mười Sáu", "Mười Bảy", "Mười Tám", "Mười Chín" };
		String[] tens = { " ", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi",
							   "Tám Mươi", "Chín Mươi" };
		String hundred = "Trăm";

		if (num < 0 || num > 999) {
			throw new IllegalArgumentException("the number must be positive and less than 3 digits !");
		}

		String result = "";

		int one = num % 10; // last digit
		int tmp = num / 10;
		int ten = tmp % 10; // second digit
		int hund = num / 100; // first digit

		if (num < 20) {
			return result + ones[num];
		} if (num < 100) {
			return result + tens[ten] + " " + ones[one];
		} else {
			return result + ones[hund] + " " + hundred + " " + ((ten == 0) ? "Lẻ":tens[ten]) + " " + ones[one];
		}
	}
}
