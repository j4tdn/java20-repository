package ex04;

import java.time.LocalDate;

public class Director extends Staff {

	private int coefficientsPosition;

	public Director() {
	}

	public Director(String name, LocalDate dateOfBirth, int coefficientsSalary, int coefficientsPosition) {
		super(name, dateOfBirth, coefficientsSalary);
		this.coefficientsPosition = coefficientsPosition;
	}

	public int getCoefficientsPosition() {
		return coefficientsPosition;
	}

	public void setCoefficientsPosition(int coefficientsPosition) {
		this.coefficientsPosition = coefficientsPosition;
	}

	@Override
	public String toString() {
		return "Giám đốc [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getCoefficientsSalary() + ", Hệ số chức vụ: " + getCoefficientsPosition() + "]";
	}

}
