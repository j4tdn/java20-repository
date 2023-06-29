package bean;

public class Director extends People  {
	private int positionLevel; // Hệ số chức vụ

	public Director() {

	}

	public Director(String name, String dateOfBirth, float salaryLevel, int positionLevel) {
		super(name, dateOfBirth, salaryLevel);
		this.positionLevel = positionLevel;
	}

	public int getpositionLevel() {
		return positionLevel;
	}

	public void setpositionLevel(int positionLevel) {
		this.positionLevel = positionLevel;
	}

	@Override
	public String toString() {
		return "Director[" + super.toString() + " positionLevel=" + positionLevel + "]";
	}

	@Override
	public float findSalary() {
		return (this.getSalaryLevel() + this.getpositionLevel()) * 3000000;
	}
}
