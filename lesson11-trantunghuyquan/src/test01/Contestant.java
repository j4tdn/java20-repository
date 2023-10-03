package test01;

public class Contestant {
    int id;
    int score;
    int firstPlaceVotes;

    public Contestant(int id) {
        this.id = id;
        this.score = 0;
        this.firstPlaceVotes = 0;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void addFirstPlaceVote() {
        this.firstPlaceVotes++;
    }

    public int getScore() {
        return score;
    }

    public int getFirstPlaceVotes() {
        return firstPlaceVotes;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}