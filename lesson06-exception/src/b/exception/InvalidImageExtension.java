package b.exception;

public class InvalidImageExtension extends Exception{
	
	// serializable
	private static final long serialVersionUID = -3952292040249713080L;

	public InvalidImageExtension() {
		this("File is not a valid image");
	}
	
	public InvalidImageExtension(String filename) {
		super("'" + filename + "'" + " is invalid");
	}

}
