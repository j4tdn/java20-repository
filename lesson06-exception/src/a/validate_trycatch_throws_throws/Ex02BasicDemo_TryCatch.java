package a.validate_trycatch_throws_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	/*
	 * 1. Enter a year of birth >> Calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter your Year of Birth = ");
		
		int yearOfBirth = 0;
		
		/* Cách 2: Xử lý exception với try catch
		   Đặt đoạn mã có khả năng xảy ra ngoại lệ vào khối try
		   Nếu đoạn mã trong khối try bị exception --> bắt exception trong khối catch
		   										   --> code sẽ nhảy xuống khối catch xong tiếp tục chương trình
		   										   
		   Nếu đoạn mã trong khối try không bị exception
		      --> code sẽ ko nhảy vào khối catch, chỉ tiếp tục chương trình
		      
		   Lưu ý: catch ddúng exception bị quăng ra, hoặc là exception cha của nó.
		   
		   2. Nếu bắt lỗi với catch
		   --> Java sẽ gán đối tượng ở bước 1 cho biến trong khối catch
		   
		   NumberFormatException nfe = new NumberFormatException(message);
		   IllegalArgumentException
		   
		   NullPointerException
		*/
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());			
				break;
			} catch(NumberFormatException nfe) {
				// quăng thông tin lỗi
				nfe.printStackTrace();
				System.out.println("Please enter a valid number: ");
			}
		}
		
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));

		ip.close();
	}

}
