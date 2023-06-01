package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		// 1. tạo số nguyên ngẫu nhiên
		int intValueWithoutRestriction = rd.nextInt();
		
		// 2. tạo ra 1 số nguyên ngẫu nhiên < n(20)
		// inclusive, exclusive
		int upperBoundValue = rd.nextInt(20); 
		
		// 3. tạo ra 1 số ngẫu từ a - b;
		int boundValue = rd.nextInt(5, 20);
		
		System.out.println("intValueWithoutRestriction --> " + intValueWithoutRestriction);
		System.out.println("upperBoundValue --> " + upperBoundValue);
		System.out.println("boundValue --> " + boundValue);
	}
	
	
}
