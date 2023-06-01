package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		a = a + 2;
		a -= 3;
		System.out.println("a --> " + a);
		// operator : ++ -- --> prefix, suffix
		// int b = a++;
		// System.out.println("b --> "+ b);
		// b = ++a;
		// System.out.println("b --> "+ b);

		// ++ --
		// prefix: tăng/ giảm vào giá trị rồi dúng giá trị tăng/ giảm đi xử lý
		// suffix: dùng giá trị hiện tại đi rồi xử lý sau đó mới tăng/giảm

		System.out.println("a1 --> " + (++a));// =5
		System.out.println("a2 --> " + (a++));// =5
		// xong dòng 21 a=6
		int b = a-- + --a + ++a;
		System.out.println("b --> " + b);
		int x = 3;
		int y = 2;
		int z = 4;
		y -= ++z - --x + z-- + y + --z;
		System.out.println("y --> " + y);
		System.out.println("x --> " + x);
		System.out.println("z --> " + z);
		// y = 2 -( 5 -2+5 +2 +3)

		// Kieemr tra x có phải là số chẵn hay không?
		boolean isEven = (x % 2 == 0);
		//Bội của 3
		boolean isMultipleOf3 = (y % 3 ==0);
		
		System.out.println("isEven -->"+ isEven);
		System.out.println("isEven -->"+ !isEven);
		System.out.println("isMultipleOf3 -->" + isMultipleOf3);
		System.out.println("isMultipleOf3 -->" + !isMultipleOf3);

		
		//Toán tử && ||  & |
		//Toán tử [&& ||] hầu như sử dụng code logic 
		
		//Boolean KQ = BT1 && BT2
		//BT1(boolean)   BT2( boolean)  KQ (Boolean)
		//    	F          	x              	F
		//		T			T				T
		//		T			F 				F
		
		//Boolean KQ = BT1 & BT2
				//--> Tất cả biểu thức luôn được thực thi
		
		x =2 ;
		y =4;
		//boolean isCorrect =(x++ > 2 && --y >2);
		//Lấy x xử lý rồi mới tăng-->>> x ++ >2 thì x so sánh với 2 -> xong mới tăng
		
		boolean isCorrect =(x++ > 2 & --y >2);
		System.out.println(isCorrect);
		System.out.println(x);
		System.out.println(y);
		
		//Toán tử [& |] AND OR khi thao tác với bit
		
		//Boolean KQ = BT1 || BT2
		//BT1(boolean)   BT2( boolean)  KQ (Boolean)
		//    	F          	F              	F
		//		T			T				T
		//		T			F 				T
		//		F			T				T
		
		//Boolean KQ = BT1 | BT2
		//--> Tất cả biểu thức luôn được thực thi
		
	}
}
