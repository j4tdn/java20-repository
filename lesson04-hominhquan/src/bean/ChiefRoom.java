package bean;


public class ChiefRoom extends Manager{
	private String departmentName;
	
	public ChiefRoom() {
	}

	public ChiefRoom(String name, String birthDay, float coefficientsSalary, float coefficientsJob,
			String departmentName) {
		super(name, birthDay, coefficientsSalary, coefficientsJob);
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
		return "ChiefRoom ["+ "Name= " + getName() 
				+ ", BirthDay= "+ getBirthDay()  
				+ ", CoefficientsSalary= " + getCoefficientsSalary() 
				+ ", CoefficientsJob= "+ getCoefficientsJob() 
				+ ", departmentName= " + departmentName +"]" ;
	}
	
	
}
