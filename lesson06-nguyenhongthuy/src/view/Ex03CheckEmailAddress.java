package view;
import java.util.Scanner;

import functional.EmailAddressException;

/**
 * Viết chương trình cho phép nhập địa chỉ email từ bàn phím. Kiểm tra email nếu không
 * hợp lệ thì thông báo lỗi vào yêu cầu nhập lại cho đến khi hợp lệ và in ra. Thông tin định dạng
 * email hợp lệ mô tả như sau:
 * 
 *
 */
public class Ex03CheckEmailAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		while(true) {
			System.out.print("Enter a email address: ");
			try {
				email = sc.nextLine();
				System.out.println("Email address '" + email + "' " + isEmailAddress(email));
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Please enter again !!!");
			}
		}
		
		sc.close();
	}
	
	private static boolean isEmailAddress(String input) throws EmailAddressException {
		if(!input.matches("^[a-zA-Z]+\\d+[\\._-]?[a-zA-Z0-9]+@[a-z]+\\.[a-z]+$")) {
			throw new EmailAddressException(input);
		}
		return true;
	}
}
