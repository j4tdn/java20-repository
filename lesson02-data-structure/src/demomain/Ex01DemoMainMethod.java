package demomain;

public class Ex01DemoMainMethod {
	// ctrl f11 --> chạy chương trình
	
	// Đây là hàm main tiêu chuẩn (bắt buộc) trong JAVA
	
	// System.out.println() --> In KQ ra màn hình console và xuống hàng
	// System.out.println() --> In KQ ra màn hình console
	// \n --> break line xuống hàng
	public static void main(String[] args) {
		System.out.print("1. Java Class\n");
		System.out.println("2. Main Method");
		
		System.out.println("/nIn ra tam giác ngôi sao: ");
		Ex01DemoMainMethod.printStarTriangle();
		
		System.out.println("In ra 2 tam giác: ");
		Ex01DemoMainMethod.printNumberTriangle();
		Ex01DemoMainMethod.printNumberTriangle();
		
//		// In ra tam giác ngôi sao
//		System.out.println("*");
//		System.out.println("* *");
//		System.out.println("* * *");
//		System.out.println("* * * *");
		
		
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
	
	/*
	 * 
	 */
	// Hàm 
	// Được dùng để xây dựng, giải quyết 1 chức năng của dự án, bài toán
	// Tạo ra hàm khi
}
