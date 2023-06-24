package b.polymorphism.method;

public class Ex01OverloadingDemo {
	public static void main(String[] args) {
		System.out.println("sum2--> " + sum(2, 4));
		System.out.println("sum3--> " + sum(2, 4, 3));
		System.out.println("sum4--> " + sum(new int[] {1,3, 4,5}));
		System.out.println("sum n--> " + sum(2,3,4,5,6,7,8));
		System.out.println("sum n--> " + sum(2));
		sum(2.0f, 2.4f);
	}
	
	private static int sum(int a, int b) {
		return a  + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a  + b + c;
	}
	//multiple variables --> 0 to n variable separate by ',' || array
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
	private static float sum(float a, float b) {
		return a  + b;
	}
}
