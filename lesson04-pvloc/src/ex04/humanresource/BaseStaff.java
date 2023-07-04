package ex04.humanresource;

import java.time.LocalDate;

public class BaseStaff {
	
	public static final int SALARY_LEVEL_1 = 1; // nv
	public static final int SALARY_LEVEL_2 = 2; // ql
	public static final int SALARY_LEVEL_3 = 3; // gd
	
	public static final int TITLE_LEVEL_1 = 1; // ql
	public static final int TITLE_LEVEL_2 = 2; // gd
	
	private String fullname;
	private LocalDate dateOfBirth;
	private int salaryLevel;
	
	public BaseStaff() {
	}

	public BaseStaff(String fullname, LocalDate dateOfBirth, int salaryLevel) {
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.salaryLevel = salaryLevel;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	@Override
	public String toString() {
		return "BaseStaff [fullname=" + fullname + ", dateOfBirth=" + dateOfBirth + ", salaryLevel=" + salaryLevel
				+ "]";
	}
}
