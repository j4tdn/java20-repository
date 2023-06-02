package homework;

import java.util.Random;

public class Ex10DisplayRandomNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arrays = new int[5];

		for (int i = 0; i < 5; i++) {
			arrays[i] = rd.nextInt(20,31);
			while (isDuplicate(arrays, i, arrays[i])) {
				arrays[i] = rd.nextInt(20,31);
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Array[" + i + "] = " + arrays[i]);
		}
	}

	private static boolean isDuplicate(int a[], int currentIndex, int duplicateNumber) {
		for (int i = 0; i < currentIndex; i++) {
			if (a[i] == duplicateNumber) {
				return true;
			}
		}
		return false;
	}
}
