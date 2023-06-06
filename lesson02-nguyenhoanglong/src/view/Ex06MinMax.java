package view;

import java.util.Scanner;

public class Ex06MinMax {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String n1,n2,n3 = "";
		do {
			System.out.print("Enter a: ");
			 n1 = ip.nextLine();
			System.out.print("Enter b: ");
			 n2 = ip.nextLine();
			System.out.print("Enter c: ");
			 n3 = ip.nextLine();
			 
			if (!n1.matches("\\d+") || !n2.matches("\\d+") || !n3.matches("\\d+")  ) 
				continue;
				
			else {
				int a = Integer.parseInt(n1);
				int b = Integer.parseInt(n2);
				int c = Integer.parseInt(n3);
				if ((a > 19 || a < 0) || (b > 19 || b < 0) || (c > 19 || c < 0))
					System.out.println("Erorr");
				else {
					
					System.out.println("MaxValue: " + MaxValue(a, b, c));
					System.out.println("MinValue: " + MinValue(a, b, c));
				}
			}
		} while (true);
	}
	private static int MaxValue(int a, int b, int c) {
		int max = 0;
		if (a > b) {
			max = a;
		}else {
			max = b;
		}
		if (c > max) {
		 max = c;
		}
		return max;
	
	}
	private static int MinValue(int a, int b, int c) {
		int min = 0;
		if (a < b) {
			min = a;
		}else {
			min = b;
		}
		if (c < min) {
		 min = c;
		}
		return min;
	
	}
}	
