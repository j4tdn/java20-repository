package ex02specialnumber;

public class SpecialNumber {
	public static boolean isSpecialNumber(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
			if (sum == number) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(8));
	}
}
