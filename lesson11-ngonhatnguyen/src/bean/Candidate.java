package bean;

import java.util.Objects;

public class Candidate {
	private Integer id;
	private int score;
	private int numbers1st;
	private int numbers2nd;
	
	public Candidate() {
	}

	public Candidate(int id, int score, int numbers1st, int numbers2nd) {
		super();
		this.id = id;
		this.score = score;
		this.numbers1st = numbers1st;
		this.numbers2nd = numbers2nd;
	}

	public Integer getId() {
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

	public int getNumbers1st() {
		return numbers1st;
	}

	public void setNumbers1st(int numbers1st) {
		this.numbers1st = numbers1st;
	}

	public int getNumbers2nd() {
		return numbers2nd;
	}

	public void setNumbers2nd(int numbers2nd) {
		this.numbers2nd = numbers2nd;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Candidate)) {
			return false;
		}
		Candidate that = (Candidate)obj;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Cadidate [id=" + id + ", score=" + score + ", numbers1st=" + numbers1st + ", numbers2nd=" + numbers2nd
				+ "]";
	}
	
}
