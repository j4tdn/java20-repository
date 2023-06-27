package ex04personnelmaganement;

import java.time.LocalDate;

public class Personnel {
	private String name;
	private LocalDate doB;
	private float coefficientsSalary;
	
	public Personnel() {
		
	}

	public Personnel(String name, LocalDate doB, float coefficientsSalary) {
		this.name = name;
		this.doB = doB;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoB() {
		return doB;
	}

	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Personnel [name=" + name + ", doB=" + doB + ", coefficientsSalary=" + coefficientsSalary + "]";
	}
}
