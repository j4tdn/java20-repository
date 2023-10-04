package view;

import java.util.List;
import utils.FileUtils;

public class Ex02DominoChain {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02-domino.txt");
		int n = Integer.parseInt(lines.get(0));
		String[] heightsStr = lines.get(1).split(" ");
		String[] positionsStr = lines.get(2).split(" ");

		int[] heights = new int[n];
		int[] positions = new int[n];

		for (int i = 0; i < n; i++) {
			heights[i] = Integer.parseInt(heightsStr[i]);
			positions[i] = Integer.parseInt(positionsStr[i]);
		}

		int maxLength = calculateMaxLength(n, heights, positions);
		System.out.println(maxLength);

	}

	public static int calculateMaxLength(int n, int[] heights, int[] positions) {
		int maxLength = 1;

		for (int i = 0; i < n; i++) {
			int currentLength = 1;

			for (int j = i + 1; j < n; j++) {
				int distance = positions[j] - positions[i];
				if (heights[j] > distance) {
					currentLength++;
				}
			}

			maxLength = Math.max(maxLength, currentLength);
		}

		return maxLength;
	}
}
