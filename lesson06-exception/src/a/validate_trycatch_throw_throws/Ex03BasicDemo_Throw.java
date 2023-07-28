package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
		// validate: calidate trước đoạn code bị exception
		// try catch: đưa đoạn code có khả năng bị exception vào khối try
		
		// throw_throws:
		// throw: ném exception trước khi gọi đoạn code xảy ra lỗi
		// throws: ném tại vị trí khai báo hàm chứa đoạn code bị exception
		//       : để chỗ gọi hàm phải biết và xử lý exception
		
		System.out.println("**__Demo Throw Throws __**\n");
		
		// validate: require input b!=0 before calling divide method
		
		// validate
		System.out.println("divide(8, 2) --> " + divide(8, 2) + "\n");
		
		// invalidate
		
		try {
			int result = divide(5, 0);
			System.out.println("divide(5, 0) --> " + result + "\n");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("**__Finished__**");
	}
	
	private static int divide(int a, int b) {
		// việc xảy ra ngoại lệ hay không, phụ thuộc vào tham số truyền vào
		// validate cho b: ko bao giờ xảy ra
		// chưa validate cho b: có thể bị ngoại lệ
		if(b == 0) {
			// failed first
			throw new ArithmeticException("denominator should not be zero");
		}
		// a = getDatabase(); // 10s
		return a / b;
	}
	
	/*
	 java.lang.ArithmeticException: / by zero
		at a.validate_trycatch_throw_throws.Ex03BasicDemo_Throw_Throws.divide(Ex03BasicDemo_Throw_Throws.java:23)
		at a.validate_trycatch_throw_throws.Ex03BasicDemo_Throw_Throws.main(Ex03BasicDemo_Throw_Throws.java:17)

	 */
}
