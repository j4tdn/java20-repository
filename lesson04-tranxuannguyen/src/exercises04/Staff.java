package exercises04;

import java.time.LocalDate;

public class Staff extends Personnel{
	
	private String agencyName;
	private Manager manager;
	
	public Staff() {
	}

	public Staff(String fullName, LocalDate dateOfBirth, float coefficientsSalary, String agencyName, Manager manager) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.agencyName = agencyName;
		this.manager = manager;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Staff [getFullName()=" + getFullName()
				+ ", getDateOfBirth()=" + getDateOfBirth() 
				+ ", getCoefficientsSalary()=" + getCoefficientsSalary()
				+ ", agencyName=" + agencyName 
				+ ", manager=" + manager +"]";
	}
	public static void printInforPersonnel(Staff...staffs) {
		for(Staff staff : staffs) {
			System.out.printf("\n%-30s%-30s%-30s%-30s%-35s\n"
					, staff.getFullName()
					, staff.getDateOfBirth()
					, staff.getCoefficientsSalary()
					, staff.agencyName
					, staff.manager.getFullName());
		}
	}
	@Override
	public float salary() {
		return super.getCoefficientsSalary() * 1250000;
	}
}
