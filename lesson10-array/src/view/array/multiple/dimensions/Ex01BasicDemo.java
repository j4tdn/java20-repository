package view.array.multiple.dimensions;

import bean.Triple;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// mảng 1 chiều
		
		
		// mảng nhiều chiều: là mảng 1 chiều trong đó mỗi phần tử là 1 mảng n-1 chiều
		// nếu > 2 chiều --> nên tạo ra mảng đối tượng
		
		// mảng 2 chiều
		int[][] matrix = {
				{1, 2, 3}, 
				{4, 5, 0},
				{3, 1, 9}
		};
		
		// mảng đối tượng
		Triple[] oMatrix = {
				new Triple(2, 3, 4), // oMatrix[0] --> get 3 --> oMatrix[0].getY()
				new Triple(1, 0, 4),
				new Triple(2, 9, 5)
		};
		for (Triple triple: oMatrix) {
			System.out.println(triple);
		}
	
	}
}
