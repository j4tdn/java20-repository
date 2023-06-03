package view;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random  rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		long s = Ex03.calculFactorialNumber(a) + Ex03.calculFactorialNumber(b)
		+ Ex03.calculFactorialNumber(c) + Ex03.calculFactorialNumber(d);
		System.out.println(a + "! + "+ b + "! + " +
		c + "! + " + d + "! = " + s);
	}
	
}
