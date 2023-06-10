package checking;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cho bảng A kích thước MxN.");
		System.out.print("Nhập M: ");
		int M = sc.nextInt();
		System.out.print("Nhập N: ");
		int N = sc.nextInt();
		
		Table tbl = new Table(M, N);
		
		tbl.enterData();
        tbl.printTable();
        tbl.checkSaddleEle();
           
		sc.close();
	}
}
