package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.FileUtils;

public class Ex01MissItTest {

	static Map<Integer, Integer> contestants = new HashMap<>();
	static Map<Integer, Integer> firstPlace = new HashMap<>();
	static Map<Integer, Integer> secondPlace = new HashMap<>();

	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01-missit.txt");
		lines.forEach(line -> System.out.println(line));

		System.out.println("================");

		getContestants(lines, contestants, firstPlace, secondPlace);

		getWinners(contestants, firstPlace, secondPlace);
	}

	private static void getContestants(List<String> lines, Map<Integer, Integer> ids, Map<Integer, Integer> first,
			Map<Integer, Integer> second) {
		for (int i = 1; i < lines.size(); i++) {
			String[] line = lines.get(i).split("\\s+");
			for (int j = 1; j < line.length; j++) {
				int idOfContestant = Integer.parseInt(line[j]);
				if (ids.containsKey(idOfContestant))
					ids.put(idOfContestant, ids.get(idOfContestant) + (4 - j));
				else
					ids.put(idOfContestant, 4 - j);
				if (j == 1) {
					if (first.containsKey(Integer.parseInt(line[j])))
						first.put(Integer.parseInt(line[j]), first.get(Integer.parseInt(line[j])) + 1);
					else
						first.put(Integer.parseInt(line[j]), 1);
				}
				if (j == 2) {
					if (second.containsKey(Integer.parseInt(line[j])))
						second.put(Integer.parseInt(line[j]), second.get(Integer.parseInt(line[j])) + 1);
					else
						second.put(Integer.parseInt(line[j]), 1);
				}
			}
		}
	}

	private static Integer getMaxValue(Map<Integer, Integer> map) {
		List<Integer> scores = new ArrayList<>();
		for (var a : map.entrySet())
			scores.add(a.getValue());
		Integer max = scores.get(0);
		for (int i = 1; i < scores.size(); i++)
			if (max < scores.get(i))
				max = scores.get(i);
		return max;
	}

	private static void getWinners(Map<Integer, Integer> contestants, Map<Integer, Integer> firstPlace, Map<Integer, Integer> secondPlace) {

		Integer maxScore = getMaxValue(contestants);
		Map<Integer, Integer> sameMaxScore = new HashMap<>(); // Lưu trữ id và số lần đứng nhất
		for (var contestant : contestants.entrySet())
			if (contestant.getValue() == maxScore)
				sameMaxScore.put(contestant.getKey(), firstPlace.get(contestant.getKey()));

		if (sameMaxScore.size() > 1) {
			Integer maxFirstPlace = getMaxValue(sameMaxScore); // Lấy max số lần đứng nhất của các id trong sameMaxScore
			Map<Integer, Integer> sameFirstPlace = new HashMap<>(); // Lưu trữ id và số lần đứng nhì
			for (var contestant : sameMaxScore.entrySet())
				if (contestant.getValue() == maxFirstPlace)
					sameFirstPlace.put(contestant.getKey(), secondPlace.get(contestant.getKey()));

			if (sameFirstPlace.size() > 1) {
				Integer maxSecondPlace = getMaxValue(sameFirstPlace); // Lấy max số lần đứng nhì của các id trong sameFirstPlace
				Map<Integer, Integer> result = new HashMap<>(); // Lưu trữ key = id (ko lưu trữ value)
				for (var contestant : sameFirstPlace.entrySet())
					if (contestant.getValue() == maxSecondPlace)
						result.put(contestant.getKey(), 0);
				showId(result);
			} else
				showId(sameFirstPlace);
		} else
			showId(sameMaxScore);
	}

	private static void showId(Map<Integer, Integer> map) {
		for (var entry : map.entrySet())
			System.out.println(entry.getKey());
	}

}
