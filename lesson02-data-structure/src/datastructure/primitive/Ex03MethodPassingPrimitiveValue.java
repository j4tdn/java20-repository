package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		modify(a);
		modify(b);
		
		// a--> 7
		// b -->5
		swap(a, b);
		
		System.out.println(
				"a --> " + a
				+ "\nb --> " + b
				);
	}
	
	private static void modify (int a) {
		a = 9999;
	}
	
	private static void swap (int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
