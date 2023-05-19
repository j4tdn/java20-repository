package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		// a,b thuộc phạm vi sử dụng trong hàm main
		int a = 7;
		int b = 5;
		int val = 99;

		// trước khi gan
		System.out.println("a --> " + a + "\nb --> " + b + "\nval --> " + val);

		// cập nhật, gán lại giá trị cho biến, ô nhớ
		// dùng toán tử =
		// VT = VP

		// sau khi gán
		System.out.println("\n");
		a = val;
		System.out.println("a --> " + a + "\nb --> " + b + "\nval --> " + val);

		// swap/ hoán vị giá trị của 2 phần tử a, b
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\n");
		System.out.println("a --> " + a + "\nb --> " + b);
	}
}
