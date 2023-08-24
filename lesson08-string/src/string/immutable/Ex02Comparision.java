package string.immutable;

public class Ex02Comparision {
	public static void main(String[] args) {
		String s1 = "a1";
		String s2 = "k5";
		String s3 = "hello";
		String s4 = "k5";
		
		System.out.println("s1.equals(s2) --> " + s1.equals(s2));
		System.out.println("s1.compareTo(s2) --> " + s1.compareTo(s2));
		
		System.out.println("s3.equals(s4) --> " + s3.equals(s4));
		System.out.println("s3.compareTo(s4) --> " + s3.compareTo(s4));
		
		
		
		
		/*
		 so sánh : chuỗi
		 equals:
		 	+ true: 2 chuỗi có giá trị bằng nhau
		 	+ false: 2 chuỗi có giá trị khác nhau
		 	+ lưu ý: override hàm equals nếu class do mình tạo ra 
		 			vì mặc định Object#equals dùng toán tử ==
		 	
		 	compareTo: Comparable
		 		+ positive: a lớn hơn b
		 		+ negative: a nhỏ hơn b
		 		+ zero	  : a bằng b
		 	--> so sánh lớn bé để sắp xếp
		 
		 */
	}

}
