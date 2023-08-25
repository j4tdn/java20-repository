package exercises.exam;


enum Score{
	A, B, C, D, E, F;
}

public class Student {
	private int StudentID;
	private String name;
	private Score score;

	public Student() {
		
	}
	
	public Student(int id, String name,Score score) {
		this.StudentID = id;
		this.name = name;
		this.score = score;
	}
	
	// getters and setters for name and score
	public int getStudentID() {
		return StudentID;
	}
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", name=" + name + ", score=" + score + "]";
	}
}
