package ex04_management;

import java.time.LocalDate;

public class Employee extends Personnel {

	private String nameOfDepartment;
	private String nameOfManager;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, LocalDate dateOfBirth, double d, String nameOfDepartment,
			String nameOfManager) {
		super(name, dateOfBirth, d);
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
