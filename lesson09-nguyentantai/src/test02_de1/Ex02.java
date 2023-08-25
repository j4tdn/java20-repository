package test02_de1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static String[] getLargestNumbers(String... ss) {
        List<Integer> largestNumbers = new ArrayList<>();
        for (String s : ss) {
            int currentNumber = 0;
            int largestNumber = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    currentNumber = currentNumber * 10 + (c - '0');
                } else {
                    if (currentNumber > largestNumber) {
                        largestNumber = currentNumber;
                    }
                    currentNumber = 0;
                }
            }
            if (currentNumber > largestNumber) {
                largestNumber = currentNumber;
            }
            largestNumbers.add(largestNumber);
        }
        Collections.sort(largestNumbers);
        List<String> result = new ArrayList<>();
        for (int num : largestNumbers) {
            if (num != 0) {
                result.add(Integer.toString(num));
            }
        }
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            ss[i] = scanner.nextLine();
        }
        scanner.close();
        String[] largestNumbers = getLargestNumbers(ss);
        System.out.println("result: ");
        for (String num : largestNumbers) {
            System.out.print(num + " ");
        }
    }
}
