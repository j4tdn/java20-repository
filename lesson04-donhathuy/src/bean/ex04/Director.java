package bean.ex04;

import java.time.LocalDate;

public class Director extends Employees {
	private double positionCoefficient;
	public Director() {
	}
	public Director(String name, LocalDate date, double salaryCoefficient, double positionCoefficient) {
		super(name, date, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}
	public double getPositionCoefficient() {
		return positionCoefficient;
	}
	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	@Override
	public String toString() {
		return "Director [ Name: " + getName() + ", Date:  "
				+ getDate() + ", Salary coefficient: " + getSalaryCoefficient() +
				", Position coefficient: " + positionCoefficient + "]";
	}
	
}
