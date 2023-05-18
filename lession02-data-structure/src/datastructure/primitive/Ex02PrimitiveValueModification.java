package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		// a, b thuộc phạm vi sử dụng trong hàm main
		int a = 7;
		int b = 5;
		int val = 99;
				
		// cập nhật hay gán giá trị lại cho biến, ô nhớ
		// dùng toán tử = --> luôn luôn gán/copy giá trị tại vùng nhớ STACK
		// BTVT = BTVP
		// Thực thi BTVP trước, được giá trị gán cho BTVT
		a = val;
		
		// swap/hoán vị giá trị của 2 phần tử a, b
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println(
				"a --> " + a
			+ "\nb --> "+ b
			+ "\nval --> " + val
		);
	}
}
