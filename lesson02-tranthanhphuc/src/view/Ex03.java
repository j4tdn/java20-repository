package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen:");
		int N=sc.nextInt();
		int giaiThua =tinhGiaiThua(N);
		System.out.println(N +"! ="+ giaiThua);
	}
		private static int tinhGiaiThua(int N) {
		int giaiThua=1;
		if(N<0) {
			System.out.println("Nhap lai:");
		}else if (N==0) {
			giaiThua=1;
		}else {
			for(int i=1;i<=N;i++) {
				giaiThua *=i;
			}
		}
		return giaiThua;
	}
}
