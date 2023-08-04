package a.validate_trycatch_throw_throws;
import java.util.Scanner;

public class Ex06BasicDemo_MultiException {
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		/**
	
		catch 1 lucs nhieuef exception
		yêu cầu
		1. các exception ko có quan hệ cha con thì
		2. nếu tồn các exception có quan hệ cha con thì
			+ để con trước, cha sau ( khuyến khích dùng cách này)
			+ để exception cha, xoá exception con(không rõ ràng lỗi)
		*/
		
		
		try {
			int result = manualInputAndDivide();
			System.out.println("result --> " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
			
		}
		System.out.println("**__Finished__**");
		
		
		ip.close();
		
	}
	
	private static int manualInputAndDivide() {
		int a = manualInput("Enter a: ");
		int b = manualInput("Enter a: ");
		if (b == 0) {
			throw new ArithmeticException("denominator should not be zero");
		}
		return a / b;
		
	}
	private static int manualInput(String text) {
		System.out.print(text);
		return Integer.parseInt(ip.nextLine());
	}

}
