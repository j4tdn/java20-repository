package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		int val = 99;
		
		a = val;
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a --> " + a + "\nb --> " + b + "\nval --> " + val);
	}
}
