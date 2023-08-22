package a.validate_trycatch_throws_throws;

import b.exception.InvalidImageExtension;

public class Ex05BasicDemo_CustomException {
	public static void main(String[] args) {
		try {
			validateFileInput("hello.png");
		} catch(InvalidImageExtension e) {
			e.printStackTrace();
		}
		
		try {
			validateFileInput("image.txt");			
		} catch (InvalidImageExtension e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("** __ Finished __ **");
	}
	
	/*
	 * Kiểm tra tính hợp lệ của hình ảnh
	 * Hình ảnh phải có đuôi file là jpg, jpeg, png, svg
	 * @param imagePath
	 */
	private static boolean validateFileInput(String imagePath) throws InvalidImageExtension{
		if(!isValid(imagePath)){
			// throw new IllegalArgumentException("'" + imagePath + "'" + " is not an image !");
			throw new InvalidImageExtension("'" + imagePath + "'" + " is not an image !");
		}
		System.out.println(">>> " + imagePath + " passed validation");
		return true;
	}
	
	private static boolean isValid(String imagePath) {
		String[] extensions = {"jpg", "jpeg", "png", "svg"};
		for(String extension : extensions) {
			if(imagePath.endsWith("." + extension)) {
				return true;
			}
		}
		return false;
	}
}
