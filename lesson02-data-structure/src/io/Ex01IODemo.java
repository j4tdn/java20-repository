package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*viết chương trình nhập vào
		 * +Họ tên
		 * + Số điện thoại
		 * +Năm Sinh
		 * 
		 * -->In ra thông tin họ tên , SDT, Tuổi
		 * 
		 * Hiện tượng trôi lệnh
		 * Xảy ra khi nhập xuất !nextLine trước nextLine
		 * 1. Nhập kiểu chuỗi nextLine()
		 *   +
		 * */ 
		//Mở 1 kết  nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter studen id(3 digit) : " );
		//int id = ip.nextInt(); Có 2 cách để xóa kí tự enter
		//ip.nextLine();C1: đưa nextLine vào
		int id  = Integer.parseInt(ip.nextLine());//C2: chuyển sang Integer.parseInt

		System.out.print("Enter fullname: " );
		String fullname = ip.nextLine();
		System.out.print("Enter phone: " );
		String phone = ip.nextLine();
		System.out.print("Enter yearOfBirth: " );
		int yearOrBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOrBirth;
		String info = id+fullname + "," + phone + "," + age;
		System.out.println("\nstuden info: " + info);
		//đóng kết nối
		ip.close();
	}
}
