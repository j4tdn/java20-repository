package bean;

public class Student {
	private int maSv;
	private String name;
	private float pointTheoretica;
	private float pointPractice;
	
	public Student() {
	}

	public Student(int maSv, String name, float pointTheoretica, float pointPractice) {
		this.maSv = maSv;
		this.name = name;
		this.pointTheoretica = pointTheoretica;
		this.pointPractice = pointPractice;
	}

	public int getMaSv() {
		return maSv;
	}

	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPointTheoretica() {
		return pointTheoretica;
	}

	public void setPointTheoretica(float pointTheoretica) {
		this.pointTheoretica = pointTheoretica;
	}

	public float getPointPractice() {
		return pointPractice;
	}

	public void setPointPractice(float pointPractice) {
		this.pointPractice = pointPractice;
	}
	public static float mediumScore(Student std) {
		return (std.getPointTheoretica() + std.getPointPractice())/2;
	}
	
	@Override
	public String toString() {
		return "Student [maSv=" + maSv + ", name=" + name + ", pointTheoretica=" + pointTheoretica + ", pointPractice="
				+ pointPractice + "]";
	}
	
	
	
	
}
