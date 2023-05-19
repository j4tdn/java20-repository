package demomain;

public class Ex01DemoMainMethod {
	// ctrl f11 --> chạy chương trình
	
	// Hàm main tiêu chuẩn(bắt buộc)trong JAVA
	
	// System.out.println() --> In KQ ra màn hình console và xuống hàng
	// System.out.println() --> In KQ ra màn hình console 
	// \n --> break line xuống hàng
	
	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. Main Method");
		
		System.out.println("\nIn ra tam giác ngôi sao");
		Ex01DemoMainMethod.printStarTriangle();
		
		System.out.println("In ra 2 tam giác ngôi sao");
		Ex01DemoMainMethod.printStarTriangle();
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
