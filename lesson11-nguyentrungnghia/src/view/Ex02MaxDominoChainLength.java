package view;

import java.util.ArrayList;
import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLength {

	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02-domino.txt");
		lines.forEach(line -> System.out.println(line));

		System.out.println("=============");

		List<Integer> heights = getHeight(lines);
		List<Integer> positions = getPosition(lines);
		Integer numberOfDominoes = Integer.parseInt(lines.get(0));

		Integer longestChain = longestDominoChain(numberOfDominoes, heights, positions);
		System.out.println(longestChain);

	}

	private static List<Integer> getHeight(List<String> lines) {
		List<Integer> heights = new ArrayList<>();
		String[] h = lines.get(1).split("\\s+");
		for (int i = 0; i < h.length; i++)
			heights.add(Integer.parseInt(h[i]));
		return heights;
	}

	private static List<Integer> getPosition(List<String> lines) {
		List<Integer> positions = new ArrayList<>();
		String[] p = lines.get(2).split("\\s+");
		for (int i = 0; i < p.length; i++)
			positions.add(Integer.parseInt(p[i]));
		return positions;
	}

	private static Integer longestDominoChain(Integer length, List<Integer> height, List<Integer> position) {
		List<Integer> distances = new ArrayList<>();

		Integer count = 1;
		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				distances.add(count);
				break;
			}
			Integer distance = position.get(i + 1) - position.get(i);
			if (height.get(i) > distance) {
				count++;
				continue;
			} else {
				distances.add(count);
				count = 1;
			}
		}
		
		distances.sort((i1, i2) -> i1.compareTo(i2));
		return distances.get(distances.size() - 1);
	}

}
