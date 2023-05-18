package demomain;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		modify(a);
		modify(b);
		
		swap(a, b);

		System.out.println("a1 --> " + a + "\nb1 --> " + b
				);
	}
	
	//khi truyền tham số qua hàm --> truyền tham trị || tham chiếu
	//pass by value || pass by reference
	// --> JAVA pass(ed) by value
	private static void modify(int a) {
		a = 9999;
	}
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
