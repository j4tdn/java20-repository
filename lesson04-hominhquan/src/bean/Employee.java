package bean;


public class Employee extends ChiefRoom{
	 private String chiefRoom;
	 
	 public Employee() {
	 }

	public Employee(String name, String birthDay, float coefficientsSalary,
			String departmentName, String chiefRoom) {
		this.setName(name);
		this.setBirthDay(birthDay);
		this.setCoefficientsSalary(coefficientsSalary);
		this.setDepartmentName(departmentName);
		this.chiefRoom = chiefRoom;
	}

	public String getChiefRoom() {
		return chiefRoom;
	}

	public void setChiefRoom(String chiefRoom) {
		this.chiefRoom = chiefRoom;
	}

	@Override
	public String toString() {
		return "Employee ["+ "Name= " + getName() 
		+ ", BirthDay= "+ getBirthDay()  
		+ ", CoefficientsSalary= " + getCoefficientsSalary() 
		+ ", CoefficientsJob= "+ getCoefficientsJob() 
		+ ", chiefRoom= "+ getChiefRoom() +"]"; 
	}
	
	 
}
