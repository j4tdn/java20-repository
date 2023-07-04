package view;

public class Ex02isSpecialNumber {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(8));
	}
	private static boolean isSpecialNumber(int num) {
		int s = 0;
		int count = 1;
		while(num > s) {
			s += count++;
		}
		if (s == num) {
			return true;
		}
		return false;
	}
}
