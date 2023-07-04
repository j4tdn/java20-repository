package viewd1;

import java.util.Arrays;

public class Test04 {
    public static int sum(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 5, 8, 9, 2, 5, 9};
        int[] a2 = {4, 2, 6, 6, 4, 15, 1};

        System.out.println("Tổng a1 = " + sum(a1));
        System.out.println("Tổng a2 = " + sum(a2));
    }
}

