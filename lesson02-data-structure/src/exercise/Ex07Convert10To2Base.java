package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07Convert10To2Base {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		int[] result = convert(number);
		for (int i = result.length-1; i >= 0; i--) {
			System.out.print(result[i]);
		}
	}
	
	private static int[] convert(int number) {
		int[] result = new int[100];
		int count = 0;
		while (number != 0) {
			int tmp = number % 2;
			number /= 2;
			result[count++] = tmp;
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
