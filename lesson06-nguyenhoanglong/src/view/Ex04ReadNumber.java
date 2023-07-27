package view;

import java.util.Scanner;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter a number with up to 3 digits: ");
				int number = Integer.parseInt(ip.nextLine());
				
				System.out.println(convertNumbersToLetters(number));
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				System.out.println("Please enter a valid number");
			}
		}
	}
	
	private static String convertNumbersToLetters(int number) {
		String[] ones = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười", "Mười Một"
					   , "Mười Hai", "Mười Ba", "Mười Bốn", "Mười Lăm", "Mười Sáu", "Mười Bảy", "Mười Tám", "Mười Chín"};
		String[] tens = {"", "", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi", "Mười", "Mười Một"};
		if (number <0 || number > 999) {
			throw new IllegalArgumentException("Enter more than 3 digits");
		}
		if (number < 20) {
	            return ones[number];
	        } else if (number < 100) {
	            return tens[number / 10] + " " + ones[number % 10];
	        } else if (number < 1000) {
	            return ones[number / 100] + " trăm " + convertNumbersToLetters(number % 100);
	        }
		return "Number out of range";
	}
}