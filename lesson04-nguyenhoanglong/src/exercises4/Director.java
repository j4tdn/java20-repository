package exercises4;

public class Director extends Person {
	private float positionLevel;
	
	public Director() {
	}
	
	public Director(String name, String dateOfBirth, float salaryLevel, float positionLevel) {
		super(name, dateOfBirth, salaryLevel);
		this.positionLevel = positionLevel;
	}

	public float getPositionLevel() {
		return positionLevel;
	}

	public void setPositionLevel(float positionLevel) {
		this.positionLevel = positionLevel;
	}

	@Override
	public String toString() {
		return "Director [positionLevel=" + positionLevel + ", toString()=" + super.toString() + "]";
	}

	public float salary() {
		return ((this.getSalaryLevel() + this.getPositionLevel()) * 3000000);
		
	}
	}
