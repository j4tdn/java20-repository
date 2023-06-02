package exercises;

import java.util.Scanner;

public class Ex05IsSymmetricalNumber {
	public static int timSoDao(int n) {
		int ndao = 0, ncuoi;
		while (n != 0) {
			ncuoi = n % 10;
			ndao = ndao * 10 + ncuoi;
			n /= 10;
		}
		return ndao;
	}

	public static boolean isSymmetricalNumber(int n) {
		if (timSoDao(n) == n) {
			return true;
		} else {
			return false;
		}
	}

	public static int inputN() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 10) {
			System.out.println("Nhập N: ");
			while (!sc.hasNextInt()) {
				System.out.println("N không hợp lệ!\nMời nhập lại:");
				sc.next();
			}
			n = sc.nextInt();
			if (n < 10) {
				System.out.println("N không hợp lệ!\nMời nhập lại:");
			} else {
				break;
			}
		}
		sc.close();
		return n;
	}

	public static void main(String[] args) {
		int x = inputN();
		if (isSymmetricalNumber(x)) {
			System.out.println(x + " là số đối xứng!");
		} else {
			System.out.println(x + " không là số đối xứng!");
		}
	}
}
