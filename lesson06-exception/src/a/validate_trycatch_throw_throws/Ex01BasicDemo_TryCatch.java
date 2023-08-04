package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_TryCatch {

	/*
	 * 1.
	 */

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter your Year of Birth = ");
		
		// cách 2: xử lý exception với try catch
		// đặt đoạn mã có khả năng xảy ra ngoại lệ vào khối try(thử)
		// nếu đoạn mã trong khối try bị exception
		//	--> bắt exception đó trong khối catch
		//	--> code sẽ nhảy xuống khối catch xong tiếp tục chương trình
		
		// nếu đoạn mã trong khối try không bị exception
		// --> code sẽ không nhảy vào khối catch, chỉ tiếp tục trương trình
		
		// lưu ý: catch đúng exception bị quăng ra, hoặc là exception cha của nó
		
		int yearOfBirth = 0;
		
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch(NumberFormatException nfe) {
				// quăng thông tin lỗi
				System.out.println("nfe --> " + nfe.getMessage());
				nfe.printStackTrace();
				System.out.println("Please enter your Year of Birth = ");

			}
		}
		


		System.out.println("AGE--> " + (Year.now().getValue() - yearOfBirth + 1));
	}
}
