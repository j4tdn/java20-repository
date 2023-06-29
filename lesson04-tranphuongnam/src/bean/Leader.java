package bean;

public class Leader extends People {

	private int posLevel; //Hệ số chức vụ
	private Department departmentName;
	public Leader() {
	}
	
	public Leader(String name, String dateOfBirth, float salaryLevel, int posLevel, Department departmentName) {
		super(name, dateOfBirth, salaryLevel);
		this.posLevel = posLevel;
		this.departmentName = departmentName;
	}

	public int getPosLevel() {
		return posLevel;
	}

	public void setPosLevel(int posLevel) {
		this.posLevel = posLevel;
	}

	public Department getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(Department departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Leader[" + super.toString() +", posLevel=" + posLevel + ", departmentName=" + departmentName.getName() +"]";
	}


	@Override
	public float findSalary() {
		return (this.getSalaryLevel() + this.getPosLevel()) * 2200000;
	}
}
