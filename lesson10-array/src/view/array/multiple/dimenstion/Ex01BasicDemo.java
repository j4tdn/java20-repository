package view.array.multiple.dimenstion;

import bean.Item;
import bean.Triple;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Mảng một chiều: là mảng trong đó mỗi phần tử là biến KDL NT, ĐT
		int[] digits = { 1, 2, 3 };
		String[] sequences = { "a", "b", "c" };
		Item[] items = { new Item(), new Item(), null };

		// Mảng nhiều(n) chiều: là mảng một chiều trong đó mỗi phần tử là mảng n - 1
		// chiều
		// Thường thì mình sẽ dùng mảng 2 chiều
		// Nếu khi mảng > 2 chiều --> Mảng đối tượng

		// Mảng 2 chiều --> matrix
		int[][] matrix = { { 1, 2, 3 }, // matrix[0] --> lấy số 8 --> matrix[0][1]
				{ 4, 5, 6 }, // matrix[1]
				{ 7, 8, 9 } // matrix[2]
		};

		// matrix.length -> số phần tử trong mảng n chiều --> số rows
		// mỗi row chính là mỗi phần tử của matrix và có m phần tử

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println("\n=============================\n");
		// Mảng đối tượng
		Triple[] oMatrix = { new Triple(1, 2, 3), // matrix[0] --> lấy số 8 --> matrix[0][1]
				new Triple(1, 4, 3), // matrix[1]
				new Triple(5, 7, 3) // matrix[2]
		};
		for (Triple triple : oMatrix) {
			System.out.println(triple);
		}
		// Triple: x, y, z

	}
}
