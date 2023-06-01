package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// random 1 số ngẫu nhiên, check
		// số đó is odd?

		Random rd = new Random();
		int n = rd.nextInt(5, 18);

		System.out.println("n --> " + n);

		boolean isOdd = (n % 2 != 0);

		if (isOdd) {
			System.out.println(n + " ís an odd number !!!");
		} else
			System.out.println(n + " is an even number !!!");
		
		// biểu thức 3 ngôi
		// dùng khi thực hiên if else ngắn(1 dòng)
	}
}
