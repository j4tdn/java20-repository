package view;

import java.util.Scanner;

public class Ex03PrintPascalTriangle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[][] triangle = new int[100][100];
		System.out.print("nhập n ");
		int n = ip.nextInt();
		printPascalTriangle(triangle, n);
	}

	private static void printPascalTriangle(int[][] triangle, int n) {
		for (int i = 0; i <= n+1; i++) {
			triangle[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}

		for (int i = 1; i <= n+1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}
