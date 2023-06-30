package ex02_customsort;

import java.util.random.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CustomSort {
	public static void main(String[] args) {
		//Enter the number of elements in sequence
		int n;
		System.out.println("Enter the amount of numbers(n) to generate, enter 0 to run the test array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		Random ranum = new Random();
		
		
		
		// generate the array if n != 0
		if(n != 0) {
			int[] sequence = new int[n];
			for(int i = 0; i < n; i++) {
				sequence[i] = ranum.nextInt(5, 101);
			}
		}
		
		// Test sequence
		int[] sequence = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		
		// print the array of number
		for(int i = 0; i < sequence.length; i++)
			if(i == sequence.length - 1)
				System.out.print(sequence[i] + ".");
			else
			 System.out.print(sequence[i] + ", ");
		System.out.println();
		
		// create ArrayList to store number types.
		ArrayList<Integer> Div5 = new ArrayList<Integer>();
		ArrayList<Integer> Div7 = new ArrayList<Integer>();
		ArrayList<Integer> DivOther = new ArrayList<Integer>();
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		boolean d5, d7;
		
		for(int num : sequence) {
			d5 = d7 = false;
			if(num % 5 == 0) d5 = true;
			if(num % 7 == 0) d7 = true;
			
			if(d5 && !d7)
				Div5.add(num);
			else if(!d5 && d7)
				Div7.add(num);
			else
				DivOther.add(num);
		}
		
		// group the numbers into 1 list.
		Temp.addAll(Div7);
		Temp.addAll(DivOther);
		Temp.addAll(Div5);
		
		System.out.println(Temp);
	}
}
