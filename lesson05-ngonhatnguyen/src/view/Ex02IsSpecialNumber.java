package view;

public class Ex02IsSpecialNumber {
	public static void main(String[] args) {
		int n = 6;
		if (isSpecialNumber(n)) {
			System.out.println(n + " là số đặc biệt");
		} else {
			System.out.println(n +  " không phải số đặc biệt");
		}
	}
	
	private static boolean isSpecialNumber(int x) {
		int S = 0;
		for (int i = 1; i <= x; i++) {
			S += i;
			if (S == x) {
				return true;
			}
		}
		return false;
	}
}
