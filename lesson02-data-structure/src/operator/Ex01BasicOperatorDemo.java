package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2; //7
		
		a -= 3; //4
		
		System.out.println("a --> " + a);
		
		// operator: ++ -- -> prefix, suffix
		// prefix: Tăng/giảm giá trị rồi mới lấy giá trị đó đi xử lý
		// suffix: Dùng giá trị đi xử lý rồi mới thực hiện tăng/ giảm
		
		int b = a-- + --a + ++a;
		
		System.out.println("a1 -->" + ++a); // 5
		System.out.println("a1 -->" + a++); // 5
		
//		Self-homework: Test thêm nhiều dạng
		
		int x = 10;
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (b % 3 == 0);
		System.out.println("IsEven -> " + isEven);
		System.out.println("!IsEven -> " + !isEven);
		
		System.out.println("isMultipleOf3 -> " + isMultipleOf3);
		System.out.println("!isMultipleOf3 -> " + !isMultipleOf3);
		
		// Negative - phủ định
		
		//Toán tử && || -> code logic
		//Boolean KQ = BT1 && BT2
		//BT1 	BT2 --> KQ(boolean)
		// F	x	--> F
		// T	F	--> F
		// T	T	--> T
		
		// BT1 & BT2 --> Tất cả các biểu thức luôn được thực thi
		x = 2;
		int y = 4;
		boolean isCorrect = (x++ > 2 & --y > 2);
		System.out.println("isCorrect --> " + isCorrect);
		System.out.println("X --> " + x);
		System.out.println("Y --> " + y);
	}
}
