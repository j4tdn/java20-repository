import java.util.Random;

public class Bai10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int randomNumber;
		boolean duplicated = false;
		
		for (int i = 0; i < 5; i++) {
			do {
				randomNumber = rd.nextInt(20, 31);
				for (int j = 0; j < i; j++) {
					if (randomNumber == numbers[j]) {
						duplicated = true;
						break;
					} else
						duplicated = false;
				}
			} while (duplicated);
			numbers[i] = randomNumber;
		}
		
		for (int num : numbers)
			System.out.print(num + " ");
	}
}
