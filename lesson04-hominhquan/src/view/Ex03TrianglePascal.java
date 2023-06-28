package view;

public class Ex03TrianglePascal {
	  public static void main(String[] args) {
	        int n = 5;
	        int[] triangle = new int[n];

	        for (int i = 0; i < n; i++) {
	            triangle[i] = 1;

	            for (int j = i - 1; j > 0; j--) {
	                triangle[j] = triangle[j] + triangle[j - 1];
	            }

	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[j] + " ");
	            }

	            System.out.println();
	        }
	    }
}
