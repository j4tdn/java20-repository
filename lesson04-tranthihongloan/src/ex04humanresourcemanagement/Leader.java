package ex04humanresourcemanagement;

import java.time.LocalDate;

public class Leader extends Personnel{
	private int titleLevel;
	private String department;
	
	public Leader() {
	}

	public Leader(String fullname, LocalDate dateOfBirth, 
				  int salaryLevel, int titleLevel, String department) {
		super(fullname, dateOfBirth, salaryLevel);
		this.titleLevel = titleLevel;
		this.department = department;
	}

	public int getTitleLevel() {
		return titleLevel;
	}

	public void setTitleLevel(int titleLevel) {
		this.titleLevel = titleLevel;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "TeamLead [fullname=" + getFullname() 
					 + ", dateOfBirth=" + getDateOfBirth() 
					 + ", salaryLevel=" + getSalaryLevel()
					 + ", titleLevel=" + getTitleLevel()
					 + ", department=" + getDepartment()
				+ "]";
	}
}
