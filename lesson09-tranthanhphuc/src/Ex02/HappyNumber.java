package Ex02;

import java.util.Scanner;

public class HappyNumber {

	public static int sumOfSquares(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}

	public static boolean isHappy(int n) {
		int slow = n;
		int fast = n;
		do {
			slow = sumOfSquares(slow);
			fast = sumOfSquares(sumOfSquares(fast));
			if (slow == 1)
				return true;
		} while (slow != fast);
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên dương:");
		int n = sc.nextInt();
		if (isHappy(n)) {
			System.out.println(n + " là số hạnh phúc.");
		} else {
			System.out.println(n + " không phải là số hạnh phúc.");
		}
	}
}
