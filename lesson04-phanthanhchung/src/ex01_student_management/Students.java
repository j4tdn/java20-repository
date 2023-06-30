package ex01_student_management;

public class Students {
	private String studentID;
	private String name;
	private double theoryMark;
	private double practicalMark;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(String studentID, String name, double theoryMark, double practicalMark) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.theoryMark = theoryMark;
		this.practicalMark = practicalMark;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTheoryMark() {
		return theoryMark;
	}

	public void setTheoryMark(double theoryMark) {
		this.theoryMark = theoryMark;
	}

	public double getPracticalMark() {
		return practicalMark;
	}

	public void setPracticalMark(double practicalMark) {
		this.practicalMark = practicalMark;
	}
	
	public double averageMark() {
		return (this.theoryMark + this.practicalMark)/2.0;
	}

	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", name=" + name + ", theoryMark=" + theoryMark + ", practicalMark="
				+ practicalMark + "]";
	}
}