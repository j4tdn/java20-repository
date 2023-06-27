package ex04personnelmaganement;

import java.time.LocalDate;

public class Manager extends Personnel {
	private float jobCoefficient;
	private String departmentName;
	
	public Manager() {
	}

	public Manager(String name, LocalDate doB, float coefficientsSalary, float jobCoefficient, String departmentName) {
		super(name, doB, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
		this.departmentName = departmentName;
	}

	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Manager [Name=" + getName() + ", DoB=" + getDoB() + ", CoefficientsSalary="
				+ getCoefficientsSalary() + ", jobCoefficient=" + jobCoefficient + ", departmentName=" + departmentName
				+ "]";
	}
	
}
