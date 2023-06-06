package controlling;

public class Ex07BasicArray {
	public static void main(String[] args) {
		// Tạo 1 ô nhớ ở HEAP lưu 5 giá trị mặc định kiểu int
		int[] digits = new int[5];
		System.out.println("digits[0] = " + digits[0]);
		System.out.println("digits[2] = " + digits[2]);
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);
		
		// Khởi tạo ô nhớ và giá trị cho mảng
		String[] sequences = {"a", "b", "c", "d"};
		System.out.println("length: " + sequences.length);
		
		// for-index[0; length)
		for (int i = 0; i < sequences.length; i++)
			System.out.println("value: " + sequences[i]);
		
		System.out.println("\n------------------------------\n");
		
		// for-each: lấy giá trị, không quan tâm chỉ số
		for (String each : sequences) 
			System.out.println("value: " + each);
	}
}
