package polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println("sum2 -->" + sum(2, 3));
		System.out.println("sum3 -->" + sum(2, 3, 4));
		System.out.println("sum0 -->" + sum());
		System.out.println("sumf -->" + sum(2.1f, 3.3f));
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private static float sum(float a, float b) {
		return a+b;
	}
	
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	// 
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
