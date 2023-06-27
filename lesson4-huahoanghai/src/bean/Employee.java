package bean;

public class Employee extends EmployeeManager {
	private String roomName;
	private String manager;
	public Employee() {
		
	}
	public Employee(String name, String date, double salary, String roomName, String manager) {
		super(name, date, salary);
		this.roomName = roomName;
		this.manager = manager;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public double getSalary() {
		return super.getSalary() *1250000;
	}
	@Override
	public String toString() {
		return "Employee [roomName=" + roomName + ", manager=" + manager + "]";
	}
	
	
	
	
}
