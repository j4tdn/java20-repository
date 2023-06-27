package bean;

import java.time.LocalDate;

public class Employee extends Personnel {
	private String departmentName;
	private Manager manager;
	
	public Employee() {
	}
	
	public Employee(String fullname, LocalDate dob, float salaryCoefficient, Manager manager) {
		super(fullname, dob, salaryCoefficient);
		this.departmentName = manager.getDepartmentName();
		this.manager = manager;
	}
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + getFullname() + ", dob=" + getDob() + ", salaryCoefficient=" + getSalaryCoefficient() + ", departmentName=" + departmentName + ", manager=" + manager + "]";
	}
	
	public static void outputInfor(Employee... employees) {
		for(Employee employee : employees) {
			System.out.printf("%-15s|%-15s|%-20.2f|%-20s|%-25s\n", employee.getFullname(), employee.getDob(), employee.getSalaryCoefficient(),employee.getDepartmentName(), employee.manager.getFullname());
		}
	}
	@Override
	public float getSalary() {
		return super.getSalaryCoefficient() * 1250000;
	}

	
}
