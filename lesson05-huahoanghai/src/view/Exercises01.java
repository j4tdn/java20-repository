package view;

import java.util.Scanner;

public class Exercises01 {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
	        System.out.print("Nhập vào a: ");
	        int a = Integer.parseInt(ip.nextLine());
	        System.out.print("Nhập vào b: ");
	        int b = Integer.parseInt(ip.nextLine());

        boolean isPower1 = isPowerOf(a, b);
        
        System.out.println(a + "," + b + "-->" + isPower1);
    }

    public static boolean isPowerOf(int a, int b) {
    	if (a <= 1 || b <= 1) {
            return false;
        }

        int power1 = 1;
        while (power1 < b) {
            power1 *= a;
        }

        if (power1 == b) {
            return true;
        }
        
        int power2 = 1;
        while (power2 < a) {
            power2 *= b;
        }
        return power2 == a;
 }
}
