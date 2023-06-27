package ex2;

public class Main {
	 public static void main(String[] args) {
	        int[] arr = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
	        int n = arr.length;
	        int pos7 = 0; // vị trí số chia hết cho 7
	        int pos5 = n - 1; // vị trí số chia hết cho 5

	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 7 == 0) {
	                // đổi chỗ số hiện tại với số ở vị trí pos7
	                int temp = arr[i];
	                arr[i] = arr[pos7];
	                arr[pos7] = temp;
	                pos7++; // tăng vị trí số chia hết cho 7 lên 1
	            } else if (arr[i] % 5 == 0) {
	                // đổi chỗ số hiện tại với số ở vị trí pos5
	                int temp = arr[i];
	                arr[i] = arr[pos5];
	                arr[pos5] = temp;
	                pos5--; // giảm vị trí số chia hết cho 5 đi 1
	            }
	        }

	        // in ra các số theo thứ tự
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

