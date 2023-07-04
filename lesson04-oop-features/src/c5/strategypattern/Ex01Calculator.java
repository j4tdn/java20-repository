package c5.strategypattern;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println("Sum --> " + sum(a, b));
		// anonymous class to create an instance for interface
		System.out.println("Sum strategy --> " + calc(a, b, new Strategy() {

			@Override
			public int process(int x, int y) {
				return x + y;
			}
		}));

		System.out.println("Sub --> " + sub(a, b));
		System.out.println("Sub strategy --> " + calc(a, b, (x,y) -> x - y));
		
		System.out.println("Mul --> " + mul(a, b));
		// anonymous class to create an instance for interface
		// from JDK 1.8
		// Using "anonymous function" to create an instance for functional interface
		// Functional Interface is interface has only ONE abstract method
		// Anonymous function is function without name to override abstract method of
		// functional interface
		// Anonymous function --> lambda expression

//		Strategy strategy = new Strategy() {
//			
//			@Override
//			public int process(int x, int y) {
//				return x + y;
//			}
//		};
//		System.out.println("Mul --> " + calc(a, b, strategy));
		Strategy mulStrategy = (int x,int y) -> {
			return x * y;
		};
		// Strategy divStrategy = (x, y) -> x * y;
		
		System.out.println("Mul strategy --> " + calc(a, b, mulStrategy));
		
		
		System.out.println("Div --> " + div(a, b));
		System.out.println("Div strategy --> " + calc(a, b, (x, y) -> x / y));
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
