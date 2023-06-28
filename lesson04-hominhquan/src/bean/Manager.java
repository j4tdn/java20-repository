package bean;


public class Manager {
	private String name;
	private String birthDay;
	private float coefficientsSalary;
	private float coefficientsJob;
	
	public Manager() {
	}

	public Manager(String name, String birthDay, float coefficientsSalary, float coefficientsJob) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.coefficientsSalary = coefficientsSalary;
		this.coefficientsJob = coefficientsJob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public float getCoefficientsJob() {
		return coefficientsJob;
	}

	public void setCoefficientsJob(float coefficientsJob) {
		this.coefficientsJob = coefficientsJob;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", birthDay=" + birthDay + ", coefficientsSalary=" + coefficientsSalary
				+ ", coefficientsJob=" + coefficientsJob + "]";
	}
	
	
}
