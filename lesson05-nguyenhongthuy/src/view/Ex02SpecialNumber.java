package view;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		System.out.println("isSpecialNumber 1 ==> " + isSpecialNumber(1));
		System.out.println("isSpecialNumber 3 ==> " + isSpecialNumber(3));
		System.out.println("isSpecialNumber 6 ==> " + isSpecialNumber(6));
		System.out.println("isSpecialNumber 10 ==> " + isSpecialNumber(10));
		System.out.println("isSpecialNumber 20 ==> " + isSpecialNumber(20));
		System.out.println("isSpecialNumber 35 ==> " + isSpecialNumber(35));
	}
	
	private static boolean isSpecialNumber(int number) {
		int s = 0;
		int i = 1;
		while(s < number) {
			s += i;
			i++;
		}
		if(s == number)
			return true;
		return false;
	}
}
