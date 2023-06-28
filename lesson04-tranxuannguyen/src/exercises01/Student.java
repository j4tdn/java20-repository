package exercises01;

public class Student {

	private int id;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoint;
	
	public Student() {
	}

	public Student(int id, String fullName, float theoreticalPoint, float practicePoint) {
		this.id = id;
		this.fullName = fullName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	public float calMediumScore() {
		return (theoreticalPoint + practicePoint)/2;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoreticalPoint=" + theoreticalPoint
				+ ", practicePoint=" + practicePoint + "]";
	}	
}
