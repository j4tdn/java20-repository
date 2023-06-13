package Ex03Saddle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng: ");
		int m = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số cột: ");
		int n = Integer.parseInt(sc.nextLine());
		Matrix a = new Matrix(m, n);
		a.matrixRandom();
		a.printArray();
		a.findSaddleElements();
		sc.close();
	}
}

