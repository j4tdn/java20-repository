package bean;

public class Manager extends Personnel {
	private float jobGrade;
	private Department department;

	public Manager() {
	}

	public Manager(String name, int birthDay, float coefficientsSalary, float jobGrade, Department department) {
		super(name, birthDay, coefficientsSalary);
		this.jobGrade = jobGrade;
		this.department = department;
	}

	public float getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(float jobGrade) {
		this.jobGrade = jobGrade;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [name: " + getName() + " ,birthDay: " + getBirthDay() + " ,coefficientsSalary: "
				+ getCoefficientsSalary() + " ,jobGrade: " + jobGrade + " ,department: " + department + "]";
	}
}
