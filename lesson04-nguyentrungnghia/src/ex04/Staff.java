package ex04;

import java.time.LocalDate;

public class Staff {

	private String name;
	private LocalDate dateOfBirth;
	private int coefficientsSalary;

	public Staff() {
	}

	public Staff(String name, LocalDate dateOfBirth, int coefficientsSalary) {
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

	public int getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(int coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
}
