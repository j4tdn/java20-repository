package view;

import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLenght {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02-domino.txt");
		lines.forEach(line -> {
			System.out.println(line);
		});
		System.out.println();
		Integer[] heightOfDominoInt = parseInt(splitStr(lines.get(1)));
		Integer[] positionOfTheDominoInt = parseInt(splitStr(lines.get(lines.size() - 1)));
		findMatchingDominoes(heightOfDominoInt, positionOfTheDominoInt);
	}

	private static String[] splitStr(String line) {
		String[] result = line.split(" ");
		return result;
	}

	private static Integer[] parseInt(String[] str) {
		Integer[] intArr = new Integer[str.length];
		for (int i = 0; i < str.length; i++) {
			intArr[i] = Integer.parseInt(str[i]);
		}
		return intArr;
	}

	private static void findMatchingDominoes(Integer[] heightOfDominoInt, Integer[] positionOfTheDominoInt) {
		for (int i = 0; i < heightOfDominoInt.length; i++) {
			for (int j = i + 1; j < heightOfDominoInt.length; j++) {
				if (heightOfDominoInt[i] + positionOfTheDominoInt[i] > positionOfTheDominoInt[j]) {
					System.out.println(heightOfDominoInt[i]);
				}
			}
		}
	}
}
