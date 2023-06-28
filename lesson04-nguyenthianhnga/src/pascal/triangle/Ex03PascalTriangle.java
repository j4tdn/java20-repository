package pascal.triangle;

public class Ex03PascalTriangle {
	public static void main(String[] args) {
		int n = 6;
		int[][] pascal = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					pascal[i][j] = 1;
				} else {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
		}
	}
}
/*
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 

p[3][1] = p[2][0]+ p[2][1]--> (số trên đầu và bên trái đầu tiên)-->của hàng trên

 
 */
