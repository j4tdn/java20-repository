package view;

public class Ex04Sum {
	public static void main(String[] args) {
		System.out.println(sum(new int[] {2,3,4,2,78,3,5,100}));
	}
	
	private static int sum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			if(isRepeatOnArr(num, arr) && !isMin(num, arr) && !isMax(num, arr) ) {
				sum += num;
			}
		}
		return sum;
		
	}
	
	private static boolean isRepeatOnArr(int num, int[] arr) {
		int count = 0;
		for (int ele : arr) {
			if (num == ele) {
				count ++;
			}
		}
		if (count == 1) {
			return false;
		}
		return true;
	}
	private static boolean  isMin(int num, int[] arr) {
		for (int ele : arr) {
			if (num > ele) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean  isMax(int num, int[] arr) {
		for (int ele : arr) {
			if (num < ele) {
				return false;
			}
		}
		return true;
	}
}
