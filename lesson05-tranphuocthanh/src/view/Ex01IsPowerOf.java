package view;

import java.util.Scanner;

public class Ex01IsPowerOf {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		boolean result = isPowerOf(num1, num2);
		System.out.println("isPowerOf --> " + result);
	}

	private static boolean isPowerOf(int num1, int num2) {
		double check = 0;
		if (num1 > num2) {
			check = (double) Math.log(num1) / Math.log(num2);
		} else {
			check = (double) Math.log(num2) / Math.log(num1);
		}
		return Math.ceil(check) == Math.floor(check);
	}
}
