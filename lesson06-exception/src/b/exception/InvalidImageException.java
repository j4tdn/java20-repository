package b.exception;

public class InvalidImageException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6739612400762365187L;
	public InvalidImageException() {
		this("File is not a valid image! ");
	}
	public InvalidImageException(String fileName) {
		super(" ' "+fileName + " ' --> is invalid");
	}
	
	
}
