package demomain;


/*
 * class
 *  +function/ method
 *  	--> 
 */
public class Ex01DemoMainMethods {
	
	//hàm main tiêu chuẩn(bắt buộc) trong JAVA
	//System.out.println --> in kết quả ra màn hihf console và xuoobg hàng 
	public static void main(String[] args) {
		System.out.println("1. Java Class");
		System.out.println("2. main Medthod");
		
		System.out.println("\nIn ra tam giac");
		printStarTriangle();
		
		System.out.println("\n In ra 2 tam giac");
		printStarTriangle();
	}
	
	//de goi ham static 
	// classOwner.staticMethodName(...)
	//in ra tam giac ngoi sao luon co 5 dong 
	private static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}

/*
 * []optional, co/ không đều ok
 */
// hàm đùng để xây dựng, giải quyết 1 chức năng của 1 dư án, bài toán tạo ra hàm khi