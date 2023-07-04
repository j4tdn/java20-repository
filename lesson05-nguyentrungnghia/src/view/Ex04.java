package view;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 9, 2, 5, 9 };
		int[] b = { 4, 2, 6, 6, 4, 15, 1 };
		System.out.println(sum(a));
		System.out.println(sum(b));
	}

	private static int min(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++)
			if (min > numbers[i + 1])
				min = numbers[i + 1];
		return min;
	}

	private static int max(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++)
			if (max < numbers[i + 1])
				max = numbers[i + 1];
		return max;
	}

	static boolean isDuplicated(int n, int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++)
			if (n == numbers[i]) {
				count++;
				if (count > 1)
					return true;
			}
		return false;
	}

	static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++)
			if (!isDuplicated(numbers[i], numbers) && numbers[i] != min(numbers) && numbers[i] != max(numbers))
				sum += numbers[i];
		return sum;
	}

}
