package bean;

public class Student {
	private int id;
	private String name;
	private RankedAcademic rAcademic; 
	
	public Student() {
	}

	public Student(int id, String name, RankedAcademic rAcademic) {
		this.id = id;
		this.name = name;
		this.rAcademic = rAcademic;
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

	public RankedAcademic getrAcademic() {
		return rAcademic;
	}

	public void setrAcademic(RankedAcademic rAcademic) {
		this.rAcademic = rAcademic;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rAcademic=" + rAcademic + "]";
	}
	
	
	
	
}
