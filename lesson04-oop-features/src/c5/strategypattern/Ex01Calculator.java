package c5.strategypattern;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b =2;
//		Strategy sumstr = (x,y)->x+y;
		System.out.println("sum= "+ calc(a,b,(x,y)->x +y));
	}
	private static int calc(int a, int b , Strategy strategy) {
		return strategy.process(a, b);
	}
}
