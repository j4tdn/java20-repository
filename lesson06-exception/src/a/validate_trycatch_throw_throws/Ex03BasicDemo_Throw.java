package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	// 2 laoij : runtime exception(con của runtime exception)
	// con của IOException --> compile exception
	public static void main(String[] args) {
		// validation: validate trước khi đoạn code bị exception
		// try catch: đưa đoạn code có khả năng bị exception vào khối try

		// throw_throws:
		// throw: ném exception trước khi lỗi xảy ra
		// throws: ném tại vị trí khai báo hàm
		// : để chỗ gọi hàm phải biết và xử lý exception
		System.out.println("**__Demo Throw Throws__**\n");
		System.out.println("divide(8,2)--> " + divide(8, 2) + "\n");

		try {
			// int result = devide(5,0);
			// System.out.println("divide(8,2)--> "+result+"/n");
			System.out.println("divide(8,2)--> " + divide(5, 0) + "/n");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		// System.out.println("divide(8,2)--> "+divide(5,1)+"/n");
		System.out.println("**__Finished__**\n");
	}

	private static int divide(int a, int b) {
		// việc xảy ra ngoại lệ hay không. phụ thuộc vào tham số truyền vào
		// validate cho b: không bao giờ xảy ra
		// chưa validate cho b: có thể bị ngoại lệ
		if (b == 0) {
			throw new ArithmeticException("denomirator should not be zero");

		}
		return a / b;
	}
}
