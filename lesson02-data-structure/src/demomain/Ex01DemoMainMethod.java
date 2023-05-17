package demomain;

public class Ex01DemoMainMethod {
	//Hàm main tiêu chuẩn 
	//crtl + f11 -->chạy chương trình
	//Hàm có cấu trúc 2 phần
	 static void printStarTriangele() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	public static void printNumberTriangele() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
	public static void main(String[] args) {
		System.out.println("1.Java Class");
		System.out.println("2.Main Method");
		Ex01DemoMainMethod.printStarTriangele();
	}
}
