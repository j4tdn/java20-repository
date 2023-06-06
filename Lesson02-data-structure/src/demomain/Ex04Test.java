package demomain;

public class Ex04Test {
	public static void main(String[] args) {
		//cho 2 số nguyên a, b
		//viết hàm hoán vị số nguyên a, b
		
		//Integer a = 4;
		//Integer b= 6;
		Ex05TestClassInteger a = new Ex05TestClassInteger(2);
		Ex05TestClassInteger b = new Ex05TestClassInteger(5);
		swap(a, b);
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	private static void swap(Ex05TestClassInteger a, Ex05TestClassInteger b) {
		int tamp;
		tamp = a.value;
		a.value = b.value;
		b.value = tamp;
		
		
	}
}
