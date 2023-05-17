package demomain;

public class Ex01DemoMainMethod {
	// Ham main tieeu chuaanr trong  java
	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. Main Method");
	
		System.out.println("In ra 1 ngoi sao");
		Ex01DemoMainMethod.printStarTriangle();
		
		System.out.println("In ra 2 ngoi sao");
		Ex01DemoMainMethod.printStarTriangle();
		Ex01DemoMainMethod.printNumberTriangle();;
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
