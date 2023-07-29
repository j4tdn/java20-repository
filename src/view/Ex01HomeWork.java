package view;

import java.util.Scanner;

public class Ex01HomeWork {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {
			try {
				 System.out.println("nhập số a:");
				 a = Integer.parseInt(ip.nextLine());
				 System.out.println("nhập số b:");
				 b = Integer.parseInt(ip.nextLine());
				break;
			} catch (ArithmeticException | NumberFormatException e) {
					 System.out.println("vui lòng nhập lại: ");		 
			}
		}
		System.out.println(Calculator(a, b));
		ip.close();
	}
	private static double Calculator(int a, int b) {
		if(a == 0) {
			throw new ArithmeticException("mẫu không được bằng 0");
		}else {
			return -b / a;
		}
	}
}
