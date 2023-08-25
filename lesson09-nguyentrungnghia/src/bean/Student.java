package bean;

import bean.Ranking;

public class Student {
	
	private int id;
	private String name;
	private Ranking ranking;
	
	public Student() {
	}

	public Student(int id, String name, Ranking ranking) {
		this.id = id;
		this.name = name;
		this.ranking = ranking;
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

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Họ tên: " + name + ", Xếp loại: " + ranking + "\n"; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		else if (this == obj)
			return true;
		
		else if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.id)
				return true;
		}
		return false;
	}

}
