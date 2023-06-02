

import java.util.Scanner;

/*
 * Viết chương trình tìm giai thừa của một số nguyên dương N
 * Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
 */
public class Ex03GetFactorial {
	public static long getFactorial(int n) {
		if (n == 1)
			return 1;
		else
			return n*getFactorial(n-1);
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println("\nn --> " + n);
		long result = getFactorial(n);
		System.out.println("n! = " + n + "! = " + result);
	}
}
