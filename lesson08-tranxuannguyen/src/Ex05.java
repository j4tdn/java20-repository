import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập xâu s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Nhập xâu s2: ");
        String s2 = scanner.nextLine();

        String longestCommonSubstring = findLongestCommonSubstring(s1, s2);

        System.out.println("Xâu con chung dài nhất: " + longestCommonSubstring);
    }

    public static String findLongestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                }
            }
        }

        if (maxLength == 0) {
            return ""; // Không có xâu con chung
        }

        return s1.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}