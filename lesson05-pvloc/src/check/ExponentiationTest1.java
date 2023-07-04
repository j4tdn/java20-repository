package check;

import java.util.Scanner;

public class ExponentiationTest1 {
	public static boolean isPowerOf(int a, int b) {
		while (a > 0) {
			if (a == 1)
				return true;
			if (a < b)
				return false;
			if (a % b != 0) {
				return false;
			}
			a /= b;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cơ số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cơ số b: ");
        int b = scanner.nextInt();
        System.out.println(a + "^" + b + " = " + isPowerOf(a, b));
	}
}
