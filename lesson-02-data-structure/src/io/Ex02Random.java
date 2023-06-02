package io;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		Random  rd = new Random();
		
		//1. tạo ra 1 số nguyên ngẫu nhiên
		// -2^31 - (2^31)-1 --> Integer.Min, Integer.Mã
		int inValueWithoutRestriction = rd.nextInt();
		
		// 2. tạo ra 1 số nguyên ngẫu nhiên [0, n) n = 20
		//inclusive, exclusive
		int upperBoundValue = rd.nextInt(20);
		
		//tạo ra 1 số nguyên ngẫu nhiên từ [a, b)
		int boundValue = rd.nextInt(5, 10);
		
		System.out.println("inValueWithoutRestriction --> " + inValueWithoutRestriction);
		System.out.println("upperBoundValue --> " + upperBoundValue);
		System.out.println("boundValue --> " + boundValue);
		

	}

}
