package b.polymorphism.method;

public class Ex01OverLoadingDemo {
	
	public static void main(String[] args) {
		System.out.println("sum2-->"+ sum(new int[] {2,3}));
		System.out.println("sum2-->"+ sum(2));
		EX02Parent pc1 = new Ex02Child();
		System.out.println("digit -->" +pc1.digit);
		System.out.println("digit -->" +pc1.text);
		pc1.log();
	}
	
	private static int sum(int a ,int b) {
		return a+b;
	}
	
	private static int sum(int a ,int b,int c) {
		return a+b+c;
	}
	//multiple variables --> 0 to n variable separate by ',' || array
	private static int sum(int...numbers ) {
		int sum=0;
		for(int number:numbers)
		{
			sum +=number;
		}
		return sum;
	}
	
}
