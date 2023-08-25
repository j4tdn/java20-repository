package view;

import java.util.Scanner;

public class Exercises02 {

	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = ip.nextInt();
        ip.nextLine();

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = ip.nextLine();
        }

        ip.close();

        String[] largestNumbers = getLargestNumbers(strings);

        for (String num : largestNumbers) {
            System.out.print(num + " ");
        }
    }

    private static String[] getLargestNumbers(String... ss) {
        int n = ss.length;
        int[] maxNumbers = new int[n];
        int maxIndex = 0;

        for (String str : ss) {
            int maxNum = findMaxNumber(str);
            if (maxNum != 0) {
                maxNumbers[maxIndex++] = maxNum;
            }
        }

        sort(maxNumbers, maxIndex);

        String[] result = new String[maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            result[i] = Integer.toString(maxNumbers[i]);
        }
        return result;
    }

    private static int findMaxNumber(String str) {
        String[] numbers = str.split("\\D+");
        int max = 0;

        for (String numStr : numbers) {
            if (!numStr.isEmpty()) {
                int num = Integer.parseInt(numStr);
                max = Math.max(max, num);
            }
        }

        return max;
    }

    private static void sort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
