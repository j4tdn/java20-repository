package view;

import java.util.Scanner;

import bean.Matrix;

public class Exercise03 {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);

	        System.out.print("Nhập số hàng: ");
	        int rows = ip.nextInt();

	        System.out.print("Nhập số cột: ");
	        int columns = ip.nextInt();
	       
	        Matrix matrix = new Matrix(rows, columns);
	        matrix.generateRandomMatrix();
	        matrix.printMatrix();
	        matrix.hasSaddlePoint();
	}
}
