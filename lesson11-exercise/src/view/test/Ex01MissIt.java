package view.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Candidate;

public class Ex01MissIt {
	public static void main(String[] args) {
		// read file
		var lines = readLines("missit-data.txt");
		
		// processing result of candidate
		var result = getResultOfCandidates(lines);
		result.values().forEach(System.out::println);
		
		// 4
		// 3 9 7 2  
		// 3 3 9 7
		// 3 2 9 6
		// 2 2 7
		
		// Candidate [id=9, fstCounter=1, sndCounter=2, trdCounter=0 --> score = 7] --> max
		// Candidate [id=7, fstCounter=0, sndCounter=2, trdCounter=1 --> score = 5]
		// Candidate [id=2, fstCounter=2, sndCounter=0, trdCounter=1 --> score = 7] --> max
		// Candidate [id=3, fstCounter=1, sndCounter=0, trdCounter=0 --> score = 3]
		// Candidate [id=6, fstCounter=0, sndCounter=0, trdCounter=1 --> score = 1]
		
		
		// find best candidate by score, 1st, 2nd
		var bestCandidates = findBestCandidates(result.values());
		
		// output
		System.out.println("Miss IT - Best Candidates");
		bestCandidates.forEach(System.out::println);
	}
	
	private static List<Candidate> findBestCandidates(Collection<Candidate> candidates) {
		Candidate temp = new Candidate();
		
		Candidate found = null;
		int maxScore = Integer.MIN_VALUE;
		for (var candidate: candidates) {
			int score = candidate.getScore();
			if (maxScore < score) {
				maxScore = score;
				found = candidate;
				temp.setTmpScore(maxScore);
				continue;
			}
		}
		
		var maxScoreCandidates = candidates.stream().filter(candidate -> candidate.getScore() == temp.getTmpScore()).collect(Collectors.toList());
		
		if (maxScoreCandidates.size() == 1) {
			return List.of(found);
		}
		
		// 3 9 7 1 --> max
		// 3 7 9 1 --> add(..)
		// 
		
		List<Candidate> result = new ArrayList<>();
		//boolean hasManyEquals = false;
		
		// Có nhiều canidates bằng điểm
		// So sánh số lần nhất
		found = maxScoreCandidates.get(0);
		for (int i = 1; i < maxScoreCandidates.size(); i++) {
			Candidate candidate = maxScoreCandidates.get(i);
			int current1stCounter = candidate.getFstCounter();
			if (found.getFstCounter() < current1stCounter) {
				found = candidate;
				continue;
			}
			// Bằng số lần nhất --> So sánh số lần nhì
			if (found.getFstCounter() == current1stCounter) {
				int current2ndCounter = candidate.getSndCounter();
				if (found.getSndCounter() < current2ndCounter) {
					found = candidate;
					continue;
				}
				
				// Bằng số lần nhì --> Lấy luôn cả phần tử đó
				if (found.getSndCounter() == current2ndCounter) {
					result.add(candidate);
					// hasManyEquals = true;
				}
			}
		}
		
		// if (!hasManyEquals) {
			result.add(found);
		// }
		
		return result;
	}
	
	private static Map<Integer, Candidate> getResultOfCandidates(List<String> lines) {
		int amountOfJudges = toInt(lines.get(0));
		// 4         --> amountOfJudges
		// 3 5 2 1   --> tokens
		// 3 8 5 2
		// 2 1 2
		// 3 2 1 5
		
		// K: Id  --> V: Candidate
		Map<Integer, Candidate> result = new LinkedHashMap<>();
		// K=5   --> V=5, 1,0,0
		// K=2   --> V=2, 0,1,0
		// K=1   --> V=1, 0,0,1
		// K=8   --> V=8, 1,0,0
		
		for (int lineIdx = 1; lineIdx <= amountOfJudges; lineIdx++) {
			var line = lines.get(lineIdx);
			var tokens = line.split("\\s+");
			int amountOfSelections = toInt(tokens[0]);
			for (int candIdx = 1; candIdx <= amountOfSelections; candIdx++) {
				int candidateId = toInt(tokens[candIdx]);
				if (result.containsKey(candidateId)) {
					Candidate candidate = result.get(candidateId);
					candidate.updateCounter(candIdx);
				} else {
					result.put(candidateId, new Candidate(candidateId, candIdx));
				}
			}
		}
		
		return result;
	}
	
	private static int toInt(String text) {
		return Integer.parseInt(text.trim());
	}
	
	private static List<String> readLines(String fpath) {
		var path = Paths.get(fpath); // new File(fpath).toPath()
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}