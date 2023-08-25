package bean;

public class Student {
	private int id;
	private String fullName;
	private Rank rank;
	public Student() {
	}
	public Student(int id, String fullName, Rank rank) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.rank = rank;
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
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", rank=" + rank + "]";
	}
	
}
