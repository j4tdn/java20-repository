package view;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		Random  rd = new Random();
		int [] arr = new int [5];
		int index = 0;
		int number = 0;
		System.out.println("Print 5 different random numbers of [20, 30]: ");
		do {
			number = rd.nextInt(20, 30);
			boolean isOfArr = true;	
			for (int i = 0; i <= index ; i++) {
				isOfArr = true;
				if (arr[i] == number) 
					break;
				else isOfArr = false;
					
			}
			if (!isOfArr) {
				arr[index] = number;
				System.out.print(arr[index]+ " ");
				index ++;
			}	
		} while (index <= 4);
	}
}
