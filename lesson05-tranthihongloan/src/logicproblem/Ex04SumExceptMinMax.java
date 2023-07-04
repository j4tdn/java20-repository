package logicproblem;

public class Ex04SumExceptMinMax {
	public static void main(String[] args) {
		int[] a = {1,5,8,9,2,5,9};
		System.out.println(sum(a));
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		int min1 = min(arr);
		int max1 = max(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = findNumber(arr, arr[i]);
			if(arr[i] != min1 && arr[i] != max1 && arr[i] != 0) {
				System.out.println(arr[i]);
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	
	public static int findNumber(int[] arr, int number) {	
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(number == arr[i]) {
				count++;
			}
		}
		if(count == 1) {
			return number;
		} else {
			return 0;
		}
	}
	
	public static int min(int[] arr) {
		int min1 = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] < min1) {
				min1 = arr[i];
			}
		}
		return min1;
	}
	
	public static int max(int[] arr) {
		int max1 = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] > max1) {
				max1 = arr[i];
			}
		}
		return max1;
	}
}
