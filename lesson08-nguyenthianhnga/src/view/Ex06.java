package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k: ");
		int k = sc.nextInt();
		int count =0;
		int number =0;
		while(count<k)
		{
			count += String.valueOf(number).length();
			number++;
		}
		int result = number;
		System.out.println("This number is index: "+result);
		
	}
}
