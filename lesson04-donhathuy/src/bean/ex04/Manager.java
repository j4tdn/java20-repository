package bean.ex04;

import java.time.LocalDate;

public class Manager extends Employees {
	private double positionCoefficient;
	private Room nameRoom;
	public Manager() {
	}
	
	public Manager(String name, LocalDate date, double salaryCoefficient,
			double positionCoefficient, Room nameRoom) {
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

	public Room getNameRoom() {
		return nameRoom;
	}

	public void setNameRoom(Room nameRoom) {
		this.nameRoom = nameRoom;
	}

	@Override
	public String toString() {
		return "Manager [ Name: " + getName() + ", Date:  "
				+ getDate() + ", Salary coefficient:  " + getSalaryCoefficient() +
				",  Position oefficient = " + positionCoefficient + ", Name room: " + nameRoom + "]";
	}
	
}
