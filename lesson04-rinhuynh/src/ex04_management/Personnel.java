package ex04_management;

import java.time.LocalDate;

public class Personnel {
	private String name;
	private LocalDate dateOfBirth;
	private double coefficientsSalary;
	
	public Personnel() {
		// TODO Auto-generated constructor stub
	}

	public Personnel(String name, LocalDate dateOfBirth, double coefficientsSalary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(int coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Personnel [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	
	

}
