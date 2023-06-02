

import java.util.Scanner;
/*
 * Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
 * Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
 */
public class Ex06MinMaxNumber {
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			while(!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		}while(n < 0 || n >= 20);
		return n;
	}
	
	public static void printMinMaxNumber(int a, int b, int c) {
		
		int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
		
		int min = a<b ? (a<c ? a : c) : (b<c ? b : c);
		
		System.out.println("\nSo lon nhat --> " + max);
		System.out.println("So be nhat --> " + min);
	}
	
	public static void main(String[] args) {
		System.out.println("Nhap 3 so nguyen duong [0, 20): ");
		System.out.println("Nhap a:");
		int a = inputNumber();
		System.out.println("Nhap b:");
		int b = inputNumber();
		System.out.println("Nhap c:");
		int c = inputNumber();
		System.out.println("\na --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		printMinMaxNumber(a, b, c);
	}
}
