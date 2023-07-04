package view;

public class Ex01isPowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8,4));
	}
	private static boolean isPowerOf(int a, int b) {
		int n = 1;
		if(a > b) {
			while(a > n) {
				n *= b; 
			}
		}
		if(a < b) {
			while(b > n) {
				n *= a;
			}
		}
		if (a == n|| b == n) {
			return true;
		}
		return false;
	}
}
