package demomain;

public class Ex01DemoMainMethod {
	// Hàm main tiêu chuẩn (bắt buộc) trong JAVA
	// System.out.println() --> In KQ ra màn hình console
 	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. Main method\n");
		
		printStarTriangle();
	}
 	/*Hàm đc dùng để xây dựng, giải quyết 1 chức năng của dự án, bài toán
 	 * bản thân của 1 hàm luôn luôn có static
 	*/
 	static void printStarTriangle() {
 		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
 	public static void printNumberTringle() {
 		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");		
	}
}
