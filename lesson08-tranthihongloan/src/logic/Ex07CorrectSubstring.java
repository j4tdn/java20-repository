package logic;

public class Ex07CorrectSubstring {
	public static void main(String[] args) {
		String X = "aaabaaabbaaaaa";
		int[] infoStr = new int[4];
		// infoStr[0] = max;
		// infoStr[1] = endMaxPos;
		// infoStr[2] = min;
		// infoStr[3] = endMinPos;
		infoStr[2] = X.length();
		findMinMaxCorrectSubstring(X, infoStr);
		System.out.println(infoStr[2] + " " + X.substring(infoStr[3] - infoStr[2], infoStr[3]) + " ["
				+ (infoStr[3] - infoStr[2]) + "]");
		System.out.println(infoStr[0] + " " + X.substring(infoStr[1] - infoStr[0], infoStr[1]) + " ["
				+ (infoStr[1] - infoStr[0]) + "]");
	}

	public static int[] findMinMaxCorrectSubstring(String str, int[] inforStr) {
		int k = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				k = 1;
			} else if (str.charAt(i) == str.charAt(i - 1)) {
				k++;
				if (i == str.length() - 1) {
					if (inforStr[0] < k) {
						inforStr[0] = k;
						inforStr[1] = i + 1;
					}
				}
			} else if (str.charAt(i) != str.charAt(i - 1)) {
				if (inforStr[0] < k) {
					inforStr[0] = k;
					inforStr[1] = i;
				}
				if (inforStr[2] > k) {
					inforStr[2] = k;
					inforStr[3] = i;
				}
				k = 1;
			}
		}
		return inforStr;
	}
}
