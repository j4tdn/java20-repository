package demomain;

public class Ex04Test {
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b. Viết hàm hoán vị a, b
		IntegerFake a = new IntegerFake(5);
		IntegerFake b = new IntegerFake(7);
		swap(a, b);
		System.out.println("a = " + a + ", b = " + b);
	}
	
	private static void swap(IntegerFake a, IntegerFake b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}
