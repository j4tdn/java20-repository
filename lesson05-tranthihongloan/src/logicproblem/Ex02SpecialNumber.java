package logicproblem;

import java.util.Scanner;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập một số: ");
		int N = sc.nextInt();
		
		if(isSpecialNumber(N)) {
			System.out.println(N + " là số đặc biệt");
		} else {
			System.out.println(N + " không phải là số đặc biệt");
		}
		
	}
	
	public static boolean isSpecialNumber(int N) {
		int sum = 0;
	
		for(int i = 1; i <= N; i++) {
			sum = sum + i;
			if(sum == N) {
				break;
			} 
			if(sum > N) {
				break;
			}
		}
		if(sum == N) {
			return true;
		} else {
			return false;
		}
	}
}
