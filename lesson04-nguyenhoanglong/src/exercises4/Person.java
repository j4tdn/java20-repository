package exercises4;

public class Person {
	private String name;
	private String dateOfBirth;
	private float salaryLevel;
	
	public Person() {
	}

	public Person(String name, String dateOfBirth, float salaryLevel) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryLevel = salaryLevel;
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
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + ", salaryLevel=" + salaryLevel + "]";
	}
	
	
}
