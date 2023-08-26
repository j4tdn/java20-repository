package view.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import view.bean.User;
import view.exception.InvalidUserValidation;

public class Ex04UserValidation {
	
	public static void main(String[] args) {
		try {
			validate(new User("by2ztkhx256", "ayDmi%%nh123"));
			System.out.println("Account is registerd successfull !!!");
		} catch (InvalidUserValidation e) {
			System.out.println("message --> " + e.getMessage());
		}
	}
	
	private static User validate(User checkUser) throws InvalidUserValidation{
		String password = checkUser.getPassword();
		
		int passwordLength = password.length();
		
		// 1. Độ dài mật khẩu: >= 8
		if (passwordLength < 8) {
			throw new InvalidUserValidation("Required length >= 8");
		}
		
		// 2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
		String specialText = "(~!@#$%^&*)";
		int numberOfDigits = 0;
		int numberOfUpperLetters = 0;
		int numberOfSpecialLettes = 0;
		for (int i = 0; i < passwordLength; i++) {
			char letter = password.charAt(i);
			if (numberOfDigits == 0 && Character.isDigit(letter)) {
				numberOfDigits = 1;
				continue;
			}
			if (numberOfUpperLetters == 0 && Character.isUpperCase(letter)) {
				numberOfUpperLetters = 1;
				continue;
			}
			if (numberOfSpecialLettes == 0 && specialText.contains(String.valueOf(letter))) {
				numberOfSpecialLettes = 1;
			}
		}
		require(numberOfDigits, "Required at least one digit letter");
		require(numberOfUpperLetters, "Required at least one upper case letter");
		require(numberOfSpecialLettes, "Required at least one special letter");
		
		// 3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
		
		// Tự làm
		// B1: Loại bỏ những kí tự trùng nhau trong username, password
		// B2: Tìm giao của password và username
		//     Duyệt từng ký tự trong password
		//        Nếu ký tự đó tồn tại(indexOf, contains) trong username --> tăng count lên
		// B3: Nếu count vượt quá 3 --> ném ngoại lệ
		
		String username = checkUser.getUsername();
		// un --> byaztkhxa256 --> bbc --> bc
		// ps --> admin123     --> aaa --> a
		char[] usernameLetters = username.toCharArray();
		char[] passwordLetters = password.toCharArray();
		
		// convert char[] sang CTDL List<Charactor>
	    List<Character> usernameLetterList = List.of(IntStream.range(0, usernameLetters.length)
	    				.mapToObj(i -> usernameLetters[i])
	    				.toArray(Character[]::new));
	    
	    List<Character> passwordLetterList = List.of(IntStream.range(0, passwordLetters.length)
				.mapToObj(i -> passwordLetters[i])
				.toArray(Character[]::new));
	    
	    // copy các phần tử từ passwordLetterLetter sang biến common
	    List<Character> common = new ArrayList<>(passwordLetterList);
	    
	    // Collection#retainAll --> giao 2 danh sách
	    common.retainAll(usernameLetterList);
		
	    if (common.size() > 3) {
	    	throw new InvalidUserValidation("Invalid, password is duplicated more than 3 letters with username");
	    }
	    
		return checkUser;
	}
	
	private static void require(int amount, String message) throws InvalidUserValidation{
		if (amount == 0) {
			throw new InvalidUserValidation(message);
		}
	}
}
