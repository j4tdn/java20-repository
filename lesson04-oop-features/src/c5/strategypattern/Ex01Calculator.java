package c5.strategypattern;

public class Ex01Calculator implements Strategy{
	public static void main(String[] args) {
		System.out.println("sum strategy: --> " + cals(5, 5, (x , y) -> x + y));
	}
	private static int cals(int a, int b, Strategy strategy) {
		return strategy.process(a,b);
	}
	@Override
	public int process(int a, int b) {
		return 0;
	}
	
}
