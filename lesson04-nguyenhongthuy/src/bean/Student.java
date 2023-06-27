package bean;

public class Student {
	private int id;
	private String fullName;
	private float theoryScore;
	private float practicesScore;
	public Student() {
		
	}
	public Student(int id, String fullName, float theoryScores, float practicesScores) {
		this.id = id;
		this.fullName = fullName;
		this.theoryScore = theoryScores;
		this.practicesScore = practicesScores;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public float getTheoryScores() {
		return theoryScore;
	}
	public void setTheoryScores(float theoryScores) {
		this.theoryScore = theoryScores;
	}
	public float getPracticesScores() {
		return practicesScore;
	}
	public void setPracticesScores(float practicesScores) {
		this.practicesScore = practicesScores;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoryScores=" + theoryScore + ", practicesScores="
				+ practicesScore + "]";
	}
}
