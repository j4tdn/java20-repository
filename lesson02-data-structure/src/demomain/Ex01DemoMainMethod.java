package demomain;

public class Ex01DemoMainMethod {
	
	// Standard main function in JAVA 
	public static void main(String[] args) {
		System.out.println("1. Java Class"); // In kết quả ra màn hình Console và xuống hàng
		System.out.print("2. Main Method");  // In kết quả ra màn hình Console và không xuống hàng
		
		//Để gọi hàm static : ClassOwner.staticMethodName(...)
		Ex01DemoMainMethod.printNumberTriangle();
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
