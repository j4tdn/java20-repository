package human.resources.management;

import java.time.LocalDate;

public class President extends EmployeeManager {

	private double positioncCoefficient;

	public President(String fullName, LocalDate dayOfBirth, double salaryFactor, double positioncCoefficient) {
		super(fullName, dayOfBirth, salaryFactor);
		this.positioncCoefficient = positioncCoefficient;
	}



	public double getPositioncCoefficient() {
		return positioncCoefficient;
	}



	public void setPositioncCoefficient(double positioncCoefficient) {
		this.positioncCoefficient = positioncCoefficient;
	}

	
	


	@Override
	public String toString() {
		return "President [positionFactor=" +positioncCoefficient + ", FullName=" + getFullName() + ", DayOfBirth="
				+ getDayOfBirth() + ", SalaryFactor()=" + getSalaryFactor() + "]";
	}
	


	
	
	
}
