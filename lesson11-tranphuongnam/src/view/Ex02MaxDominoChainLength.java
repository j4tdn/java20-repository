package view;

import java.util.Arrays;
import java.util.List;
import utils.FileUtils;

public class Ex02MaxDominoChainLength {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02domino.txt");
		lines.forEach(line -> System.out.println(line));

		int loop = Integer.parseInt(lines.get(0));

		int[] position = new int[loop];
		int[] height = new int[loop];

		for (int i = 1; i < lines.size(); i++) {
			String[] parts = lines.get(i).split(" ");
			for (int j = 0; j < loop; j++) {
				if (i == 1) {
					height[j] = Integer.parseInt(parts[j]);
				} else {
					position[j] = Integer.parseInt(parts[j]);
				}
			}
		}

		System.out.println("longestDominoChain: " + longestDominoChain(loop, height, position));
	}

	public static int longestDominoChain(int length, int[] height, int[] position) {
		int maxChainLength = -1;
		for (int i = 0; i < length; i++) {
			int currentChainLength = 1;
			//Tìm thấy 1 domino tại vị trí i và có height là i (i > 0)
			if (i < length && height[i] != 0) { // Lấy i làm mốc
				for (int j = i + 1; j < length; j++) {
					// Khi chiều dài của domino[j] vẫn dài hơn khoảng cách từ i -> j
					// -> tiếp tục đổ và dịch sang domino mới, khi sang domino mới thì làm tương tự cho đến khi \
					// hết vòng lặp hoặc chiều dài domino < khoảng cách giữa 2 i,j
					while (i < length && j < length && height[j] != 0 && position[j] - position[i] <= height[i]) {
						currentChainLength++;
						j++;
						i++;
					}
					maxChainLength = Math.max(currentChainLength, maxChainLength);
				}
			}
		}
		return maxChainLength;
	}
}