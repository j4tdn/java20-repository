package ex04sumofelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumOfElements {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 9, 2, 5, 9};
        int[] b = {4, 2, 6, 6, 4, 15, 1};

        System.out.println("Tổng các phần tử duy nhất trong mảng A trừ Min Max: " + sumUniqueElementsExceptMinMax(a));
        System.out.println("Tổng các phần tử duy nhất trong mảng B trừ Min Max: " + sumUniqueElementsExceptMinMax(b));
    }

    public static int sumUniqueElementsExceptMinMax(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Mảng phải có ít nhất 3 phần tử");
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        // Sử dụng Set để lưu trữ các phần tử không trùng nhau
        Set<Integer> uniqueElements = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] != max && uniqueElements.add(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
