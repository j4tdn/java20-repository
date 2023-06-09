package demomain;

public class Ex04Test {
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b
		// Viết hàm hoán vị 2 số nguyên a, b
		Java20Integer a = new Java20Integer(22);
		Java20Integer b = new Java20Integer(2222);
		System.out.println("a --> " + a.value);
		System.out.println("b --> " + b.value);
		modify(a, b);
		
		System.out.println("a --> " + a.value);
		System.out.println("b --> " + b.value);
	}
	
	private static void modify(Java20Integer a, Java20Integer b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}
