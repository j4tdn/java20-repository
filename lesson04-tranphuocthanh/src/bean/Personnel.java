package bean;

public class Personnel {
	private String name;
	private int birthDay;
	private float coefficientsSalary;

	public Personnel() {
	}

	public Personnel(String name, int birthDay, float coefficientsSalary) {
		this.name = name;
		this.birthDay = birthDay;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDay=" + birthDay + ", coefficientsSalary=" + coefficientsSalary + "]";
	}

}
