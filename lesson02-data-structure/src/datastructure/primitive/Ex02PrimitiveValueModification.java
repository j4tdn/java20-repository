package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	
	public static void main(String[] args) {
	// a,b thuoc pha vi su dung trong ham main
		int a = 7; //99
		int b = 5; //5
		int val = 99;
		System.out.println(
				"a -->" + a
				+ "\nb -->" + b
				+ "\nval -->" + val
				);
		// cập nhạt, gán lại giá trị cho biến, ô nhớ
		// dùng toán tử = --> luôn luôn gán/ copy giá trị tại vùng nhớ STACK
		// vế trái = vế phải
		// thực thi biểu thứ vế phải trước, được giá trị gán cho biểu thức về trái
		a = val;
		
		//swap/ hoán vị giá trị của 2 phần tử a, b
		int tmp = a; //tmp(99)
		a = b; //tmp(99)
		b= tmp;
		System.out.println(
				"a -->" + a
				+ "\nb -->" + b
				+ "\nval -->" + val
				);
	}
}
