package view.array.multiple.dimension;

import java.util.ArrayList;
import java.util.List;

import bean.Item;
import bean.Triple;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Mảng 1 chiều: là mảng trong đó mỗi phần tử là biến KDL NT, ĐT

		// Mảng nhiều(n) chiều: là mảng một chiều trong đó mỗi phần tử là mảng n-1 chiều
		// Thường dùng tối đa là mảng 2 chiều
		// Nếu dùng mảng > 2 chiều -> Mảng đối tượng

		// Mảng 2 chiều matrix
		int[][] matrix = { { 2, 8, 5 }, // matrix[0] --> lấy số 8 --> matrix[0][1]
				{ 1, 2, 3 }, // matrix[1]
				{ 8, 2, 3 }, };

		// matrix.length --> số phần tử trong mảng n chiều --> số rows
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
				System.out.print(matrix[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
		
		List a = new ArrayList<>();
		
		
		//Mảng đối tượng
		Triple[] omatrix = {
			new Triple(1, 2, 3), // oMatrix[0] --> lấy số 8 --> oMatrix[0].getY()
			new Triple(4, 5, 6), // oMatrix[1]
			new Triple(7, 8, 9)  // oMatrix[2]
		};
		
		System.out.println("\n===================\n");
		
		for(Triple triple : omatrix) {
			System.out.println(triple);
		}
	}
}
