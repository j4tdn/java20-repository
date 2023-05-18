package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		// a, b thuoc pham vi su dung trong ham main
		int a = 7;
		int b = 5;
		int val = 99;
		
		System.out.println(
					"a --> " + a
				 +  "\nb --> " + b
				 +  "\nval --> " + val
		);
		// cập nhật, gán lại giá trị cho biến, ô nhớ
		// dùng toán tử =
		// VT = VP
		// Thực thi BTVP trước, được giá trị gán cho BTVT
		a = val;
		
		int tmp = a; //temp(99)
		a = b; // a(5), b(5)
		b = tmp; //b(99)
		
		System.out.println(
				"a --> " + a
			 +  "\nb --> " + b
			 +  "\nval --> " + val
		);
	}
}
