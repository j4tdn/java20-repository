package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
	
		//validation: validate trước đoạn code bị exception
		//try catch: đưa đoạn code có khả năng bị exception vào khối try
		
		//throw_throws:
		//throw ném exception trước khi gọi đoạn code xảy ra lỗi
		//throws: ném tại vị trí khai báo hàm
		//		: để chỗ gọi hàm phải biết và xử lý exception
		
		System.out.println("**__Demo Throw Throws__**\n");
		
		System.out.println("divice(8, 2) --> " + divice(8,2) + "\n");
				
		try {
			int result = divice(5,0);
			System.out.println("divice(5,0) --> " + result + "\n");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("**__Finished__**");
	}
	private static int divice(int a, int b) {
		//việc xẩy ra ngoại lệ hay không phụ thuộc vào tham số truyền vào
		//validate cho b: kh bao giờ xầy ra
		//chưa validate cgi b: có thể bị ngoại  lệ
		//numerator
		if (b==0) {
			//failed first
			throw new ArithmeticException("denominator should not be zero");
		}
		//a =getDatabase(); //10s
		return a/b;
	}
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at a.validate_trycatch_throw_throws.Ex03BasicDemo_Throw_Throws.divice(Ex03BasicDemo_Throw_Throws.java:23)
	at a.validate_trycatch_throw_throws.Ex03BasicDemo_Throw_Throws.main(Ex03BasicDemo_Throw_Throws.java:18)

	 */
}
