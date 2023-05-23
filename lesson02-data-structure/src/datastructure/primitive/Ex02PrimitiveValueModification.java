package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		
		//a,b thuộc phạm vi sử dụng trong hàm main
		int a = 7;
		int b = 5;
		int val = 99;
		
		//cập nhật, gán lại giá trị cho biến, ô nhớ
		//dùng toán tử =  ---> luôn luôn gán/copy giá trị tại vùng nhớ STACK
		// biểu thức Vế trái = biểu thức Vế phải
		// Thực thi BTVP trước, được giá trị rồi gán cho BTVT
		a = val;
		
		// swap/hoán vị giá trị của 2 phần tử a,b
		int tmp = a; //temp(99)
		a = b; // a(5), b(5)
		b = tmp; // b(99)
		System.out.println(
				"a --> " + a
			+	"\nb --> " + b
			+	"\nval --> " + val
		);
	}
}
