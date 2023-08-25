package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04{
    public static String[] getLargestNumbers(String ...ss) {
        List<String> results = new ArrayList<>();

        for (String s : ss) {
            int currentMax = 0;
            int currentNumber = 0;

            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    currentNumber = currentNumber * 10 + (c - '0');
                } else {
                    if (currentNumber > currentMax) {
                        currentMax = currentNumber;
                    }
                    currentNumber = 0;
                }
            }

            if (currentNumber > currentMax) {
                currentMax = currentNumber;
            }

            results.add(String.valueOf(currentMax));
        }

        results.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        return results.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] input = {
            "01a2b3456cde478",
            "aa6b546c6e22h",
            "aa6b326c6e22h"
        };

        String[] largestNumbers = getLargestNumbers(input);
        System.out.println(Arrays.toString(largestNumbers));
    }
}
