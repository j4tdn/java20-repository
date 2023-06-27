package bean;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Personnel {
	private String fullname;
	private LocalDate dob;
	private float salaryCoefficient;
	protected Scanner sc;

	public Personnel() {

	}

	public Personnel(String fullname, LocalDate dob, float salaryCoefficient) {
		super();
		this.fullname = fullname;
		this.dob = dob;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(float salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	@Override
	public String toString() {
		return "Personnel [fullname=" + fullname + ", dob=" + dob + ", salaryCoefficient=" + salaryCoefficient + "]";
	}
	
	// Tính lương
	public abstract float getSalary();
}
