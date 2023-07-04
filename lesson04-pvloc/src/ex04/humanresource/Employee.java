package ex04.humanresource;

import java.time.LocalDate;

public class Employee extends BaseStaff{
	
	private TeamLead teamLead; // has-a
	
	public Employee() {
	}

	public Employee(String fullname, LocalDate dateOfBirth, int salaryLevel, TeamLead teamLead) {
		super(fullname, dateOfBirth, salaryLevel);
		this.teamLead = teamLead;
	}


	public TeamLead getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(TeamLead teamLead) {
		this.teamLead = teamLead;
	}

	
	@Override
	public String toString() {
		return "Employee [fullname=" + getFullname() 
					 + ", dateOfBirth=" + getDateOfBirth() 
					 + ", salaryLevel=" + getSalaryLevel()
					 + ", department= " + teamLead.getDepartment()
					 + ", teamLead=" + teamLead.getFullname()
				+ "]";
	}
	
	
}
