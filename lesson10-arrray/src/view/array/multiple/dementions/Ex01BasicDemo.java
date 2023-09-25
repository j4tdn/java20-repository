package view.array.multiple.dementions;


import bean.Triple;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//Mãng một chiều : trong đó mỗi phần tử là biến KDL NT, ĐT
//		int[] a = {1, 2, 3};
//		String[] b = {"a", "b ", "c"};
//		Item[] c = {new Item(), null, new Item()};
//		
		//Mãng nhiều chiều: mãng trong đó mỗi phần tử là một mảng N-1 chiều
		
		// Mãng 2 chiều: 
		int[][] matrix ={
				{2,8,7},//matrix[0] --> lấy số 8 --> matrix[0][1]
				{1,2,6},//matrix[1]
				{4,7,9}//matrix[2]
		};
		
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "  ");
			}
			System.out.println();
		}
		
		Triple[] triples = {
				new Triple(2, 4, 6),
				new Triple(3, 7, 7),
				new Triple(5, 4, 9)
		};
		System.out.println("===========");
		for(Triple triple:triples) {
			System.out.println(triple);
		}
		// Mãng 4 chiều 
		
	}
}
