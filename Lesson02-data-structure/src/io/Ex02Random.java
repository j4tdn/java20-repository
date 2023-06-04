package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//tạo ra 1 số nguyên ngẫu nhiên

		int intValueWithoutRestriction = rd.nextInt();
		
		//tao ra so nguyen ngau nhien nho hon [0 < n);
		//inclusive(bao gom), exclusive(ko gom)
		int upperBoundValue = rd.nextInt(20);
		
		
		//tao ra 1 so nguyen ngau nhien tu [a,b);
		int boundValue = rd.nextInt(5, 20);
		
		System.out.println("number random: " + intValueWithoutRestriction);
		System.out.println("UpperBoundValue: " + upperBoundValue);
		System.out.println("Bound Value: " + boundValue);
	}
}
