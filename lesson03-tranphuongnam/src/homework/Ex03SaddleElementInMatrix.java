package homework;

import java.util.Scanner;

import bean.Matrix;

public class Ex03SaddleElementInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số hàng ma trận: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số cột ma trận: ");
		int m = Integer.parseInt(sc.nextLine());
		
		Matrix matrix = new Matrix(n,m);
		matrix.inputMatrix();
		matrix.printMatrix();
		if(matrix.hasSaddleElement()) {
			System.out.println("Ma trận có yên ngựa");
		} else {
			System.out.println("Ma trận không có yên ngựa");
		}
	}
}
