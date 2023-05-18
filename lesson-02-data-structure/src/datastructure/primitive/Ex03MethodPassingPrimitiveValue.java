package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		modify(a);
		modify(b);
		
		swap(a, b);
		
		System.out.println(
				"a1 --> " + a
				+ "\nb1 --> " + b
				);
		
	}
	
	private static void modify(int a) {
		a = 9999;
	}
	
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}

}
