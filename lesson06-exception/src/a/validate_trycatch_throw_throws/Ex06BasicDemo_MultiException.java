package a.validate_trycatch_throw_throws;

import java.util.Scanner;

public class Ex06BasicDemo_MultiException {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		//catch 1 luc nhieu exception
		//yeu cau: 1. cac exception ko co quan he cha con voi nhau
		// neu ton tai cac exception ton tai moi quan he cha con thi 
		// + de con trc cha sau (nen dung cach nay)
		// + de exception cha, xoa exception con(ko ro rang loi)
		
		try {
			int result = manulInputAndDivide();
			System.out.println("result: " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("finish");
		ip.close();
	}
	//numberFormatException
	//ArithmeticException
	private static int manulInputAndDivide() {
		int a = manualInput("Enter a:");
		int b = manualInput("Enter b:");
	
		
		if(b ==0) {
			throw new ArithmeticException("denominator should not be zero");
		}
		return a / b;
	}

	private static int manualInput(String text) {
		System.out.print(text);
		return Integer.parseInt(ip.nextLine());
	}
}
