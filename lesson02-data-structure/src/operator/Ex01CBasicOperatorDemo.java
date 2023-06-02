package operator;

public class Ex01CBasicOperatorDemo {
	public static void main(String[] args) {
		int a = 5;
		
		a = a + 2;
		
		a -= 3;
		 
		System.out.println("a --> " + a);
		
		//operator: ++ -- --> prefix (tiền tố), suffix (hậu tố)
		
		//prefix: tăng/ giảm giá trị rồi dùng giá trị tăng/ giảm đi xử lý
		//suffix: dùng giá trị hiện tại xử lý rồi mới tăng giảm
		int b = a++;
		System.out.println("b --> " + b);
		
		boolean isEvent = (a % 2 == 0);			//biểu thức so sánh trả về true/false
		boolean isMultipleOf3 = (b % 3 == 0);
		
		System.out.println("isEvent --> " + isEvent);
		System.out.println("isMultipleOf3 --> " + isMultipleOf3);
		System.out.println("!isMultipleOf3 --> " + !isMultipleOf3); //phủ định !
		
		//Toán tử && || --> code logic
		//Toán tử & | --> AND OR khi thao tác với bit
		
		//boolean KQ = BT1 && BT2 --> BT1 là false thì BT2 không được xử lý
		//boolean KQ = BT1 & BT2  --> Thực thi cả 2 BT 
		
		//boolean KQ = BT1 || BT2 --> Đi từ trái sang phải BT nào true thì trả về true
		int x = 2;
		int y = 4;
		boolean isCorrect = ( x++ > 2 && --y > 2);
		System.out.println("isCorrect --> " + isCorrect);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
	}
}
