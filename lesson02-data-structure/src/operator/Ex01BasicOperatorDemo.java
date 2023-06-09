package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2; // 7
		
		a -= 3; // 4
		
		System.out.println("a --> " + a);
		
		// operator: ++ -- --> prefix, suffix
		// int b = a++; // --> b = 4 (hậu tố)
		// Biểu thức: ++ = -- /= *= () --> thứ tự ưu tiên
		
		// ++ --
		// prefix (tiền tố): tăng/giảm vào giá trị rồi dùng giá trị tăng/giảm đi xử lý 
		// suffix (hậu tố): dùng giá trị hiện tại đi xử lý rồi sau đó mới tăng/giảm
		
		// System.out.println("a1 --> " + (++a)); --> a1 = 5
		// System.out.println("a2 --> " + (a++)); --> a2 = 5
		int b = ++a; // --> b = 5 (tiền tố)
		System.out.println("b --> " + b);
		// a = 6
		int b1 = a-- + --a + ++a; // 6 + 4 + 5
		System.out.println("b --> " + b1); // b1 = 15
		
		int x = 3; // 2
		int y = 2; // -11
		int z = 4; // 3
		
		y -= ++z - --x + z-- + y + --z; // 5 - 2 + 5 + 2 + 3 = -11
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
		
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (y % 3 == 0);
		
		System.out.println("isEven --> " + isEven);	
		System.out.println("!isEven --> " + !isEven);	
		
		System.out.println("isMultipleOf3 --> " + isMultipleOf3);	
		System.out.println("!isMultipleOf3 --> " + !isMultipleOf3);	
		
		// Toán tử [&& ||] code logic
		// && return true khi tất cả biểu thức đều đúng
		
		// boolean KQ = BT1 && BT2
		// BT1(boolean) BT2(boolean) KQ(boolean)
		// BT1 false thì BT2 ko đc thực thi, xử lí --> False
		// BT1 true còn BT2 false --> false
		// Còn BT1 true thì BT2 true --> true
		x = 2;
		y = 4;
		boolean isCorrect = (x++ > 2 && --y > 2);
		System.out.println("isCorrect --> " + isCorrect); // false
		System.out.println("x --> " + x); // 3
		System.out.println("y --> " + y); // 4
		
		
		// = BT1 & BT2 --> Tất cả các biểu thức luôn đc thực thi
		x = 2;
		y = 4;
		boolean isCorrect1 = (x++ > 2 & --y > 2);
		System.out.println("isCorrect --> " + isCorrect1); // false
		System.out.println("x --> " + x); // 3
		System.out.println("y --> " + y); // 3
		
		
		// boolean KQ = BT1 || BT2
		// BT1(boolean) BT2(boolean) KQ(boolean)
		// BT1 true thì dừng ngay lập tức khi đó BT2 cũng true luôn return tổng kết quả --> True
		// Còn BT1 false thì BT2 vẫn tiếp tục xử lí nếu BT2 true --> True
		// Còn BT1 false thì BT2 false --> False
		// Còn BT1 true nhưng BT2 ko thực thi --> True
		x = 2;
		y = 4;
		boolean isCorrect2 = (x++ > 2 || --y > 2);
		System.out.println("isCorrect --> " + isCorrect2); // false
		System.out.println("x --> " + x); // 3
		System.out.println("y --> " + y); // 4
		
		// = BT1 | BT2 --> Tất cả các biểu thức luôn đc thực thi
		
		
		// Toán tử [& |] AND OR khi thao tác với bit 
		
		
	}

}
