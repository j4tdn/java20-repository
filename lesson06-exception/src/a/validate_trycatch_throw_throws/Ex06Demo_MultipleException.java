package a.validate_trycatch_throw_throws;

import java.util.Scanner;

public class Ex06Demo_MultipleException {

	private static Scanner sc = new Scanner(System.in);

	/* 
	 catch 1 lúc nhiều exception
	 yêu cầu
	 1. các exception ko có quan hệ cha con với nhau
	 2. nếu tồn các các exception có quan hệ cha con thì
	    + để con trước, cha sau(khuyến khích dùng cách này)
	    + để exception cha, xóa exception con(không rõ ràng lỗi)
	*/
	
	public static void main(String[] args) {

		try {
			int result = manualInputAndDivide();
			System.out.println("Result --> " + result);
			
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("!(@E(@!K");
		sc.close();
	}

	
	//NumberFormat || Arithmetics
	
	private static int manualInputAndDivide() {
		int a = manualInput("Enter a: ");
		int b = manualInput("Enter b: ");

		if (b == 0) {
			throw new ArithmeticException("Demonitor can not be zero");
		}
		return a / b;
	}

	private static int manualInput(String string) {
		System.out.println(string);
		return Integer.parseInt(sc.nextLine());
	}
}
