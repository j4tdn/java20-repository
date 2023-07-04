package view;


public class Ex01IsPowerOf {
	public static void main(String[] args) {
		System.out.println("isPowerOf (8, 2) ==> " + isPowerOf(8, 2));
		System.out.println("isPowerOf (2, 8) ==> " + isPowerOf(2, 8));
		System.out.println("isPowerOf (6, 2) ==> " + isPowerOf(6, 2));
		System.out.println("isPowerOf (20, 4) ==> " + isPowerOf(20, 4));
		System.out.println("isPowerOf (64, 4) ==> " + isPowerOf(64, 4));
	}

	public static boolean isPowerOf(int a, int b) {
		if(b > a)
			return isPowerOf(b, a);
		
		int tmp = b;
		while (a > b) {
			b *= tmp;
		}
		if (a == b)
			return true;
		return false;
	}
}

