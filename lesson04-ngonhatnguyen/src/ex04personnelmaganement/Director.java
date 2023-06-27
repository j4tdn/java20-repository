package ex04personnelmaganement;

import java.time.LocalDate;

public class Director extends Personnel {
	private float jobCoefficient;

	public Director() {
	}

	public Director(String name, LocalDate doB, float coefficientsSalary, float jobCoefficient) {
		super(name, doB, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}
	
	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	@Override
	public String toString() {
		return "Director [Name=" + getName() + ", DoB=" + getDoB() + ", CoefficientsSalary="
				+ getCoefficientsSalary() + ", jobCoefficient=" + jobCoefficient + "]";
	}
	
}
