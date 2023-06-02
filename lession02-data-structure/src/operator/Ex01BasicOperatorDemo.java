package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2; // 7
		
		a -= 3; // 4
		
		System.out.println("a --> " + a);
		
		// operator: ++ -- --> prefix, sufix
		// int b = a++; // --> b = 4
		
		// ++ -- 
		// prefix: tăng/ giảm vào giá trị rồi dùng giá trị tăng/giảm đi xử lý
		// sufix: dùng giá trị hiện tại đi xử lý  sau đó mới tăng/giảm
		
		//int b = a++;
		//System.out.println("b --> " + b);
		
		System.out.println("a1 --> " + (++a)); // a1 -> 5
		System.out.println("a2 --> " + (a++)); // a1 -> 5	
		// a = 6
		int b = a-- + --a + ++a;
		System.out.println("b --> " + b); //15
		
		int x = 3;
		int y = 2;
		int z = 4;
		
		y -= ++z - --x + z-- + y + --z;
		// y = y - (++z - --x + z-- + y + --z)
		System.out.println("x --> " + x);
		System.out.println("y --> " + x);
		System.out.println("z --> " + x);
	
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (y % 3 == 0);
		
		System.out.println("isEven -> " + isEven);
		System.out.println("!isEvent -> " + !isEven);
		
		System.out.println("isMultipleOf3 -> " + isMultipleOf3);
		System.out.println("!isMultipleOf3 -> " + !isMultipleOf3);
		
		// Toán tử [&& ||] code logic  
		// && return true khi tất cả biểu thức đều đúng
		
		// boolean KQ = BT1 && BT2
		// BT1(boolean) BT2(boolean) KQ(boolean)
		// 		F			x			F		
		//			(x là không thực thi)
		//		T			F			F
		//		T			T			T
		// boolean KQ = BT1 & BT2 --> Tất cả các BT luôn đc thực thi
		
		// boolean KQ = BT1 || BT2
		// BT1(boolean) BT2(boolean) KQ(boolean)
		// 		F 			F 			F
		// 		F 			T 			T
		// 		T 			x 			T
		// boolean KQ = BT1 | BT2 --> Tất cả các BT luôn đc thực thi

		x = 2;
		y = 4;
		boolean isCorrect = (x++ > 2 || --y > 2);
		System.out.println("isCorrect --> " + isCorrect);
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		// Toán tử [& |] AND OR khi thao tác với bit
		
	}
}
