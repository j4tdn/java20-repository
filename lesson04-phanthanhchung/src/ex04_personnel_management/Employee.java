package ex04_personnel_management;

import java.time.LocalDate;

public class Employee extends Personnel{
	private String department;
	private Manager manager;
	
	public Employee() {
	}

	public Employee(String name, String birthday, double salaryFactor, String department, Manager manager) {
		super(name, birthday, salaryFactor);
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManager() {
		return manager.getName();
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthday=" + getBirthday() + ", salaryFactor=" + salaryFactor + ", department="
				+ department + ", manager=" + getManager() + "]";
	}
}
