package numbercheck_bai3;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows, columns = 0;
		System.out.println("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		columns = sc.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.printf("Enter the [%d][%d] number: ",i,j);
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("The array is: ");
		
		for(int[] row : arr) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		boolean foundNumber = false;
		
		int minIndexCol = 0;
		int minIndexRow = 0;
		outerloop:
		for(int i = 0; i < rows; i++){
			int smallestNum = arr[i][0];
			for(int j = 0; j < columns; j++) {
				if (arr[i][j] < smallestNum) {
					smallestNum = arr[i][j];
					minIndexRow = i;
					minIndexCol = j;
				}
			}
			
			int biggestNum = arr[0][minIndexCol];
			for(int i2 = 0; i2 < rows; i2++) {
				if(arr[i2][minIndexCol] > biggestNum)
					biggestNum = arr[i2][minIndexCol];
			}
			
			if(smallestNum == biggestNum) {
				foundNumber = true;
				break outerloop;
			}
		}
		
		System.out.println(foundNumber ? "Phần tử yên ngựa là: A" + minIndexRow + minIndexCol : "Không có phần tử yên ngựa");
		
	}
}
