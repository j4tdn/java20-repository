package bean;

public class EmployeeManager {
	private String name;
	private String date;
	private double salary;
	public EmployeeManager() {
	
	}
	public EmployeeManager(String name, String date, double salary) {
		super();
		this.name = name;
		this.date = date;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeManager [name=" + name + ", date=" + date + ", salary=" + salary + "]";
	}
	
}
