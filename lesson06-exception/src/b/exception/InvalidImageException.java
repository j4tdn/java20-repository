package b.exception;

public class InvalidImageException extends Exception{

	// serializable chua hoc nen chua quan tam
	private static final long serialVersionUID = 6739612400762365187L;
     public InvalidImageException() {
		this("File is not a valid image");
	}
     public InvalidImageException(String filename) {
    	 super("file "+ filename);
 		
 	}
}
