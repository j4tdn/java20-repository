package exercises;

import java.util.Scanner;

public class Ex06FindMaxMin {
	public static int findMax(int a, int b, int c) {
		int max = a;
		if (a >= b && a >= c) {
			max = a;
		}
		if (b >= a && b >= c) {
			max = b;
		}
		if (c >= a && c >= b) {
			max = c;
		}
		return max;
	}

	public static int findMin(int a, int b, int c) {
		int min = a;
		if (a <= b && a <= c) {
			min = a;
		}
		if (b <= a && b <= c) {
			min = b;
		}
		if (c <= a && c <= b) {
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Nhập a thuộc [0, 20): ");
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Nhập a thuộc [0, 20):");
				sc.next();
			}
			a = sc.nextInt();
			if (a < 0 || a >= 20) {
				System.out.println("Nhập a thuộc [0, 20):");
			}
		} while (a < 0 || a >= 20);
		System.out.println("Nhập b thuộc [0, 20): ");
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Nhập b thuộc [0, 20):");
				sc.next();
			}
			b = sc.nextInt();
			if (b < 0 || b >= 20) {
				System.out.println("Nhập b thuộc [0, 20):");
			}
		} while (b < 0 || b >= 20);
		System.out.println("Nhập c thuộc [0, 20): ");
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Nhập c thuộc [0, 20):");
				sc.next();
			}
			c = sc.nextInt();
			if (c < 0 || c >= 20) {
				System.out.println("Nhập c thuộc [0, 20):");
			}
		} while (c < 0 || c >= 20);
		sc.close();
		System.out.println("a --> " + a + "\nb --> " + b + "\nc --> " + c);
		System.out.println("Số lớn nhất là: " + findMax(a, b, c));
		System.out.println("Số nhỏ nhất là: " + findMin(a, b, c));
	}
}
