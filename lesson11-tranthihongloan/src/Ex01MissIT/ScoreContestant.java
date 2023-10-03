package Ex01MissIT;

public class ScoreContestant {
	private int id;
	private int score = 0;
	private int nVote = 0;
	
	public ScoreContestant() {
		
	}

	public ScoreContestant(int id, int score, int nVote) {
		this.id = id;
		this.score = score;
		this.nVote = nVote;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getnVote() {
		return nVote;
	}

	public void setnVote(int nVote) {
		this.nVote = nVote;
	}

	@Override
	public String toString() {
		return "SoreContestant [id=" + id + ", score=" + score + ", nVote=" + nVote + "]";
	}
	
	public void plusScore(int score) {
		this.score += score;
	}
	
	public void plusVote() {
		this.nVote++;
	}
}
