package b.polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println("sum2 --> " + sum(2, 3));
		System.out.println("sum3 --> " + sum(2, 3, 4));
		System.out.println("sum4 --> " + sum(new int[] { 2, 3, 4, 5 }));
		System.out.println("sum1 --> " + sum(2));
		System.out.println("sum_mang --> " + sum(2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("----------------------------------------------");
		Ex02Parent p1 = new Ex02Parent();
		System.out.println("P1 digit --> " + p1.digit);
		System.out.println("P1 text --> " + p1.text);
		p1.log();
		
		System.out.println("----------------------------------------------");
		Ex02Child c1 = new Ex02Child();
		c1.log_test();
		System.out.println("C1 digit --> " + c1.digit);
		System.out.println("C1 text --> " + c1.text);
		c1.log();
		
		System.out.println("----------------------------------------------");
		Ex02Parent pc1 = new Ex02Child();
		System.out.println("PC1 digit --> " + pc1.digit);
		System.out.println("PC1 text --> " + pc1.text);
		pc1.log();
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

	// multiple variables --> 0 to n variables separate by ',' or array
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
}
