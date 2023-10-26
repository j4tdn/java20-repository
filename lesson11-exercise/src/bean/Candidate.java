package bean;

public class Candidate {
	private int id;
	private int fstCounter; // 1st
	private int sndCounter; // 2nd
	private int trdCounter; // 3nd
	private int tmpScore;
	
	public Candidate() {
	}

	public Candidate(int id, int candPos) {
		this.id = id;
		updateCounter(candPos);
	}

	public void updateCounter(int candPos) {
		switch (candPos) {
		case 1: {
			fstCounter++;
			break;
		}
		case 2: {
			sndCounter++;
			break;
		}
		case 3: {
			trdCounter++;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + candPos);
		}
	}
	
	public void setTmpScore(int score) {
		this.tmpScore = score;
	}
	
	public int getTmpScore() {
		return tmpScore;
	}

	public int getScore() {
		return fstCounter * 3 + sndCounter * 2 + trdCounter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFstCounter() {
		return fstCounter;
	}

	public void setFstCounter(int fstCounter) {
		this.fstCounter = fstCounter;
	}

	public int getSndCounter() {
		return sndCounter;
	}

	public void setSndCounter(int sndCounter) {
		this.sndCounter = sndCounter;
	}

	public int getTrdCounter() {
		return trdCounter;
	}

	public void setTrdCounter(int trdCounter) {
		this.trdCounter = trdCounter;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", fstCounter=" + fstCounter + ", sndCounter=" + sndCounter + ", trdCounter="
				+ trdCounter + " --> score = " + getScore() + "]";
	}
}