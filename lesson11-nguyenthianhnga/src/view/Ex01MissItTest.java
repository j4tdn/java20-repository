package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;



import utils.FileUtils;

public class Ex01MissItTest {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01-missit.txt");
		lines.forEach(line -> {
			System.out.println(line);
		});
		System.out.println();
		//System.out.println(parseInput(lines));

		List<List<Integer>> jChoices = parseInput(lines);
		Map<Integer, Integer> scores = calculateScores(jChoices);
		List<Integer> winners = findWinners(scores);
	    List<Integer> finalWinners = applySecondaryCriterion(winners, jChoices);
		printWinners(winners);
	}


	private static List<List<Integer>> parseInput(List<String> lines) {
		List<List<Integer>> jChoices = new ArrayList<>();
		for (String line : lines) {
			String[] choice = line.split(" "); 
			List<Integer> jChoice = new ArrayList<>();
			for (int j = 1; j < choice.length; j++) {
				jChoice.add(Integer.parseInt(choice[j]));
				/*
				 	[3]
					[3, 2]
					[3, 2, 1]
					[2]
					[2, 3]
					[2, 3, 1]
				 */
			}
			jChoices.add(jChoice);
		}
		return jChoices;// [[], [ 5, 2, 1], [ 12, 5, 2], [ 1, 2], [2, 1, 5]]
	}

	private static Map<Integer, Integer> calculateScores(List<List<Integer>> jChoices) { 
		Map<Integer, Integer> scores = new HashMap<>();
		for (List<Integer> jChoice : jChoices) {
			int numChoices = jChoice.size();
			int score = 3;
			for (int candidateId : jChoice) {
				int currentScore = scores.getOrDefault(candidateId, 0);
				scores.put(candidateId, currentScore + score);
				score--;
			}
		}
		return scores;
	}

	private static List<Integer> findWinners(Map<Integer, Integer> scores) {
		List<Integer> winners = new ArrayList<>();
		int maxScore = 0;
		for (int score : scores.values()) {
			if (score > maxScore) {
				maxScore = score;
			}
		}
		for (int candidateId : scores.keySet()) {
			if (scores.get(candidateId) == maxScore) {
				winners.add(candidateId);
			}
		}
		return winners;
	}

	private static List<Integer> applySecondaryCriterion(List<Integer> winners, List<List<Integer>> jChoices) {
		if (winners.size() == 1) {
			return winners;
		}

		int secondPositionScore = 0;
		List<Integer> finalWinners = new ArrayList<>();

		for (int winner : winners) {
			for (List<Integer> jChoice : jChoices) {
				int position = jChoice.indexOf(winner);
				if (position == 1) {
					secondPositionScore++;
				}
			}
		}
		if (secondPositionScore > 0) {
			for (int winner : winners) {
				for (List<Integer> jChoice : jChoices) {
					int position = jChoice.indexOf(winner);
					if (position == 1) {
						finalWinners.add(winner);
					}
				}
			}
		} else {
			finalWinners.addAll(winners);
		}

		return finalWinners;
	}

	private static void printWinners(List<Integer> winners) {
		for (int winner : winners) {
			System.out.print(winner + " ");
		}
		System.out.println();
	}
}
