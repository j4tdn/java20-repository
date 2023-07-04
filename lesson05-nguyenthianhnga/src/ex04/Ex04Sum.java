package ex04;

public class Ex04Sum {
	public static void main(String[] args) {
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		System.out.println(sum(a));

		int[] b = {4, 2, 6, 6, 4, 15, 1};
		System.out.println(sum(b)); 
	}

	public static int sum(int[] arr) {
	    if (arr == null || arr.length < 3) {
	        return 0;
	    }
	    int min = arr[0];
	    int max = arr[0];
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    boolean hasMin = false;
	    boolean hasMax = false;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == min && !hasMin) {
	            hasMin = true;
	        } else if (arr[i] == max && !hasMax) {
	            hasMax = true;
	        } else if (arr[i] != min && arr[i] != max) {
	            sum += arr[i];
	        }
	    }
	    return sum;
	}
}
