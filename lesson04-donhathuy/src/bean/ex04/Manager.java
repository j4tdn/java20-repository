package bean.ex04;

import java.time.LocalDate;

public class Manager extends Employees {
	private double positionCoefficient;
	private String nameRoom;
	public Manager() {
	}
	
	public Manager(String name, LocalDate date, double salaryCoefficient,
			double positionCoefficient, String nameRoom) {
		super(name, date, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
		this.nameRoom = nameRoom;
	}

	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getNameRoom() {
		return nameRoom;
	}

	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}

	@Override
	public String toString() {
		return "Manager [ Name: " + getName() + ", Date:  "
				+ getDate() + ", Salary coefficient:  " + getSalaryCoefficient() +
				",  Position oefficient = " + positionCoefficient + ", Name room: " + nameRoom + "]";
	}
	
}
