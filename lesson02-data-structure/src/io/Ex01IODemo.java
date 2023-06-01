package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào + Họ tên + Số điện thoại + Năm sinh --> In ra
		 * thông tin họ tên, số điện thoại, tuổi
		 */

		// Mở kết nối đến bàn phím
		
		/*
		 * 
		 */
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter student id (3 digits): ");
		//int id = ip.nextInt();
		int id = Integer.parseInt(ip.nextLine());
		System.out.print("Enter fullname: ");
		String fullName = ip.nextLine();

		System.out.print("Enter phone: ");
		String phone = ip.nextLine();

		System.out.print("Enter yearOfBirth: ");
		int yearOfBirth = ip.nextInt();

		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		String info = id + ", " + fullName + ", " + phone + ", " + age;
		System.out.println("\n --> Student info:  " + info);
		// Đóng kết nối
		ip.close();
	}
}
