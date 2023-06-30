package ex04_personnel_management;

import java.time.LocalDate;

public class Manager extends Personnel{
	private double statusFactor;
	private String department;
	
	public Manager() {
	}

	public Manager(String name, String birthday, double salaryFactor, double statusFactor, String department) {
		super(name, birthday, salaryFactor);
		this.statusFactor = statusFactor;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getStatusFactor() {
		return statusFactor;
	}

	public void setStatusFactor(double statusFactor) {
		this.statusFactor = statusFactor;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", birthday=" + getBirthday() + ", salaryFactor=" + getSalaryFactor() + ", statusFactor="
				+ getStatusFactor() + ", department=" + getDepartment() + "]";
	}
}
