package view;

public class Ex02GetMissingNumber {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 6, 5, 4, 8 };
		System.out.println("missing number is --> " + getMissingNumber(numbers));
	}

	private static int getMissingNumber(int[] numbers) {
		int sum = (numbers.length + 1) * (numbers.length + 2) / 2;
		int sumOfArray = 0;
		for (int number : numbers) {
			sumOfArray += number;
		}
		return sum - sumOfArray;
	}
}
