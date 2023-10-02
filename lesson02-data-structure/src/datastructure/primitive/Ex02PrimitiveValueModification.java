package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		
		//a, b thuộc phạm vi sử dụng trong hàm main
		int a=7;
		int b=5;
		int val=99;
		
		//Cập nhật, gán lại giá trị
		//Toán tử = luôn luôn gán / copy giá trị tại vùng nhớ stack
		//BTVT=BTVP ->BTVP thực thi trước
		a=val;
		
		//swap/hoán vị giá trị của hai phần tử a, b
		int tmp=a;
		a=b;
		b=tmp;
		
		System.out.println(
				"a-->"+a
			+ "\nb-->"+b
		);
		
	}
	
}
