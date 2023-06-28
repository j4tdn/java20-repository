package exercises04;

import java.time.LocalDate;

public class President extends Personnel{
	private float coefficientsFunction;
	
	public President() {
		// TODO Auto-generated constructor stub
	}

	public President(String fullName, LocalDate dateOfBirth, float coefficientsSalary, float coefficientsFunction) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.coefficientsFunction = coefficientsFunction;
	}

	public float getCoefficientsFunction() {
		return coefficientsFunction;
	}

	public void setCoefficientsFunction(float coefficientsFunction) {
		this.coefficientsFunction = coefficientsFunction;
	}

	@Override
	public String toString() {
		return "President [getFullName()=" + getFullName()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getCoefficientsSalary()=" + getCoefficientsSalary()
				+ ", coefficientsFunction=" + coefficientsFunction + "]";
	}
	
	public static void printInforPersonnel(President...presidents) {
		
		for(President president : presidents) {
			System.out.printf("\n%-30s%-30s%-30s%-30s\n"
					, president.getFullName()
					, president.getDateOfBirth()
					, president.getCoefficientsSalary()
					, president.coefficientsFunction);
		}
	}
	
	@Override
	public float salary() {
		return ((super.getCoefficientsSalary() + this.getCoefficientsFunction()) * 3000000);
	}
}
