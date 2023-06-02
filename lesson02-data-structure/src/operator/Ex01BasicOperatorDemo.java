package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2;
		a -= 3;
		
		System.out.println("a --> " + a);
		// operator: ++ --  --> prefix, suffix
		//prefix: tăng giảm vào giá trị rồi dùng giá trị tăng giảm đi xử lý
		//suffix: dùng giá trị hiện tại đi xử lý sau đó mới tăng giảm
		//int b = a++
		//System.out.println("b --> " + b);
		//a= 6;
		int b = a-- + --a + ++a;
		System.out.println("b --> " + b);
		int x= 3;
		int y= 2;
		int z= 4;
		y -= ++z - --x + z-- + y + --z;
		System.out.println("x --> " +x);
		System.out.println("y --> " +y);
		
		boolean isEven = (x % 2 == 0);
		boolean isMultipleOf3 = (y % 3 == 0);
		
		System.out.println(" isEven -> " + isEven);
		System.out.println("!isEven -> " + !isEven);
		System.out.println(" isMultipleOf3 -> " + isMultipleOf3);
		System.out.println("!isMultipleOf3 -> " + !isMultipleOf3);
		
		//toán tử [&& ||] code logic --> return true khi 2 vế đều đúng		
		//boolean KQ = BT1 && BT2
		//BT1(boolean) BT2(boolean) KQ(boolean)
		//F					x			F
		//T					F			F
		//T					T			T
		//toán tử [ & | ] AND OR khi thao tác với bit
		// toán tử & -> tất cả biểu thức đều được thực thi
		x=2;
		y=4;
		boolean isCorrect = (x++ > 2 && --y >2);
		System.out.println("isCorrect -> " +isCorrect);
		System.out.println("x-> " +x);
		System.out.println("y-> " +y);
	}
}
