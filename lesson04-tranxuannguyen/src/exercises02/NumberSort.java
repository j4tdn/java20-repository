package exercises02;

import java.util.Random;
import java.util.Scanner;

public class NumberSort {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của dãy số: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(5,100);
        }
        
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
                swap(arr, i, left);
                left++;
            }
        }

        int right = n-1;
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                swap(arr, i, right);
                right--;
            }
        }

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
