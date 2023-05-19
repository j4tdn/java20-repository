package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		modify(a);
		modify(b);
		
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	//khi truyen tham so qua ham --> truyen tham tri || tham chieu
	// pass by value || pass by reference
	// --> JAVA pass(es) by value at STACK
	 private static void modify(int a) {
		 a = 9999;
	 }
	 private static void swap(int a, int b) {
		 int temp = a;
		 a = b; 
		 b = temp;
	 }
}
