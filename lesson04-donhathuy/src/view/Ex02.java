package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = Integer.parseInt(ip.nextLine());
		System.out.println("Enter array elements: ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(ip.nextLine());
		}
		StringBuilder div7 = new StringBuilder();
		StringBuilder div5 = new StringBuilder();
		StringBuilder remain = new StringBuilder();
		
		
		for (int ele : arr) {
			if (ele % 7 == 0 && ele % 5 != 0) {
				div7.append(ele+ " ");
			}else 
				if (ele % 7 != 0 && ele % 5 == 0) {
				div5.append(ele+ " ");
			}else 
				remain.append(ele+ " ");
		}
		StringBuilder result = new StringBuilder().append(div7).append(remain).append(div5);
		System.out.println(result.toString());
		ip.close();
	}
	
}
