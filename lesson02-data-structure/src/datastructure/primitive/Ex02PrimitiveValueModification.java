package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		// a, b thuộc phạm vi sd trong hàm main
		int a = 7;
		int b = 5;
		int val = 99;

		a = val;
		
		//swap/ hoán vị gtrị của 2 ptử a, b;
		int temp = a;
		a = b;
		b = temp;

		System.out.println("a --> " + a + "\nb --> " + b + "\nval --> " + val);
	}
	// cập nhật, gán lại giá trị cho biến, ô nhớ
	// dùng toán tử = --> luon luôn gán/copy giá trị tại vùng nhớ STACK
	// BTVT = BTVT
	// Thực thi BTVP trước, được gtrị gán cho BTVT
}
