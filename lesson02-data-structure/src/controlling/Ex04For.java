package controlling;

public class Ex04For {
	public static void main(String[] args) {
		// Duyệt và in ra các số nguyên dương < n
		int n = 12;
		for (int i = 1; i < n; i++)
			System.out.print(i + " ");

		System.out.println("\n\n=================\n");

		// label
		ff: for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print("" + row + col + " ");
				if (row == 5 && col == 3)
					break ff;
			}
			System.out.println();
		}
	}
}
