package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//Random 1 so nguyen ngau nhien(5,18), kiem tra so do co phai la so le khong
		Random rd = new Random();
		int number = rd.nextInt(5, 18);
		System.out.println("number: " + number);
		boolean isOdd = (number % 2 != 0);
		
		
		if (isOdd) {
			System.out.println(number + " is an odd number");
		}else {
			System.out.println(number + " is an event number");
		}
		
		//khi nao dung toan tu 3 ngoi
		//khi bieu thuc thuc hien trong if/else ngan(thuong la 1 dong)
		
		String text = isOdd ? number + " is an odd number" : number + " is an event number";
		System.out.println(text);
		
		
	}
}
