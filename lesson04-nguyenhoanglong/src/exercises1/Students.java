package exercises1;

public class Students {
	private int id;
	private String name;
	private float theoreticalscore;
	private float praticalscore;
	
	public Students() {
	}

	public Students(int id, String name, float theoreticalscore, float praticalscore) {
		this.id = id;
		this.name = name;
		this.theoreticalscore = theoreticalscore;
		this.praticalscore = praticalscore;
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

	public float getTheoreticalscore() {
		return theoreticalscore;
	}

	public void setTheoreticalscore(float theoreticalscore) {
		this.theoreticalscore = theoreticalscore;
	}

	public float getPraticalscore() {
		return praticalscore;
	}

	public void setPraticalscore(float praticalscore) {
		this.praticalscore = praticalscore;
	}

	public float averageScore() {
		return (theoreticalscore + praticalscore) / 2;
	}

	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", theoreticalscore=" + theoreticalscore + ", praticalscore="
				+ praticalscore + "]";
	}
	
	
	
}
