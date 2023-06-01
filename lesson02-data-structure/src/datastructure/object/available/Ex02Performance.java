package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N = 300000000l;

		// Số ms từ thời gian hiện tại về epoch time 1/1/1970
		long start = System.currentTimeMillis();

		// KDL đối tượng new
		for (long i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
		}

		long end = System.currentTimeMillis();
		
		System.out.println("Duration = " + (end - start) + "(ms)");
		
		System.out.println("\n------------------------\n");
		
		start = System.currentTimeMillis();

		// KDL đối tượng new
		for (long i = 1; i <= N; i++) {
			Integer iA = 99;
			Integer iB = 99;
		}

		end = System.currentTimeMillis();
		
		System.out.println("Duration = " + (end - start) + "(ms)");
	}
}
