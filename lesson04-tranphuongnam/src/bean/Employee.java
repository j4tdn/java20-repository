package bean;

public class Employee extends People {
	private Department departmentName;
	private Leader leader;

	public Employee() {
	}

	public Employee(String name, String dateOfBirth, float salaryLevel, Department departmentName, Leader leader) {
		super(name, dateOfBirth, salaryLevel);
		this.departmentName = departmentName;
		this.leader = leader;
	}

	public Department getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(Department departmentName) {
		this.departmentName = departmentName;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}

	@Override
	public String toString() {
		return "Employee[" + super.toString() + ", departmentName=" + departmentName.getName() + ", " + leader + "]";
	}

	@Override
	public float findSalary() {
		return (this.getSalaryLevel() + 0 /* 0: Hệ số chức vụ */) * 1250000;
	}

}
