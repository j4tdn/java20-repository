package view.array.multiple.dimenstion;

import bean.Item;
import bean.Triple;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Mảng một chiều: là mảng trong đó mỗi phần tử là biến KDL NT, ĐT
		int[] digits = { 1, 2, 3 };
		String[] sequences = { "a", "b", "c" };
		Item[] items = { new Item(), null, new Item() };

		// Mảng nhiều(n) chiều: là mảng một chiều trong đó mỗi phần tử là mảng n-1 chiều
		// Thường là mình sẽ dùng tối đa là mảng 2 chiều
		// Nếu khi mảng > 2 chiều --> Mảng đối tượng
		
		// Mảng 2 chiều --> matrix
		int[][] matrix = {
				{2, 8, 5}, // matrix[0] --> lấy số 8 --> matrix[0][1]
				{1, 2, 6}, // matrix[1]
				{4, 7, 9}  // matrix[2] 
		};
		
		// matrix.length --> số phần tử trong mảng n chiều --> số rows
		// mỗi row chính là mỗi phần tử của matrix và có m phần tử
		
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
				System.out.print(matrix[rowIndex][columnIndex] + "    ");
			}
			System.out.println();
		}
		
		// Mảng đối tượng
		Triple[] oMatrix = {
				new Triple(2, 8, 5), // oMatrix[0] --> lấy số 8 --> oMatrix[0].getY()
				new Triple(1, 2, 6), // oMatrix[1]
				new Triple(4, 7, 9)  // oMatrix[2] 
		};
		
		System.out.println("\n================\n");
		
		for (Triple triple: oMatrix) {
			System.out.println(triple);
		}
		
		// Triple: x, y, z
	}
}