package ex01;

public class Ex01PowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(6, 2)); 
		System.out.println(isPowerOf(2, 8)); 
		System.out.println(isPowerOf(6, 2)); 
	}
	public static boolean isPowerOf(int base, int num) {
	    if (base <= 1 || num <= 0) {
	        return false;
	    }
	    int power = 1;
	    while (power < num) {
	        power *= base;
	    }
	    return power == num;
	}
	
}
