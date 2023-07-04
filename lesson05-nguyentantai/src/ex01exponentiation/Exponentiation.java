package ex01exponentiation;

public class Exponentiation {
	public static boolean isPowerOf(int n, int a) {
		if (n == 1 || a == 1) {
			return true;
		}
		
		if (n < a) {
			int t = n;
			n = a;
			a = t;
		}
		
		int c = 1;
		while (c < n) {
			c *= a;
		}
		return c == n;
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}
}
