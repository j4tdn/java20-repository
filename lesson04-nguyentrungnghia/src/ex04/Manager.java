package ex04;

import java.time.LocalDate;

public class Manager extends Staff {

	private int coefficientsPosition;
	private String nameOfDepartment;

	public Manager() {
	}

	public Manager(String name, LocalDate dateOfBirth, int coefficientsSalary, int coefficientsPosition,
			String nameOfDepartment) {
		super(name, dateOfBirth, coefficientsSalary);
		this.coefficientsPosition = coefficientsPosition;
		this.nameOfDepartment = nameOfDepartment;
	}

	public int getCoefficientsPosition() {
		return coefficientsPosition;
	}

	public void setCoefficientsPosition(int coefficientsPosition) {
		this.coefficientsPosition = coefficientsPosition;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public String toString() {
		return "Trưởng phòng [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getCoefficientsSalary() + ", Hệ số chức vụ: " + coefficientsPosition + ", Tên phòng ban: "
				+ nameOfDepartment + "]";
	}

}
