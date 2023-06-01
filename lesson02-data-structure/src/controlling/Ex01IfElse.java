package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên (5, 18), kiểm tra số đó có phải là số lẻ không
		Random rd = new Random();
		int n = rd.nextInt(5, 18);
		System.out.println("n --> " + n);
		boolean isOdd = (n % 2 != 0);
		if (isOdd)
			System.out.println(n + " is a odd number !!!");
		else 
			System.out.println(n + " is a even number !!!");
	}
}
