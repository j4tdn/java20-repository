package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		// 1. Tạo ra một số nguyên ngẫu nhiên
		// -2^31 - (2 ^ 31)-1 --> Integer.MIN_VALUE, Integer.MAX_VALUE
		int q1 = Integer.MIN_VALUE;
		int q2 = Integer.MAX_VALUE;
		int intValueWithoutRestriction = rd.nextInt();
		
		// 2. Tạo ra 1 số nguyên ngẫu nhiên [0 , n) n = 20
		// inclusive, exclusive
		int upperBoundValue = rd.nextInt(20);
		
		// 3. Tạo ra 1 số nguyên ngẫu nhiên từ [a, b) --> a=5, b=20 
		int upperBoundValue2 = rd.nextInt(5, 10);
		
		System.out.println("intValueWithoutRestriction --> " + intValueWithoutRestriction);
		System.out.println("upper BoundValue --> " + upperBoundValue);
		System.out.println("upper BoundValue2 --> " + upperBoundValue2);
	}
}
