package view;

import java.util.Random;

public class Ex10RandomNumberNotMatch {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		int num;
		for (int i = 0; i < 5; i++) {
			do {
			Random rd = new Random();
			num = rd.nextInt(20, 31);
			} while (checkForDuplicates(numbers, num));
			numbers[i] = num;
		}

		System.out.print("Day so: ");
		for(int each: numbers) {
			System.out.print(each + "  ");
		}
	}
	private static boolean checkForDuplicates (int[] arr, int number) {
		for(int i = 0; i < arr.length; i++) {
			if(number == arr[i]) return true;
		}
		return false;
	}
}
