package io;

import java.awt.GradientPaint;
import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào
		 * + Họ tên
		 * + Số Điện Thoại
		 * + Năm sinh
		 * 
		 * --> In ra thông tin Họ tên, Số Điện Thoại, Tuổi
		 * 
		 * Hiện tượng trôi lệnh
		 * Xảy ra khi nhập xuất !nextLine trước nextLine
		 * --> !nextLine --> enter(chứa kí tự enter trong memory)
		 * -->  nextLine(đang có enter) --> lưu rỗng vào nextLine
		 * 
		 * 1. Nhập kiểu chuỗi nextLine()
		 *    + Khi dùng nextLine, dừng lại màn hình
		 *    + Người dùng có nhập --> nhấn enter --> lưu giá trị đó vào nextLine
		 *    +            không   --> nhấn enter --> lưu giá trị rỗng vào nextLine
		 * 
		 * 2. Nhập không phải chuỗi nextInt, nextBoolean, nextFloat ...
		 *    + Khi dùng !nextLine, dừng lại màn hình
		 *    + Người dùng có nhập --> nhấn enter --> lưu giá trị đó vào !nextLine
		 *    +            không   --> nhấn enter --> không có chuyện gì xảy ra
		 *                                        --> yêu cầu ng/dùng phải nhập gì đó
		 *                                        --> nhấn enter --> kết thúc việc nhập
		 *    + Người dùng nhập gì đó ...xyz... nhấn enter
		 *      --> lấy giá trị ...xyz... lưu vào !nextLine
		 *      --> jvm, memory đang xửu lý vẫn đang lưu, chứa kí tự enter vừa nhấn
		 */
		// mở kết nối đến bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter student id(3 digits): ");
		// int id = ip.nextInt(); // ET
		// ip.nextLine();
		int id = Integer.parseInt(ip.nextLine()); // require ip.nextLine() dãy số
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter phone: ");
		String phone = ip.nextLine();
		
		System.out.print("Enter yearOrBirth: ");
		int yearOrBirth = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOrBirth;
		
		System.out.print("Year Of graduation: ");
		int yearOrGraduate = ip.nextInt();
		
		String info = id
					+ fullname + ", " 
					+ phone    + ", " 
					+ age      + ", "
					+ yearOrGraduate;
		System.out.println("\n--> student info: " + info);
		
		// đóng kết nối
		ip.close();
	}
}
