package view;

public class Ex02MethodDemo {
	
	private int x;
	private int y;
	public static void main(String[] args) {

		
		System.out.println("class sum --> " + Ex02MethodDemo.sum(8, 6));
		
		Ex02MethodDemo e1 = new Ex02MethodDemo();
		e1.x = 8;
		e1.y = 6;
		System.out.println("e1 sub --> " + e1.sub());

		
	}
	
	//non-static: object
	//static: class
	
	//non-static method: khi hàm phụ thuộc vào đối tượng đang gọi
	//static: khi hàm không phụ thuộc vào đối tượng đang gọi
	//		: chỉ phụ thuộc vào các tham số
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private int sub() {
		return this.x - this.y;
	}

}
