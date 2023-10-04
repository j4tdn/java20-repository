package test;

import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLength {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02-domino.txt");
	
		System.out.println("Input: ");
		lines.forEach(line -> {
			System.out.println(line);
		});
		
		System.out.println("Output: ");
		showMaxDominoChain(lines);
	}
	
	public static void showMaxDominoChain(List<String> lines) {
		int iteration = Integer.parseInt(lines.get(0).trim());
		int[] heightArray = Arrays.stream(lines.get(1).trim().split(" "))
				.mapToInt(Integer::parseInt).toArray();
		int[] positionArray = Arrays.stream(lines.get(2).trim().split(" "))
				.mapToInt(Integer::parseInt).toArray();
		
		int curMax = 0;
		for(int i = 0; i < iteration; i++) {
			int curMaxTemp = 0;
			for(int j = i; j < iteration - 1; j++) {
				if(positionArray[j] + heightArray[j] <= positionArray[j+1])
					break;
				else 
					curMaxTemp++;
			}
			if(curMaxTemp > curMax) curMax = curMaxTemp;
		}
		curMax++;
		
		System.out.println(curMax);
	}
}
