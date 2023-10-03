package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import utils.FileUtils;

public class Ex01MissItTest {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        //List<String> lines = FileUtils.readLines("Test01.txt");
		
		//lines.forEach(line -> System.out.println(line));
		
		
		int numberOfJudges = scanner.nextInt();

		Map<Integer, Integer> scores = new HashMap<>();

		for (int i = 0; i < numberOfJudges; i++) {
			int numberOfChoices = scanner.nextInt();
			for (int j = 0; j < numberOfChoices; j++) {
				int contestantID = scanner.nextInt();
				if (scores.containsKey(contestantID)) {
					scores.put(contestantID, scores.get(contestantID) + 1);
				} else {
					scores.put(contestantID, 1);
				}
			}
		}
		List<Integer> winners = findWinners(scores);

		for (int i = 0; i < winners.size(); i++) {
			System.out.print(winners.get(i));
			if (i < winners.size() - 1) {
				System.out.print("Nguoi chien thang la : ");
			}
		}
	}

	public static List<Integer> findWinners(Map<Integer, Integer> scores) {
		List<Map.Entry<Integer, Integer>> candidates = new ArrayList<>(scores.entrySet());//Lấy tất cả các entry (cặp key-value) từ Map scores và đưa vào một danh sách mới (candidates).
		Collections.sort(candidates, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
				return b.getValue().compareTo(a.getValue());
			}
		});

		List<Integer> winners = new ArrayList<>();
		winners.add(candidates.get(0).getKey());
		for (int i = 1; i < candidates.size(); i++) {
			if (candidates.get(i).getValue().equals(candidates.get(0).getValue())) {
				winners.add(candidates.get(i).getKey());
			} else {
				break;
			}
		}

		Collections.sort(winners);
		return winners;
		
	}
	
	
}
