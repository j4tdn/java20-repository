package view;

public class IsPowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 8));
	}
	
	private static boolean isPowerOf(int a, int b) {
		double result; 
		if(a > b) {
			 result = Math.log(a)/Math.log(b);
		}else {
			result = Math.log(b)/Math.log(a);
		}
		 return result % 1 == 0;
	}
}
