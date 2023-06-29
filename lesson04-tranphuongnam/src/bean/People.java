package bean;

public class People  {
	private String name;
	private String dateOfBirth;
	private float salaryLevel;

	public People(String name, String dateOfBirth, float salaryLevel) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryLevel = salaryLevel;
	}

	public People() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(float salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	@Override
	public String toString() {
		return "name=" + name + ", dateOfBirth=" + dateOfBirth + ",salaryLevel=" + salaryLevel;
	}

	public float findSalary() {
		return 0;
	}
}
