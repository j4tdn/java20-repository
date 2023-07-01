package view.ex04.humanresource;

import java.time.LocalDate;

public class TeamLead extends BaseStaff {
	
	private int titleLevel;
	private String department;
	
	public TeamLead() {
	}

	public TeamLead(String fullname, LocalDate dateOfBirth, int salaryLevel, int titleLevel, String department) {
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof TeamLead)) {
			return false;
		}
		
		TeamLead that = (TeamLead)obj;
		
		return getFullname().equals(that.getFullname())
			&& getDateOfBirth().equals(that.getDateOfBirth())
			&& getSalaryLevel() == that.getSalaryLevel()
			&& getTitleLevel() == that.getTitleLevel()
			&& getDepartment() == that.getDepartment();
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
