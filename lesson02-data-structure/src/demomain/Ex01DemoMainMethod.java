package demomain;

public class Ex01DemoMainMethod {
	
	//Hàm main tiêu chuẩn (Bắt buộc) trong JAVA
	//System.out.println(); -->In kết quả ra màn hình xuống dòng
	//System.out.print(); -->In kết quả ra màn hình không xuống dòng
	//Ctrl F11 -->Chạy chương trình
	// \n --> Xuống dòng
	
	//Hàm không có access modifier thì mặc định là protected
	static void printStarTriangle()
	{
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
	public static void printNumberTriangle()
	{
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
	
	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. Main Method");
		printStarTriangle();
	}
	
	
}
