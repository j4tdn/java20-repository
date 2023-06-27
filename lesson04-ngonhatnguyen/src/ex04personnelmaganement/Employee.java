package ex04personnelmaganement;

import java.time.LocalDate;

public class Employee extends Personnel {
	private String departmentName;
	private Manager manager;
	
	public Employee() {
	}

	public Employee(String name, LocalDate doB, float coefficientsSalary, Manager manager) {
		super(name, doB, coefficientsSalary);
		this.departmentName = manager.getDepartmentName();
		this.manager = manager;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + getName() + ", DoB=" + getDoB() + ", CoefficientsSalary="
				+ getCoefficientsSalary() + ", departmentName=" + departmentName + ", manager=" + manager + "]";
	}
	
}
