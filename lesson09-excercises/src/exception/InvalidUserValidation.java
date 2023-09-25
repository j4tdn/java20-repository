package exception;

public class InvalidUserValidation extends Exception{

	private static final long serialVersionUID = -2075489293019088732L;
	
	public InvalidUserValidation (String message) {
		super(message);
	}
}
