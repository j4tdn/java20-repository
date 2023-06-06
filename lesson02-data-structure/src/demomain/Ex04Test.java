package demomain;

import datastructure.object.custom.Java20Int;

public class Ex04Test {
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b
		// Viết hàm hoán vị 2 số nguyên a, b
		
		// xanh
		// Integer x = 2; // H1
		// Integer y = 5; // H2
		
		// int, Integer 
		// --> khi mình truyền tham số qua hàm, luôn copy giá trị của
		// int, Integer ở STACK vào cho tham số của hàm
		// --> khi đó mình thay đổi giá trị bằng toán tử = trong hàm
		// thì nó chỉ cập nhật giá trị của tham số, các biến truyền vào
		// sẽ ko bị ảnh hưởng
		
		Java20Int x = new Java20Int(2);
		Java20Int y = new Java20Int(5);
		
		swap(x, y);
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
	}
	
	// đỏ
	// Integer a = x; // H2
	// Integer b = y; // H1
	// Integer tmp = a; // H1
	private static void swap(Java20Int a, Java20Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
	
	
}
