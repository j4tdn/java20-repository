package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào 
		 * + Họ tên
		 * + Số điện thoại
		 * + Năm sinh
		 * 
		 * --> In ra thông tin Họ tên, Số điện thoại, Tuổi
		 * 
		 * Hiện tượng trôi lệnh
		 * 

		 */
		// mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter student id(3 digits): ");
		//int id = ip.nextInt(); 
		//ip.nextLine();
		int id = Integer.parseInt(ip.nextLine()); // require ip.nextLine() dãy số
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();
		
		System.out.print("Enter yearOfBirth: ");
		int yearOfBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		
		String info = id + ", " 
					+ fullname + ", " 
					+ phone + ", "
					+ age;
		System.out.println("\n--> student info: " + info);
		// đóng kết nối
		ip.close();
	}
}
