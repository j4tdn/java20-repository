package c5.strategypattern;

public class Ex01Calculator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;

		System.out.println("sum --> " + sum(a, b));
		System.out.println("sum strategy --> " + calc(a, b, new Strategy() {

			@Override
			public int process(int x, int y) {
				return x + y;
			}

		}));

		System.out.println("sub --> " + sub(a, b));
		System.out.println("sub strategy --> " + calc(a, b, new Strategy() {

			@Override
			public int process(int x, int y) {
				return x - y;
			}

		}));

		System.out.println("mul --> " + mul(a, b));
		Strategy mulStrategy = (int x, int y) -> {
			return x * y;
		};
		System.out.println("mul strategy --> " + calc(a, b, mulStrategy));

		System.out.println("div --> " + div(a, b));
		// Strategy divStrategy = (x, y) -> x / y;
		System.out.println("div strategy --> " + calc(a, b, (x, y) -> x / y));
		
	}

	private static int calc(int a, int b, Strategy strategy) {
		return strategy.process(a, b);
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

}
