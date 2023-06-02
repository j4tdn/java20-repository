package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 *  Viết chương trình nhập vào 
		 *  -Họ tên
		 *  -SDT
		 *  -Năm sinh
		 *  
		 *  --> In ra thông tin Họ tên, SDT, tuổi
		 *  
		 *  
		 *  
		 */
		
		//Mở một kết nối đến bàn phím
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id(3 digits): ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter fullname: ");
		String fullname = sc.nextLine();
		System.out.print("Enter phone: ");
		
		String phone = sc.nextLine();
		System.out.print("Enter yearOrBirth: ");
		
		int yearOrBirth = Integer.parseInt(sc.nextLine());
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOrBirth;
		
		String info = id + ", "
					+ fullname + ", " 
					+ phone + ", " 
					+ age ;
		System.out.println("Info: " + info );
		//Đóng kết nối
		sc.close();
	}
}
