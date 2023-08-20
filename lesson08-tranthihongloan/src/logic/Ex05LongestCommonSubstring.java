package logic;

public class Ex05LongestCommonSubstring {
	public static String findLongestCommonSubstring(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		int[][] dp = new int[m + 1][n + 1];
		int maxLength = 0; // Độ dài của xâu con chung dài nhất
		int endIndex = 0; // Vị trí cuối cùng của xâu con chung dài nhất trong s1

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					if (dp[i][j] > maxLength) {
						maxLength = dp[i][j];
						endIndex = i;
					}
				}
			}
		}

		// Trích xuất xâu con chung dài nhất từ vị trí cuối cùng và độ dài
		String longestCommonSubstring = s1.substring(endIndex - maxLength, endIndex);
		return longestCommonSubstring;
	}

	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";

		String longestCommonSubstring = findLongestCommonSubstring(s1, s2);
		System.out.println("Longest Common Substring: " + longestCommonSubstring);
	}
}
