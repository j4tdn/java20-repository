package bai2;

import java.util.Scanner;

public class Ex02DemoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = Integer.parseInt(sc.nextLine());
		boolean isSpecialNum = isSpecialNumber(n);
		if(isSpecialNum) {
			System.out.println(n + " là số đặc biệt");
		} else {
			System.out.println(n + " không là số đặc biệt");
		}
	}

	public static boolean isSpecialNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if(sum >= n) {
				break;
			}
		}
		return sum == n;
	}
}
