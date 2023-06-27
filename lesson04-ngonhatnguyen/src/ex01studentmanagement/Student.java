package ex01studentmanagement;

public class Student {
	private int id;
	private String name;
	private float ltGrade;
	private float thGrade;

	public Student() {
	}

	public Student(int id, String name, float ltGrade, float thGrade) {
		super();
		this.id = id;
		this.name = name;
		this.ltGrade = ltGrade;
		this.thGrade = thGrade;
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

	public float getLtGrade() {
		return ltGrade;
	}

	public void setLtGrade(float ltGrade) {
		this.ltGrade = ltGrade;
	}

	public float getThGrade() {
		return thGrade;
	}

	public void setThGrade(float thGrade) {
		this.thGrade = thGrade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ltGrade=" + ltGrade + ", thGrade=" + thGrade + "]";
	}
	
	public float calAverage() {
		return (ltGrade + thGrade) / 2;
	}
}
