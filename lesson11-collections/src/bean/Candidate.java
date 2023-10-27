package bean;

public class Candidate {
	private int id;
	private int fstCounter;
	private int sndCounter;
	private int trdCounter;
	
	public Candidate() {
	}

	public Candidate(int id, int fstCounter, int sndCounter, int trdCounter) {
		super();
		this.id = id;
		this.fstCounter = fstCounter;
		this.sndCounter = sndCounter;
		this.trdCounter = trdCounter;
	}

	public Candidate(int id, int canPos) {
		this.id = id;
		updateCounter(canPos);
	}
	
	public void updateCounter(int canPos) {
		switch (canPos) {
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
			throw new IllegalArgumentException("Unexpected value: " + canPos);
		}
	}
	
	public int getScore() {
		return fstCounter * 3 + sndCounter* 2 + trdCounter;
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
				+ trdCounter + "]";
	}
	
	
}
