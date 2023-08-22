 package a.validate_trycatch_throws_throws;

import java.util.Scanner;

public class Ex06BasicDemo_MultiException {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * Catch 1 lúc nhiều exception
		 * yêu cầu
		 * 1. Các exception ko có quan hệ cha con với nhau
		 * 2. Nếu tồn tại các exception có quan hệ cha con thì
		 *    + để con trước, cha sau(khuyến khích dùng cách này)
		 *    + để exception cha, xóa exception con(Không rõ ràng lỗi)
		 */
		
		try {
			int result = manualInputAndDivide();			
			System.out.println("result --> " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("**__ Finished __**");
		ip.close();
	}

	private static int manualInputAndDivide() {
		int a = manualInput("Enter a: ");
		int b = manualInput("Enter b: ");
	
		if(b == 0) {
			throw new ArithmeticException("denominator should not be zero");
		}
		return a / b;
	}

	private static int manualInput(String text) {
		System.out.println(text);
		return Integer.parseInt(ip.nextLine());
	}
}
