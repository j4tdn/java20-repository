package view;

import java.util.Scanner;

public class Ex03PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(sc.nextLine()) + 1;
		for (int i = 1; i <= n; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.printf("%5d", pascal(k, i));
			}
			System.out.println("\n");
		}
	}

	private static int pascal(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		return pascal(k, n - 1) + pascal(k - 1, n - 1);
	}
}
