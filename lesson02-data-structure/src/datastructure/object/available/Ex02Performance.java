package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N = 1000000000l; //1 tỉ
		
		//Vòng lặp for
		
		//KDL đối tượng new
		//epoch time --> mốc thời gian cho OS sử dụng để tính toán thời gian --> 1.1.1970
		long start = System.currentTimeMillis();
		for(long i = 1; i <= N; i++) {
			Integer A = new Integer(99);
			Integer B = new Integer(99);
		}
		long end = System.currentTimeMillis();
		//STACK --> 2 tỷ
		//HEAP --> 1 tỷ
		System.out.println("duarion: " + (end-start) + "ms");
		
		System.out.println("\n-------------\n");
		start = System.currentTimeMillis();
		for(long i = 1; i <= N; i++) {
			Integer C = 99;
			Integer D = 99;
		}
		end = System.currentTimeMillis();
		System.out.println("duarion: " + (end-start) + "ms");
		//STACK --> 2 tỷ
		//HEAP --> 1
	}
}
