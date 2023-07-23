package a.validate_trycatch_throw_throws;

import b.exception.InvalidImageException;

public class Ex05BasicDemo_CustomException {
	public static void main(String[] args) {
		try {
			validateFileInput("hello.jpg");
		} catch (InvalidImageException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Kiểm tra tính hợp lệ của hình ảnh
	 * Hình ảnh phải có đuôi file là png, jpg, jpeg, svg
	 * @param imagePath
	 */
	private static boolean validateFileInput(String imagePath) throws InvalidImageException {
		if (!isValid(imagePath)) {
			throw new InvalidImageException(imagePath + " is not an image!");
		}
		
		System.out.println(">>> " + imagePath + " passed validation");
		return true;
	}
	
	private static boolean isValid(String imagePath) {
		String[] extensions = {"jpg", "png", "jpeg", "svg"};
		for (String extension : extensions) {
			if (imagePath.endsWith("." + extension)) {
				return true;
			}
		}
		return false;
	}
}
