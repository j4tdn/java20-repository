package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * viết chương trình nhập vào 
		 * + họ tên
		 * + số điện thoại 
		 * + năm sinh
		 * 
		 * --> in ra thông tin họ tên, sđt , tuổi
		 * Hiện tượng trôi lệnh 
		 * xảy ra khi nhập xuất !nextLine trước nextLine
		 * 
		 * 
		 * 
		 * 1. nhập kiểu Chuỗi nextLine()
		 *    + khi dùng nextLine, dừng lại màn hình 
		 *    + người dùng có nhập -->nhấn enter--> lưu giá trị vào nextLine
		 *    				không -->nhấn enter --> lưu giá trị rỗng vào nextLine
		 * 2. nhập ko phải chuỗi nextBoolean(), nextInt()
		 * + khi dùng nextInt(), dừng lại màn hình 
		 *    + người dùng có nhập -->nhấn enter--> lưu giá trị vào nextInt
		 *    				không -->nhấn enter --> không có chuyện gì xảy ra 
		 *	
		 */
		//mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		System.out.println(" Enter Studentid (3 digit): ");
		int id = Integer.parseInt(ip.nextLine());//require ip.nextline(day so)
		
		System.out.print("Enter FullName: ");
		String fullName = ip.nextLine();
		
		System.out.print("Enter Phone: ");
		String phone = ip.nextLine();
		
		System.out.print("Enter yearOfBirth: ");
		int yearOrBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOrBirth;
		
		String info = 	id + "," +
						fullName + "," +
						phone + ", " +
						yearOrBirth + ",";
		
		System.out.println("Enter FullName:  " + info);
		
		System.out.println("yearOfBirth of You: " + age);
		//dong ket 
		ip.close();
	}
}
