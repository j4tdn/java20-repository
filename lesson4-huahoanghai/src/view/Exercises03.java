package view;

import java.util.Scanner;

public class Exercises03 {
	public static void main(String[] args) {
		   Scanner ip = new Scanner(System.in);
	        System.out.print("Nhập số hàng của tam giác : ");
	        int n = ip.nextInt();

	        int[][] pascalTriangle = generatePascalTriangle(n);
	        printPascalTriangle(pascalTriangle);

	        ip.close();
	    }

	    public static int[][] generatePascalTriangle(int n) {
	        int[][] pascalTriangle = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            pascalTriangle[i][0] = 1;
	            pascalTriangle[i][i] = 1;
	            for (int j = 1; j < i; j++) {
	                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
	            }
	        }

	        return pascalTriangle;
	    }

	    public static void printPascalTriangle(int[][] pascalTriangle) {
	        for (int i = 1; i < pascalTriangle.length; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(pascalTriangle[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
