package ex02;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1)); 
		System.out.println(isSpecialNumber(3)); 
	}
	public static boolean isSpecialNumber(int num) {
	    if (num < 1) {
	        return false;
	    }
	    int sum = 0;
	    for (int i = 1; i <= num; i++) {
	        sum += i;
	    }
	    return sum == num;
	}
}
