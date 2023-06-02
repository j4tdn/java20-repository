package exercises;

public class Ex03FindFactorialOfN {
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int x = Ex01IsMultiplierOf2.inputN();
		if (x > 0) {
			System.out.println(x + "! = " + factorial(x));
		}
	}
}
