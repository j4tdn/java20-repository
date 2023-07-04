package ex04humanresourcemanagement;

import java.time.LocalDate;

public class Staff extends Personnel{
	private Leader leader;
	
	public Staff() {
	}

	public Staff(String fullname, LocalDate dateOfBirth, 
				 int salaryLevel, Leader leader) {
		super(fullname, dateOfBirth, salaryLevel);
		this.leader = leader;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}
	
	@Override
	public String toString() {
		return "Employee [fullname=" + getFullname() 
					 + ", dateOfBirth=" + getDateOfBirth() 
					 + ", salaryLevel=" + getSalaryLevel()
					 + ", department= " + leader.getDepartment()
					 + ", teamLead=" + leader.getFullname()
				+ "]";
	}
}
