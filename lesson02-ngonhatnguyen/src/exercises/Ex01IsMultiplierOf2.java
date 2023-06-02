package exercises;

import java.util.Scanner;

public class Ex01IsMultiplierOf2 {
	public static boolean isMultiplierOfTwo(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static int inputN() {
		Scanner sc = new Scanner(System.in);
		int i = 0, n = 0;
		while (i < 5) {
			System.out.println("Nhập N: ");
			while (!sc.hasNextInt() && i < 5) {
				System.out.println("N không hợp lệ!\nMời nhập lại:");
				i++;
				sc.next();
			}
			if (i == 5) {
				System.out.println("Bạn đã nhập lại 5 lần! Không thể nhập tiếp!!!");
				return 0;
			}
			n = sc.nextInt();
			if (n <= 0 && i < 5) {
				System.out.println("N không hợp lệ!\nMời nhập lại:");
				i++;
			} else {
				break;
			}
			if (i == 5) {
				System.out.println("Bạn đã nhập lại 5 lần! Không thể nhập tiếp!!");
				return 0;
			}
		}
		sc.close();
		return n;
	}

	public static void main(String[] args) {
		int n = inputN();
		if (n > 0) {
			if (isMultiplierOfTwo(n)) {
				System.out.println(n + " là bội của 2!");
			} else {
				System.out.println(n + " không là bội của 2!");
			}
		}
	}
}
