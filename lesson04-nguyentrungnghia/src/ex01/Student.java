package ex01;

public class Student {

	private int id;
	private String name;
	private float theoreticalGrade;
	private float practicalGrade;

	public Student() {
	}

	public Student(int id, String name, float theoreticalGrade, float practicalGrade) {
		this.id = id;
		this.name = name;
		this.theoreticalGrade = theoreticalGrade;
		this.practicalGrade = practicalGrade;
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

	public float getTheoreticalGrade() {
		return theoreticalGrade;
	}

	public void setTheoreticalGrade(float theoreticalGrade) {
		this.theoreticalGrade = theoreticalGrade;
	}

	public float getPracticalGrade() {
		return practicalGrade;
	}

	public void setPracticalGrade(float practicalGrade) {
		this.practicalGrade = practicalGrade;
	}
	
	public float getAverageGrade() {
		return ((getTheoreticalGrade() + getPracticalGrade()) / 2);
	}

	@Override
	public String toString() {
		return "Mã SV: " + id + ", Họ tên: " + name + ", Điểm lý thuyết: " + theoreticalGrade + ", Điểm thực hành: "
				+ practicalGrade;
	}

}
