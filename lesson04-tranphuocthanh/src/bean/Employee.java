package bean;

public class Employee extends Personnel {
	private Department department; // bộ phận, đơn vị
	private String manager;

	public Employee() {
	}

	public Employee(String name, int birthDay, float coefficientsSalary, Department department, String manager) {
		super(name, birthDay, coefficientsSalary);
		this.department = department;
		this.manager = manager;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [name: " + getName() + " ,birthDay: " + getBirthDay() + " ,coefficientsSalary: "
				+ getCoefficientsSalary() + " ,department: " + department + " ,manager: " + manager + "]";
	}

}
