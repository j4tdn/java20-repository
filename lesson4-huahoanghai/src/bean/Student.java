package bean;

public class Student {
	private int id;
	private String name;
	private float poinTheory;
	private float poinPractice;
	
	public Student() {
		
	}
	
	public float average() {
		return (poinTheory + poinPractice)/2;
	}

	public Student(int id, String name, float poinTheory, float poinPractice) {
		
		this.id = id;
		this.name = name;
		this.poinTheory = poinTheory;
		this.poinPractice = poinPractice;
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

	public float getPoinTheory() {
		return poinTheory;
	}

	public void setPoinTheory(float poinTheory) {
		this.poinTheory = poinTheory;
	}

	public float getPoinPractice() {
		return poinPractice;
	}

	public void setPoinPractice(float poinPractice) {
		this.poinPractice = poinPractice;
	}

	@Override
	public String toString() {
		return "Studen [id=" + id + ", name=" + name + ", poinTheory=" + poinTheory + ", poinPractice=" + poinPractice
				+ "]";
	}
	
	
}
