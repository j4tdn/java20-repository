package a.validate.trycatch_throw;

import java.util.Scanner;

public class Ex06BasicDemo_MultiException {
    private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		/**
		 * catch 1 luc nhieu Exceptopm
		 * yeu cau : 
		 *    cac exception khong co quan he cha con voi nhau
		 *    2. neu ton tai cac exception co quan he ccha con thi 
		 *    + de con truoc, cha sau(khuyen khic dung cach nay
		 *    + sw wxception cham 
		 *    
		 */
		
		try {
			int result = manualInputAndDivide();
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		
	    System.out.println("___Finished___");
		ip.close();
	}
	
	private static int manualInputAndDivide() {
		int a = manualInput("enter a:");
		int b = manualInput("enter b:");
		if (b == 0) {
			throw new ArithmeticException("denominator should not be zero");
		}
		return a / b;
	}
	
	private static int manualInput(String text) {
		System.out.println(text);
		return Integer.parseInt(ip.nextLine());
	}
}
