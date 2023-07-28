package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	/**
	 * 1. Enter a year of birth >> Calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your Year of Birth = ");
		
		/*
		 Cách 2: Xử lý exception với try catch
			Đặt đoạn mã có khả năng xảy ra ngoại lệ vào khối try
			Nếu đoạn mã trong khối try bị exception 
				--> bắt exception đó trong khối catch
				--> code sẽ nhảy xuống khối catch xong tiếp tục chương trình
				
			Nếu đoạn mã trong khối try không bị exception
				--> code sẽ ko nhảy vào khối catch, chỉ tiếp tục chương trình
				
			Lưu ý: catch đúng exception bị quăng ra, hoặc là exception cha của nó
		 
		 	Quy trình khi bị exception
		 	
		 	1. Dòng code bị exception(vd NumberFormatException)
		 		--> JAVA sẽ tạo ra 1 đối tượng (new NumberFormatException(default message))
		 	2. Nếu bắt lỗi với catch
		 		--> JAVA sẽ gán đối tượng ở bước 1 cho biến trong khối catch
		 */ 
		int yearOfBirth = 0;
		
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch(NumberFormatException nfe) {
				// quăng thông tin lỗi cơ bản System.out.println("nfe --> " + nfe.getMessage());
				nfe.printStackTrace();
				System.out.print("Please enter a valid number = ");
			}
		}
	
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));
		
		ip.close();
	}
	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:668)
		at java.base/java.lang.Integer.parseInt(Integer.java:786)
		at view.Ex01BasicDemo.main(Ex01BasicDemo.java:14)
	 */
}
