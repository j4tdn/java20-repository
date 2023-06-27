package bean;

public class Director extends Personnel {
	private float jobGrade; // cấp bậc công việc, hệ số chức vụ

	public Director() {
	}

	public Director(String name, int birthDay, float coefficientsSalary, float jobGrade) {
		super(name, birthDay, coefficientsSalary);
		this.jobGrade = jobGrade;
	}

	public float getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(float jobGrade) {
		this.jobGrade = jobGrade;
	}

	@Override
	public String toString() {
		return "Director [name: " + getName() + " ,birthDay: " + getBirthDay() + " ,coefficientsSalary: "
				+ getCoefficientsSalary() + " ,jobGrade: " + jobGrade + "]";
	}
}
