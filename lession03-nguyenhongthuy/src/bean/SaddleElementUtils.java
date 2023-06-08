package bean;

import java.util.Random;
import java.util.Scanner;

public class SaddleElementUtils {
	public static SaddleElement inputMatrixRandom() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		SaddleElement saddleElement;
		System.out.print("Enter row: ");
		int row = Integer.parseInt(sc.nextLine());
		System.out.print("Enter column: ");
		int column = Integer.parseInt(sc.nextLine());
		saddleElement = new SaddleElement(row, column);
		
		int[][] array = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				array[i][j] = rd.nextInt(1, 100);
			}
		}
		saddleElement.setArraySaddle(array);
		sc.close();
		return saddleElement;
	}
	
	public static void outputMatrix(SaddleElement saddleElement) {
		int[][] array = saddleElement.getArraySaddle();
		System.out.println("\n============Matrix=============");
		for(int i = 0; i < saddleElement.getRow(); i++) {
			for(int j = 0; j < saddleElement.getColumn(); j++) {
				System.out.printf("%-3d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("===============================\n");
	}
	
	public static void printSaddleElement(SaddleElement saddleElement) {
		int[][] array = saddleElement.getArraySaddle();
		int count = 0; //Đếm phần tử yên ngựa, nếu không có thì thông báo 
		int min = 0, max = 0;
		int column = 0; //dùng để giưa vị trí column của phần tử nhỏ nhất trong hàng
		for(int i = 0; i < saddleElement.getRow(); i++) {
			//Tìm phần tử min trong hàng
			min = array[i][0];
			for(int j = 1; j < saddleElement.getColumn(); j++) {
				if(array[i][j] < min) {
					min = array[i][j];
					column = j;
				}
			}
			
			//Tìm phần tử max của cột chứa min vừa tìm
			max = array[i][column];
			for(int k = 0; k < saddleElement.getRow(); k++) {
				if(array[k][column] > max)
					max = array[k][column];
			}
			
			if(min == max) {
				System.out.println("Phan tu yen ngua: " + array[i][column]);
				count++;
			}
			
		}
		if(count == 0)
			System.out.println("Khong co phan tu yen ngua!");
	}

}
