package exercises4;

public class Manager extends Person {
	private int numberOfEmployees;
	
	public Manager() {
	}



	public Manager(String name, String dateOfBirth, float salaryLevel, int numberOfEmployees) {
		super(name, dateOfBirth, salaryLevel);
		this.numberOfEmployees = numberOfEmployees;
	}



	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", toString()=" + super.toString() + "]";
	}



	public float salary() {
		return this.getSalaryLevel()  * 2200000;
		
	}
	
}
