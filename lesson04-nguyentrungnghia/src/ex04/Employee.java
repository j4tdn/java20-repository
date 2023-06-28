package ex04;

import java.time.LocalDate;

public class Employee extends Staff {

	private String nameOfDepartment;
	private String nameOfManager;

	public Employee() {
	}

	public Employee(String name, LocalDate dateOfBirth, int coefficientsSalary, String nameOfDepartment,
			String nameOfManager) {
		super(name, dateOfBirth, coefficientsSalary);
		this.nameOfDepartment = nameOfDepartment;
		this.nameOfManager = nameOfManager;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	public String getNameOfManager() {
		return nameOfManager;
	}

	public void setNameOfManager(String nameOfManager) {
		this.nameOfManager = nameOfManager;
	}

	@Override
	public String toString() {
		return "Nhân viên [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getCoefficientsSalary() + ", Tên phòng ban: " + nameOfDepartment + ", Trưởng phòng: " + nameOfManager
				+ "]";
	}

}
