package a.validate_trycatch_throw_throws;

import b.exception.InvalidImageException;

public class Ex05BasicDemo_CustomerException {

	public static void main(String[] args) {
		
		
		try {
			validateFileInput("hello.png");
			validateFileInput("hello.pna");
		} catch (InvalidImageException ie) {
			ie.printStackTrace();
		}
		System.out.println("***Finish*****");
		
		
		
	}
	/*
	 Kiểm tra tính hợp lệ của hình ảnh
	 Hình ảnh phải có đuôi file jpg,png
	 * */
	private static boolean validateFileInput(String imagePath) throws InvalidImageException {
		if(!isValid(imagePath)) {
			//throw new IllegalArgumentException(imagePath + " is not an image !");
			throw new InvalidImageException(imagePath + " is not an image !");
		}
		System.out.println(">> " + imagePath + " passed validation");
		return true;
	}
	
	private static boolean isValid(String imagePath) {
		String[] extenstions = {"jpg","jpeg","svg","png"};
		for(String extension:extenstions) {
			if(imagePath.endsWith("."+extension)) {
				return true;
			}
		}
		return false;
	}
}
