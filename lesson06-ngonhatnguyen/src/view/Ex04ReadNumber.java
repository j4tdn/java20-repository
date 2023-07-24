package view;

import java.util.Scanner;

public class Ex04ReadNumber {
	private static final String[] digits = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number = ");

		// Cách 1: Xử lý exception với validation(tiền xử lý)
		String text = sc.nextLine();
		
		// validation cho text là dãy số hợp lệ rồi mới gọi hàm parseInt
		while (!text.matches("\\d{1,3}")) {
			System.out.print("Please enter a valid number and is a 3 digit number! = ");
			text = sc.nextLine();
		}
		
		String rnum = "";
		if (text.length() == 1) {
			int pos = text.charAt(0) - '0';
			rnum = digits[pos];
		} else if (text.length() == 2) {
			rnum = readTwo(text.charAt(0), text.charAt(1), false);
		} else {
			rnum = readThree(text.charAt(0), text.charAt(1), text.charAt(2));
		}
		System.out.println("Read number " + text + " --> " + rnum);
		sc.close();
	}

	private static String readTwo(char b, char c, boolean hasHundred) {
		String cvt = "";
		int B = b - '0';
		int C = c - '0';

		switch (B) {
		case 0: {
			if (hasHundred && C == 0) {
				break;
			}
			if (hasHundred) {
				cvt += "lẻ ";
			}
			cvt += digits[C];
			break;
		}
		case 1: {
			cvt = "mười";
			if (C == 5) {
				cvt += " lăm";
			} else if (C != 0) {
				cvt += " " + digits[C];
			}
			break;
		}
		default: {
			cvt = digits[B] + " mươi";
			if (C == 1) {
				cvt += " mốt";
			} else if (C == 4) {
				cvt += " tư";
			} else if (C == 5) {
				cvt += " lăm";
			} else if (C != 0) {
				cvt += " " + digits[C];
			}
			break;
		}
		}
		return cvt;
	}

	private static String readThree(char a, char b, char c) {
		String read3 = "";
		int A = a - '0';
				
		if (A == 0) {
			read3 = readTwo(b, c, false);
		}
		if (A != 0) {
			read3 = digits[A] + " trăm " + readTwo(b, c, true);			
		}
		return read3;
	}
}
