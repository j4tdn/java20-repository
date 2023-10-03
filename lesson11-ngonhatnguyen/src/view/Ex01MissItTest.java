package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import bean.Candidate;
import utils.FileUtils;

public class Ex01MissItTest {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLine("test01-missit.txt");

		System.out.println("Input: ");
		lines.forEach(line -> {
			System.out.println(line);
		});

		Map<Integer, Candidate> candidates = getListScore(lines);
		
		int[] theWinner = getTheWinner(candidates);
		System.out.println("\n Output:");
		System.out.println(Arrays.toString(theWinner));
	}
	
	private static int[] getTheWinner(Map<Integer, Candidate> candidates) {
		var candiList = new ArrayList<>(candidates.entrySet());
		Candidate maxScore = candiList.get(0).getValue();
		for (int i = 0; i < candiList.size(); i++) {
			Candidate candi = candiList.get(i).getValue();
			if (maxScore.getScore() < candi.getScore()) {
				maxScore = candi;
			} else if (maxScore.getScore() == candi.getScore()) {
				if (maxScore.getNumbers1st() < candi.getNumbers1st()) {
					maxScore = candi;
				} else if (maxScore.getNumbers1st() == maxScore.getNumbers1st()) {
					if (maxScore.getNumbers2nd() < candi.getNumbers2nd()) {
						maxScore = candi;
					}
				}
			}
		}
		
		int[] result = new int[10];
		int count = 0;
		
		for (var candiL: candiList) {
			Candidate candi = candiL.getValue();
			if (maxScore.getScore() == candi.getScore() && maxScore.getNumbers1st() == candi.getNumbers1st()
					&& maxScore.getNumbers2nd() == candi.getNumbers2nd()) {
				result[count++] = candi.getId();
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Map<Integer, Candidate> getListScore(List<String> lines) {
		Map<Integer, Candidate> candidates = new HashMap<>();

		int judgeNumbers = Integer.parseInt(lines.get(0));

		for (int i = 1; i <= judgeNumbers; i++) {
			String[] votes = lines.get(i).split(" ");

			for (int j = 1; j <= Integer.parseInt(votes[0]); j++) {
				int id = Integer.parseInt(votes[j]);

				Candidate candidate = null;
				if (candidates == null || !candidates.containsKey(id)) {
					candidate = new Candidate(id, 0, 0, 0);
				} else {
					candidate = candidates.get(id);
				}

				calScore(candidate, j);

				candidates.put(candidate.getId(), candidate);
			}
		}
		
		return candidates;
	}

	private static void calScore(Candidate candidate, int rankVote) {
		if (rankVote == 1) {
			candidate.setScore(candidate.getScore() + 3);
			candidate.setNumbers1st(candidate.getNumbers1st() + 1);
		} else if (rankVote == 2) {
			candidate.setScore(candidate.getScore() + 2);
			candidate.setNumbers2nd(candidate.getNumbers2nd() + 1);
		} else {
			candidate.setScore(candidate.getScore() + 1);
		}
	}
}
