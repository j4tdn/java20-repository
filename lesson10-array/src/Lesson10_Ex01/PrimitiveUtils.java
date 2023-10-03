package Lesson10_Ex01;

public class PrimitiveUtils {
	
	private PrimitiveUtils() {
	}
	
	// Hàm sắp xếp nổi bọt cho mảng
	public static int[] bubbleSort(int[] arr, ComparatorInt comparator) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(comparator.compare(arr[j], arr[j+1]) > 0) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	
	// Hàm hoán vị cho mảng
	public static void swap(int[] arr, int i, int j) {
		if(isValidIndex(i, arr) && isValidIndex(j, arr)) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}
	
	// Kiểm tra chỉ số và giá trị có trong mảng hay ko
	private static boolean isValidIndex(int i, int[] elements) {
		return i >= 0 && i < elements.length;
	}
}
