package ex05_levelofnumber;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class NumberLevel {
	public static void main(String[] args) {
		int i, j, temp;
		boolean swapped;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter n to generate an array(3 <= n <= 20): ");
		int n = sc.nextInt();
		
		Random ran = new Random();
		int[] sequence = new int[n];
		for(i = 0; i < n; i++) {
			sequence[i] = ran.nextInt(2, 101);
		}
		
		System.out.println("The original sequence is: ");
		System.out.println(Arrays.toString(sequence));
		System.out.println();
		
		// Bubble sort algorithm
		for(i = 0; i < n - 1; i++) {
			swapped = false;
			for(j = 0; j < n - i - 1; j++) {
				if(calcLevel(sequence[j]) > calcLevel(sequence[j+1])) {
					temp = sequence[j];
					sequence[j] = sequence[j+1];
					sequence[j+1] = temp;
					swapped = true;
				}
			}
			
			// If no two elements were
			// swapped by inner loop, then break
			if(swapped == false)
				break;
		}
		
		System.out.println("The sorted sequence is: ");
		System.out.println(Arrays.toString(sequence));
		
	}
	
	// Calculate the level of number.
	public static int calcLevel(int n) {
		int level = 0;
		for(int i = 1; i < Math.sqrt(n); i++) {
			if(n % i == 0)
				level++;
		}
		return level;
	}
}
