package view.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Candidate;

public class Ex01MissIT {
	
	public static void main(String[] args) {
		var lines = readLine("MistIT.txt");
		
		//processing
		
		
		var result = getResultOfCandidates(lines);
		
		
		
		var bestCandidate = findBestCandidate(result.values());
		//output
		System.out.println("best Candidate");
		bestCandidate.forEach(candidate -> {
			System.out.println(candidate + "\n has score = " + candidate.getScore());
		});
	}
	private static List<Candidate> findBestCandidate(Collection<Candidate> candidates){
		Candidate found = null;
		int maxScore = Integer.MIN_VALUE;
		for(Candidate candidate: candidates) {
			int score = candidate.getScore();
			if(maxScore < score) {
				maxScore = score;
				found = candidate;
			}
		}
		return List.of(found);
	}
	private static Map<Integer, Candidate> getResultOfCandidates(List<String> lines){
		int amoutOfJudges = Integer.parseInt(lines.get(0).trim());
		
		//K: ID -> value: validate
		Map<Integer, Candidate> result = new LinkedHashMap<>();
		for(int index = 1; index <= amoutOfJudges; index++) {
			var line = lines.get(index);
			var tokens = line.split("\\s+");
			int amountOfSelections = toInt(tokens[0]);
			for(int candId = 1; candId <= amountOfSelections; candId++) {
				int candidateId = toInt(tokens[candId]);
				if(result.containsKey(candidateId)) {
					Candidate candidate = result.get(candidateId);
					candidate.updateCounter(candId);
				}else {
					result.put(candidateId, new Candidate(candidateId, candId));
				}
			}
		}
		return result;
	}
	
	private static int toInt(String text) {
		return Integer.parseInt(text.trim());
	}
	
	public static List<String> readLine(String fpath){
		var path = Paths.get(fpath);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
