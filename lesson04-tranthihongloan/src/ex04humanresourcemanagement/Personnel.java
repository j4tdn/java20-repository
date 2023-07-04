package ex04humanresourcemanagement;

import java.time.LocalDate;

public abstract class Personnel {
	public static final int SALARY_LEVEL_1 = 1; // nv
	public static final int SALARY_LEVEL_2 = 2; // ql
	public static final int SALARY_LEVEL_3 = 3; // gd
	
	public static final int TITLE_LEVEL_1 = 1; // ql
	public static final int TITLE_LEVEL_2 = 2; // gd
	
	private String fullname;
	private LocalDate dateOfBirth;
	private int salaryLevel;
	
	public Personnel() {
	}

	public Personnel(String fullname, LocalDate dateOfBirth, int salaryLevel) {
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
		return "Personnel [fullname=" + fullname 
					+ ", dateOfBirth=" + dateOfBirth 
					+ ", salaryLevel=" + salaryLevel
				+ "]";
	}
}
