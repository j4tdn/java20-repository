package logic;

import java.util.Scanner;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		System.out.println(readNumber(n));

		sc.close();
	}

	public static String readNumber(int n) {
		String st = "";
		int[] arr = new int[3];
		int i = 0;
		while (n != 0 && i < 4) {
			arr[i] = n % 10;
			n = n / 10;
			i++;
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			switch (arr[j]) {
			case 0:
				st = st + "không";
				break;
			case 1:
				st = st + "một";
				break;
			case 2:
				st = st + "hai";
				break;
			case 3:
				st = st + "ba";
				break;
			case 4:
				st = st + "bốn";
				break;
			case 5:
				st = st + "năm";
				break;
			case 6:
				st = st + "sáu";
				break;
			case 7:
				st = st + "bảy";
				break;
			case 8:
				st = st + "tám";
				break;
			case 9:
				st = st + "chín";
				break;
			}
			if(j == 2) {
				st = st + " trăm ";
			}
			if(j == 1) {
				st = st + " mươi ";
			}
		}
		return st;
	}
}
