package exercises4;

public class Employee extends Person {
	private String departmentName;
	
	public Employee() {
	}

	
	public Employee(String name, String dateOfBirth, float salaryLevel, String departmentName) {
		super(name, dateOfBirth, salaryLevel);
		this.departmentName = departmentName;
	}


	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return "Employee [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}

	public float salary() {
		return this.getSalaryLevel() * 1250000;
		
	}
	
	
}
