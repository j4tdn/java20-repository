package view;

import java.util.List;

import utils.FileUtils;

public class Ex02Domino {
     public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("Test02.txt");
		lines.forEach(line -> { System.out.println(line);});
	}
}
