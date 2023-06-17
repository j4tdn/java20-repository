package view;

public class Ex02StaticMethodDemo {
	private int x;
	private int y;

	public static void main(String[] args) {
		System.out.println("sum --> " + Ex02StaticMethodDemo.sum(8, 6));

		Ex02StaticMethodDemo e1 = new Ex02StaticMethodDemo();
		e1.x = 8;
		e1.y = 2;
		System.out.println("e1 sub --> " + e1.sub());
	}

	// non-static method: khi hàm phụ thuộc vào đối tượng đang gọi
	// static method    : khi hàm không phụ thuộc vào đối tượng đang gọi
	//                  : chỉ phụ thuộc vào tham số

	private static int sum(int a, int b) {
		return a + b;
	}

	private int sub() {
		return x - y;
	}
}
