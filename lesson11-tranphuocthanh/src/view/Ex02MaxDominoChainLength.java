package view;

import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLength {

	public static void main(String[] args) {
		
		List<String> lines = FileUtils.readLines("test02-domino.txt");
		
		System.out.println(getMaxLength(lines));
	}
	
	private static int getMaxLength(List<String> lines) {
		
		int n = Integer.parseInt(lines.get(0));
		
		int[] height = convertStringToIntArray(lines.get(1));
		int[] pos = convertStringToIntArray(lines.get(2));
		
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			int running = 1;
			for(int j = i; j < n - 1; j++) {
				int distance = pos[j+1] - pos[j];
				if (height[i] >= distance) {		
					running++;
				}else {
					break;
				}
			}
			res = Math.max(res, running);
		}
		
		return res;
		
	}

	private static int[] convertStringToIntArray(String str) {
		int[] result = new int[str.length()];
		int running = 0;
		String[] elements = str.split("\\s");
		for(String s : elements) {
			result[running++] = Integer.parseInt(s);
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
