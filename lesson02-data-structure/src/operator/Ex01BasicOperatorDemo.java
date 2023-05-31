package operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		a+=2;
		
		a-=3;
		System.out.println("a--> "+ a);
		//operator : ++ và -- đứng ở tiền tố or hậu tố
		//++ or --
		//tiền tố: tăng/giảm vào giá trị rồi dùng giá tị tăng/giảm đi xử lý
		//hậu tố: dùng giá trị hiện tại đi xử lý sau đó mới tăng/giảm
		//int b = ++a;
		//System.out.println("b--> "+ b);
		
		System.out.println("a1-->" + ++a);//a=5
		System.out.println("a1-->" + a++);//a=5
		//a=6
		int b = a-- + --a + ++a;
		System.out.println("b-->" +b);
		
		int x =3;
		int y=2;
		int z=4;
		y-=++z - --x + z-- + y + --z;
		System.out.println("x-->" + x);
		System.out.println("x-->" + y);
		System.out.println("x-->" + z);
		
		boolean isEven = (x % 2 ==0);
		boolean isMultiple = (b % 3 == 0);
		
		System.out.println("isEven--> "+ isEven);
		System.out.println("isEven--> "+ !isEven); //phủ định
		System.out.println("isMul--> "+ isMultiple);
		System.out.println("isMul--> "+ !isMultiple);
		
		//toán tử && || hầu như dùng code logic
		
		//boolean KQ = BT1 && BT2
		//Khi gặp trường hợp false dừng ngay lập tức
		//BT1(boolean) BT2(boolean) KQ(boolean)
		//F             X             F
		//              =BT1 & BT2 -->Tất cả lệnh được thực thi
		
		
		//boolean KQ = BT1 || BT2
		//Khi gặp trường hợp True dừng ngay lập tức
				//BT1(boolean) BT2(boolean) KQ(boolean)
				//T             X             T
				//              =BT1 | BT2 -->Tất cả lệnh được thực thi
		x =2;
		y =4;
		boolean isCorrect = (x++ > 2 && --y > 2 ) ;
		System.out.println("isCorrect-->" + isCorrect);
		System.out.println("x-->" + x);
		System.out.println("y-->" + y);
		//--> & | AND OR thao tác với bit
	}
}
