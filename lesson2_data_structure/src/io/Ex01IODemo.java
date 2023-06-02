package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		//viết ct nhập vào
		// họ tên, số điện thoại, năm sinh, in ra thông tin đó.
		//mở kết nối bàn phím
		// hiện tượng trôi lệnh
		//xảy ra khi nhập xuất !nextline trước  nextline
		//1. nhập kiểu chuỗi nexLine();
		// + khi dùng nextline, dung
		Scanner ip = new Scanner (System.in);
		System.out.print("Enter Id: ");
		int id = ip.nextInt();
		ip.nextLine();
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();
		
		System.out.print("Enter yearBirth: ");
		int yearBirth = ip.nextInt();
		
		int curentYear = YearMonth.now().getYear();
		int age = curentYear - yearBirth;
		String info = id +", " + fullname +", " + phone + ", " + age;
		System.out.println("student info--> "+ info);
		// đóng kết nối
		ip.close();
		
	}

}
