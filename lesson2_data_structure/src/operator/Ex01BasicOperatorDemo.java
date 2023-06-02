package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
	int a = 5;
	a = a+2;
	a -= 3;
	System.out.println("a-->" +a);
	//opretator: ++ --
	// ++ --
	// Prefix: tien to, tăng giảm giá trị rồi dùng giá trị tăng/giảm đi xử lý
	//suffix: dùng giá trị hiện tịa đi xử lý sau đó mới tăng giảm
	//int b = a++;
	int b = ++a;
	System.out.println("b-->" + b);
	System.out.println("a1-->" + ++a);
	int x = 3;
	int y = 4;
	int z = 5;
	y = ++z - --x +z-- + y + --z;
	System.out.println(x+y+z);
	
	boolean isEven = (x % 2 ==0);
	boolean isMultipleteOf = (b % 3 == 0 );
	System.out.println("isEven--> "+ isEven);
	System.out.println("!isEven--> "+ !isEven);
	System.out.println("isMulpletOf--> " + isMultipleteOf);
	
	//toán tử && || code logic
	//toán tử và và, nếu vế 1 false thì về 2 dừng lại....
	// toán tử hoặc hoặc vể 1 T thì dừng lại
	y=4;
	x=2;
	
	boolean isCorrect = (x++ >2 && --y > 2 );
	System.out.println("isCorrect-->"+ isCorrect);
	System.out.println("x--> "+x);
	System.out.println("y--> "+y);
	
	// toán tử & | AND OR khi thao tác với bit
	// tất cả các biểu thức luôn được thưc thi
	y=4;
	x=2;
	
	boolean isCorrect2 = (x++ >2 & --y > 2 );
	System.out.println("isCorrect-->"+ isCorrect2);
	System.out.println("x--> "+x);
	System.out.println("y--> "+y);
	
	y=4;
	x=2;
	
	boolean isCorrect3 = (x++ >2 | --y > 2 );
	System.out.println("isCorrect-->"+ isCorrect3);
	System.out.println("x--> "+x);
	System.out.println("y--> "+y);
	
	}
}
