package ex01_student;

public class Student {

	
	private int id;
	private String name;
	private float theoreticalScores;
	private float practiceScores;
	
	public Student() {
	}

	public Student(int id, String name, float theoreticalScores, float practiceScores) {
		super();
		this.id = id;
		this.name = name;
		this.theoreticalScores = theoreticalScores;
		this.practiceScores = practiceScores;
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

	public float getTheoreticalScores() {
		return theoreticalScores;
	}

	public void setTheoreticalScores(float theoreticalScores) {
		this.theoreticalScores = theoreticalScores;
	}

	public float getPracticeScores() {
		return practiceScores;
	}

	public void setPracticeScores(float practiceScores) {
		this.practiceScores = practiceScores;
	}
	
	public float getAverageScore() {
		return (theoreticalScores + practiceScores)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalScores=" + theoreticalScores + ", practiceScores="
				+ practiceScores + "]";
	}
	
	
	

}
