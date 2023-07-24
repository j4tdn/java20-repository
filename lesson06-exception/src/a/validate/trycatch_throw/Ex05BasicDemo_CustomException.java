package a.validate.trycatch_throw;

public class Ex05BasicDemo_CustomException {
  
	
	 public static void main(String[] args) {
		 validateFileInput("hello.jpg");
		
		 //should try catch
	}
	 /**
	  * Kiem tra tinh hop le cua hinh anh
	  * Hinh anh phai co duoi file jpg, jpeg, png, svg
	  * @param imagePath
	  */
	 private static boolean validateFileInput(String imagePath) {
		 if(!isValid(imagePath)) {
			 
			 //throw new IllegalArgumentException(imagePath + "is not an image !");
			 throw new IllegalArgumentException(imagePath);
		 }
		 System.out.println(">> "+ imagePath+ "passedd validation");
		 return true;
	 }
	 private static boolean isValid(String imagePath) {
		 String[] extensions = {"jpg","jpeg","svg"};
		 for (String extension: extensions) {
			 if(imagePath.endsWith("." + extension));
			 return true;
		 }
	 

	 return false;
}
}
// thieeu