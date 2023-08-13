package b.exception;

public class InvalidImageException extends Exception {

	private static final long serialVersionUID = 6739612400762365187L;
	
	public InvalidImageException() {
	}
	
	public InvalidImageException(String filename) {
		super("File '" + filename + "' is invalid");
	} 
	
}
