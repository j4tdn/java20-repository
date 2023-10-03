package Lesson10_Ex01;

import static Lesson10_Ex01.PrimitiveUtils.*;

public class Main {
	
	/*
		Bài 1: 
		Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
			- Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
			- So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
			- Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng
			  nhau 
			  
		VD: {7 8 8 8 6 2 5 1} Kết quả: 6
	 */
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 3, 1};
		
		// Loại bỏ những phần tử trùng lặp
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1 ) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		// So sánh giá trị trung bình
		int sum = 0;
		int avgHead = 0;
		int avgFoot = 0;
		for (int i = 0; i < arr.length/2; i++) {
			sum = sum + arr[i];
		}
		avgHead = sum/(arr.length/2);
		System.out.println(avgHead);
		
		sum = 0;
		for (int i = arr.length - 1; i > arr.length/2 - i - 1; i--) {
			sum = sum + arr[i];
		}
		avgFoot = sum/(arr.length/2);
		System.out.println(avgFoot);
	}
	
	

}
