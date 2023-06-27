package bean;

public class President extends EmployeeManager {
	private double job;
	public President() {
		
	}
	public President(String name, String date, double salary, double job) {
		super(name, date, salary);
		this.job = job;
	}
	public double getJob() {
		return job;
	}
	public void setJob(double job) {
		this.job = job;
	}
	@Override
	public double getSalary() {
		return (super.getSalary() + getJob()) * 3000000;
	}
	@Override
	public String toString() {
		return "President [job=" + job + "]";
	}
	
	
	
	
	
}
