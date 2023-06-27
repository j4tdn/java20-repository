package bean;

public class Student {
	private int id;
	private String name;
	private float theoryScore;
	private float practicalScore;

	public Student() {
	}

	public Student(int id, String name, float theoryScore, float practicalScore) {
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practicalScore = practicalScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(float theoryScore) {
		this.theoryScore = theoryScore;
	}

	public float getPracticalScore() {
		return practicalScore;
	}

	public void setPracticalScore(float practicalScore) {
		this.practicalScore = practicalScore;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryScore=" + theoryScore + ", practicalScore="
				+ practicalScore + "]";
	}

	public float calAverage() {
		float result = (float)(this.theoryScore + this.practicalScore) / 2;
		return result;
	}
}
