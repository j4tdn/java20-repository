package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22h,aa6b326c6e22h";
		String s3 = "aksn2929kaskas1228masnk12394,dj2n4n2k2m3n44n,12in3";
		int[] s1MaxNums = getLargestNumbers(s1); 
		int[] s2MaxNums = getLargestNumbers(s2);
		int[] s3MaxNums = getLargestNumbers(s3);
		System.out.println(Arrays.toString(s1MaxNums));
		System.out.println(Arrays.toString(s2MaxNums));
		System.out.println(Arrays.toString(s3MaxNums));
	}

	public static int[] getLargestNumbers(String str) {
		String[] tokens = str.split(",");

		int[] maxNums = new int[str.length()];
		int running = 0;
		for (int i = 0; i < tokens.length; i++) {
			
			String[] subTokens = tokens[i].split("[a-z]+");
			
			for(String subToken : subTokens) {
				if(subToken != "") {
					int num = Integer.parseInt(subToken);
					if(num > maxNums[i]) {
						maxNums[i] = num;
					}
				}
			}
			running++;
		}
		return Arrays.copyOfRange(maxNums, 0, running);
	}
}
