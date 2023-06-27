package bean;

public class Ex01Student {
	private int id;
	private String name;
	private float theoryScore;
	private float praticeScore;
	public Ex01Student() {
	}
	public Ex01Student(int id, String name, float theoryScore, float praticeScore) {
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.praticeScore = praticeScore;
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
	public float getPraticeScore() {
		return praticeScore;
	}
	public void setPraticeScore(float praticeScore) {
		this.praticeScore = praticeScore;
	}
	public float averageScore() {
		return (theoryScore + praticeScore)/2;
	}
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", theoryScore = " 
				+ theoryScore + ", praticeScore = "+ praticeScore + "]";
	}
	
}
