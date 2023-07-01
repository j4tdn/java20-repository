package ex01studentmanagement;

public class Student {
	private int id;
	private String name;
	private double thPoint;
	private double prPoint;
	
	public Student() {
	}

	public Student(int id, String name, double thPoint, double prPoint) {
		super();
		this.id = id;
		this.name = name;
		this.thPoint = thPoint;
		this.prPoint = prPoint;
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

	public double getThPoint() {
		return thPoint;
	}

	public void setThPoint(double thPoint) {
		this.thPoint = thPoint;
	}

	public double getPrPoint() {
		return prPoint;
	}

	public void setPrPoint(double prPoint) {
		this.prPoint = prPoint;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", thPoint=" + thPoint + ", prPoint=" + prPoint + "]";
	}
	
	public double calAverage() {
		return (thPoint + prPoint)/2;
	}
}
