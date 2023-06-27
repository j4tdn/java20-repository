package bean.ex04;

import java.time.LocalDate;

public class Employees {
	private String name;
	private LocalDate date;
	private double salaryCoefficient;
	public Employees() {
	}
	public Employees(String name, LocalDate date, double salaryCoefficient) {
		this.name = name;
		this.date = date;
		this.salaryCoefficient = salaryCoefficient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}
	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", date=" + date + ", salaryCoefficient=" + salaryCoefficient + "]";
	}
	
	
}
