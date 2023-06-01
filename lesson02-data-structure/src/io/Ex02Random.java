package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//1. Random a random number
		int intValueWithoutRestriction = rd.nextInt();
		System.out.println(intValueWithoutRestriction);
		
		//2. Random a random number [0,n), n = 20
		//Inclusive, exclusive
		int upperBoundValue = rd.nextInt(20);
		System.out.println(upperBoundValue);
		
		//3. Random a random number in bound [a,b)
		int boundValue = rd.nextInt(5, 20);
		System.out.println(boundValue);
	}
}
