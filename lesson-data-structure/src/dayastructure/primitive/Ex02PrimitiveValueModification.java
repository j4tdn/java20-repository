package dayastructure.primitive;

public class Ex02PrimitiveValueModification {
     public static void main(String[] args) {
    	 // a, b thuôcj phạm vi sử dung trong hàm main
		int a = 7;
		int b = 5;
		int val = 99;
		
		System.out.println(
				"a --> " + a
				+ "\nb -->" + b
				+ "\nval -->" + val
				);
		// cập nhật, gán lại giá trị cho biến , ô nhớ
		// dùng toán tử = --> luôn luôn gán/copy giá trị tại vùng nhớ stack
		// BTVT = BTVP
		// Thực thi vp trước , được giá trị gán cho  vế trái
		
		a = val;
		
		//swap/ hoán vị giá trị của 2 phần từ a, b
		int tmp = a; //temp(99)
		a= b; //a(5), b(5)		
		b = tmp; // b(99)
		
		System.out.println(
				"a --> " + a
				+ "\nb -->" + b
				+ "\nval -->" + val
				);
	}
}
