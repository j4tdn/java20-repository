package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//1.Tạo ra 1 số nguyên ngẫu nhiên
		int inValueWithoutRestriction = rd.nextInt();
		
		//2.Tạo ra 1 số nguyên ngẫu nhiên [0 < n) =20
		//inclusive, exclusive
		int upperBourndValue = rd.nextInt(20);
		
		//3.Tạo ra 1 số nguyên ngẫu nhiên từ [a,b) -->a=5 ;b=20
		int boundValue  = rd.nextInt(5,20);
		System.out.println("inValueWithoutRestriction -->"+ inValueWithoutRestriction);
		System.out.println("upperBourndValue:  "+ upperBourndValue);
		System.out.println("boundValue: " + boundValue);
	}
}
