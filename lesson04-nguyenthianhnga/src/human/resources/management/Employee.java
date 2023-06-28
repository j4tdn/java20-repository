
package human.resources.management;

import java.time.LocalDate;

public class Employee extends EmployeeManager {
	private String departmentName;
	private Manager departmentManager;

	public Employee(String fullName, LocalDate dayOfBirth, double salaryFactor, String departmentName,
			Manager departmentManager) {
		super(fullName, dayOfBirth, salaryFactor);
		this.departmentName = departmentName;
		this.departmentManager = departmentManager;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getDepartmentManager() {
		return departmentManager;
	}

	public void setDepartmentManager(Manager departmentManager) {
		this.departmentManager = departmentManager;
	}

	@Override
	public String toString() {
		return "\nEmployee [departmentName =" + departmentName + ", departmentManager=" + departmentManager.getFullName()
				+ ", FullName=" + getFullName() + ",DayOfBirth=" + getDayOfBirth() + ",SalaryFactor="
				+ getSalaryFactor() + "]";
	}

}
