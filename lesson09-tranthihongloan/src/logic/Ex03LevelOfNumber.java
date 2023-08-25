package logic;

public class Ex03LevelOfNumber {
	public static void main(String[] args) {
		int[] arr = {8, 5, 9, 20};

		
	}
	
	public static int findLevel(int number) {
		int level = 0;
		for (int i = 1; i <= number; i++) {
			if(number%i==0) {
				level++;
			}
		}
		return level;
	}
}
