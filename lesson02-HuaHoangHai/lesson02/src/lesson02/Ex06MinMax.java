package lesson02;

import java.util.Scanner;

public class Ex06MinMax {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
	        int max = -1;
	        int min = 20;
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Nhập số nguyên: ");
	            if(ip.hasNextInt()) {
	            int num = ip.nextInt();
	            while (num < 0 || num >= 20) {
	                System.out.print("Số không hợp lệ. Hãy nhập lại: ");
	                num = ip.nextInt();
	            }
	            max = Math.max(max, num);
	            min = Math.min(min, num);
	        }else {
				System.out.println("Nhập sai định dạng");
				ip.next();
				i--;
	        }
	    }
	        System.out.println("Số lớn nhất là: " + max);
	        System.out.println("Số nhỏ nhất là: " + min);
	}	
}
