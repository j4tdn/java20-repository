package saddlepoint;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.print("Nhập số hàng: ");
		m = Integer.parseInt(sc.nextLine());
		int n;
		System.out.print("Nhập số cột: ");
		n = Integer.parseInt(sc.nextLine());
		int[][] matrix = new int[m][n];

		System.out.println("=============================");
		
		inputMatrix(matrix);
		
		System.out.println("=============================");
		
		printMatrix(matrix);
		
		System.out.println("=============================");
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (minOfRow(i, j, matrix) && maxOfColumn(i, j, matrix))
					System.out.println("arr[" + i + "][" + j + "] = " + matrix[i][j] + " là điểm yên ngựa");
	}
	
	public static void inputMatrix(int[][] matrix) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				matrix[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static boolean minOfRow(int i, int j, int[][] matrix) {
		int min = matrix[i][j];
		for (int m = 0; m < matrix[i].length; m++) 
			if (min > matrix[i][m])
				return false;
		return true;
	}

	public static boolean maxOfColumn(int i, int j, int[][] matrix) {
		int max = matrix[i][j];
		for (int m = 0; m < matrix.length; m++)
			if (max < matrix[m][j])
				return false;
		return true;
	}
}
