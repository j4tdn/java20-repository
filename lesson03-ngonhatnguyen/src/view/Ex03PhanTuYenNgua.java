package view;

import java.util.Scanner;

import bean.Mang2Chieu;

public class Ex03PhanTuYenNgua {
	public static void main(String[] args) {
		Mang2Chieu arr;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng: ");
		int m = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số cột: ");
		int n = Integer.parseInt(sc.nextLine());
		arr = new Mang2Chieu(m, n);
		arr.createArrayMember();
		arr.printArray();
		arr.timPhanTuYenNgua();
	}
}
