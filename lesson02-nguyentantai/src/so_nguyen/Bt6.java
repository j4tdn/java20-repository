package so_nguyen;

import java.util.Scanner;

public class Bt6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		while(a>20) {
			System.out.println("Nhap lai a: ");
			a = sc.nextInt();
		}
		
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		while(b>20) {
			System.out.println("Nhap lai b: ");
			b = sc.nextInt();
		}
		
		System.out.println("Nhap c: ");
		int c = sc.nextInt();
		while(c>20) {
			System.out.println("Nhap lai c: ");
			c = sc.nextInt();
		}
		
		int max = 0;
		
		if (a>b) {
			max = a;
		} else {
			max = b;
		}
		if(c>max) max = c;
		
		int min = 0;
		
		if (a>b) {
			min = b;
		} else {
			min = a;
		}
		
		if (c<min) min = c;
		
		System.out.println("so lon nhat la " + max);
		System.out.println("so nho nhat la " + min);
	}
}
