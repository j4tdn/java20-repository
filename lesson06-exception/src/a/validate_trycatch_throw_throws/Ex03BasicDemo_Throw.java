package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
		//throw: ném ngoại lệ Exception trước khi đoạn code lỗi xảy ra
		
		//throws: ném tại vị trí khai báo hàm 
		//		: để chỗ gọi hàm phải biết và xử lý exception
	System.out.println("Demo throw throws: \n");
	
	//validate: require input b != 0 before calling divide method
	System.out.println("divide(8,4)= " + divide(8, 2));
	
	try {
		System.out.println("divide(4,0)= " + divide(4, 0));
	} catch (ArithmeticException ae) {
		ae.printStackTrace();
	}   
	
	
	System.out.println("\n finish: ");
	}
	private static int divide(int a, int b) {
		//việc xảy ra ngoại lệ hay không phụ thuộc vào tham số truyền vào 
		//validate cho b: ko bao h xảy ra ngoại lệ 
		// nếu chưa: thì có thể bị ngoại lệ
		if(b == 0) {
			//failed first
			throw new ArithmeticException("denominator should not be zero");
		}
		return a/b;
	}	
}
