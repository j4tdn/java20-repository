package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class JudgeChoice {
    int[] choices;

    public JudgeChoice(int[] choices) {
        this.choices = choices;
    }
}

public class Ex01MissItTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<JudgeChoice> judgeChoices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] choices = new int[3];
            for (int j = 0; j < 3; j++) {
                choices[j] = scanner.nextInt();
            }
            judgeChoices.add(new JudgeChoice(choices));
        }

        Map<Integer, Integer> candidateScores = new HashMap<>();

        for (JudgeChoice judgeChoice : judgeChoices) {
            for (int i = 0; i < 3; i++) {
                int candidateId = judgeChoice.choices[i];
                candidateScores.put(candidateId, candidateScores.getOrDefault(candidateId, 0) + (3 - i));
            }
        }

        List<Integer> winners = new ArrayList<>();
        int maxScore = -1;

        for (Map.Entry<Integer, Integer> entry : candidateScores.entrySet()) {
            int candidateId = entry.getKey();
            int score = entry.getValue();

            if (score > maxScore) {
                winners.clear();
                winners.add(candidateId);
                maxScore = score;
            } else if (score == maxScore) {
                winners.add(candidateId);
            }
        }

        int secondPlace = -1;
        int maxSecondPlaceVotes = -1;

        for (int winner : winners) {
            int secondPlaceVotes = 0;
            for (JudgeChoice judgeChoice : judgeChoices) {
                if (judgeChoice.choices[1] == winner) {
                    secondPlaceVotes++;
                }
            }
            if (secondPlaceVotes > maxSecondPlaceVotes) {
                maxSecondPlaceVotes = secondPlaceVotes;
                secondPlace = winner;
            }
        }

        System.out.println(secondPlace);
    }
}