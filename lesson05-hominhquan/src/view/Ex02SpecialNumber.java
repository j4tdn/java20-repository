package view;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(10));
	}
	private static boolean isSpecialNumber(int n) {
		int result = 0;
	
		for(int i = 1; i <= n; i++) {
			result += i;
			if(result == n) {
				return true;
			}
		}
		return false;
	}
}
