package controlling;

public class Ex04For {
	public static void main(String[] args) {
		// Duyệt và in ra các số nguyên dương nhỏ hơn n
		// Sử dụng for khi
		// 
		// 
		int n = 12;
		int i = 1;
		for ( ; ; ) {
			System.out.print(i + " ");
			i++;
			if (i == n) {
				break;
			}
		}
		
		System.out.println("\n=======================\n");
		
		for (i = 1;i < n;i++) {
			System.out.println(i + " - ");
		}
		
		System.out.println("\n=======================\n");
		// row = 5, col = 3
		ff: for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= 4; col++) {
					System.out.print(" " + row + col + " ");
					if (row == 5 && col == 3) {
						break ff;
					}
			}
			System.out.println();
		}
	}
}
