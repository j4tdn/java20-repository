package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {

	public static void main(String[] args) {
		/*
		 * viết chương trình nhập vào 
		 * + họ tên
		 * 
		 * + sđt
		 * + năm sinh
		 * 
		 * --> in ra thông tin họ tên, số điện thoại, tuổi.
		 * 
		 * 
		 * hiện tượng trôi lệnh
		 * xảy ra khi nhập xuất !nextLine trước nextLine
		 * 
		 * 1. nhập kiểu chuỗi nextLine()
		 * 	+ khi dùng nextLine, dừng lại màng hình
		 * 	+ người dùng có nhập --> nhấn enter --> lưu giá trị đó vào nextLine
		 * 	+			không	--> nhấn enter --> không có chuyện gì xảy ra
		 * 										--> yêu cầu người dùng phải nhập gì đó
		 * 										--> nhấn enter kết thục việc nhập
		 * 2. nhập không phải chuỗi nextInt(), nextBoolean, nextFloat...
		 * 
		 *
		 */
		//mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter student id(3 digits): ");
		//int id = ip.nextInt();
		int id = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();

		System.out.print("Enter YOB: ");
		int yearOfBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		
		String info = id 
					+ fullname + ", "
					+ phone + ", " 
					+ age;
		
		// đóng  kết nối
		ip.close();
				
	}

}
