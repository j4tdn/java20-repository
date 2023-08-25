package exam;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03LevelOfNaturalNumber {

	public static void main(String[] args) {
		 int[] arr = {8, 5, 9, 20};
	        sort(arr);
	        System.out.println("Result " + Arrays.toString(arr));
	}
    public static void sort(int[] arr) {
        Integer[] sortedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

        Arrays.sort(sortedArr, new LevelComparator());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArr[i];
        }
    }

	private static class LevelComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int level1 = count(num1);
            int level2 = count(num2);
            return Integer.compare(level1, level2);
        }
    }
	private static int count(int num)
	{
		int count =0;
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count;
	}
}
