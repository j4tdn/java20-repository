package human.resources.management;

import java.time.LocalDate;

public class Manager extends EmployeeManager {
	private double positioncCoefficient;
	private String departmentName;

	public Manager(String fullName, LocalDate dayOfBirth, double salaryFactor, double positioncCoefficient,
			String departmentName) {
		super(fullName, dayOfBirth, salaryFactor);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public double getPositioncCoefficient() {
		return positioncCoefficient;
	}

	public void setPositioncCoefficient(double positioncCoefficient) {
		this.positioncCoefficient = positioncCoefficient;
	}

	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + ", PositionFactor=" + getPositioncCoefficient()
				+ ", FullName =" + getFullName() + ", DayOfBirth=" + getDayOfBirth() + ", SalaryFactor="
				+ getSalaryFactor() + "]";
	}

}
