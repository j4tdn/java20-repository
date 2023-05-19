package demomain;

public class Ex01DemoMainMethod {
	// hàm main tiêu chuẩn,,bắt buộc trong JAVA
	// System.out.println("");: in kết quả ra màn hình ở console và xuống hàng
	// System.out.print:in kết quả ra màn hình ở console
	// "": đặt chuỗi
	// \n --> break line xuống hàng
	public static void printStarTriangle() {
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
		System.out.println("1 2 3 4 5 ");
	}

	public static void main(String[] args) {
		System.out.println("1.Java Class");
		System.out.println("2.Main Method");
		Ex01DemoMainMethod.printStarTriangle();
		Ex01DemoMainMethod.printNumberTriangle();
		printStarTriangle();
		printNumberTriangle();
	}
	// Hàm được dùng để xây dựng chức năng của bài toán
	// Tạo ra hàm
	// --> Có những đoạn code trùng nhau
}
