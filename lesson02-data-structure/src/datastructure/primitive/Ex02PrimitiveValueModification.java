package datastructure.primitive;

public class Ex02PrimitiveValueModification {
		
	public static void main(String[] args) {
		
		int a = 8; 
		int b = 5;
		int val = 99;
		
		System.out.println("a --> " + a + "\nb --> " + b + "\nvalue --> " + val);
		System.out.println("==============");
		// cập nhật, gán lại giá trị dùng = --> luôn luôn gán/copy giá trị tại STACK
		// VT = VP ==> thực thi VP trước sau đó gán cho VT
		a = val;
		
		// swap 2 giá trị a, b
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a --> " + a + "\nb --> " + b + "\nvalue --> " + val);
	
	
	
	}
}
