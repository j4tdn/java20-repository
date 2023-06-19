package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println("sum 2 --> " + sum(2, 3));
		System.out.println("sum 3 --> " + sum(2, 3, 4));
		System.out.println("sum 4 --> " + sum(new int[] { 1, 2, 3, 4 }));
		System.out.println("sum 4 --> " + sum(1, 2, 3, 4, 5, 6, 7));
		System.out.println("sum 1 --> " + sum(2));

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

	// multiple variables --> passing 0 to n variables separate by ',' || array
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
}
