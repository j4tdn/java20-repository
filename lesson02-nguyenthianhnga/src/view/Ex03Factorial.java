package view;

import java.util.Scanner;

public class Ex03Factorial {
	
	public static void main(String[] args) {
		  int n;
	        Scanner ip = new Scanner(System.in);
	        do {
	            System.out.print("Enter number: ");
	            n = ip.nextInt();
	            if (n < 0) {
	                System.out.println("Invalid input. Please enter a positive integer.");
	            }
	        } while (n < 0);
	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        System.out.println(n + "! = " + factorial);
	    }
	
}
