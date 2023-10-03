package view;

import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLength {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02-domino.txt");

		lines.forEach(line -> System.out.println(line));

		int n = Integer.parseInt(lines.get(0));

		int[] point = Arrays.stream(lines.get(1).split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		int[] position = Arrays.stream(lines.get(2).split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		maxDominoChain(n, point, position);

	}

	private static int maxDominoChain(int n, int[] point, int[] position) {
		int maxCollisions = 0; 
        int bestPosition = -1; 
        
        for (int i = 0; i < n; i++) {
            int collisions = 0; 
            
            for (int j = 0; j < n; j++) {
                if (i != j && (position[i] == position[j] || 
                		position[i] == point[j] || point[i] == position[j])) {
                    collisions++;
                }
            }
            
            if (collisions > maxCollisions) {
                maxCollisions = collisions;
                bestPosition = i;
            }
        }
		if (bestPosition != -1) {
			System.out.println("số quân cờ domino bị đỗ nhiều nhất: " + point[maxCollisions]);
		} else {
			System.out.println("Không tìm thấy quân cờ hợp lệ.");
		}

		return maxCollisions;
	}
}
