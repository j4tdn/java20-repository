package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	
	
	public static void main(String[] args) {
		
		//a, b thuoc pham vi su dung trong ham main
		int a = 9;
		int b = 4;
		int val = 99;
		
		// cap nhat, gan lai gia tri cho o nho
		// dung taon tu = ---> luon luon gan/copy gia tri tai vung nho STACK
		//BTVT = BTVP 
		//thuc thi BTVP truoc, duoc gia tri gan cho BTVT
		a= val;
		//swap/hoan vi gia tri cua 2 phan tu a, b
		int temp = a;
		a =b; 
		b = temp;
		
		System.out.println(
				"a: " + a
				+ "\nb: " + b
				+ "\nval: " + val
				);
		
	}
}
