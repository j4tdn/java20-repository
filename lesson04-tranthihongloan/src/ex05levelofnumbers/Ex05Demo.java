package ex05levelofnumbers;

import java.util.Arrays;

public class Ex05Demo {
	public static void main(String[] args) {
		
		LvNumber[] lvNumbers = new LvNumber[4];
		
		lvNumbers[0] = new LvNumber(8, 0);
		lvNumbers[1] = new LvNumber(5, 0);
		lvNumbers[2] = new LvNumber(9, 0);
		lvNumbers[3] = new LvNumber(20, 0);
		
		findLevels(lvNumbers);
		
		for (LvNumber number : lvNumbers) {
			System.out.println(number.getValue() + " ");
		}
	}

	public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }   
            arr[j + 1] = key;
        }
    }
	
	public static void findLevels (LvNumber[] lvNumbers) {
		for(int i = 0; i < lvNumbers.length; i++) {
			lvNumbers[i].setLevel(countDivisor(lvNumbers[i].getValue()));;
		}
	}
	
	public static int countDivisor(int number) {
		int count = 0;
		for(int i = 1; i<= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		return count;
	}
}
