package demomain;

import java.util.random.RandomGenerator.JumpableGenerator;

public class Ex04Test {
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b
		// Viết hàm hoán bị 2 số nguyên a, b
		IntegerN a = new IntegerN(); // H1
		a.value = 4;
		
		IntegerN b = new IntegerN(); // H2
		b.value = 5;
		
		swap(a, b);
		
		// int, Integer --> khi mình truyền tham số qua hàm, luôn copy giá trị của 
		// int, Integer ở STACK vào cho tham số của HÀM
		// --> khi đó mình thay đổi giá trị bằng toán tử = trong hàm
		// thì nó chỉ cập nhật giá trị của tham số, các biến truyền vào
		// sẽ không bị ảnh hưởng.
		System.out.println("Number a is: " + a);
		System.out.println("Number b is: " + b);
	}
	
	public static void swap(IntegerN a, IntegerN b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}
