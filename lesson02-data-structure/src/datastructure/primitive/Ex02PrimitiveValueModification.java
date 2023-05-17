package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	
	public static void main(String[] args) {
		int a=7;
		int b=5;
		int val=99;
		a = val + 100;
		int temp =a;
		a=b;
		b=temp;
		//cập nhập , gán lại giá trị biến , ô nhớ
		//dùng toán tử = --> luôn luôn gán/copy giá trị tại vùng nhớ STACK
		//Vế trái bằng vế VT=VP thực thi biểu thức vế phải trước,được giá trị gán cho BTVT
		
		System.out.println("a-->"+a+"\nb-->"+b+"\nval -->"+val);
	}
}
