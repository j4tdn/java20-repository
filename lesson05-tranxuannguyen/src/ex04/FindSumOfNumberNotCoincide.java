package ex04;

import java.util.HashSet;
import java.util.Set;

public class FindSumOfNumberNotCoincide {
	public static void main(String[] args) {
        int[] a = {1, 5, 8, 9, 2, 5, 9};
        int sum = sumOfNumberNotCoincide(a);
        System.out.println("sum of number not coincide except min number and max number: " + sum);
    }

    public static int sumOfNumberNotCoincide(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
            set.add(a[i]);
        }
        set.remove(min);
        set.remove(max);
        for (int num : set) {
            sum += num;
        }
        return sum;
    }
}
