package demomain;

public class Ex04Test {
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b
		// Viết hàm hoán vị 2 số nguyên a, b
		
		SoNguyen a = new SoNguyen(5);
		SoNguyen b = new SoNguyen(7);
		swap(a, b);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
	}

	private static void swap(SoNguyen a, SoNguyen b) {
		int tmp;
		tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}
