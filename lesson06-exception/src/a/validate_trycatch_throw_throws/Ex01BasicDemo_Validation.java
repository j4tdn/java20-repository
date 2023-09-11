package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {
	
	/*
	 * Tính năm sinh*/
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your year of Birth = ");
		//Cách 1: Xử lý vưới exception calidation(tiền xử lý)
		
		String text  = ip.nextLine();
		
		//validate cho text là dãy số hợp lệ rồi mới gọi hàm parseInt
		
		while(!text.matches("\\d+")) {
			System.out.println("Please enter a number = ");
			text  = ip.nextLine();
		}
		
		int yearOfBirth  = Integer.parseInt(ip.nextLine());
		
		System.out.println("Age--> "+ (Year.now().getValue() - yearOfBirth +1));
		ip.close();
	}
}
