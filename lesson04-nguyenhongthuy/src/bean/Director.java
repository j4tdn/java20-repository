package bean;

import java.time.LocalDate;

public class Director extends Personnel{
	private float positionCoefficient;
	public Director() {
		
	}
	public Director(String fullname, LocalDate dob, float salaryCoefficient, float jobCoefficient) {
		super(fullname, dob, salaryCoefficient);
		this.positionCoefficient = jobCoefficient;
	}
	public float getJobCoefficient() {
		return positionCoefficient;
	}
	public void setJobCoefficient(float jobCoefficient) {
		this.positionCoefficient = jobCoefficient;
	}
	
	@Override
	public String toString() {
		return "Director [ getFullname()=" + getFullname()+ ", getDob()=" + getDob() + ", getSalaryCoefficient()=" + getSalaryCoefficient() 
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}
	
	public static void outputInfor(Director...directors) {
		
		for(Director director : directors) {
			System.out.printf("%-15s|%-15s|%-20.2f|%-20.5f\n", director.getFullname(), director.getDob(), director.getSalaryCoefficient(), director.positionCoefficient);
		}
	}
	@Override
	public float getSalary() {
		return (super.getSalaryCoefficient() + this.positionCoefficient)*3000000;
	}
	
}
