package exercise;

import java.util.Random;

public class Ex10Random5Numbers {
	public static void main(String[] args) {
		Random rd = new Random();
		int count = 0;
		int[] stored = new int[5];
		do {
			int number = rd.nextInt(20, 31);
			if (!isExist(stored, number)) {
				stored[count++] = number;
				System.out.print(number + " ");
			}
		} while (count < 5);
	}

	private static boolean isExist(int[] numbers, int data) {
		for (int number : numbers) {
			if (data == number) {
				return true;
			}
		}

		return false;
	}
}
