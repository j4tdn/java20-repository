package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//Random 1 so nguyen ngau nhien, kiem tra so do co phai la so le k
		Random rd = new Random();
		int n = rd.nextInt(5, 18);
		
		System.out.println("n--> " +n);
		boolean isOdd = (n % 2 != 0);
		
		if (isOdd) {
			System.out.println(n + " is an odd number !!!");
		}
		else {
			System.out.println(n + " is an even number !!!");
		}
		
	}

}
