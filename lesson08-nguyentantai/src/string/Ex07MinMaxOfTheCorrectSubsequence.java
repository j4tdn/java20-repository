package string;

import java.util.Scanner;

public class Ex07MinMaxOfTheCorrectSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu kí tự S: ");
        String s = scanner.nextLine();

        int maxLength = 0;
        String maxSubsequence = "";
        int maxStart = -1;
        int minLength = Integer.MAX_VALUE;
        String minSubsequence = "";
        int minStart = -1;

        int currentLength = 1;
        int currentStart = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxSubsequence = s.substring(currentStart, i);
                    maxStart = currentStart;
                }
                if (currentLength < minLength) {
                    minLength = currentLength;
                    minSubsequence = s.substring(currentStart, i);
                    minStart = currentStart;
                }
                currentLength = 1;
                currentStart = i;
            }
        }

        // Check for the last subsequence
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxSubsequence = s.substring(currentStart);
            maxStart = currentStart;
        }
        if (currentLength < minLength) {
            minLength = currentLength;
            minSubsequence = s.substring(currentStart);
            minStart = currentStart;
        }

        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength + " \"" + maxSubsequence + "\" [" + maxStart + "]");
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength + " \"" + minSubsequence + "\" [" + minStart + "]");
    }
}
