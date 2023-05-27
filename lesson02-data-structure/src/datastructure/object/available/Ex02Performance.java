package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		// code --> saving memory, time --> clean(interview)
		long N = 300000000l;

		// KDL đối tượng
		// epoch time --> mốc thời gian cho các hệ điều hành dùng
		// tính toán time --> 1.1.1970 mid night

		// System.currentTimeMillis() --> thời gian hiện tại
		// số ms từ hiện tại về epoch time
		long start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
		}
		long end = System.currentTimeMillis();
		System.out.println("duration = " + (end - start) + " ms");
		// STACK --> 6 tỉ
		// HEAP --> 6 tỉ

		System.out.println("\n===========\n");
		// KDL constant pool
		start = System.currentTimeMillis();
		for (long i = 1; i <= N; i++) {
			Integer iA = 99;
			Integer iB = 99;
		}
		end = System.currentTimeMillis();
		System.out.println("duration = " + (end - start) + " ms");
		// STACK --> 6 TỈ
		// HEAP --> 1
	}
}
