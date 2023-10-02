package a.available_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth >> Calculate age of candidate
 */
public class Ex02BasicDemo_TryCatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Year of Birth = ");
		
		//Cách 2: Xử lý exception với try catch
		//Đặt đoạn mã có khả năng xảy ra ngoại lệ vào khối try (thử)
		//Nếu đoạn mã trong khối try bị exception --> Bắt exception đó trong khối catch
		//										  --> Code sẽ nhảy xuống khối catch xong tiếp tục chương trình
		
		//Nếu đoạn mã trong khối try không bị exception --> code sẽ ko nhảy vào khối catch, tiếp tục chương trình
		// **Lưu ý: catch đúng exception bị quăng ra, hoặc là exception cha của nó
		
		
		/*
		 * Quy trình khi bị exception (vd NumberFommatException)
		 * 
		 * 1. Dòng code bị exception (vd NumberFommatException)
		 * --> Java sẽ tạo ra 1 object (new NumberFommatException (default message)
		 * 
		 * 2. Nếu bắt lỗi với catch
		 * --> Java sẽ án đối tượng ở bước 1 cho biến trong khối catch
		 * 
		 */
		int yearOfBirth = 0;
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(sc.nextLine());
				break;
			}catch (NumberFormatException nfe) {
				//Quăng thông tin lỗi cơ bản
				//System.out.println("nfe --> " + nfe.getMessage());
				nfe.printStackTrace();
				System.out.print("Please enter a value number = ");
			}
		}
		
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth));
		
		sc.close();
	}
}
