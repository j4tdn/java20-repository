package human.resources.management;

import java.time.LocalDate;

public abstract class EmployeeManager {
	private String fullName;
	private LocalDate dayOfBirth;
	private double salaryFactor;
	public EmployeeManager(String fullName, LocalDate dayOfBirth, double salaryFactor) {
		this.fullName = fullName;
		this.dayOfBirth = dayOfBirth;
		this.salaryFactor = salaryFactor;
	}
	public EmployeeManager() {
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public double getSalaryFactor() {
		return salaryFactor;
	}
	public void setSalaryFactor(double salaryFactor) {
		this.salaryFactor = salaryFactor;
	}
	@Override
	public String toString() {
		return "HumanResources [fullName=" + fullName + ", dayOfBirth=" + dayOfBirth + ", salaryFactor=" + salaryFactor
				+ "]";
	}
	
	
}
