package b.exception;

public class InvalidImageException extends Exception{

	/**
	 * serializable
	 */
	private static final long serialVersionUID = 6739612400762365187L;
	public InvalidImageException() {
		this("file is not a valid image");
		
	}
	public InvalidImageException(String message) {
		super(" " + message + " is invalid");
		
	}
	
	
}
