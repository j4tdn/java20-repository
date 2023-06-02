package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2;
		
		a -= 3;
		
		System.out.println("a --> " +a);
		
		//operator: ++ -- --> prefix, suffix
		// int b = a++; // --> b = 4;
		
		//int b = a++;		
		System.out.println(a);
		
		int x = 3;
		int y = 2;
		int z = 4;
		y -= ++z - --x + z-- +y + --z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (y % 3 == 0);
		
		
		System.out.println("isEvent --> " + isEven);
		System.out.println("! isEvent --> " + !isEven);
		
		System.out.println("isMultipleOf3 --> " + isMultipleOf3);
		System.out.println("! isMultipleOf3 --> " + !isMultipleOf3);
		
		
		
	}

}
