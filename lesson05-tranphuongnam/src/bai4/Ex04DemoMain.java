package bai4;

public class Ex04DemoMain {
	public static void main(String[] args) {
		int[] a1 = { 1, 5, 8, 9, 2, 5, 9 }; // Tổng = 2 + 5 + 8 = 15
		int[] a2 = { 4, 2, 6, 6, 4, 15, 1 }; // Tổng = 2 + 4 + 6 = 12
		System.out.println("Sum a1 --> " + sumOfUniqueElementExceptMaxMin(a1));
		System.out.println("Sum a2 --> " + sumOfUniqueElementExceptMaxMin(a2));
	}

	public static int sumOfUniqueElementExceptMaxMin(int a[]) {
		int maxElement = getMaxElementInArray(a); // Tìm max element
		int minElement = getMinElementInArray(a); // Tìm min element
		int sum = 0;

		// Gán cờ hiệu 2 phần tử không trùng nhau
		boolean isDuplicateElement = false;
		for (int i = 0; i < a.length; i++) {
			// Mỗi lần duyệt qua một phần tử mới mặc định sẽ là chưa trùng nhau
			isDuplicateElement = false;
			for (int j = 0; j < a.length; j++) {
				// Tìm các phần tử trùng nhau
				if (a[i] == a[j] && i != j) {
					// Gán lại cờ hiệu là trùng
					isDuplicateElement = true;
				}
			}

			// Đúng với cờ hiệu và không phải là element max min --> Cộng
			if (isDuplicateElement == false && a[i] != maxElement && a[i] != minElement) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int getMaxElementInArray(int a[]) {
		int max = Integer.MIN_VALUE;
		for (int num : a) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static int getMinElementInArray(int a[]) {
		int min = Integer.MAX_VALUE;
		for (int num : a) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}
