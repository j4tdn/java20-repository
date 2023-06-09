package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		//JAVA pass(es) by value [AT STACK]
		int a = 5;
		int b = 7;
		
		modify(a);
		modify(b);
		
		swap(a, b);
		System.out.println(
			  "a --> " + a
			+ "\nb --> " + b
		);
		
	}
	
	private static void modify(int a) {
		a = 9999;
	}
	
	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}