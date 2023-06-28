package find.level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex05FindLevel {
	public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static Comparator<Integer> sortByLevel() {
        return new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return countDivisors(a) - countDivisors(b);
            }
        };
    }
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);

	        System.out.print("Enter n: ");
	        int n = ip.nextInt();

	        Integer[] arr = new Integer[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            arr[i] =ip.nextInt();
	        }

	        Arrays.sort(arr, sortByLevel());

	        System.out.println("Sorted array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
