package exercises04;

import java.time.LocalDate;

public abstract class Personnel {
	private String fullName;
	private LocalDate dateOfBirth;
	private float coefficientsSalary;
	
	public Personnel() {
	}

	public Personnel(String fullName, LocalDate dateOfBirth, float coefficientsSalary) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Personnel [fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary="
				+ coefficientsSalary + "]";
	}
	public abstract float salary();
	
}
