package ex04humanresourcemanagement;

import java.time.LocalDate;

public class Manager extends Personnel{
	private int titleLevel; // hệ số chức vụ
	
	public Manager() {
	}

	public Manager(String fullname, LocalDate dateOfBirth, 
				   int salaryLevel, int titleLevel) {
		super(fullname, dateOfBirth, salaryLevel);
		this.titleLevel = titleLevel;
	}

	public int getTitleLevel() {
		return titleLevel;
	}

	public void setTitleLevel(int titleLevel) {
		this.titleLevel = titleLevel;
	}

	@Override
	public String toString() {
		return "Manager [fullname=" + getFullname() 
					 + ", dateOfBirth=" + getDateOfBirth() 
					 + ", salaryLevel=" + getSalaryLevel()
					 + ", titleLevel=" + getTitleLevel()
				+ "]";
	}
}
