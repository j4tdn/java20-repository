package ex03_pascaltriangle;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] firstArr = {1, 1};
		System.out.println("Enter n for the pascal triangle of level n: ");
		int n = sc.nextInt();
		generateTriPascal(4, firstArr);
		sc.close();
	}
	
	public static void generateTriPascal(int n, int[] listNum) {
		if(n == 0) {
			return;
		}
				
		if(listNum.length == 2) {
			System.out.print(listNum[0] + "  " + listNum[1]);
			System.out.print("\n\n");
		}
		int[] listNumNext = new int[listNum.length + 1];
			
		listNumNext[0] = listNumNext[listNum.length] = 1;
			
		System.out.print(listNumNext[0] + "  ");
			
		for(int i = 1; i < listNumNext.length - 1; i++) {
			listNumNext[i] = listNum[i] + listNum[i-1];
			System.out.print(listNumNext[i] + "  ");
		}
			
		System.out.print(listNumNext[listNum.length]);
		
		System.out.print("\n\n");
		generateTriPascal(n-1, listNumNext);
	}
}
