package view;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int count =0;
		int N;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Nhap so nguyen : ");
			N = sc.nextInt();
			if(N<=0) {
				System.out.println("Nhap lai");
				count ++;
			}else {
				break;
			}
		}while(count <5);
		if (N <2) {
            System.out.println("N khong la so nguyen to");
        }
		for(int i=2;i<= Math.sqrt(N);i++){
			if(N%i !=0) {
        	 System.out.println("N la so nguyen to");
			}
		}
	}
}