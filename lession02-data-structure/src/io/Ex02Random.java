package io;

import java. util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		Random rd = new Random();
		
		//1.Tạo ra 1 số nguyên ngẫu nhiên
		// -2 ^31 - (2^31)-1 --> Integer.MIN , Integer.MAX
		 
		int intValueWithoutRestriction = rd.nextInt();		
		//2.Tạo ra 1 số nguyên ngẫu nhiên [0 < n )  n =20
		//inclusive, exclusive
		int upperBoundValue = rd.nextInt(20); // --> min +rd.nextInt(max - min)
		
		
		//3.Tạo ra số nguyên ngẫu nhiên từ [a,b) --> a=5, b= 20 --> 5 + rd.nextInt(20-5)
		int boundValue = rd.nextInt(5, 20);
		System.out.println("intValueWithoutRestriction" + intValueWithoutRestriction);
		System.out.println("upperBoundValue" + upperBoundValue);
		System.out.println("boundValue "+ boundValue);
	}
}
