package b.polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {

		System.out.println("sum2 --> " + sum(2, 3));
		System.out.println("sum2 --> " + sum(2, 3, 4));

		System.out.println("sum2 --> " + sum(new int[] { 2, 3, 4, 5 }));
		System.out.println("sum2 --> " + sum(new int[] { 2, 3 }));
		System.out.println("sum --> " + sum(2, 3, 4, 5, 6, 6, 4, 3, 32));

	}

	private static int sum(int a, int b) {
		return a + b;
	}
	private static float sum(float a, float b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	// multiple variables --> 1 to n variable separate by ',' || array
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
