package view;

import java.util.Scanner;

public class Exercises02 {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
		 System.out.println("Nhập vào số tự nhiên: ");
		 int a = ip.nextInt();
		 if (isSpecialNumber(a)) {
	            System.out.println(a + " là số đặc biệt.");
	        } else {
	            System.out.println(a + " không phải là số đặc biệt.");
	        }
	    }
	public static boolean isSpecialNumber(int n) {
        int sum = 0;
        int currentNumber = 1;
        
        while (sum < n) {
            sum += currentNumber;
            currentNumber++;
        }
        
        return sum == n;
    }
}

