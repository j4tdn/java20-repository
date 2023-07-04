package view;

public class Ex01IsPowerOf {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		
		if (isPowerOf(x, y)) {
			System.out.println("(" + x + ", " + y + ") --> True");
		} else {
			System.out.println("(" + x + ", " + y + ") --> False");
		}
	}
	
	private static boolean isPowerOf(int a, int b) {
		int max, min;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		for (int i = 0; i <= max; i++) {
			if (Math.pow(min, i) == max) {
				return true;
			}
		}
		return false;
	}
}
