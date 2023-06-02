package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int N;
		do{
			System.out.println("Nhap so nguyen: ");
			N = sc.nextInt();
			if(N<=0) {
				System.out.println("Nhap lai");
				count++;
			}else {
				break;
			}
		}while(count<5);
		if(N%2 ==0) {
			System.out.println("N la boi cua 2");
		}else {
			System.out.println("N khong la boi cua 2");
		}
	}
}
