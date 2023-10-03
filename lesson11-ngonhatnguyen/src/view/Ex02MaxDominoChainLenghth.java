package view;

import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLenghth {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLine("test02-domino.txt");

		System.out.println("Input --> ");
		lines.forEach(line -> {
			System.out.println(line);
		});
		
		System.out.println("\nOutput:");

		System.out.println("The max domino chain length --> " + getMaxDominoChainLeghth(lines));
	}
	
	private static int getMaxDominoChainLeghth(List<String> lines) {
		int dominiNums = Integer.parseInt(lines.get(0));
		int[] heights = convertIntArray(lines.get(1).split(" "));
		int[] positions = convertIntArray(lines.get(2).split(" "));

		int[] longchain = new int[dominiNums];
		int count = 0;

		for (int i = 0; i < dominiNums; i++) {
			int chains = 1;

			for (int j = i; j < dominiNums - 1; j++) {
				if ((positions[j + 1] - positions[j]) <= heights[j]) {
					chains++;
				} else {
					break;
				}
			}
			longchain[count++] = chains;
		}
		
		System.out.println(Arrays.toString(longchain));
		Arrays.sort(longchain);
		
		return longchain[dominiNums - 1];
	}

	private static int[] convertIntArray(String[] strings) {
		int[] result = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			result[i] = Integer.parseInt(strings[i]);
		}

		return result;
	}
}
