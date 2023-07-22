package a.validate_trycatch_throw_throws;

import b.exception.InvalidImageException;

public class Ex05BasicDemo_CustomException {
	public static void main(String[] args) {
		try {
			validateFileInput("hello.png");
		} catch (InvalidImageException e) {
			e.printStackTrace();
		}
		
		//should try catch
		try {
			validateFileInput("hello.asd");
		} catch (InvalidImageException e) {
			e.printStackTrace();
		}
		System.out.println("finish");
	}
	
	private static boolean validateFileInput(String imagePath) throws InvalidImageException {
		if(!isvalid(imagePath)) {
			throw new InvalidImageException(imagePath);
		}
		
		System.out.println(">>> " + imagePath +" ==> passed validation");
		return true;
	}
	
	private static boolean isvalid(String imagePath) throws InvalidImageException{
		String[] extenstions = {"jpg", "jpeg", "png", "svg"};
		for(String extenstion: extenstions) {
			if(imagePath.endsWith("." + extenstion)) {
				return true;
			}
		}
		return false;
	}
}
