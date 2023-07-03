package ex03_triangle_pascal;

public class TrianglePascal {
	public static void main(String[] args) {
		int lineNumbers = 6;

		int[][] arr = new int[lineNumbers][lineNumbers];
		arr[0][0] = 1;

		for (int i = 1; i < lineNumbers; i++) {
			for (int j = 0; j < lineNumbers; j++) {
				if (j == 0) {
					arr[i][j] = 1;
					continue;
				}
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}

//	private static void print(int[][] arr, int lineNumbers) {
		for (int i = 0; i < lineNumbers; i++) {
			for (int j = 0; j < lineNumbers; j++) {
				if (arr[i][j] == 0) {
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
