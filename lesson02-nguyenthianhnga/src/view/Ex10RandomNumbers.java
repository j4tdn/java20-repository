package view;

import java.util.Random;

public class Ex10RandomNumbers {
	 public static void main(String[] args) {
	        int[] numbers = new int[5];
	        Random random = new Random();
	        int count = 0;
	        while (count < 5) {
	            int number = random.nextInt(20,30);
	            if (!contains(numbers, number)) {
	                numbers[count] = number;
	                count++;
	            }
	        }
	        System.out.println("5 random numbers from 20 to 30:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }
	    }

	    private static boolean contains(int[] array, int number) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == number) {
	                return true;
	            }
	        }
	        return false;
	    }
}
