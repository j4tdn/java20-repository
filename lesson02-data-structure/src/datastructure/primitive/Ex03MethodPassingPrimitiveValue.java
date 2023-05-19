package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		// block scope
		int a = 7;
		int b = 5;
		
		modify(a);
		modify(b);
		
		// a --> 7
		// b --> 5
		swap(a, b);
		
		System.out.println(
				"a1 --> " + a
			+	"\nb1 --> " +b	
		);
		
	}		
	
	
	    // A: a=7, b=5
		// B: runtime error
		// C: a=5, b=7
		// D: compile time error
		// E: a=77, b=55
		
		// invoke modify(777); --> int a = 777
		// invoke modify(a);   --> int a = a
		// invoke modify(b);   --> int a = b
		
		// khi truyền tham số qua hàm --> truyền tham trị || tham chiếu
		// pass by value || pass by reference
		// ---> JAVA pass(es) by value [at STACK]
		
		 private static void modify(int a) {
		 	a = 9999;
		 }
		
		
		private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
		
}
