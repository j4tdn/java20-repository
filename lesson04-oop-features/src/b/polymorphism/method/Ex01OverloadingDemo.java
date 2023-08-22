package b.polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(2, 3));
		System.out.println("sum3 --> " + sum(2, 3, 4));
		System.out.println("sum4 --> " + sum(new int[] {2, 3, 4, 5}));
		System.out.println("sum --> " + sum(1));
		System.out.println("sum --> " + sum(2, 3, 4, 5, 6, 7, 8));
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// multiple variables --> 0 to n variables separate by ',' || array
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
