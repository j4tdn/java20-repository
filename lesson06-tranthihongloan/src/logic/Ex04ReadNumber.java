package logic;

import java.util.Scanner;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập một số: ");
		
		while(true) {
			try {
				n = Integer.parseInt(sc.nextLine());
				System.out.println(readNumber(n));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Nhập sai kiểu dữ liệu.");
				System.out.println("Nhập lại:");
			} 
		}
	}

	public static String readNumber(int n) {
		String st = "";

		// Đếm có bao nhiêu chữ số
		int[] arr = new int[countCharacter(n)];

		// Tách từng chữ số thành mảng
		arr = separateDigits(n, arr);

		for (int j = 0; j <= arr.length - 1; j++) {
			switch (arr[j]) {
			case 0:
				st = "không" + st;
				break;
			case 1:
				st = "một" + st;
				break;
			case 2:
				st = "hai" + st;
				break;
			case 3:
				st = "ba" + st;
				break;
			case 4:
				st = "bốn" + st;
				break;
			case 5:
				st = "năm" + st;
				break;
			case 6:
				st = "sáu" + st;
				break;
			case 7:
				st = "bảy" + st;
				break;
			case 8:
				st = "tám" + st;
				break;
			case 9:
				st = "chín" + st;
				break;
			}

			if (j == 0 && (arr.length == 2 || arr.length == 3)) {
				st = " mươi " + st;
			}
			if (j == 1 && arr.length == 3) {
				st = " trăm " + st;
			}
		}
		return st;
	}

	public static int countCharacter(int n) {
		String st = "" + n;
		return st.length();
	}

	public static int[] separateDigits(int n, int[] arr) {
		int i = 0;
		while (n != 0 && i < arr.length) {
			arr[i] = n % 10;
			n = n / 10;
			i++;
		}
		return arr;
	}
}
