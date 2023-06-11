package view;

public class Ex02StaticMethodDemo {
	private int x;
	private int y;
	
	public static void main(String[] args) {
		System.out.println("result --> " + sum(8, 7));
		
		Ex02StaticMethodDemo e1 = new Ex02StaticMethodDemo();
		e1.x = 8;
		e1.y = 5;
		
		System.out.println("e1 sub --> " + e1.sub());
	}
	
	// class, object(warning) --> call static method
	// object --> call non-static method
	
	// non-static: object
	// --> khi hàm phụ thuộc vào đối tượng đang gọi
	// static: class
	// --> khi hàm không phụ thuộc vào đối tượng đang gọi
	//	   chỉ phụ thuộc vào tham số
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private int sub() {
		return x - y;
	}
}
