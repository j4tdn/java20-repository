package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào 
		 * 		+ Họ tên
		 * 		+ SĐT
		 * 		+ Năm sinh
		 * -> In ra thông tin Họ tên, SĐT, Tuổi
		 * 
		 * Hiện tượng trôi lệnh: Xảy ra khi nhập xuất !nextLine trước nextLine
		 * 	1) Nhập kiểu chuỗi nextLine()
		 * 		_ Khi dùng nextLine(), dừng lại màn hình
		 * 		_ Người dùng có nhập -> Nhấn Enter -> Lưu giá trị đó vào nextLine
		 * 				     không nhập -> Nhấn Enter -> Lưu giá trị rỗng vào nextLine
		 * 	2) Nhập không phải chuỗi
		 * 		_ Khi dùng !nextLine(), dừng lại màn hình
		 * 		_ Người dùng có nhập -> Nhấn Enter -> Lưu giá trị đó vào !nextLine (thừa ra 1 kí tự Enter)
		 * 				     không nhập -> Nhấn Enter -> Không có chuyện gì xảy ra -> Yêu cầu user phải nhập gì đó -> Nhấn Enter -> Kết thúc việc nhập
		 */
		
		// Mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter student id(3 digits): ");
		int id = Integer.parseInt(ip.nextLine());
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();
		System.out.print("Enter yearOfBirth: ");
		int yearOfBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		
		System.out.print("Year of graduation: ");
		int yearOfGraduate = ip.nextInt();
		
		String info = id + ", " + fullname + ", " + phone + ", " + age + ", " + yearOfGraduate;
		System.out.println("\nstudent info: " + info);
		
		// Đóng kết nối
		ip.close();
	}
}
