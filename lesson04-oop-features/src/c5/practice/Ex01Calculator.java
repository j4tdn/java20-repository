package c5.practice;

public class Ex01Calculator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		System.out.println("sum --> " + sum(a, b));
		
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int sub(int a, int b) {
		return a - b;
	}
	private static int mul(int a, int b) {
		return a * b;
	}
	private static int div(int a, int b) {
		return a / b;
	}
	
	private static int calc(int a, int b, Strategy strategy) {
		return strategy.process(a, b);
	}

}
