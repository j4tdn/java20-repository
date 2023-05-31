package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào
		 *  + Họ tên
		 *  + số điện thoại
		 *  + năm sinh 
		 *  
		 * --> in ra thông tin Họ tên, Số điện thoại, Tuổi
		 *  
		 * Hiện tượng trôi lệnh
		 *  
		 * 1. Nhập kiểu chuỗi nextLine()
		 *  
		 */
		// Mở kết nối đến bàn phím
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student id(3 digits):");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter fullname:");
		String fullname = sc.nextLine();
		System.out.print("Enter phone:");
		String phone = sc.nextLine();
		System.out.print("Enter yearofBirth:");
		int yearOfBirth = sc.nextInt();
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		
		String info = id + ", " + fullname + ", " + phone + ", " + age + ", " + yearOfBirth;
		System.out.println("\n--> Student info: "+ info);
		
		// đóng kết nối
		sc.close();
	}
}
