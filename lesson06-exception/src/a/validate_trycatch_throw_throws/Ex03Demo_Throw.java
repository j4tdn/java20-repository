package a.validate_trycatch_throw_throws;

public class Ex03Demo_Throw {
	public static void main(String[] args) {
		// validation: validate trước đoạn code bị exception
		// try catch: đưa đoạn code có khả năng bị exception vào khối try

		// throw_throws:
		// throw: ném exception trước khi gọi đoạn code xảy ra lỗi
		// throws: ném tại vị trí khai báo hàm(chứa đoạn code bị exception)
		// : để chỗ gọi hàm phải biết và xử lý exception

		System.out.println("----- Demo throw throws ----- ");

		System.out.println("divide(8,2) --> " + divide(8, 2));

		// Invalidate

		try {
			int result = divide(5, 0);
			System.out.println("divide(5,0) --> " + result);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("----- Finished ----- ");
	}

	private static int divide(int a, int b) throws ArithmeticException {

		if (b == 0) {
			// Failed first
			throw new ArithmeticException("Denominator should not be zero");
		}
		return a / b;
	}
}
