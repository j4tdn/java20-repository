package studentmanagement;

public class Student {
	private int id;
	private String fullName;
	private double theoryGrade;
	private double practiceGrade;

	public Student(int id, String fullName, double theoryGrade, double practiceGrade) {
		this.id = id;
		this.fullName = fullName;
		this.theoryGrade = theoryGrade;
		this.practiceGrade = practiceGrade;
	}

	public Student() {
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

	public double getTheoryGrade() {
		return theoryGrade;
	}

	public void setTheoryGrade(double theoryGrade) {
		this.theoryGrade = theoryGrade;
	}

	public double getPracticeGrade() {
		return practiceGrade;
	}

	public void setPracticeGrade(double practiceGrade) {
		this.practiceGrade = practiceGrade;
	}

	public double tinhDiemTrungBinh() {
		return (practiceGrade + theoryGrade) / 2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", theoryGrade=" + theoryGrade + ", practiceGrade="
				+ practiceGrade + ", tinhDiemTrungBinh()=" + tinhDiemTrungBinh() + "]";
	}

}
