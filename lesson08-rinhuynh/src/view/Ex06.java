package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter here: ");
		int n = in.nextInt();
		int i = 1;
		StringBuilder stringNum = new StringBuilder();
		if(n < 20) {
			while(i <= n) {
				stringNum.append(i +"");
				i++;
			}
		} else {
			while(i <= (n/2)) {
				stringNum.append(i +"");
				i++;
			}
		}
		System.out.println(stringNum);
		String[] arr = stringNum.toString().split("");
		System.out.println(arr[n-1]);
	}
}