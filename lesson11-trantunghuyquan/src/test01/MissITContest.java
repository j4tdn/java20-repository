package test01;

import java.util.*;

public class MissITContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of judges
        ArrayList<Contestant> contestants = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int choices = scanner.nextInt();
            for (int j = 0; j < choices; j++) {
                int id = scanner.nextInt();
                Contestant contestant = findOrCreateContestant(contestants, id);
                if (j == 0) {
                    contestant.addScore(3);
                    contestant.addFirstPlaceVote();
                } else if (j == 1) {
                    contestant.addScore(2);
                } else {
                    contestant.addScore(1);
                }
            }
        }

        contestants.sort((c1, c2) -> {
            if (c1.getFirstPlaceVotes() != c2.getFirstPlaceVotes()) {
                return Integer.compare(c2.getFirstPlaceVotes(), c1.getFirstPlaceVotes());
            } else if (c1.getScore() != c2.getScore()) {
                return Integer.compare(c2.getScore(), c1.getScore());
            } else {
                return Integer.compare(c1.id, c2.id);
            }
        });

        int maxFirstPlaceVotes = contestants.get(0).getFirstPlaceVotes();
        int maxScore = contestants.get(0).getScore();

        for (Contestant contestant : contestants) {
            if (contestant.getFirstPlaceVotes() == maxFirstPlaceVotes && contestant.getScore() == maxScore) {
                System.out.print(contestant + " ");
            } else {
                break;
            }
        }
    }

    private static Contestant findOrCreateContestant(ArrayList<Contestant> contestants, int id) {
        for (Contestant contestant : contestants) {
            if (contestant.id == id) {
                return contestant;
            }
        }
        Contestant newContestant = new Contestant(id);
        contestants.add(newContestant);
        return newContestant;
    }
}