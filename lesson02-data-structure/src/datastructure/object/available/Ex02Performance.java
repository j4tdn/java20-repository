package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N = 2000000000l; // 3 tỷ

		// Vòng lặp for

		// KDL đối tượng new
		
		// epoch time --> mốc thời gian cho các hệ điều hành sử dụng để tính toán thời gian 
		// mặc định là 1.1.1970 mid night
		
		
		// System.currentTimeMillis() --> thời gian hiện tại
		// số ms từ hiện tại về epoch time
		long start = System.currentTimeMillis();
		System.out.println(start);
		for (int i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
		}
		//STACK --> 6 tỷ
		//HEAP --> 6 tỷ
		
		long end = System.currentTimeMillis();
		// KDL đối tượng constant pool
		System.out.println("duration = " + (end - start) + "(ms)");
		
		System.out.println("\n================\n");
		
		start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = 99;
			Integer iB = 99;
		}
		end = System.currentTimeMillis();
		System.out.println("duration = " + (end - start) + "(ms)");
		// STACK --> 6 tỉ
		// HEAP  --> 1
	}
}