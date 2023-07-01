package view.ex04.humanresource;


public class TeamLeadParam {
	
	private TeamLead teamLead;
	private Employee[] employees;
	private int counter;
	
	public TeamLeadParam() {
	}

	public TeamLeadParam(TeamLead teamLead, Employee[] employees) {
		this.teamLead = teamLead;
		this.employees = employees;
	}
	
	public static TeamLeadParam newParam(TeamLead teamLead, Employee employee, int maxLength) {
		TeamLeadParam param = new TeamLeadParam();
		Employee[] newEmpls = new Employee[maxLength];
		newEmpls[param.counter++] = employee;
		
		param.teamLead = teamLead;
		param.employees = newEmpls;
		
		return param;
	}
	
	public void newEmpl(Employee employee) {
		employees[counter++] = employee;
	}

	public TeamLead getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(TeamLead teamLead) {
		this.teamLead = teamLead;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return teamLead.getFullname() + " --> " + counter;
	}
}
