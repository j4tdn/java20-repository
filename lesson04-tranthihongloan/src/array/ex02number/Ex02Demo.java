package array.ex02number;

import java.util.Random;
import java.util.Scanner;

public class Ex02Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberArray arr = new NumberArray();
		
		
		System.out.print("Nhập n: ");
		arr.setLength(sc.nextInt());
		
		// Random dãy số ngẫu nhiên
		getArray(arr);
		
		// In mảng
		System.out.print(arr.toString());
		
		sc.close();
	}
	
	public static NumberArray arrangeArray(NumberArray a) {
		int i, j = a.getLength()-1, k = 0;
		int[] array = a.getValue();
		for(i = 0; i < a.getLength(); i++) {
			if(array[i] % 7 == 0) {
				swap(array[i],array[k]);
				k++;
			}
			else if (array[i] % 5 == 0) {
				swap(array[i],array[a.getLength()-1-j]);
				j--;
			}
			
			System.out.println(k);
		}
		return a;
	}
	
	public static void getArray(NumberArray a) {
		Random rd = new Random();
		int[] array = new int[a.getLength()]; 
		for(int i = 0; i < a.getLength(); i++) {
			array[i] = rd.nextInt(5, 101);	
		}
		a.setValue(array);
	}

	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
