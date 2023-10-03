package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.FileUtils;

public class Ex01MissITTest {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01-Missit.txt");	   

		lines.forEach(line -> System.out.println(line));
		 int n = Integer.parseInt(lines.get(0));
		  Map<Integer, Integer> scores = new HashMap<>();

	        for (int i = 1; i <= n; i++) {
	            String[] judgeSelection = lines.get(i).split(" ");
	            int judge = Integer.parseInt(judgeSelection[0]);
	            for (int j = 1; j <= judge; j++) {
	                int contestant = Integer.parseInt(judgeSelection[j]);

	                int points = scores.getOrDefault(contestant, 0);
	                scores.put(contestant, points + (3 - j));
	            }
	        }

	        int maxScore = Collections.max(scores.values());;

	        List<Integer> winners = new ArrayList<>();
	        for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
	            if (entry.getValue() == maxScore) {
	                winners.add(entry.getKey());
	            }
	        }

	        winners.sort((a, b) -> scores.get(b) - scores.get(a));

	        if (winners.size() > 1) {
	            winners.sort((a, b) -> scores.getOrDefault(b, 0) - scores.getOrDefault(a, 0));
	        }

	        for (int winner : winners) {
	            System.out.print(winner + " ");
	        }
		}
}

