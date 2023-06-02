package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//1. tạo số nguyên ngẫu nhiên
		int intValueWithoutRestriction = rd.nextInt();
		
		//2. tạo ra số nguyên ngẫu nhiên nhỏ hơn n(n=20)
		//inclusive, exclusive
		int upperBoundValue = rd.nextInt(20);
		
		//3. tạo ra một số nguyên ngẫu nhiên từ a-->b
		int boundValue = rd.nextInt(5, 10);
		System.out.println("intValueWithoutRestriction: "+intValueWithoutRestriction);
		System.out.println("upperBoundValue: "+ upperBoundValue);
		System.out.println("bound Value: " + boundValue);
	}
}
