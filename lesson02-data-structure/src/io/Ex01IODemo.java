package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/* Viết chương trình nhập vào
		 * + Họ tên
		 * + Số điện thoại
		 * + Năm sinh
		 * 
		 * --> In ra thông tin Họ tên, Số điện thoại, Tuổi
		 * 
		 * Hiện tượng trôi lệnh
		 * 
		 * 1. Nhập kiểu chuỗi nextLine()
		 * 	  + Khi dùng nextLine, dừng lại màn hình
		 * 	  + Người dùng có nhập --> nhấn enter --> lưu giá trị đó vào nextLine
		 *    +            không   --> nhấn enter --> lưu giá trị rỗng vào nextLine
		 * 
		 * 2. Nhập kiểu không phải chuỗi nextInt, nextBoolean, nextFloat...
		 *    + Khi dùng !nextLine, dừng lại màn hình
		 *    + Người dùng có nhập --> nhấn enter --> lưu giá trị đó vào !nextLine
		 *    + 		   không   --> nhấn enter --> không có chuyện gì xảy ra
		 *    									  --> yêu cầu ng/ dùng phải nhập gì đó
		 *    									  --> nhấn enter --> kết thúc việc nhập
		 */
		// Mở kết nối tới bàn phím
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter student id(3 digits): ");
		int id = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter fullname: ");
		String fullname = scan.nextLine();
		
		System.out.print("Enter phone number: ");
		String phone = scan.nextLine();
		
		System.out.print("Enter yearOfBirth: ");
		int yearOfBirth = scan.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		
		String info = id + ", " + fullname + ", " + phone + ", " + age;
		
		System.out.println("\n--> student info: " + info);
		
		// đóng kết nối
		scan.close();
		
	}
}
