package logic;
/**
  
	Bài 1: Đếm số phần tử chung
	
	Cho 2 mảng số nguyên đơn điệu có cùng số phần tử là n (4 < n < 40). 
	Viết phương thức tìm số phần tử chung của 2 mảng đó
	Example
	Mảng 1: 2 8 9 1 6
	Mảng 2: 2 1 1 8 9
	Output
	1 2 8 9
 
 */
public class Ex01CommonElement {
	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 9, 1, 6 };
		int[] arr2 = { 2, 1, 1, 8, 9 };
		
		arr1 = arrange(arr1);
		arr2 = arrange(arr2);
		
		System.out.println(findCommonElement(arr1, arr2));
	}

	public static String findCommonElement(int[] arr1, int[] arr2) {
		String str = "";

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					str = str + arr1[i] + " " ;
				}
			}
		}
		return str; 
	}
	
	public static int[] arrange(int[] arr) {
		int k;
		do {
			k = 0;
			for (int i = 0; i < arr.length; i++) {	
				if(i+1 < arr.length && arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					k++;
				}
			}
		} while (k != 0);
		return arr;
	}
	
}
