package view;


public class Ex05LevelNumber {
	public static void main(String[] args) {
		int[] numbers = {8, 5, 9, 20};
		int n = numbers.length;
		int[] levels = new int[n];
        for (int i = 0; i < n; i++) {
            levels[i] = Divisors(numbers[i]);
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (levels[i] > levels[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                    int tempLevel = levels[i];
                    levels[i] = levels[j];
                    levels[j] = tempLevel;
                }
            }  
        }
        System.out.println("mang sau khi sap xep:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
	}
	
	private static int Divisors(int n) {
		int count = 1;
		for(int i = 1; i <= n/2 ; i++) {
			if(n % i == 0) {
				count++;	
			}
		}
		return count;
	}
}
