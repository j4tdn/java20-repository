package demomain;

public class Ex01DemoMainMethod {
	// Hàm main tiêu chuẩn (bắt buộc) trong JAVA
	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. Main Method");
		System.out.println("\nIn ra tam giác ngôi sao");
		printStarTriangle();
		System.out.println("\nIn ra 2 tam giác ngôi sao");
		printStarTriangle();
		System.out.println("\n");
		printStarTriangle();
	}
	
	private static void printStarTriangle() {
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
