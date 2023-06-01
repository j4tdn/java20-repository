package datastructure.array;

public class Ex01BasicArray {
	public static void main(String[] args) {

		// Mảng là KDL đối tượng
		// 5 độ dài lenth của mảng
		// Tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 giá trị mặc định của kiểu int
		int[] digits = new int[5];
		for (int i = 0; i < digits.length; i++) {
            System.out.println("Địa chỉ của phần tử thứ " + i + ": " + System.identityHashCode(digits[i]));
        }
	}
}