package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
		// validation: validate trước đoạn code bị exception
		// try catch: đưa đoạn code có k/n bị exception vào khối try
		
		// throw: ném exception trước khi lỗi xảy ra
		// throws: ném tại vị trí khai báo hàm để chỗ gọi hàm phải biết và xử lí exception
		
		System.out.println("**__Demo Throw Throws__**\n");
		
		// validate; require input b != 0 before calling divide method
		
		// validated
		System.out.println("divide(8, 2) --> " + divide(8,2) + "\n");
		
		// invalidated
		try {
			int result = divide(5, 0);
			System.out.println("divide(5, 0) --> " + result + "\n");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("finished");
	}
	
	private static int divide(int a, int b) {
		// việc xảy ra exception ==> phụ thuộc tham số truyền vào
		// validate cho b: ko bh xảy ra ngoại lệ
		// invalidate: có thể bị ngoại lệ
		if (b == 0) {
			// failed first
			throw new ArithmeticException("denominator should not be zero");
		}
		// a = getDatabase(); --> 10s
		return a / b;
	}
	
	/*
	java.lang.ArithmeticException: / by zero
	at a.validate_trycatch_throw_throws.Ex03BasicDemo_Throw_Throws.divide(Ex03BasicDemo_Throw_Throws.java:18)
	at a.validate_trycatch_throw_throws.Ex03BasicDemo_Throw_Throws.main(Ex03BasicDemo_Throw_Throws.java:13)

	 */
}
