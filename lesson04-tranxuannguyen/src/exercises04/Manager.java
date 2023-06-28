package exercises04;

import java.time.LocalDate;

public class Manager extends Personnel{
	
	private float coefficientsFunction;
	private String agencyName;
	
	public Manager() {
	}

	public Manager(String fullName, LocalDate dateOfBirth, float coefficientsSalary, float coefficientsFunction,
			String agencyName) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.coefficientsFunction = coefficientsFunction;
		this.agencyName = agencyName;
	}

	public float getCoefficientsFunction() {
		return coefficientsFunction;
	}

	public void setCoefficientsFunction(float coefficientsFunction) {
		this.coefficientsFunction = coefficientsFunction;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	@Override
	public String toString() {
		return "Manager [getFullName()=" + getFullName() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getCoefficientsSalary()=" + getCoefficientsSalary() 
				+ ", coefficientsFunction=" + coefficientsFunction 
				+ ", agencyName=" + agencyName +"]";
	}
	
	public static void printInforPersonnel(Manager...managers) {
		for(Manager manager : managers) {
			System.out.printf("\n%-30s%-30s%-30s%-30s%-35s\n"
					, manager.getFullName()
					, manager.getDateOfBirth()
					, manager.getCoefficientsSalary()
					, manager.coefficientsFunction 
					, manager.agencyName);
		}
	}
	@Override
	public float salary() {
		return ((super.getCoefficientsSalary() + this.getCoefficientsFunction()) * 2200000);
		
	}
	
}
