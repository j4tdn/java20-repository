package ex03pascaltriangle;

public class Ex03PascalTriangle {
	
	// Các hàng trong tam giác lần lượt là tất cả các tổ hợp của i (với i chạy từ 1 đến n)
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println("=========Pascal=========");
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + calCombination(j, i));
			}
			System.out.println();
		}
	}
	
	private static int calCombination(int k, int n) {
		if (k == 0 || k == n ) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return calCombination(k - 1, n - 1) + calCombination(k, n - 1);
	}
}
