package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		// code --> saving memory, time --> clean(interview)
		// 
		long N = 3_000_000_000L; // 1 ty
		
		// vòng lặp for
		
		// KDL đối tượng new
		// epoch time --> mốc thời gian cho các hệ điều hành sử dụng 
		// để tính toán thời gian --> 1.1.1970 midnight
		
		// 27.5.2023
		// 15.5.1950
		// 0
		
		//System.currentTimeMillis() --> Thời gian hiện tại
		// số ms từ hiện tại về epoch time.
		long start = System.currentTimeMillis();
		for(long i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration = " + (end - start) + "(ms)");
		// STACK --> 6 ti
		// HEAP --> 6 ti
		
		System.out.println("\n=================\n");
		
		start = System.currentTimeMillis();
		for(long i = 1; i <= N; i++) {
			Integer iA = 99;
			Integer iB = 99;
		}
		end = System.currentTimeMillis();
		System.out.println("Duration = " + (end - start) + "(ms)");
		// STACK --> 6 ti
		// HEAP --> 1
	}
}
