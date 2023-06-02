package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/* viết chương trình nhập vào 
		 * +Họ tên
		 * +Số điện thoại
		 * +Năm sinh
		 * 
		 * --> ỉn a thông tin họ tên, số điện thoại, tuổi
		 * hiện tượng trôi lệnh
		 * 1. Nhập chuỗi nextLine:
		 * +khi dùng nextline, dừng lại màn hình
		 * +Người dùng có nhập --> nhấn enter --> l
		 */
		//Mở kết nối đến bàn phím
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter student id(3 digits): ");
		//int id = ip.nextInt();
		//ip.nextLine();
		int id = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();
		
		System.out.print("Enter yearOrBirth: ");
		int yearOrBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOrBirth;
		String info = id + ',' + fullname + ',' + phone + ',' + age;
		System.out.println("student info: " +info);
		//Đóng kết nối
		ip.close();
	}

}
