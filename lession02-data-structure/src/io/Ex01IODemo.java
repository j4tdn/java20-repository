package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IODemo {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhâp vào 
		 * + Họ tên 
		 * + Số điện thoại
		 * + Năm sinh
		 * 
		 * --> In ra thông tin Họ tên, Số điện thoại, Tuổi
		 */
		
		//Mở kết nối đến với bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter student iD: ");
		int iD = ip.nextInt();
		ip.nextLine();//
		//int id = Integer.parseInt(ip.nextLine());
		System.out.print("Enter fullName: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter phoneNumber: ");
		String phoneNumber = ip.nextLine();
		
		System.out.print("Enter yearOfBirth: ");
		int yearOfBirth = ip.nextInt();
		
		System.out.print("Enter Year Of graduation: ");
		int yearOfGradution = ip.nextInt();
		
		int currentYear = YearMonth.now().getYear();
		int age = currentYear - yearOfBirth;
		String info =iD +", " + fullname + ", "+ phoneNumber + ", " + age + ", "+yearOfGradution;
		System.out.println("\n --> student info: "+ info);
		
		//Đóng kết nối
		ip.close();
		
	
		
		
	}
}
