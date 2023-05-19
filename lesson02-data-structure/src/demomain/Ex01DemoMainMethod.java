package demomain;

public class Ex01DemoMainMethod {
	public static void main(String[] args) {
//		System.out.println() --> in ra man hinh console va xuong hang
		
		System.out.println("1. Java Class");
		System.out.println("2. Main Method");
		
		System.out.println("\nIn ra tam giac ngoi sao");
		Ex01DemoMainMethod.printStarTriangle();
		
		System.out.println("\nIn ra 2 tam giac ngoi sao");
		Ex01DemoMainMethod.printStarTriangle();
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
