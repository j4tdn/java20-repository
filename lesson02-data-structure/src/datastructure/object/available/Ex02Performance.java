package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N = 3000000000l;
		//vòng lặp for
		
		//kieuDL doi tuong new
		//epoch time --> mốc thời gian cho các hệ điều hành sử dụng
		//để tính toán thời gian --> 1.1.1970 mid night
		//System.currentTimeMillis() --> thời gian hiện tại
		//sôs ms từ hiện tại về epoch time
		
		long start = System.currentTimeMillis();
		for (long i = 1; i <= N ; i++) {
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
		}
		long end = System.currentTimeMillis();
		System.out.println("ducation = " +(end - start) + "(ms)");
		
		//STACK --> 6 ti
		//HEAP --> 6 ti
		System.out.println("\n--------------------\n");
		
		start = System.currentTimeMillis();
		for (long i = 1; i <= N ; i++) {
			Integer iA = 99;
			Integer iB = 99;
		}
		end = System.currentTimeMillis();
		System.out.println("ducation = " +(end - start) + "(ms)");
	}

}
