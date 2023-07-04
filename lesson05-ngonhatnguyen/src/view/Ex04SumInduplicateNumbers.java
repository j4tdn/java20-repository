package view;

public class Ex04SumInduplicateNumbers {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 9, 2, 5, 9 };
		System.out.println("Tổng = " + sum(arr));
	}

	private static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != getMin(array) && array[i] != getMax(array)) {
				int check = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (array[i] == array[j]) {
						check++;
					}
				}
				if (check == 0) {
					sum += array[i];
				}
			}
		}
		return sum;
	}

	private static int getMax(int[] array) {
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	private static int getMin(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
