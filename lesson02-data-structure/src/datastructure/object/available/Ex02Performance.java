package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N=300000l;
		//KDL doi tuong new
		
		long start = System.currentTimeMillis();
		for (long i=1; i<=N; i++) {
			Integer iA= new Integer(99);
			Integer iB= new Integer(99);
		}
		long end = System.currentTimeMillis();
		System.out.println("duration = "+ (end - start) + "(ms)");
		System.out.println("\n------------------\n");
		start = System.currentTimeMillis();
		for (long i=1; i<=N; i++) {
			Integer iA= 99;
			Integer iB= 99;
		}
			end = System.currentTimeMillis();
			System.out.println("duration = "+ (end - start) + "(ms)");
		}
	}

