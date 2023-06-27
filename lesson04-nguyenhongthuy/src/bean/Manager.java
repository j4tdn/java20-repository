package bean;

import java.time.LocalDate;

public class Manager extends Personnel {
	private float positionCoefficient;
	private String departmentName;

	public Manager() {

	}
	
	public Manager(String fullname, LocalDate dob, float salaryCoefficient, float positionCoefficient, String departmentName) {
		super(fullname, dob, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
		this.departmentName = departmentName;
	}


	public float getPositionCoefficient() {
		return positionCoefficient;
	}


	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
	@Override
	public String toString() {
		return "Manager [fullname=" + getFullname() + ", dob=" + getDob() + ", salaryCoefficient=" + getSalaryCoefficient() + ", positionCoefficient=" + positionCoefficient + ", departmentName=" + departmentName + "]";
	}
	
	//In thông tin trưởng phòng
	public static void outputInfor(Manager...managers) {
		for(Manager manager : managers) {
			System.out.printf("%-15s|%-15s|%-20.2f|%-20.5f|%-25s\n", manager.getFullname(), manager.getDob(), manager.getSalaryCoefficient(), manager.positionCoefficient ,manager.departmentName);
		}
	}
	
	
	@Override
	public float getSalary() {
		return (super.getSalaryCoefficient() + this.positionCoefficient) * 2200000;
	}

}
