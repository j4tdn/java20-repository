package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int[] rowPascal = new int[]{1, 1};
		System.out.println(toString(rowPascal));
		for (int i = 1; i<= n; i++) {
			rowPascal = rowPascal(rowPascal);
			System.out.println(toString(rowPascal));
		}
		ip.close();
	}
	public static int[] rowPascal(int[] arrInput) {
		int[] arrOutput = new int[arrInput.length + 1];
		arrOutput[0] = 1;
		arrOutput[arrOutput.length - 1] = 1;
		for (int i = 0; i < arrInput.length - 1; i++) {
			arrOutput[i+1] = arrInput[i]+ arrInput[i+1];
		}
		return arrOutput;
	}
	
	public static String toString(int[] arr) {
		StringBuilder str = new StringBuilder();
		for (int ele : arr) {
			str.append(ele);
			str.append("\t");
		}
		return str.toString();
	}
}
