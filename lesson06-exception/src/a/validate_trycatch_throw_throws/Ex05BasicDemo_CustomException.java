package a.validate_trycatch_throw_throws;

import b.exception.InvalidImageException;

public class Ex05BasicDemo_CustomException {
	
	public static void main(String[] args) {
		try {
			validateFileInput("Hello.png1");
		} catch (InvalidImageException e) {
			e.printStackTrace();
		}
		
		try {
			validateFileInput("Hello.png");
		} catch (InvalidImageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static boolean validateFileInput(String imagePath) throws InvalidImageException   {
		if(!isValid(imagePath)) {
			// throw new IllegalArgumentException(imagePath + " is not an image!");
			throw new InvalidImageException(imagePath);
		}
		
		System.out.println(">>> " + imagePath + " passed validation");
		return true;
	}

	private static boolean isValid(String imagePath) {
		String[] extentions = {".jpg", ",jpeg",".svg",".psd",".png"};
		for(String str : extentions) {
			if(imagePath.endsWith(str)) {
				return true;
			}
		}
		return false;
		}
}
