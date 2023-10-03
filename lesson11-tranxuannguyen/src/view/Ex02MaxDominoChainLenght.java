package view;

import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLenght {

	public static void main(String[] args) {
		
		List<String> lines = FileUtils.readLines("test02-domino.txt");
		
		lines.forEach(line -> {
			System.out.println(line);
		});
		
		int n = Integer.parseInt(lines.get(0));

        int[] height = Arrays.stream(lines.get(1).split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] position = Arrays.stream(lines.get(2).split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxChainLength = longestDominoChain(n, height, position);

        System.out.println(maxChainLength);	
	}
	public static int longestDominoChain(int n, int[] height, int[] position) {
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int currentLength = 1;
			if (i < n && height[i] != 0) {
				for (int j = i + 1; j < n; j++) {
					for (;i < n && j < n && height[j] != 0 && ( position[j] - position[i])<= height[i];) {
                    currentLength++;
                    i++;
                    j++;
					}
		            maxLength = Math.max(maxLength, currentLength);
		            break;
				}
			}
        }
        return maxLength;       
	}
}

