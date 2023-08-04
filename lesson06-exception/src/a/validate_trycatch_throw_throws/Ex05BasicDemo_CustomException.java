package a.validate_trycatch_throw_throws;

import b.exception.InvalidImageException;

public class Ex05BasicDemo_CustomException {
	
	public static void main(String[] args) {
		
		// should try catch
		
		try {
			validateFileInput("hello.png");		
		} catch (InvalidImageException e) {
			e.printStackTrace();
		}
		
		
		try {
			validateFileInput("image.txt");
			
		} catch (InvalidImageException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
		
	}
	
	/**
	 kiểm tra tính hợp lệ của hình ảnh
	 Hình ảnh phải có đuôi file là jpg, jpeg, png, svg
	 
	 */
	
	private static boolean validateFileInput(String imagePath) throws InvalidImageException {
		if (!isValid(imagePath)) {
		//	throw new IllegalArgumentException(imagePath + " is not an image !");
			throw new InvalidImageException(imagePath);
		}
		
		System.out.println(">>> " + imagePath + " --> passed validation");
		return true;
	}
	
	private static boolean isValid(String imagePath) { 
		String[] extensions = {"jpg", "jpeg", "png", "svg"};
		for (String extension: extensions) {
			if (imagePath.endsWith("." + extension)) {
				return true;
			}
		}
		return false;
		
	}

}
