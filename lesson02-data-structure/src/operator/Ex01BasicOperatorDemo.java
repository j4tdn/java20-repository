package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		a = a + 2; // 7
		a -= 3; // 4
		System.out.println("a --> " + a);
		
		// operator: ++ --> prefix, suffix
		// int b = a++; --> b = 4
		// biểu thức: ++ = -- /= *= () --> thứ tự ưu tiên
		
		// ++ --
		// prefix: tăng/giảm vào giá trị rồi dùng giá trị tăng/giảm đi xử lý
		// suffix: dùng giá trị hiện tại đi xử lý sau đó mới tăng/giảm
		System.out.println("a1 --> " + (++a));
		System.out.println("a2 --> " + (a++));
		// a = 6
		int b = a-- + --a + ++a;
		System.out.println("b --> " + b);
		
		int x = 3;
		int y = 2;
		
		boolean isEven = (x % 2 ==0);
		boolean isPowerOf3 = (y % 3 == 0);
		
		System.out.println("isEvent --> " + isEven);
		System.out.println("isMultipleOf3 --> " + isPowerOf3);
		
		System.out.println("!isEvent --> " + !isEven);
		System.out.println("!isMultipleOf3 --> " + !isPowerOf3);
		
		// Toán tử [&& ||] code logic
		// && return true khi tất cả biểu thức đều đúng
		// && bthức 1 mà false bthức sau k thực hiện ngược lại bthức 1 đúng thì bthức sau đc thực hiện
		
		// boolean KQ = BT1 && BT2
		// BT1(boolean)	BT2(boolean)	KQ
		//		F			x			F
		//		T			F			F
		//		T			T			T
		// 			  = BT1 & BT2 --> tất cả các BT luôn đc thực thi
		
		// boolean KQ = BT1 || BT2
		// BT1(boolean)	BT2(boolean)	KQ
		//		F			F			F
		//		F			T			T
		//		T			x			T
		// 			  = BT1 | BT2 --> tất cả các BT luôn đc thực thi
		x=2;
		y=4;
		boolean isCorrect = (x++ > 2 && --y > 2);
		System.out.println("isCorrect --> " + isCorrect);
		System.out.println("x --> " + x);
		System.out.println("y --> "	+ y);
		
		// Toán tử [& |] AND OR khi thao tác với bit
	}
}
