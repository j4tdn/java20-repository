package bean;

public class Manager extends President {
	private String roomName;
	
	public Manager() {
		
	}

	public Manager(String name, String date, double salary, double job, String roomName) {
		super(name, date, salary, job);
		this.roomName = roomName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	@Override
	public double getSalary() {
		return (super.getSalary()+getJob()) * 2200000;
	}
	@Override
	public String toString() {
		return "Manager [roomName=" + roomName + "]";
	}

	
	
	
}
