package view;

import java.util.Scanner;

public class Ex03PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap n: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("\n================\n");
		System.out.println("Hinh tam giac pascal: ");
		printPascalTriangle(n);
		sc.close();
	}

	public static void printPascalTriangle(int n) {
		Integer[][] element = new Integer[n+1][n+1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if(i == 0 && j == 0)
					continue;
				if (j == 0 || i == j) {
					element[i][j] = 1;
				}else if(i > j){
					element[i][j] = element[i - 1][j - 1] + element[i-1][j];
				}
			}
		}
		printMatrix(element);
	}
	
	public static void printMatrix(Integer[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] == null)
					System.out.print("    ");
				else
					System.out.printf("%-4d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
