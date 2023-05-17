package datastructure.primitive;

public class Ex02PrimitiveValueModification {
	public static void main(String[] args) {
		//a,b thuoc pham vi su dung trong ham main
		int a =7;
		int b=5;
		int val=99;
		
		// Cap nhap , gan lai gia tri cho bien, o nho
		// Dung toan tu = --> luon luon gan/copy gia tri tai vung nho STACK
		// VT = VP
		// Thuc thi VP truoc, duoc gia tri gan cho VT
		a= val;
		// Swap/ hoan vi gia tri cua hai phan tu a,b
		int tmp=a; //teamp(99)
		a=b; // a(5) b(5)
		b=tmp; // b(99)
		System.out.println(
				"a --> " +a +
				"\nb --> " +b +
				"\nval -->" +val
				);
	}
}
