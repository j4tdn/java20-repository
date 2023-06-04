package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2;
		
		a -= 3;
		
		System.out.println("a: " + a);
		
		//operator ++ -- --> prefix, suffix
		//int b = a++;
		
		//prefix: tăng/ giảm vào giá trị rồi dùng giá trị tăng/ giảm đi xử lý
		
		//suffix: dùng giá trị hiên tại đi xử lý rồi tăng giảm sau
		//System.out.println("b: " + b);
		
		int b = a-- +  --a + ++a;
		System.out.println("b:" + b);
		
		boolean isEven = (a % 2 == 0);
		boolean isMultipleOf3 = (b % 3 == 0);
		System.out.println("isEven:" + isEven);
		System.out.println("isEven:" + !isEven);
		
		System.out.println("isMultipleOf3:" + isMultipleOf3);
		System.out.println("isMultipleOf3:" + !isMultipleOf3);
		
		// toán tử [&& ||] code logic 
		//&& return true khi tat ca bieu thuc deu dung 
		//BT1(boolen)  BT2(boolean)      KQ
		//BT1: F       X				 F
		//BT1: T	   F				 F
		//BT1: T	   T				 T
		//   = BT1 & BT2 --> Tất cả các BT đều được thực hiện 	
		
		// || return true khi 1 bieu thuc deu dung 
		//BT1(boolen)  BT2(boolean)      KQ
		//BT1: F       F				 F
		//BT1: T	   X				 F
		//BT1: F	   T				 T
		//   = BT1 & BT2 
		int x = 2;  
		int y = 4;
		boolean isCorrect = (x++ > 2 && --y > 2);
		System.out.println("isCorrect: " + isCorrect);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		
		
		//--> & |AND OR khi thao tác với bit
	}
}
