package demomain;

public class Ex04Test {
	public static void main(String[] args) {
		// cho 2 số nguyên a, b
		// viết hàm hoán vị a, b
		
		Integer x = 5;
		Integer y = 3;
		swap(x, y);
		System.out.println("x = " + x + ", y = " + y);
		
		Java20Int a = new Java20Int(5); // H1
		Java20Int b = new Java20Int(7); // H2
		
		swap(a, b);
		// int, Integer 
		// --> khi mình truyền tham số qua hàm, luôn copy giá trị của 
		// int, Integer ở Stack 
		// khi đó mình thay đổi giá trị bằng = trong hàm thì nó chỉ cập nhật giá trị tham số
		// --> nó sẽ không swap
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}
	
	private static void swap(Java20Int a, Java20Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}
