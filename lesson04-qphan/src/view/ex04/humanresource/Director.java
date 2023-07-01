package view.ex04.humanresource;

import java.time.LocalDate;

public class Director extends BaseStaff{
	
	private int titleLevel; // hệ số chức vụ
	
	public Director() {
	}
	
	public Director(String fullname, LocalDate dateOfBirth, int salaryLevel, int titleLevel) {
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
		return "Director [fullname=" + getFullname() 
					 + ", dateOfBirth=" + getDateOfBirth() 
					 + ", salaryLevel=" + getSalaryLevel()
					 + ", titleLevel=" + getTitleLevel()
				+ "]";
	}
	
	
}
