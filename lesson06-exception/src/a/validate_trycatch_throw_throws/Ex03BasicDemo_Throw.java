package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
		//throw_throws:
		//+throw:ném exception trước khi ngoại lệ xảy ra lỗi
		//throws: ném tại vị trí khai báo hàm
		//		: để chỗ gọi hàm phải biết và xử lý exception
		
		System.out.println("********Demo throw_throws*****\n");
		
		System.out.println("divede(8.2)-->" + divede(8, 2) + "\n");
		
		try {
			System.out.println("divede(5.0)-->" + divede(5, 0) + "\n");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		
		System.out.println("*******Finish******");
	}
	private static int divede(int a, int b) {
		//việc xảy ra ngoiaj lệ hay không phụ thuộc vào tham số truyền vào
		//validate cho b : không bao giờ xảy ra
		//chưa validate cho b :có thể bị ngoại lệ
		if(b == 0) {
			//fail first
			throw new ArithmeticException("denomirator should not be zero ");
		}
		return a/b;
	}
}
