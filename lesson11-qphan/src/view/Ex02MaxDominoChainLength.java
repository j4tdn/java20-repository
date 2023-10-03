package view;

import java.util.List;

import utils.FileUtils;

public class Ex02MaxDominoChainLength {
	
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test02-domino.txt");
		
		lines.forEach(line -> {
			System.out.println(line);
		});
	}
}
