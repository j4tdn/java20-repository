package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	/**
	 * 1.Enter a year of birth --> calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		/*
		 * cách 2: xử lí exception với try catch đặt đoạn mã có k/n xảy ra exception xảy
		 * ra ngoại lệ vào khối try nếu đoạn mã trong khối try bị exception --> bắt
		 * exception đó trong khối catch --> code sẽ nhảy xuống khối catch và tiếp tục
		 * ctr
		 * 
		 * Nếu đoạn mã trong khối try ko bị exception --> code sẽ ko nhảy vào catch, chỉ
		 * tiếp tục ctr
		 * 
		 * Lưu ý: catch đúng exception bị quăng ra, hoặc exception cha của nó
		 * 
		 * Quy trình khi bị exception 1. Dòng code bị exception (vd
		 * NumberFormatException) --> java sẽ tạo 1 đối tượng (new
		 * NumberFormatException(default message)) 2. Nếu bắt lỗi với catch --> java sẽ
		 * gán đối tượng ở b1 cho biến trong khối catch
		 * 
		 * NumberFormatException nfe = new NumberFormatException(message)
		 * 
		 * NullPointerException
		 * 
		 */
		int yearOfBirth = 0;
		while (true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				// quăng thông tin lỗi cơ bản --> System.out.println("nfe --> " +
				// nfe.getMessage());
				nfe.printStackTrace();
				System.out.print("please enter a valid number: ");
			}
		}
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));

		ip.close();
	}

	/*
	 * Exception in thread "main" java.lang.NumberFormatException: For input string:
	 * "sdaf" at java.base/java.lang.NumberFormatException.forInputString(
	 * NumberFormatException.java:67) at
	 * java.base/java.lang.Integer.parseInt(Integer.java:668) at
	 * java.base/java.lang.Integer.parseInt(Integer.java:786) at
	 * view.Ex01BasicDemo.main(Ex01BasicDemo.java:15)
	 */
}
