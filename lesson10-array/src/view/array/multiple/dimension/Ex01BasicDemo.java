package view.array.multiple.dimension;

import bean.Item;
import bean.Triple;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		
		// Mảng một chiều: là mảng trong đó mỗi phần tử là biến KDL nguyên thuỷ/đối tượng
		int[] digits = { 1, 2, 3 };
		String[] sequences = { "a", "b", "c" };
		Item[] items = { new Item(), null, new Item() };
		
		// Mảng nhiều chiều: là mảng một chiều trong đó mỗi phần tử là mảng n - 1 chiều
		// Thường mình sẽ dùng mảng 2 chiều
		// Nếu > 2 chiều => Dùng mảng đối tượng
		
		// Mảng 2 chiều
		int[][] matrix = {
				{ 2, 8, 5 },
				{ 1, 2, 6 },
				{ 4, 7, 9 }
		};
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) 
				System.out.print(matrix[rowIndex][columnIndex] + " ");
			System.out.println();
		}
		
		System.out.println("========================");
		
		// Mảng đối tượng
		Triple[] oMatrix = {
			new Triple(2, 8, 5),	
			new Triple(1, 2, 6),	
			new Triple(4, 7, 9)	
		};
		for (Triple triple : oMatrix)
			System.out.println(triple);
	}

}
