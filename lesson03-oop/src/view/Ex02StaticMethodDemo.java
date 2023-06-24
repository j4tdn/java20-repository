package view;

public class Ex02StaticMethodDemo {
	private int x;
	private int y;
	
	public static void main(String[] args) {
		System.out.println("sum: " + Ex02StaticMethodDemo.sum(5, 4));
		
		Ex02StaticMethodDemo e1 = new Ex02StaticMethodDemo();
		e1.x = 8;
		e1.y = 2;
		System.out.println("e1 sub: " + e1.sub());
	}
	
	//class, object(warning) --> call static method
	//object --> call non-static method
	
	//non-static: object
	//static: class
	//non-static method: khi ham phu thuoc vao doi tuong dang goi
	//static : khi ham khong phu thuoc vao doi tuong dang goi
	//		 : chi phu thuoc vao tham so
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private int sub() {
		return this.x - this.y;
	}
}
