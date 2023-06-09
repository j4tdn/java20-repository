package ex03horsesaddle;

import java.util.Random;
import java.util.Scanner;

public class Ex04HorseSaddle {
	public static void main(String[] args) {
		if (check() == true) {
			System.out.println("mảng có phần tử yên ngựa");
		} else {
			System.out.println("Mảng không có phần tử yên ngựa");
		}
	}

	public static boolean check() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter M: ");
		int m = sc.nextInt();
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int[][] arr = new int[m][n];

		Random rd = new Random();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = 1 + rd.nextInt(99);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < m; i++) {
			int jMin = 0;
			int result = arr[i][0];
			for (int j = 0; j < n; j++) {
				if (arr[i][j] < result) {
					result = arr[i][j];
					jMin = j;
				}
			}
			for (int k = 0; k < m; k++) {
				if (result < arr[k][jMin]) {
					break;
				}
				if (k == m - 1) {
					return true;
				}
			}
		}
		return false;

	}

}
