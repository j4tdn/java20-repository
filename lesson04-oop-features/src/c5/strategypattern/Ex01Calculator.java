package c5.strategypattern;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		System.out.println("sum --> " + sum(a,b));
		System.out.println("sum strategy --> " + calc(a, b, new Strategy() {
			
			@Override
			public int process(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		}));
		
		System.out.println("sub --> " + sub(a,b));
		// anonymous to create an instance for interface
		System.out.println("sub strategy --> " + calc(a, b , new Strategy() {
			
			@Override
			public int process(int x, int y) {
				// TODO Auto-generated method stub
				return x - y;
			}
		}));
		// from JDK 1.8
		// --> using 'anonymous function' to create an instance for 'functional' interface
		// functional interface is interface has ONE abstract method
		// 'anonymous function' is function without name to override abstract method of functional interface
		
		// 'anonymous function' --> lambda expression
		Strategy mulStrategy = (int x, int y) -> {
			return x * y;
		};
		
		System.out.println("mul --> " + mul(a,b));
		System.out.println("mul strategy --> " + calc(a, b, mulStrategy));
		
		System.out.println("div --> " + div(a,b));
		Strategy divStrategy = (x, y) -> x / y;
		System.out.println("div strategy --> " + calc(a,b, (x,y) -> x/y));
	}
	
	// a + b
	// a - b
	// a * b
	// a / b
	// strategy: int process(a, b)
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
