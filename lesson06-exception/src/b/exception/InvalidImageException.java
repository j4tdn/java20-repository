package b.exception;

public class InvalidImageException extends Exception {
	
	// serializable
	private static final long serialVersionUID = 6217485774535987709L;
	
	public InvalidImageException() {
		this("File is not a valid image");
	}
	
	public InvalidImageException(String fileName) {
		super(fileName + " --> is invalid");
	}
}
