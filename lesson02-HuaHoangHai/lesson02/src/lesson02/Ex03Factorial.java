package lesson02;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		int result=1;
		int N=0;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap vao N: ");
		N = Integer.parseInt(ip.nextLine());
		for(int i=1;i<=N;i++)
		{
			result *=i;
		}
		System.out.print(N+" != ");
		for(int i=N;i>=1;i--)
		{
		System.out.print(i);
		if(i>1)
			System.out.print(".");
		}
		
		System.out.print(" = " + result );
	}
}

