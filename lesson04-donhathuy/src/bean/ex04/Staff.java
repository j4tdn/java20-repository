package bean.ex04;

import java.time.LocalDate;

public class Staff extends Employees{
	private String nameRoom;
	private Manager manager;
	public Staff() {
	}
	public Staff(String name, LocalDate date, double salaryCoefficient, String nameRoom, Manager manager) {
		super(name, date, salaryCoefficient);
		this.nameRoom = nameRoom;
		this.manager = manager;
	}
	public String getNameRoom() {
		return nameRoom;
	}
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Staff [Name: " + getName() + ", Date:  "
				+ getDate() + ", Salary coefficient: " + getSalaryCoefficient() +
				", Name room:  " + nameRoom + ", Manager: " + manager.getName() + "]";
	}
	
}
