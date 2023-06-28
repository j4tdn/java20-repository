package ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số hàng: ");
		int n = Integer.parseInt(ip.nextLine());
		setAndPrintTriangle(n);
	}
	
	static void setAndPrintTriangle(int n) {
		int[][] triangle = new int[n][];
		
		// Thiết lập tam giác Pascal
		for (int i = 0; i < n; i++) {
			triangle[i] = new int[i + 1];
			
			// Phần tử đầu tiên của mỗi hàng đều bằng 1
			triangle[i][0] = 1;
			
			// Phần tử cuối cùng của mỗi hàng đều bằng 1
			triangle[i][i] = 1;
			
			// Phần tử thứ j của hàng thứ n là tổng của phần tử thứ j-1 và j của hàng thứ n-1
			for (int j = 1; j < i; j++) 
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
		}
		
		// In ra tam giác Pascal
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) 
				System.out.print(triangle[i][j] + " ");
			System.out.println();
		}
	}
	
}
