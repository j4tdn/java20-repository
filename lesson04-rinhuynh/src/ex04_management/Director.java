package ex04_management;

import java.time.LocalDate;

public class Director extends Personnel {
	private int coecoefficientsPosition;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, LocalDate dateOfBirth, int coefficientsSalary, int coecoefficientsPosition) {
		super(name, dateOfBirth, coefficientsSalary);
		this.coecoefficientsPosition = coecoefficientsPosition;
	}

	public int getCoecoefficientsPosition() {
		return coecoefficientsPosition;
	}

	public void setCoecoefficientsPosition(int coecoefficientsPosition) {
		this.coecoefficientsPosition = coecoefficientsPosition;
	}

	@Override
	public String toString() {
		return "Giám đốc [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getCoefficientsSalary() + ", Hệ số chức vụ: " + getCoecoefficientsPosition() + "]";
	}

}
