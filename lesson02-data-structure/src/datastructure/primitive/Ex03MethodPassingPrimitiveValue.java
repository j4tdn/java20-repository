package datastructure.primitive; // tạo folder datastructure rồi trong đó tạo thêm folder primitive

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {

		int a = 7;
		int b = 5;

		modify(a);
		swap(a, b);
		System.out.println("a --> " + a + "\nb --> " + b);

	}

	private static void modify(int a) {
		a = 9999;
	}

	// JAVA pass by value
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
