package exercises;

public class Ex02IsPowerOf2 {
	public static boolean isPowerOfTwo(int n){
		if( 0 == n|| 1 == n ) return true;
		int x = n / 2;
		int y = n%2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
	}

	public static void main(String[] args) {
		int n = Ex01IsMultiplierOf2.inputN();
		if (isPowerOfTwo(n)) {
			System.out.println(n + " là lũy thừa của 2!");
		} else {
			System.out.println(n + " không là lũy thừa của 2!");
		}
	}
}
