package ex03SaddleElement;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Checking exist Saddle element......");
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter row M =  ");
		int m = Integer.parseInt(ip.nextLine());
		System.out.print("Enter coulum N = ");
		int n = Integer.parseInt(ip.nextLine());
		
		int [][] matrix = AppUtils.importMatrixRandom(m, n);
		AppUtils.printMatrix(matrix);
		System.out.print("Result--> " + AppUtils.existSaddleElement(matrix));
		ip.close();
	}
}
