package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		int N = 1000000000; // 1 tỷ
		
		// vòng lặp for
		
		// KDL đối tượng new 
		//epoch time --> mốc thời gian cho các hệ điều hành sử dụng
		// để tính toán thời gian -->
		
		
		
		
		// System.currentTimeMillis() --> thời gian hiện tại
		// số ms từ hiện tại về epoch time
		long start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
			
		}
		long end = System.currentTimeMillis();
		System.out.println("duration = " + (end - start) + "(ms)");
		// STACK --> 2 triệu
		// HEAP  --> 2 triệu
	}
	
}
