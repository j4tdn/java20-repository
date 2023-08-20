package view;

import java.util.Scanner;

public class Exercises05 {

	private static final Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        String text1 = getInput("Nhập chuỗi thứ 1: ");
        String text2 = getInput("Nhập chuỗi thứ 2: ");

        String longestCommonSubstring = findLongestCommonSubstring(text1, text2);
        System.out.println("Chuỗi con chung dài nhất: " + longestCommonSubstring);
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        String input = ip.nextLine();

        if (!input.matches("[A-Z]+")) {
            throw new IllegalArgumentException("Chuỗi chỉ chứa các kí tự A-Z");
        }

        return input;
    }

    private static String findLongestCommonSubstring(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int maxLen = 0;
        int endIndex = -1;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        if (maxLen > 0) {
            return s1.substring(endIndex - maxLen, endIndex);
        }
        return "";
    }
}
