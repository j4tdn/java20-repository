package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		a = a + 2;
		a -= 3;
		System.out.println("a --> " + a);
		
		// operator: ++, -- (prefix/suffix)
		int b = a++;
		System.out.println("b --> " + b);
		int x = 2;
		b = 9;
		
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (b % 3 == 0);
		System.out.println("isEven -> " + isEven);
		System.out.println("isMultipleOf3 -> " + isMultipleOf3);
		
		x = 2;
		int y =4;
		
	}
}
