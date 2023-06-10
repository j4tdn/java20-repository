package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/**
		 * Viết chương trình nhập vào 
		 * + Họ tên
		 * + Số điện thoại
		 * + Năm sinh
		 * 
		 * --> in ra thông tin họ tên, số điện thoại, tuổi
		 * 
		 *  Hiện tượng trôi lệnh xảy ra khi nhập !nextLine trước nextLine
		 *  
		 *  1. Nhập chuỗi nextLine()
		 *     + khi dùng nextLine, dưng lại màn hình
		 *     + Người dùng có nhập --> enter --> lưu vào nextLine
		 *     +            không                 lưu giá trị rỗng vào nextline
		 *     
		 *  2. Nhập không phải chuỗi : nextInt()...
		 *  +   
		 */
		
		// mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.println("enter student id (3 digits) ");
		int id = Integer.parseInt(ip.nextLine());
		
		System.out.print("enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("enter phone: ");
		String phone = ip.nextLine();
		
		System.out.print("enter yearOfBirth: ");
		int yearOfBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		String info = id + ", " + fullname + ", " + phone + ", " + age;
		System.out.println("student info: " + info);
		
		// đóng kết nối
		ip.close();
	}
}
