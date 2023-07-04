package ex02numberarray;

import java.util.Arrays;

public class Ex02DemoFix {
	public static void main(String[] args) {
		Integer[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18, 70};
		
		numbers = arrange(numbers);
		System.out.println("Array arranged --> " + Arrays.toString(numbers));
	}
	
	public static Integer[] arrange(Integer[] arr) {
		int i, j = arr.length-1, k = 0;
		
		for(i = 0; i < arr.length; i++) {
			if(i > j) {
				break;
			}
			if(arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				// arr[k] là số hoán đổi cho arr[i] khi arr[i] chia hết cho 7
				swap(arr ,i, k);
				k++;
			}
			
			if (arr[i] % 7 != 0 && arr[i] % 5 == 0) {
				// arr[j] là số hoán đổi cho arr[i] khi arr[i] chia hết cho 5
				if(arr[j] % 7 != 0 && arr[j] % 5 == 0) {
					j--;
				}
				if(arr[j]% 7 == 0 && arr[j] % 5 != 0) {
					swap(arr,j, k);
					k++;
				}
				swap(arr,i, j);
				j--;
			}
		}
		return arr;
	}
	
	public static void swap(Integer[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
