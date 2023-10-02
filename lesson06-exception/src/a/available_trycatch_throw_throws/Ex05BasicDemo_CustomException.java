package a.available_trycatch_throw_throws;

import b.exception.InvalidImageException;

public class Ex05BasicDemo_CustomException {
	public static void main(String[] args) {
		try {
			validateFileInput("abc.png");
		} catch (InvalidImageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  Kiểm tra tính hợp lệ của hình ảnh
	 *  Hình ảnh phải có đuôi file là jpg, jpeg, png, svg
	 *  
	 * @param imagePath
	 * @return 
	 * @throws InvalidImageException 
	 */
	private static boolean validateFileInput(String imagePath) throws InvalidImageException {
		if(!isInvalid(imagePath)) {
			throw new InvalidImageException(imagePath + " is not an image !");
		}
		
		System.out.println(">>> " + imagePath + " passed validation");
		return true;
	}
	private static boolean isInvalid(String imagePath) {
		String[] extensions = {"jpg", "jpeg", "png", "svg"};
		for(String extension : extensions) {
			if(imagePath.endsWith(extension))
				return true;
		}
		return false;
		
		/*return imagePath.endsWith(".jpg")
				|| imagePath.endsWith(".jpeg")
				|| imagePath.endsWith(".png")
				|| imagePath.endsWith(".svg");
				*/
	}
}
