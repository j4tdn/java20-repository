package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
//truyền tham số cho hàm thông qua giá trị: tên class

//khi truyền tham số qua hàm --> truyền tham trị || tham chiều	
//-->JAVA pass(es) by value at STACK
	public static void main(String[] args) {

		int a = 7;
		int b = 5;
		modify(a);
		modify(b);
		swap(a, b);
		System.out.println("a --> " + a + "\nb --> " + b);
	}

	private static void modify(int a) {
		a = 9999;
	}

	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
