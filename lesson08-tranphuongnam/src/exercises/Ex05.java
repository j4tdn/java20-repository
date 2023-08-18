package exercises;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "543545";
		String s2 = "1ab2d";
		
		String commonString = process(s1, s2);
		System.out.println(commonString);
	}

	public static String process(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		String resultString = "";
		int maxLength = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int length = 0;
				int idx1 = i;
				int idx2 = j;
				while(s1.charAt(idx1) == s2.charAt(idx2) && idx1 < m && idx2 < n) {
					length++; idx1++; idx2++;
				}		
				if(length > maxLength) {
					maxLength = length;
					resultString = s1.substring(i, idx1);
				}
			}
		}
		return resultString;
	}
}
