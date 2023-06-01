package io;

import java.time.YearMonth;
import java.util.Scanner;

public class Ex01IoDemo {
    public static void main(String[] args) {
		/*
		 *  viết chương trình nhập vào
		 *  + Họ tên
		 *  + sỐ điện thoại
		 *  + năm sinh
		 *  
		 *   --> sau đó in ra thông tin họ tên, số điện thoại, tuổi
		 *  
		 */
    	
    	Scanner ip = new Scanner(System.in);
    	
    	 System.out.println("Enter student id (3digits): ");
    	 int id = ip.nextInt();
    	 //ip.nextLine(); sửa lỗi k nhập xuống hàng
    			 
    	 System.out.print("Enter fullname: ");
    	 String fullname = ip.nextLine();
    	 
    	 System.out.print("Enter phone: "); 
    	 String phone = ip.nextLine();
    	 
    	 System.out.print("Enter yearOrBirth: ");
    	 int yearOrBirth = ip.nextInt();
    	 
    	 int currentYear = YearMonth.now().getYear();
    	 int age = currentYear - yearOrBirth;
    	 
   
    	 
    	 String ifno = id + fullname + ", " + phone + " , "  + age ;
    	 
    	 System.out.println("\n --> student info: \n" );
    	// đóng kết nối
    	ip.close();
	}
}
