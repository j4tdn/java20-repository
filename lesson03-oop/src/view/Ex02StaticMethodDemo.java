package view;

public class Ex02StaticMethodDemo {
	private int x;
	private int y;
	
	public static void main(String[] args) {
		
		
		System.out.println("a + b = "+Ex02StaticMethodDemo.sum(8, 6));
		Ex02StaticMethodDemo e1 = new Ex02StaticMethodDemo();
		e1.x = 8;
		e1.y = 2;
		System.out.println("a-b= "+ e1.sub());
	}
	
	//class, object: --> call static method
	//object: call non-static method
	//non-static: thuộc phạm vi của Object , static của class.
	
	//non-static method: khi hàm phụ thuộc vào đối tượng đang gọi
	//static: không phụ thuộc vào đối tượng đang gọi mà chỉ phụ thuộc vào các tham số
	
	private static int sum(int a , int b)
	{
		return a + b;
	}
	private int sub()
	{
		return this.x - this.y;
	}
}
