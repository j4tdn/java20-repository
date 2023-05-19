package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		//a, b thuộc phạm vi sử dụng trong hàm main
		int a = 7;
		int b = 5;
		int val = 99;
		
		//cập nhật, gán lại giá trị cho biến , ô nhớ
		//dùng toán tử = ---> luôn luôn gán/copy giá trị tại vùng nhớ stack
		//BTVT =BTVP
		//thực thi BTVT trước, được giá trị gán cho BTVP
		
		a = val;
		
		//swap/hoán vị giá trị của 2 phần tử a,b
		int tmp =a;
		a = b;
		b = tmp;
		
		System.out.println("a --> " +a +"\nb --> " +b+ "\nval --> " +val);
		
	}
}
