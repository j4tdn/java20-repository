package a.validate_trycatch_throw_throws;

public class Ex03BasicDemo_Throw {
	
	public static void main(String[] args) {
		System.out.println("**__ Demo Throw Throws __**\n");
		
		System.out.println("divide (8, 2) --> " + divide(8, 2));
		
		try {
			int result = divide(5, 0);
			System.out.println("divide(5, 0) --> " + result + "\n");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("\n**__ Finished __**");
	}
	
	private static int divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("denominator should not be zero");
		return a / b;
	}
	
}
