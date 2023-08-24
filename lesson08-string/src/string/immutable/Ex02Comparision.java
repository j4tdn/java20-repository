package string.immutable;

public class Ex02Comparision {

	public static void main(String[] args) {
		
		String s1 = "a1";
		String s2 = "z5";
		String s3 = "hello";
		String s4 = "z5";
		
		System.out.println("s1.equals(s2) --> " + s1.equals(s2));
		System.out.println("s1.compareTo(s2) --> " + s1.compareTo(s2));
		
		System.out.println("");
		
		System.out.println("s3.equals(s4) --> " + s3.equals(s4));
		System.out.println("s3.compareTo(s4) --> " + s3.compareTo(s4));
		
		/*
		 * So sánh: chuỗi
		 * 		equals: Object
		 * 			+ true: 2 chuỗi có giá trị bằng nhau
		 * 			+ false: 2 chuỗi có giá trị khác nhau
		 * 	LƯU Ý: override hàm equals nếu class do mình tạo ra 
		 * 		   vì mặc định Objects#equals dùng toán tử ==
		 * 		
		 * 		compareTo: Comparable
		 * 			+ positive: a > b
		 * 			+ negative: a < b
		 * 			+ zero    : a = b
		 */
		
	}
	
}
