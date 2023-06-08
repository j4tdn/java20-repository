package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		a = a + 2;
		a -= 3;
		System.out.println("a --> " + a);
		
		// operator: ++, -- (prefix/suffix)
		// prefix: tăng/giảm giá trị rồi lấy giá trị đó đi xử lý
		// suffix: lấy giá trị hiện tại đi xử lý rồi mới tăng/giảm
		System.out.println("a1 --> " + ++a);
		System.out.println("a2 --> " + a++);
		int b = a-- + --a + ++a;
		System.out.println("b --> " + b);
		
		System.out.println("\n-------------------------\n");
		
		int x = 3;
		int y = 2;
		int z = 4;
		y -= ++z - --x + z-- + y + --z;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		System.out.println("\n-------------------------\n");
		
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (y % 3 == 0);
		System.out.println("isEven -> " + isEven);
		System.out.println("!isEven -> " + !isEven);
		System.out.println("isMultipleOf3 -> " + isMultipleOf3);
		System.out.println("!isMultipleOf3 -> " + !isMultipleOf3);
		
		System.out.println("\n-------------------------\n");
		
		// Toán từ &&, || dùng để code logic
		x = 2;
		y = 4;
		boolean isCorrect = (x++ > 2 && --y > 2);
		System.out.println("isCorrect --> " + isCorrect);
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		// Toán tử &, | dùng để AND, OR khi thao tác với bit
		
	}
}
