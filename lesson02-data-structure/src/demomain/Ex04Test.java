package demomain;

public class Ex04Test {
	public static void swap(Java20Int a, Java20Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
	//copy giá trị vào hàm
	
	public static void main(String[] args) {
		//Cho 2 số nguyên a, b
		//Viết hàm hoán vị 2 số nguyên a, b
		Java20Int a = new Java20Int();
		Java20Int b = new Java20Int();
		a.setValue(10);
		b.setValue(5);
		System.out.println("a --> " + a.getValue());
		System.out.println("b --> " + b.getValue());
		swap(a, b);
		System.out.println("=======================");
		System.out.println("a --> " + a.getValue());
		System.out.println("b --> " + b.getValue());
		
	}
	
}
