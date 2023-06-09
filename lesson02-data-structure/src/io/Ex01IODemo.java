package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào
		 * 		+ Họ tên
		 * 		+ Số Điện Thoại
		 * 		+ Năm sinh
		 * In ra thông tin Họ tên, Số Điện Thoại, Tuổi
		 */
		
		// Mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter student id(3 digits): ");
		int id = ip.nextInt();
		ip.nextLine();
		System.out.print("Enter fullname: ");
		String fullName = ip.nextLine();
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();
		System.out.print("Enter yearOfBirth: ");
		int yearOfBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		String info = id + ", " + fullName + ", " + phone + ", " + age; 
		System.out.println("Student info: " + info);
		
		// Đóng kết nối
		ip.close();
	}
}