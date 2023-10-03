package view;

import java.util.*;
import utils.FileUtils;

public class Ex01MissItTest {
    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("test01-missit.txt");
        lines.forEach(line -> {
        	System.out.println(line);
        });
        int N = Integer.parseInt(lines.get(0));
        if (N < 1 || N >= 100) {
            System.out.println("Số lượng giám khảo không hợp lệ. Xin nhập lại!");
            return;
        }
        Map<Integer, Integer> candidateScores = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String[] parts = lines.get(i).split(" ");
            int numVotes = Integer.parseInt(parts[0]);
            for (int j = 1; j <= numVotes; j++) {
                int candidateId = Integer.parseInt(parts[j]);
                candidateScores.put(candidateId, candidateScores.getOrDefault(candidateId, 0) + getScore(j - 1));
            }
        }
        int maxScore = Collections.max(candidateScores.values());
        for (Map.Entry<Integer, Integer> entry : candidateScores.entrySet()) {
            if (entry.getValue() == maxScore) {
            	System.out.print("Hoa hậu là thí sinh có ID: ");
                System.out.println(entry.getKey());
            }
        }
    }
    private static int getScore(int position) {
        if (position == 0) {
            return 3;
        } else if (position == 1) {
            return 2;
        } else if (position == 2) {
            return 1;
        }
        return 0;
    }
}
