package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
		// validation: validate trước đoạn code bị exception
		// try catch: đưa đoạn code có khả năng bị exception vào khối try
		
		// throw_throws:
		// throw: ném exception trước khi gọi đoạn code xảy ra lỗi
		// throws: ném tại vị trí khai báo hàm
		//		 : để chỗ gọi hàm phải biết và xử lý exception
		
		System.out.println("**__ Demo Throw Throws __**\n");
		
		// validate: require input b != 0 before calling divide method
		
		// validated		
		System.out.println("divide(8, 2) --> " + divide(8, 2));
		
		// invalidate
		
		try {
			System.out.println("divide(5, 0) --> " + divide(5, 0));
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("\n**__ Finished __**");
	}
	
	private static int divide(int a, int b) {
		// việc xảy ra ngoại lệ hay không, phụ thuộc vào tham số truyền vào
		// validate cho b: ko bao giờ xảy ra
		// chưa validate cho bL có thể bị ngoại lệ
		
		if (b == 0) {
			// failed first
			throw new ArithmeticException("denominator should not be zero");
		}
		return a / b;
	}
}
