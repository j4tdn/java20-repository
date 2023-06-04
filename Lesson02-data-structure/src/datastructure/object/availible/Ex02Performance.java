package datastructure.object.availible;

public class Ex02Performance {
	public static void main(String[] args) {
		// saving memory, time --> clean(interview)

		long n = 300000000l; // 1 triệu

		// vong lap

		// KDL doi tuong new
		// epoch time -- moc time cho cac he dieu hanh su dung de tinh toan thoi gian
		// ---> 1.1.1970 mid night
		// System.currentTimeMillis() --> thoi gian hien tai;
		// so milis tu hien tai ve epoch time
		long start = System.currentTimeMillis();
		for (long i = 1; i <= n; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);

		}
		long end = System.currentTimeMillis();

		System.out.println("duration = " + (end - start) + "(ms)");
		System.out.println("=============");
		// stack --> 6ti
		// heap --> 6ti
		// KDL doi tuong constant pool
		start = System.currentTimeMillis();
		for (long i = 1; i <= n; i++) {
			Integer iA = 99;
			Integer iB = 99;

		}
		end = System.currentTimeMillis();
		System.out.println("duration = " + (end - start) + "(ms)");
	}
}
