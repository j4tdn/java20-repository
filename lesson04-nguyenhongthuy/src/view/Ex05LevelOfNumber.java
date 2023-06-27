package view;

import java.util.Random;

public class Ex05LevelOfNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int n = rand .nextInt(3, 21);
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		
		System.out.println("Mang ban dau: ");
		for (int num : arr) {
            System.out.print(num + " ");
        }
		arrangeDivisorLevel(arr);
		System.out.println("\n\nMang sau khi sap xep: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}
	
	public static int countDivisorLevel(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0)
				count++;
		}
		return count;
	}
	
	 public static void arrangeDivisorLevel(int[] arr) {
	        int n = arr.length;
	        
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int count = countDivisorLevel(key);
	            int j = i - 1;
	            
	            while (j >= 0 && countDivisorLevel(arr[j]) > count) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            
	            arr[j + 1] = key;
	        }
	    }
}
