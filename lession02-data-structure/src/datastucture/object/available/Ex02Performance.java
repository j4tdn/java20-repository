package datastucture.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N = 300000000l; //1 triệu
		
		// vòng lặp for
		
		// KDL đối tượng new
		// epoch time --> mốc thời gian cho các hệ điều hành sử dụng
		// để tính toán thời gian --> 1.1.1970 mid night
		long start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);	
		}
		long end = System.currentTimeMillis();
		System.out.println("duarion: " + (end - start) + "(ms)");
		// STACK --> 2 triệu
		// HEAP  --> 2 triệu
		
		System.out.println("\n-----------------------\n");
		
		start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = 99;
			Integer iB = 99;	
		}
		end = System.currentTimeMillis();
		System.out.println("duarion: " + (end - start) + "(ms)");
		// STACK --> 2 triệu
		// HEAP  --> 1
	}
}
