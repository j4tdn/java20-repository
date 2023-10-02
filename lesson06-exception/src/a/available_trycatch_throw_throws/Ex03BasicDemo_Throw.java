package a.available_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	public static void main(String[] args) {
		//validation: validate trước đoạn code bị exception
		//try catch: đưa đoạn code có khả năng bị exception vào khối try
		
		//throw_throws:
		//throw: nén exception trước khi gọi đoạn code xảy ra lỗi
		//throws: ném tại vị trí khai báo hàm
		//		: đễ chỗ gọi hàm phải biết và xử lý exception
		
		System.out.println("--Demo Throw Throws--\n");
		
		//validate: require input b != 0 before calling divide method
		
		System.out.println("divide(8, 2) --> " + devide(8, 2) + "\n");
		
		//invalidate
		
		try {
			int result = devide(5, 0);
			System.out.println("divide(5, 0) --> " + result + "\n");
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("--Finished--");
	}
	
	private static int devide(int a, int b) {
		//việc xảy ra ngoại lệ hay không, phụ thuộc vào tham số truyền vào
		//validate cho b: không bao giờ xảy ra
		//chưa validate cho b: có thể bị ngoại lệ
		
		if(b == 0)
			//failed first
			throw new ArithmeticException("denominator should not be zero");
		//a = getDatabase(); -> nếu load dữ liệu ko đc --> ném exception trước khi load --> đỡ tốn time
		return a/b;
	}
}
