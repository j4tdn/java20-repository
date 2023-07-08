package Bai04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhập các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = findUniqueSum(array);
        System.out.println("Tổng các phần tử không trùng nhau trong mảng (không tính số lớn nhất và nhỏ nhất): " + sum);
    }

    public static int findUniqueSum(int[] array) {
        List<Integer> uniqueElements = new ArrayList<>();

        Arrays.sort(array);

        int n = array.length;

        for (int i = 1; i < n - 1; i++) {
            if (array[i] != array[i - 1] && array[i] != array[i + 1]) {
                uniqueElements.add(array[i]);
            }
        }

        int sum = 0;
        for (int element : uniqueElements) {
            sum += element;
        }

        return sum;
    }
}
