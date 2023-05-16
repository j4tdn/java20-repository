package demomain;

public class Ex01DemoMainMethod {
	// hàm main tiêu chuẩn (bắt buộc) trong java
	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. Main Method");
		
		System.out.println("in hình tam giác ngôi sao");
		printStarTriangle();
		
		System.out.println("in hình tam giác số");
		printNumberTriangle();
	}
	
	static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
