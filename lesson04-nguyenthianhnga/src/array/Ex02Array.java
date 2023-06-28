package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02Array {
	public static void main(String[] args) {
		int[] arr = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		 ArrayList<Integer> divBy5 = new ArrayList<Integer>();
	     ArrayList<Integer> divBy7 = new ArrayList<Integer>();
         ArrayList<Integer> others = new ArrayList<Integer>();
		
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
            	 others.add(arr[i]);
             } else if (arr[i] % 5 == 0) {
                 divBy5.add(arr[i]);
             } else if (arr[i] % 7 == 0) {
                 divBy7.add(arr[i]);
             } else {
                 others.add(arr[i]);
             }
         }
         Integer[] result = new Integer[arr.length];
         int index = 0;
         for (Integer i : divBy7) {
             result[index++] = i;
         }
         for (Integer i : others) {
             result[index++] = i;
         }
         for (Integer i : divBy5) {
             result[index++] = i;
         }

         System.out.println("Input: " + Arrays.toString(arr));
         System.out.println("Output: " + Arrays.toString(result));
		}
	}

