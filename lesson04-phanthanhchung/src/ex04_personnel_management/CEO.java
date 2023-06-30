package ex04_personnel_management;

import java.time.LocalDate;

public class CEO extends Personnel{
	private double statusFactor;
	
	public CEO() {
		
	}
	
	public CEO(String name, String birthday, double salaryFactor, double statusFactor) {
		super(name, birthday, salaryFactor);
		this.statusFactor = statusFactor;
	}

	

	public double getStatusFactor() {
		return statusFactor;
	}

	public void setStatusFactor(double statusFactor) {
		this.statusFactor = statusFactor;
	}

	@Override
	public String toString() {
		return "CEO [name=" + name + ", birthday=" + getBirthday() + ", salaryFactor=" + salaryFactor + ", statusFactor="
				+ statusFactor + "]";
	}
}
