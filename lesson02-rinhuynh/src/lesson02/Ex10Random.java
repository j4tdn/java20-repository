package lesson02;

import java.util.Random;

public class Ex10Random {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		int count = 0; 

		while (count < 5) {
		    int a = rd.nextInt(20, 31);
		    boolean isDuplicate = false;
		    for (int i = 0; i < count; i++) { 
		        if (a == arr[i]) {
		            isDuplicate = true;
		            break;
		        }
		    }
		    if (!isDuplicate) {
		        arr[count++] = a;
		    }
		}
		for (int j = 0; j < arr.length; j++) {
		    System.out.print(arr[j] + " ");
		}
	}

}
