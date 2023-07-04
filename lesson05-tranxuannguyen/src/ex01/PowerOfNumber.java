package ex01;

public class PowerOfNumber {
	public static void main(String[] args) {
		 int a = 6;
	     int b = 2;
	     int temp;
		if (a < b ) {
			temp = a;
			a = b;
			b = temp;
		}
	     if (isPowerOf(a, b)) {
	            System.out.println(a + " is a power of " + b);
	     } else {
	            System.out.println(a + " is not a power of " + b);
	     }
	}
	public static boolean isPowerOf(int a, int b) {
		if (a == 0 || b == 0) {
            return false;
        }
		if (a == 1 || b == 1) {
			return true;
		}
		
        while (a % b == 0) {
            a /= b;
        }
        return a == 1;
	}
}

