package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		
		// a , b thuộc phạm vi sử dụng trong hàm main
		int a = 7;
		int b = 5;
		int value = 99;
		
		System.out.println(
				"a --> " + a
			+ "\nb --> " + b
			+ "\nvalue --> " + value
		);
		
		a = value;
		System.out.println("--------------------------------");
		System.out.println(
				"a --> " + a
			+ "\nb --> " + b
			+ "\nvalue --> " + value
		);
		
		//Swap hoán vị giá trị của 2 phần tử a và b
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("--------------------------------");
		System.out.println(
				"a --> " + a
			+ "\nb --> " + b
			+ "\nvalue --> " + value
		);
	}
}
