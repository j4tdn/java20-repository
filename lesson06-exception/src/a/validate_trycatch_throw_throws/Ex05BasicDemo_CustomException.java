package a.validate_trycatch_throw_throws;

public class Ex05BasicDemo_CustomException {
	public static void main(String[] args) {
		validateFileInput("hello.png");
	}

	/**
	 * Kiểm tra tính hợp lệ của hình ảnh Hình ảnh phải có đuôi file là jpg,jpeg,
	 * png, svg
	 * 
	 * @param imagePath
	 */
	private static boolean validateFileInput(String imagePath) {
		if (!isValid(imagePath)) {
			throw new IllegalArgumentException(imagePath + " is not an image !");
		}
		System.out.println(">>> " + imagePath + " passed validation");
		return true;

	}

	private static boolean isValid(String imagePath) {
		String[] extensions = { "jpg", "jpe", "png", "svg" };
		for (String extension : extensions) {
			if (imagePath.endsWith("." + extension)) {
				return true;
			}
		}
		return false;
	}
}
