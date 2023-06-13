package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2; // 7
		
		a -= 3; // 4
		
		System.out.println("a --> " + a);
		
		// operator: ++ -- --> prefix, suffix
		// int b = a++; // -->  b = 4
		// Biểu thức: ++ = -- /= *= () --> thứ tự ưu tiên
		
		// ++ --
		// prefix: tăng/giảm vào giá trị rồi dùng giá trị tăng/giảm đi xử lý
		// suffix: dùng giá trị hiện tại đi xử lý sau đó mới tăng/giảm
		
		System.out.println("a1 --> " + (++a)); // a1 -> 5
		System.out.println("a2 --> " + (a++)); // a2 -> 5
		// a = 6
		int b = a-- + --a + ++a;
		System.out.println("b --> " + b); // 11 12 18 '15' 13
		
		int x = 3; // 2   3
		int y = 2; // 19 -9
		int z = 4; // 3   4
		
		y -= ++z - --x + z-- + y + --z;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (y % 3 == 0);
		
		System.out.println("isEven -> " + isEven);
		System.out.println("!isEven -> " + !isEven);
		
		System.out.println("isMultipleOf3 -> " + isMultipleOf3);
		System.out.println("!isMultipleOf3 -> " + !isMultipleOf3);
		
		// Toán tử [&& ||] code logic
		// && return true khi tất cả biểu thức đều đúng
		
		// boolean KQ = BT1 && BT2
		// BT1(boolean) BT2(boolean) KQ(boolean)
		//    F          x           F
		//    T          F           F
		//    T          T           T
		//            = BT1 & BT2 --> Tất cả các BT luôn đc thực thi
		
		// boolean KQ = BT1 || BT2
		// BT1(boolean) BT2(boolean) KQ(boolean)
		//    F          F           F
		//    F          T           T
		//    T          x           T
		//            = BT1 | BT2 --> Tất cả các BT luôn đc thực thi
		
		
		x = 2;
		y = 4;
		boolean isCorrect = (++x > 2 || --y > 2);
		System.out.println("isCorrect --> " + isCorrect); // false true
		System.out.println("x --> " + x); // 3
		System.out.println("y --> " + y); // 3 4
		
		
		// Toán tử [& |] AND OR khi thao tác với bit
	}
}